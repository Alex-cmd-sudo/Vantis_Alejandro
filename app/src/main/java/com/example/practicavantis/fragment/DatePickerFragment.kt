package com.example.practicavantis.fragment

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import java.util.*

class DatePickerFragment: DialogFragment() {

    private var listener : DatePickerDialog.OnDateSetListener? = null


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(requireContext(), listener, year - 18, month, day)

        // Min and max date
        c.set(Calendar.YEAR, year - 100)
        datePickerDialog.datePicker.minDate = c.timeInMillis
        c.set(Calendar.YEAR, year - 10)
        datePickerDialog.datePicker.maxDate = c.timeInMillis

        return datePickerDialog
    }

    companion object {
        fun newInstance(listener: DatePickerDialog.OnDateSetListener): DatePickerFragment {
            val fragment = DatePickerFragment()
            fragment.listener = listener
            return fragment
        }
    }


}