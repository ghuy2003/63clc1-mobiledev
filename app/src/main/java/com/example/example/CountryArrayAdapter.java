package com.example.example;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryArrayAdapter extends BaseAdapter
{
    List<Country> listDataSource;
    private LayoutInflater inflater;
    private Context context;

    //Constructor
    public CountryArrayAdapter(List<Country> listDataSource, Context context) {
        this.listDataSource = listDataSource;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    //inner class
    class CountryItemHolder {
        ImageView imageViewFlag;
        TextView textViewName;
        TextView textViewInfo;
    }


    @Override
    public int getCount() {
        return listDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return listDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CountryItemHolder itemViewHolder;
        if(view==null)
        {
            //XML item view--> Java item view
            view = inflater.inflate(R.layout.country_item_layout,null);
            //get Ref
            itemViewHolder=new CountryItemHolder();
            itemViewHolder.textViewName= view.findViewById(R.id.textViewName);
            itemViewHolder.imageViewFlag=  view.findViewById(R.id.imageViewFlag);
            itemViewHolder.textViewInfo= view.findViewById(R.id.textViewInfo);
            view.setTag(itemViewHolder);
        }
        else
        {
            itemViewHolder =(CountryItemHolder)view.getTag();
        }
        //set item's data
        Country countryItem = listDataSource.get(i);
        itemViewHolder.textViewName.setText(countryItem.getCountryName());
        itemViewHolder.textViewInfo.setText("Population: "+ countryItem.getPopulation());
        //image data
        int flagID = getImageIDbyResName(countryItem.getCountryFlag());
        itemViewHolder.imageViewFlag.setImageResource(flagID);

        return view;
    }//reading image function
    public int getImageIDbyResName(String resName)
    {
        String packageName = context.getPackageName();
        int  imgID = context.getResources().getIdentifier(resName,"mipmap",packageName);
        return imgID;
    }
}
