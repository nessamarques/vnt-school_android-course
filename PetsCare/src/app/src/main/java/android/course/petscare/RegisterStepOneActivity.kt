package android.course.petscare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterStepOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_step_one)

        findViewById<Button>(R.id.buttonNext).setOnClickListener {
            val intentRegisterStepTwo = Intent(this, RegisterStepTwoActivity::class.java)
            startActivity(intentRegisterStepTwo)
        }
    }
}