package com.example.uidesign

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_automatic.*

class activity_automatic : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_automatic)


        val alertbutton = findViewById(R.id.switchtomanual) as Button


// this gets the signal from the menu

        fun getMyVariable2(): Int {
            if (intent != null) {
                if (intent.extras != null) {
                    return intent.extras!!.getInt("SecondVariable")
                }
            }
            return 109 // default
        }


// this gets the signal from the menu

        fun getMyVariable3(): Int {
            if (intent != null) {
                if (intent.extras != null) {
                    return intent.extras!!.getInt("fromManualLink")
                }
            }
            return 109 // default
        }



        fun ok () {
                val intentforward = Intent(this, ManualActivity2::class.java)
                intentforward.putExtra("SecondVariable", getMyVariable2())
                startActivity(intentforward)
        }

        alertbutton.setOnClickListener {
            val builder = AlertDialog.Builder(this@activity_automatic)
            builder.setTitle("Warning")
            builder.setMessage("You are about to exit the automatic mode.\n Do you want to continue?")
            builder.setPositiveButton("OK") { dialog, which ->
                  ok()   }
            builder.setNegativeButton("Cancel") { dialog, which ->
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }



        val go_back3 = findViewById(R.id.back3) as ImageButton

        go_back3.setOnClickListener {
            val intentback = Intent(this, MenuActivity::class.java)
            intentback.putExtra("BackVariable1", getMyVariable2())
            startActivity(intentback)
        }




        if(getMyVariable2()==1) {

            var menuchange = findViewById(R.id.onoff3) as Button;
            menuchange.setBackgroundResource(R.drawable.transparent);
        }



        if(getMyVariable3()==1) {

            var menuchange = findViewById(R.id.onoff3) as Button;
            menuchange.setBackgroundResource(R.drawable.transparent);
        }



    }
}
