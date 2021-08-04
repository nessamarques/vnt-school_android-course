package android.course.petscare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            val intentVerification = Intent(this, VerificationActivity::class.java)
            startActivity(intentVerification)
        }
    }
}