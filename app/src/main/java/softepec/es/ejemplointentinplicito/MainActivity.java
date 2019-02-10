package softepec.es.ejemplointentinplicito;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnWeb, btnContacts, btnCall, btnSearch, btnVoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWeb = findViewById(R.id.buttonWeb); btnWeb.setOnClickListener(this);
        btnContacts = findViewById(R.id.buttonContacts); btnContacts.setOnClickListener(this);
        btnCall = findViewById(R.id.buttonCall); btnCall.setOnClickListener(this);
        btnSearch = findViewById(R.id.buttonWebSearch); btnSearch.setOnClickListener(this);
        btnVoice = findViewById(R.id.buttonVoiceCommand); btnVoice.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.buttonWeb:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://escuelaestech.es"));
                break;
            case R.id.buttonContacts:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://contacts/people/"));
                break;
            case R.id.buttonCall:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:953636000"));
                break;
            case R.id.buttonWebSearch:
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, "estech");
                break;
            case R.id.buttonVoiceCommand:
                intent.setAction(Intent.ACTION_VOICE_COMMAND);
                break;
        }

        startActivity(intent);

    }
}
