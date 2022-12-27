package com.template.listviewsample

import android.app.ListActivity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.test.core.app.ApplicationProvider

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val stationsArray = resources.getStringArray(R.array.stations)
        val aa: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            R.layout.list_item,
            stationsArray
        )

        listAdapter = aa
        val lv: ListView = listView
        lv.adapter = aa

        lv.onItemClickListener


        //    @Override
        //    public void onCreate(Bundle savedInstanceState) {
        //        super.onCreate(savedInstanceState);
        //        Resources r = getResources();
        //        String[] stationsArray =
        //                r.getStringArray(R.array.stations);
        //        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
        //                R.layout.list_item, stationsArray);
        //        setListAdapter(aa);
        //        ListView lv = getListView();
        //        lv.setAdapter(aa);
        //    }

    }

    fun onItemClick(
        parent: AdapterView<*>?,
        v: View, position: Int, id: Long
    ) {
        val text: CharSequence = (v as TextView).text
        val duration = Toast.LENGTH_LONG
        val context: Context = ApplicationProvider.getApplicationContext()
        Toast.makeText(context, text, duration).show()
    }

    //    @Override
    //    public void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        Resources r = getResources();
    //        String[] stationsArray =
    //                r.getStringArray(R.array.stations);
    //        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
    //                R.layout.list_item, stationsArray);
    //        setListAdapter(aa);
    //        ListView lv = getListView();
    //        lv.setAdapter(aa);
    //    }


}