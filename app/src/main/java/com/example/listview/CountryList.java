package com.example.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryList extends MainActivity {

    ListView listView;
    String smTitle[] = {"Pakistan", "Afghanistan", "Australia", "Brazil", "Canada", "China", "Iran", "Iraq", "Lithuania", "New Zealand", "Oman", "South Africa", "Turkey"};
    String smDescription[] = {"Pakistan Description", " Afghanistan Description", " Australia Description", " Brazil Description", " Canada Description",
            "China Description", " Iran Description", " Iraq Description", " Lithuania Description", " New Zealand Description", "Oman Description", " South Africa Description", " Turkey Description"};
    int smImage[] = {R.drawable.pakistan, R.drawable.afghanistan, R.drawable.australia, R.drawable.brazil, R.drawable.canada,
            R.drawable.china, R.drawable.iran, R.drawable.iraq, R.drawable.lithuania, R.drawable.newzealand, R.drawable.oman, R.drawable.southafrica, R.drawable.turkey};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        listView = findViewById(R.id.listView);

        CountryList.MyAdapter adapter = new CountryList.MyAdapter(this, smTitle, smDescription, smImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                if (position == 0) {
//                    Toast.makeText(CountryList.this, "Facebook Description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(CountryList.this, "WhatsApp Description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(CountryList.this, "Twitter Description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(CountryList.this, "Instagram Description", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 0) {
//                    Toast.makeText(CountryList.this, "YouTube Description", Toast.LENGTH_SHORT).show();
//                }

            }
        });
    }

        class MyAdapter extends ArrayAdapter<String> {

            Context context;
            String smaTitle[];
            String smaDescription[];
            int smaImage[];

            MyAdapter(Context c, String title[], String description[], int image[]) {
                super(c, R.layout.list_item, R.id.textView1, title);
                this.context = c;
                this.smaImage = image;
                this.smaTitle = title;
                this.smaDescription = description;
            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View list_item = layoutInflater.inflate(R.layout.list_item, parent, false);
                ImageView smImage = list_item.findViewById(R.id.image);
                TextView smTitle = list_item.findViewById(R.id.textView1);
                TextView smDescription = list_item.findViewById(R.id.textView2);

                smImage.setImageResource(smaImage[position]);
                smTitle.setText(smaTitle[position]);
                smDescription.setText(smaDescription[position]);

                return list_item;
            }
        }
    }
