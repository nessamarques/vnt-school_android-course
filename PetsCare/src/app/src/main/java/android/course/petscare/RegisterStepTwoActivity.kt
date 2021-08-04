package android.course.petscare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterStepTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_step_two)

        findViewById<Button>(R.id.buttonRegisterStepTwo).setOnClickListener{
            val intentLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentLogin)
        }
    }
}