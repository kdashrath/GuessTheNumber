package com.example.dashrath.apps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity() : AppCompatActivity() {
    var chosen_number = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnchoose.setOnClickListener {
            chosen_number = Random().nextInt(100) + 1
            label1.text = "I've chosen a nuber.now you guess it"
        }


        btnsubmit.setOnClickListener{
            val user_guess_str = editText.text.toString()
            val user_guess = Integer.parseInt(user_guess_str)
            editText.setText("")
            when
            {
                chosen_number > user_guess -> label1.text = "guess higher"
                chosen_number == user_guess ->label1.text = "correct guess"
                else -> label1.text = "guess lower"
        }
    }

    }


}
