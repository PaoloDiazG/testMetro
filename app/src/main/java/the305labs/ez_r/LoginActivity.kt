package the305labs.ez_r

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, getString(R.string.login_toast_credentials_needed), Toast.LENGTH_SHORT).show() // Changed
                return@setOnClickListener
            }

            signInWithUsernamePassword(username, password)
        }
    }

    private fun signInWithUsernamePassword(username: String, password: String) {
        // TODO: Implement Firebase authentication logic here
        Toast.makeText(this, getString(R.string.login_toast_firebase_not_implemented), Toast.LENGTH_LONG).show() // Changed
    }
}
