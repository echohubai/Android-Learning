package com.example.hubai.broadcastbestpractice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by hubai on 2016/7/4.
 */
public class LoginAcitvity extends BaseActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanaceState) {
        super.onCreate(savedInstanaceState);
        setContentView(R.layout.login);
        accountEdit = (EditText) findViewById(R.id.account);
        accountEdit = (EditText) findViewById(R.id.password);
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String account = accountEdit.getText().toString();
          String password = accountEdit.getText().toString();
                  if (account.equals("admin")&& password.equals("123456")) {
                      Intent intent = new Intent(LoginAcitvity.this,MainActivity.class);
  startActivity(intent);
finish();
}
else  {
                      Toast.makeText(LoginAcitvity.this,"account or password is invaild",Toast.LENGTH_SHORT).show();
}
}
});
}
}