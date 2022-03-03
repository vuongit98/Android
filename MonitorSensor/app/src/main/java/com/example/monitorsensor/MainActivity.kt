package com.example.monitorsensor

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Mapping();
        findViewById<Button>(R.id.btn_history)?.setOnClickListener{
            val intent = Intent(this,HistoryActivity::class.java);
            startActivity(intent);
        }

    }

    fun Mapping(){
        val txtTitle = findViewById<TextView>(R.id.txt_title) as TextView ;
        val txtNameHm = findViewById<TextView>(R.id.txt_humidity) as TextView ;
        val txtNameHmValue = findViewById<TextView>(R.id.txt_humidity_value) as TextView ;

        val txtNameTm = findViewById<TextView>(R.id.txt_temperature) as TextView ;
        val txtNameTmValue = findViewById<TextView>(R.id.txt_temperature_1) as TextView ;

        val txtNameSl = findViewById<TextView>(R.id.txt_solid) as TextView ;
        val txtNameSlValue = findViewById<TextView>(R.id.txt_solid_value) as TextView ;

        txtTitle.text = getString(R.string.title);

        txtNameHm.text = "Humidity: "
        txtNameHm.setTextColor(Color.RED);
        txtNameHmValue.text = "Value"
        txtNameHmValue.setTextColor(Color.BLUE);

        txtNameTm.text = "Temperature: "
        txtNameTm.setTextColor(Color.RED);
        txtNameTmValue.text = "Value"
        txtNameTmValue.setTextColor(Color.BLUE);

        txtNameSl.text = "Solid: "
        txtNameSl.setTextColor(Color.RED);
        txtNameSlValue.text = "Value"
        txtNameSlValue.setTextColor(Color.BLUE);



    }
}