package com.example.smartelec.smartelec;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by tejas on 1/20/2017.
 */

public class BillingFragment extends android.support.v4.app.Fragment {
    public BillingFragment(){
        super();
    }


    private ListView listView_billing;
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_billing, container, false);
        listView_billing = (ListView)rootView.findViewById(R.id.listview_billing);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        final String[] Table =  new String[]{"Bill Cycle Start Date : 1 January 2017","Bill Cycle End Date : 31 January 2017","Units Consumed In Last Bill Cycle : 200","Units Consumed Until Now : 91"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,android.R.id.text1, Table);
        listView_billing.setAdapter(adapter);

    }
}
