package com.example.myapplication3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d: Double = 0.0

        button3.setOnClickListener {
            textView2.setText("0")
        }
        button2.setOnClickListener {
            if (textView2.text == "0" || textView2.text.length.toString() == "1") {
                textView2.setText("0")
            } else {
                textView2.setText(textView2.text.toString().dropLast(1))
            }
        }
        button5.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "7")
            } else {
                textView2.setText(textView2.text.toString() + "7")
            }
        }
        button9.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "8")
            } else {
                textView2.setText(textView2.text.toString() + "8")
            }
        }
        button8.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "9")
            } else {
                textView2.setText(textView2.text.toString() + "9")
            }
        }
        button10.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "4")
            } else {
                textView2.setText(textView2.text.toString() + "4")
            }
        }
        button11.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "5")
            } else {
                textView2.setText(textView2.text.toString() + "5")
            }
        }
        button12.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "6")
            } else {
                textView2.setText(textView2.text.toString() + "6")
            }
        }
        button16.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "1")
            } else {
                textView2.setText(textView2.text.toString() + "1")
            }
        }
        button19.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "2")
            } else {
                textView2.setText(textView2.text.toString() + "2")
            }
        }
        button18.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "3")
            } else {
                textView2.setText(textView2.text.toString() + "3")
            }
        }
        button23.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("0")
            } else {
                textView2.setText(textView2.text.toString() + "0")
            }
        }
        button22.setOnClickListener {
            if (!textView2.text.toString().contains(".")) {
                textView2.text = textView2.text.toString() + "."
            }
        }
        button4.setOnClickListener {
            c = "/"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button6.setOnClickListener {
            c = "*"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button13.setOnClickListener {
            c = "-"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button17.setOnClickListener {
            c = "+"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button2.setOnClickListener {
            c = "%"
            a = textView2.text.toString()
            textView2.setText("0")
        }
        button24.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            } else if (c == "*") {
                d = (a.toString().toDouble() * textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            }else if (c == "%") {
                d = (a.toString().toDouble() % textView2.text.toString().toDouble())
                textView2.setText(d.toString())
            }
        }
    }
}