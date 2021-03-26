package com.dilshan.androidchartdemo;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class piedemo extends AppCompatActivity
{
  PieChart piechart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedemo);

        piechart=(PieChart)findViewById(R.id.piechart);

        ArrayList<PieEntry> records=new ArrayList<>();
        records.add(new PieEntry(32,"Quarter1"));
        records.add(new PieEntry(14,"Quarter2"));
        records.add(new PieEntry(34,"Quarter3"));
        records.add(new PieEntry(38,"Quarter4"));

        PieDataSet dataSet=new PieDataSet(records,"Pie Chart Report");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(22f);

        PieData pieData=new PieData(dataSet);

        piechart.setData(pieData);
        piechart.getDescription().setEnabled(true);
        piechart.setCenterText("Quarterly Revenue");
        piechart.animate();
    }

}