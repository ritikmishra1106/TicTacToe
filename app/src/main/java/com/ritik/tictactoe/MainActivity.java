package com.ritik.tictactoe;

import static java.lang.ref.Cleaner.create;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private String startGame ="X";

    int b1 =5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5,xCount =0,oCount =0,i=1;
    private TextView scoreX,scoreO;
    private Button Reset;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =findViewById(R.id.btnImg1);
        btn2 =findViewById(R.id.btnImg2);
        btn3 =findViewById(R.id.btnImg3);
        btn4 =findViewById(R.id.btnImg4);
        btn5 =findViewById(R.id.btnImg5);
        btn6 =findViewById(R.id.btnImg6);
        btn7 =findViewById(R.id.btnImg7);
        btn8 =findViewById(R.id.btnImg8);
        btn9 =findViewById(R.id.btnImg9);

        scoreX =findViewById(R.id.scoreX);
        scoreO=findViewById(R.id.scoreO);

        Reset =findViewById(R.id.Reset);


        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                btn1.setImageDrawable(null);
//                btn2.setImageDrawable(null);
//                btn3.setImageDrawable(null);
//                btn4.setImageDrawable(null);
//                btn5.setImageDrawable(null);
//                btn6.setImageDrawable(null);
//                btn7.setImageDrawable(null);
//                btn8.setImageDrawable(null);
//                btn9.setImageDrawable(null);
//
//                resetValue();
//
//                xCount=0;
//                oCount=0;
//
//                scoreX.setText("Score X:- "+String.valueOf(xCount));
//                scoreO.setText("Score O:- "+String.valueOf(oCount));


                        Intent iHome = new Intent(MainActivity.this,splashScreen.class);
                        startActivity(iHome);
                         finish();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn1.setImageResource(R.drawable.cross);
                    b1=1;
                }
                else{
                    btn1.setImageResource(R.drawable.circle);
                    b1=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn2.setImageResource(R.drawable.cross);
                    b2=1;
                }
                else{
                    btn2.setImageResource(R.drawable.circle);
                    b2=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn3.setImageResource(R.drawable.cross);
                    b3=1;
                }
                else{
                    btn3.setImageResource(R.drawable.circle);
                    b3=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn4.setImageResource(R.drawable.cross);
                    b4=1;
                }
                else{
                    btn4.setImageResource(R.drawable.circle);
                    b4=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn5.setImageResource(R.drawable.cross);
                    b5=1;
                }
                else{
                    btn5.setImageResource(R.drawable.circle);
                    b5=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn6.setImageResource(R.drawable.cross);
                    b6=1;
                }
                else{
                    btn6.setImageResource(R.drawable.circle);
                    b6=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn7.setImageResource(R.drawable.cross);
                    b7=1;
                }
                else{
                    btn7.setImageResource(R.drawable.circle);
                    b7=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn8.setImageResource(R.drawable.cross);
                    b8=1;
                }
                else{
                    btn8.setImageResource(R.drawable.circle);
                    b8=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(startGame.equals("X")){
                    btn9.setImageResource(R.drawable.cross);
                    b9=1;
                }
                else{
                    btn9.setImageResource(R.drawable.circle);
                    b9=0;
                }
                choosePlayer();
                winingGame();
                i++;
            }
        });
    }
    private void winingGame(){
        if((b1==1) && (b2==1) && (b3==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b4==1) && (b5==1) && (b6==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b7==1) && (b8==1) && (b9==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b1==1) && (b4==1) && (b7==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b2==1) && (b5==1) && (b8==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b3==1) && (b6==1) && (b9==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b1==1) && (b5==1) && (b9==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }
        else if((b3==1) && (b5==1) && (b7==1)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player X wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            xCount++;
            scoreX.setText("Score X:- "+String.valueOf(xCount));

        }

//        O Player Condition-

        else if((b1==0) && (b2==0) && (b3==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b4==0) && (b5==0) && (b6==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b7==0) && (b8==0) && (b9==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b1==0) && (b4==0) && (b7==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b2==0) && (b5==0) && (b8==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b3==0) && (b6==0) && (b9==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b1==0) && (b5==0) && (b9==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else if((b3==0) && (b5==0) && (b7==0)){
            AlertDialog.Builder builder =new AlertDialog.Builder(this);
            builder.setMessage("Player O wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    btn1.setImageDrawable(null);
                    btn2.setImageDrawable(null);
                    btn3.setImageDrawable(null);
                    btn4.setImageDrawable(null);
                    btn5.setImageDrawable(null);
                    btn6.setImageDrawable(null);
                    btn7.setImageDrawable(null);
                    btn8.setImageDrawable(null);
                    btn9.setImageDrawable(null);

                    resetValue();
                }
            });
            AlertDialog alertDialog =builder.create();
            alertDialog.show();
            oCount++;
            scoreO.setText("Score O:- "+String.valueOf(oCount));

        }
        else {

            if (i==9){
                AlertDialog.Builder builder =new AlertDialog.Builder(this);
                builder.setMessage("No One wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btn1.setImageDrawable(null);
                        btn2.setImageDrawable(null);
                        btn3.setImageDrawable(null);
                        btn4.setImageDrawable(null);
                        btn5.setImageDrawable(null);
                        btn6.setImageDrawable(null);
                        btn7.setImageDrawable(null);
                        btn8.setImageDrawable(null);
                        btn9.setImageDrawable(null);

                        resetValue();
                    }
                });
                AlertDialog alertDialog =builder.create();
                alertDialog.show();
            }
        }

    }
    private void choosePlayer(){
        if (startGame.equals("X")){
            startGame="O";
        }
        else{
            startGame="X";
        }
    }
    private void resetValue(){
        b1 =5;b2=5;b3=5;b4=5;b5=5;b6=5;b7=5;b8=5;b9=5;i=1;
    }

}