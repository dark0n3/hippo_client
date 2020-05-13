package com.example.hippo.ui.registration

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hippo.R
import com.example.hippo.isValidCode
import com.example.hippo.validate
import kotlinx.android.synthetic.main.activity_code_registration.*

class CodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_registration)
        registrationCodeButton.setOnClickListener {
            confirmationCode.validate("Wrong code") { s -> s.isValidCode() }
            if(confirmationCode.text.toString().isValidCode())
            startActivity(Intent(this, PersonalActivity::class.java))
        }
    }
}