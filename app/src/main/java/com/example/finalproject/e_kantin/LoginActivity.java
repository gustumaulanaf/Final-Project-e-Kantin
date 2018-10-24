package com.example.finalproject.e_kantin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

  //  EditText editTextNIM;
    //EditText editTextPassword;
    //Declaration TextInputLayout
    TextView textViewNIM;
    TextView textViewPassword;


    //Declaration Button
    Button buttonLogin;




    //Declaration SqliteHelper
    //SQLiteHelper sqliteHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //sqliteHelper = new SQLiteHelper(this);
        //initCreateAccountTextView();
        // initViews();

        //set click event of login button
        /*buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = editTextNIM.getText().toString();
                String Password = editTextPassword.getText().toString();

                if (Email.equals("abc")&&Password.equals(12345)) {
                    Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
                }else {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            }
            }});}*/
    }


    public void but1(View view) {
      //  String Email = editTextNIM.getText().toString();
      //  String Password = editTextPassword.getText().toString();

     /*   if (Email.equals("abc")&&Password.equals(12345)) {
            Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
            startActivity(intent);
        }else {

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
        */
     Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

   /*  Bundle kirim = new Bundle();
     kirim.putString("email",Email);
     kirim.putString("password",Password);
     intent.putExtras(kirim);
     startActivity(intent);
*/
    }
}

                //Check user input is correct or not
                /*if (validate()) {

                    //Get values from EditText fields
                    String Email = editTextNIM.getText().toString();
                    String Password = editTextPassword.getText().toString();

                    //Authenticate user
                    user currentUser = sqliteHelper.Authenticate(new user(null, null, Email, Password));

                    //Check Authentication is successful or not

                    if (Email.equals("abc")&&Password.equals(12345)) {
                        Toast.makeText(LoginActivity.this, "Login Sucess", Toast.LENGTH_SHORT).show();

                        //User Logged in Successfully Launch You home screen activity
                        Intent intent=new Intent(LoginActivity.this, AdminActivity.class);
                        Bundle bundle_login = new Bundle();

                        bundle_login.putString("email", Email);
                        intent.putExtras(bundle_login);
                        startActivity(intent);
                        finish();

                    } else {
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                        //User Logged in Failed
                        Toast.makeText(LoginActivity.this, "Login failed, try again", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });


    }


   /* public void but1(View view) {

        Toast.makeText(getApplicationContext(), "Success Login", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);


    }
    //this method used to set Create account TextView text and click event( maltipal colors
    // for TextView yet not supported in Xml so i have done it programmatically)
    //private void initCreateAccountTextView() {
      //  TextView textViewCreateAccount = (TextView) findViewById(R.id.textViewCreateAccount);
        //textViewCreateAccount.setText(fromHtml("<font color='#000000'>Belum punya Akun? </font><font color='#0c0099'>Daftar</font>"));
        //textViewCreateAccount.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Intent intent = new Intent(LoginActivity.this, MainActivity.class);
               // startActivity(intent);
       //     }
       // });
    //}

    //this method is used to connect XML views to its Objects
    private void initViews() {
        editTextNIM = (EditText) findViewById(R.id.text1);
        editTextPassword = (EditText) findViewById(R.id.pasw1);
        buttonLogin = (Button) findViewById(R.id.bt1);

    }

    //This method is for handling fromHtml method deprecation
   /* @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }*/

                //This method is used to validate input given by user
   /* public boolean validate() {
        boolean valid = false;

        //Get values from EditText fields
        String Email = editTextNIM.getText().toString();
        String Password = editTextPassword.getText().toString();

        //Handling validation for Email field
        if (!Email.equals("abc")) {
            valid = false;
            textViewNIM.setError("Please enter valid email!");
        } else {
            valid = true;
            textViewNIM.setError(null);
        }

        //Handling validation for Password field
        if (Password.isEmpty()) {
            valid = false;
            textViewPassword.setError("Please enter valid password!");
        } else {
            if (Password.length() > 5) {
                valid = true;
                textViewPassword.setError(null);
            } else {
                valid = false;
                textViewPassword.setError("Password is to short!");
            }
        }

        return valid;
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa kalian ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        moveTaskToBack(true);

                    }
                })
                .setNegativeButton("No", null)
                .show();
    }*/
    //        }