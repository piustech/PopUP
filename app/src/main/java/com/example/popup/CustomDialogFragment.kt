package com.example.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.DialogFragment

class CustomDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.dialog_popup, container, false)

        val cancel = rootView.findViewById<Button>(R.id.cancelButton)

        cancel.setOnClickListener {
            dismiss()
        }

        val submit = rootView.findViewById<Button>(R.id.submitButton)

        val ratingRadioGroup = rootView.findViewById<RadioGroup>(R.id.ratingRadioGroup)

        submit.setOnClickListener {
            val selectedId = ratingRadioGroup.checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectedId)

            val ratingResult = radio.text.toString()

            Toast.makeText(context, "You rated: $ratingResult", Toast.LENGTH_SHORT).show()
        }


        return rootView
    }
}