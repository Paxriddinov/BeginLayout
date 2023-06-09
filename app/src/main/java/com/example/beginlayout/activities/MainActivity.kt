package com.example.beginlayout.activities

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import com.example.beginlayout.R
import com.example.beginlayout.R.id

class MainActivity : AppCompatActivity() {

    private lateinit var editTextSample:TextView
    lateinit var tvSample:TextView
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextSample = findViewById(id.editTextSample)
        tvSample = findViewById(id.tvSample)
        editTextSample.addTextChangedListener(object:android.text.TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                tvSample.text = "Text in EditText :$s"
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
        initView()
    }

    private fun initView(){
        val textView = findViewById<TextView>(id.hashtag)
        val text = "Wake up to reality. Nothing ever goes as planned in this accursed world. The more you live in our #Willmark, " +
                "the more you realize that the only thing truly exists in this reality are merely pain and suffering"
        val wordToSpan:Spannable = SpannableString(text)
        wordToSpan.setSpan(ForegroundColorSpan(Color.BLUE), 97, 107, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = wordToSpan
    }
}