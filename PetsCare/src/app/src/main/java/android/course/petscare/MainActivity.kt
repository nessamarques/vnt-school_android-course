package android.course.petscare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val intentLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentLogin)
        }

        findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            val intentRegisterStepOne = Intent(this, RegisterStepOneActivity::class.java)
            startActivity(intentRegisterStepOne)
        }
    }
}