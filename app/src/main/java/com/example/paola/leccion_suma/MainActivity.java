package com.example.paola.leccion_suma;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    TextView numeros;
    EditText respuesta;
    Button btn;
    Intent itemintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta = (EditText) findViewById(R.id.respuesta);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(this);

        itemintent = new Intent(MainActivity.this, pantalla.class);


    }

    @Override
    public void onClick(View v) {
       Integer r = 5;
       Integer r2;
       Integer intentos=0;


        r2= Integer.valueOf(respuesta.getText().toString());

        if(r==r2){
            Log.d("myTag", "Muy bien");
            itemintent = new Intent(MainActivity.this, pantalla.class);
            startActivity(itemintent);
            intentos++;
            Log.d("myTag", "Muy bien"+intentos);

            if (intentos==3){


            }


            /*NotificationCompat.Builder mBuilder;
            NotificationManager mNotifyMgr =(NotificationManager) getApplicationContext().getSystemService(NOTIFICATION_SERVICE);


            int icono = R.mipmap.ic_launcher;
            Intent i=new Intent(MainActivity.this, MensajeActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, i, 0);

            mBuilder =new NotificationCompat.Builder(getApplicationContext())
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(icono)
                    .setContentTitle("Titulo")
                    .setContentText("Hola que tal?")
                    .setVibrate(new long[] {100, 250, 100, 500})
                    .setAutoCancel(true);


            mNotifyMgr.notify(1, mBuilder.build());
*/

        }else

            Log.d("myTag", "Mal");
        Vibrator v2 = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        v2.vibrate(3000);
    }
}
