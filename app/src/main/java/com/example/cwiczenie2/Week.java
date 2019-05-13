package com.example.cwiczenie2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Week extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        setupUIViews();
        initToolbar();
        setupListView();
       //TODO: zadanie 3
    }


    private void setupUIViews(){
        //TODO: zadanie 3
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.ToolbarMain);
        listView=(ListView)findViewById(R.id.lvMain);

    }

    private void initToolbar(){
        //TODO zadanie 4
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Week");
    }

    private void setupListView() {
        String[] title = getResources().getStringArray(R.array.week);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, title);
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: {break;}
                    case 1:{break;}
                    case 2:{break;}
                    case 3:{break;}
                    case 4:{break;}
                    case 5:{break;}

                }
            }
        });
    }




    public class SimpleAdapter extends BaseAdapter{
//TODO: zadanie 3
        private Context mContext;
        private LayoutInflater layoutInflater;
        private TextView day;
        private String[] weekArray;
        private ImageView imageView;

        public SimpleAdapter(Context context, String[] title){
            mContext = context;
            weekArray= title;
            layoutInflater= LayoutInflater.from(context);// pozwala na rozny layout

        }
        @Override
        public int getCount() {
            return weekArray.length;
        }
        @Override
        public Object getItem(int position) {
            return weekArray[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView== null){
                convertView= layoutInflater.inflate(R.layout.single_item, null);
            }
            day= (TextView)convertView.findViewById(R.id.tvMain);
            imageView= (ImageView)convertView.findViewById(R.id.ivMain);

            day.setText(weekArray[position]);

            if(weekArray[position].equalsIgnoreCase("Monday")){
                imageView.setImageResource(R.drawable.calendar);
            }else if(weekArray[position].equalsIgnoreCase("Tuesday")){
                imageView.setImageResource(R.drawable.calendar);
            }else if(weekArray[position].equalsIgnoreCase("Wednesday")){
                imageView.setImageResource(R.drawable.calendar);
            }else if(weekArray[position].equalsIgnoreCase("Thursday")){
                imageView.setImageResource(R.drawable.calendar);
            }else if(weekArray[position].equalsIgnoreCase("Friday")){
                imageView.setImageResource(R.drawable.calendar);
            }else if(weekArray[position].equalsIgnoreCase("Saturday")){
                imageView.setImageResource(R.drawable.calendar);
            }else if(weekArray[position].equalsIgnoreCase("Sunday")){
                imageView.setImageResource(R.drawable.calendar);
            }
            //TODO: zadanie 3

            return convertView;
        }

    }

}
