package com.example.practicavantis

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.PendingIntent.getActivity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        var month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        et_fechaInicial.setOnClickListener{
            val listenerInicial = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{viewModelStore, mYear, mMonth, mDay ->
            et_fechaInicial.setText(""+mYear+"/"+""+mMonth+"/"+mDay)
            }, year, month+1, day)

            var Ini:String
            val fechaInicial = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{viewModelStore,mYear,mMonth,mDay->
                Ini = (""+mYear+"/"+""+mMonth+"/"+mDay)
            }, year, month+1,day)

            listenerInicial.show()

        }

        et_fechaFinal.setOnClickListener{
            val listenerFinal = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{viewModelStore,mYear,mMonth,mDay->
            et_fechaFinal.setText(""+mYear+"/"+""+mMonth+"/"+mDay)
            }, year, month+1,day)

            var Fin:String
            val fechaFinal = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{viewModelStore,mYear,mMonth,mDay->
                Fin = (""+mYear+"/"+""+mMonth+"/"+mDay)
            }, year, month+1,day)
            listenerFinal.show()
        }

            btn_aceptar.setOnClickListener{

                    var Inicial = et_fechaInicial.toString()
                    var Final = et_fechaFinal.toString()

                    var n1 = Inicial.toInt()
                    var n2 = Final.toInt()

                    if(et_fechaInicial.equals(et_fechaFinal))
                    {
                        Toast.makeText(this,"OK",Toast.LENGTH_LONG).show()
                    }

                    else
                    {
                        Toast.makeText(this,"La fecha final no puede ser mayor a la inicial",Toast.LENGTH_LONG).show()
                    }



            }
    }


}

