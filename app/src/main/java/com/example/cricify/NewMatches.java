package com.example.cricify;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Switch;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class NewMatches extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_matches);



        final Handler autoUpdateHandler;
        autoUpdateHandler = new Handler();
        autoUpdateHandler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                //start the following method every 1 second.
                updateChartFromJson("1187686",1);
                updateChartFromJson("1213873",2);
                updateChartFromJson("1214667",3);
                updateChartFromJson("1173063",4);
                updateChartFromJson("1203612",5);
                updateChartFromJson("1203611",6);
                autoUpdateHandler.postDelayed(this,100000);

            }
        },1000);

    }

    public void updateChartFromJson(String s, final int no) {

        final TextView t1 = findViewById(R.id.textViewCricapi);
        final TextView t2 = findViewById(R.id.textViewCricapi2);
        final TextView t3 = findViewById(R.id.textViewCricapi3);
        final TextView t4 = findViewById(R.id.textViewCricapi4);
        final TextView t5 = findViewById(R.id.textViewCricapi5);
        final TextView t6 = findViewById(R.id.textViewCricapi6);

        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);
        String u="https://cricapi.com/api/cricketScore?apikey=VAr7k5kS9Lc4RqGCryqEmMS8sWo1&unique_id=1234567";
        String url=u.replace("1234567",s);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(final JSONObject response) {

                try {
                    String x = response.getString("score");
                    //t1.setText(x);
                    switch (no) {
                        case 1: t1.setText(x);break;
                        case 2: t2.setText(x);break;
                        case 3: t3.setText(x);break;
                        case 4: t4.setText(x);break;
                        case 5: t5.setText(x);break;
                        case 6: t6.setText(x);break;
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("myapp", "Something went wrong");

            }
        });
        requestQueue.add(jsonObjectRequest);

    }
}
