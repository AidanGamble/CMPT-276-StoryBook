package com.example.storbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;


import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import com.github.mikephil.charting.utils.Utils;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;




import java.util.ArrayList;
import java.util.List;

public class CaretakerStat extends AppCompatActivity {

    ArrayList<String> Titles = ((global) this.getApplication()).picutreTitles;
    ArrayList<String> clickedtimes = ((global) this.getApplication()).pictureTimeClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caretaker_stat);

        BarChart chart = findViewById(R.id.BarChart);

        BarDataSet bardataset = new BarDataSet(data1(),"Time clicked");

        BarData barData = new BarData();

        barData.addDataSet(bardataset);

        chart.setData(barData);


    }

    private ArrayList<BarEntry> data1 () {

        ArrayList<BarEntry> datalist = new ArrayList<>();

        for(int i = 1; i < Titles.size()+1; i++){
            datalist.add((new BarEntry(i, Integer.valueOf(clickedtimes.get(i)))));
        }

        return datalist;
    }

}
