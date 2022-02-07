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

public class SocialMediaApps extends MainActivity {

    ListView listView;
    String smTitle[] = {"Facebook", "WhatsApp", "Twitter", "Instagram", "Youtube"};
    String smDescription[] = {" Facebook Description", " WhatsApp Description", " Twitter Description", " Instagram Description", " Youtube Description"};
    int smImage[] = {R.drawable.facebook, R.drawable.whatsapp, R.drawable.twitter, R.drawable.instagram, R.drawable.youtube};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_apps);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, smTitle, smDescription, smImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(SocialMediaApps.this, "Facebook Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(SocialMediaApps.this, "WhatsApp Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(SocialMediaApps.this, "Twitter Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(SocialMediaApps.this, "Instagram Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(SocialMediaApps.this, "YouTube Description", Toast.LENGTH_SHORT).show();
                }

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