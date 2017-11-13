package com.example.android.giphyapiretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

 ArrayList<String> listaGiphy = new ArrayList<String> ();
    ArrayList<String> urlList = new ArrayList<String>();

    private ListView listView;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        listView = (ListView) findViewById (R.id.ListView);
        searchView = (SearchView) findViewById (R.id.SearchView);

        /**
         * SearchView
         */
        searchView.setOnQueryTextListener (new SearchView.OnQueryTextListener () {
            @Override
            public boolean onQueryTextSubmit(String query) {
                /**
                 * RETROFIT
                 */
                ApiInterface service = ApiInterface.retrofit.create (ApiInterface.class);
                service.getDownsized (query, "yXeFI6D8TyVNtjLVYv17riJr0Or4kp23", "10").enqueue (new Callback<TopObject> () {
                    @Override
                    public void onResponse(Call<TopObject> call, Response<TopObject> response) {
                        if (response.isSuccessful ()) {

                          for(Datum d:response.body().getData()){
                            urlList.add(d.getImages ().getOriginal ().getUrl ());
                                //title lista
                                listaGiphy.add (d.getTitle ());
                                //Adapter
                                   ArrayAdapter<String> adapter = new ArrayAdapter<String> (MainActivity.this, android.R.layout.simple_list_item_1, listaGiphy);
                                   listView.setAdapter (adapter);

                                   //onClickListener from listView
                                   listView.setOnItemClickListener(
                                           new AdapterView.OnItemClickListener() {
                                               @Override
                                               public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                   Intent myData = new Intent(MainActivity.this, Main2Activity.class);
                                                   myData.putExtra ("CatchData", urlList.get(i));
                                                   startActivityForResult(myData, 0);

                                               }
                                           }
                                   );
                          }

                         //for (final Datum data : response.body ().getData ()) {
                         //
                         //    //url lista
                         //    urlList.add(data.getImages ().getOriginal ().getUrl ());
                         //    //title lista
                         //    listaGiphy.add (data.getTitle ());
                         //    //Adapter
                         //       ArrayAdapter<String> adapter = new ArrayAdapter<String> (MainActivity.this, android.R.layout.simple_list_item_1, listaGiphy);
                         //       listView.setAdapter (adapter);
                         //
                         //       //onClickListener from listView
                         //       listView.setOnItemClickListener(
                         //               new AdapterView.OnItemClickListener() {
                         //                   @Override
                         //                   public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                         //                       Intent myData = new Intent(MainActivity.this, Main2Activity.class);
                         //                       myData.putExtra ("CatchData", urlList.get(i));
                         //                       startActivityForResult(myData, 0);
                         //
                         //                   }
                         //               }
                         //       );
                         //  }

                        } else {
                            Toast.makeText (MainActivity.this, "Response error", Toast.LENGTH_SHORT).show ();
                        }
                    }

                    @Override
                    public void onFailure(Call<TopObject> call, Throwable t) {
                        Toast.makeText (MainActivity.this, "Call response error", Toast.LENGTH_SHORT).show ();
                    }
                });

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });

    }
}