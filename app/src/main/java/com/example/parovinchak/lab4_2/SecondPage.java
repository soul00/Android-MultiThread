package com.example.parovinchak.lab4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;



public class SecondPage extends AppCompatActivity {
    public static int prog = 0;
    public static int iterations;
    public static int threads;
    public static int time;

    Thread Thread1;
    Thread Thread2;
    Thread Thread3;
    Thread Thread4;
    Thread Thread5;
    Thread Thread6;
    Thread Thread7;
    Thread Thread8;
    Thread Thread9;
    Thread Thread10;
    Thread Thread11;
    Thread Thread12;
    Thread Thread13;
    Thread Thread14;
    Thread Thread15;
    Thread Thread16;
    public static String TAG = "requestThread";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);


        Button buttonSecond = (Button)findViewById(R.id.buttonSecond);
        TextView voiceToText = (TextView)findViewById(R.id.voiceToText);
        TextView voiceToTextPotok = (TextView)findViewById(R.id.voiceToTextPotok);
        Button StopButton = (Button)findViewById(R.id.StopButton);
        final Button buttonResult = (Button)findViewById(R.id.buttonResult);
        final TextView result = (TextView)findViewById(R.id.result);
        final ProgressBar progress = (ProgressBar)findViewById(R.id.progressBar);


        String iter ;
        String potok;


        iter = getIntent().getExtras().getString("iter");
        potok = getIntent().getExtras().getString("potok");

        iterations = Integer.parseInt(iter);
        threads = Integer.parseInt(potok);

        voiceToText.setText("Обрана кількість ітерацій:  " + iter);
        voiceToTextPotok.setText("Обрана кількість потоків:  " + potok);


        buttonSecond = (Button) findViewById(R.id.buttonSecond);


        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (threads == 2) {
                    Thread1 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread1.isInterrupted()) {
                                Calcul(iterations / threads, 1);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread2 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread2.isInterrupted()) {
                                Calcul(iterations / threads, 2);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread1.start();
                    Log.i(TAG, "Потік #1 почав роботу");
                    Thread2.start();
                    Log.i(TAG, "Потік #2 почав роботу");
                }

                if (threads == 4) {
                    Thread1 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread1.isInterrupted()) {
                                Calcul(iterations / threads, 1);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread2 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread2.isInterrupted()) {
                                Calcul(iterations / threads, 2);
                                progress.setProgress(prog);
                            }
                        }
                    });
                    Thread3 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread3.isInterrupted()) {
                                Calcul(iterations / threads, 3);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread4 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread4.isInterrupted()) {
                                Calcul(iterations / threads, 4);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread1.start();
                    Log.i(TAG, "Потік #1 почав роботу");
                    Thread2.start();
                    Log.i(TAG, "Потік #2 почав роботу");
                    Thread3.start();
                    Log.i(TAG, "Потік #3 почав роботу");
                    Thread4.start();
                    Log.i(TAG, "Потік #4 почав роботу");
                }

                if (threads == 8) {
                    Thread1 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread1.isInterrupted()) {
                                Calcul(iterations / threads, 1);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread2 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread2.isInterrupted()) {
                                Calcul(iterations / threads, 2);
                                progress.setProgress(prog);
                            }
                        }
                    });
                    Thread3 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread3.isInterrupted()) {
                                Calcul(iterations / threads, 3);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread4 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread4.isInterrupted()) {
                                Calcul(iterations / threads, 4);
                                progress.setProgress(prog);
                            }
                        }
                    });
                    Thread5 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread5.isInterrupted()) {
                                Calcul(iterations / threads, 5);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread6 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread6.isInterrupted()) {
                                Calcul(iterations / threads, 6);
                                progress.setProgress(prog);
                            }
                        }
                    });
                    Thread7 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread7.isInterrupted()) {
                                Calcul(iterations / threads, 7);
                                progress.setProgress(prog);

                            }
                        }
                    });

                    Thread8 = new Thread(new Runnable() {
                        public void run() {
                            if (!Thread8.isInterrupted()) {
                                Calcul(iterations / threads, 8);
                                progress.setProgress(prog);
                            }
                        }
                    });

                    Thread1.start();
                    Log.i(TAG, "Потік #1 почав роботу");
                    Thread2.start();
                    Log.i(TAG, "Потік #2 почав роботу");
                    Thread3.start();
                    Log.i(TAG, "Потік #3 почав роботу");
                    Thread4.start();
                    Log.i(TAG, "Потік #4 почав роботу");
                    Thread5.start();
                    Log.i(TAG, "Потік #5 почав роботу");
                    Thread6.start();
                    Log.i(TAG, "Потік #6 почав роботу");
                    Thread7.start();
                    Log.i(TAG, "Потік #7 почав роботу");
                    Thread8.start();
                    Log.i(TAG, "Потік #8 почав роботу");
                }

                if (threads == 16) {
                    Thread1 = new Thread(new Runnable() {
                        @Override
                        public void run() {

                            Thread1 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread1.isInterrupted()) {
                                        Calcul(iterations / threads, 1);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread2 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread2.isInterrupted()) {
                                        Calcul(iterations / threads, 2);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread3 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread3.isInterrupted()) {
                                        Calcul(iterations / threads, 3);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread4 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread4.isInterrupted()) {
                                        Calcul(iterations / threads, 4);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread5 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread5.isInterrupted()) {
                                        Calcul(iterations / threads, 5);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread6 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread6.isInterrupted()) {
                                        Calcul(iterations / threads, 6);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread7 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread7.isInterrupted()) {
                                        Calcul(iterations / threads, 7);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread8 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread8.isInterrupted()) {
                                        Calcul(iterations / threads, 8);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread9 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread9.isInterrupted()) {
                                        Calcul(iterations / threads, 9);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread10 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread10.isInterrupted()) {
                                        Calcul(iterations / threads, 10);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread11 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread11.isInterrupted()) {
                                        Calcul(iterations / threads, 11);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread12 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread12.isInterrupted()) {
                                        Calcul(iterations / threads, 12);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread13 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread13.isInterrupted()) {
                                        Calcul(iterations / threads, 13);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread14 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread14.isInterrupted()) {
                                        Calcul(iterations / threads, 14);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                            Thread15 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread15.isInterrupted()) {
                                        Calcul(iterations / threads, 15);
                                        progress.setProgress(prog);
                                    }
                                }
                            });

                            Thread16 = new Thread(new Runnable() {
                                public void run() {
                                    if (!Thread16.isInterrupted()) {
                                        Calcul(iterations / threads, 16);
                                        progress.setProgress(prog);
                                    }
                                }
                            });
                        }
                    });

                    Thread1.start();
                    Log.i(TAG, "Потік #1 почав роботу");
                    Thread2.start();
                    Log.i(TAG, "Потік #2 почав роботу");
                    Thread3.start();
                    Log.i(TAG, "Потік #3 почав роботу");
                    Thread4.start();
                    Log.i(TAG, "Потік #4 почав роботу");
                    Thread5.start();
                    Log.i(TAG, "Потік #5 почав роботу");
                    Thread6.start();
                    Log.i(TAG, "Потік #6 почав роботу");
                    Thread7.start();
                    Log.i(TAG, "Потік #7 почав роботу");
                    Thread8.start();
                    Log.i(TAG, "Потік #8 почав роботу");
                    Thread9.start();
                    Log.i(TAG, "Потік #9 почав роботу");
                    Thread10.start();
                    Log.i(TAG, "Потік #10 почав роботу");
                    Thread11.start();
                    Log.i(TAG, "Потік #11 почав роботу");
                    Thread12.start();
                    Log.i(TAG, "Потік #12 почав роботу");
                    Thread13.start();
                    Log.i(TAG, "Потік #13 почав роботу");
                    Thread14.start();
                    Log.i(TAG, "Потік #14 почав роботу");
                    Thread15.start();
                    Log.i(TAG, "Потік #15 почав роботу");
                    Thread16.start();
                    Log.i(TAG, "Потік #16 почав роботу");
                }
            }
        });
        StopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnPause();
            }
        });


        buttonResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v) {
                    result.setText(String.valueOf(io));
                    prog = 0;
                    io = 0;
            }
        });
    }


    protected void OnPause(){
        super.onPause();

        if (threads == 2){
            try {
                Thread1.interrupt();
                Log.i(TAG,"Потік #1 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread2.interrupt();
                Log.i(TAG,"Потік #2 зупинений ");
            }catch (Exception ex){

            }
        }

        if (threads == 4){
            try {
                Thread1.interrupt();
                Log.i(TAG,"Потік #1 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread2.interrupt();
                Log.i(TAG,"Потік #2 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread3.interrupt();
                Log.i(TAG,"Потік #3 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread4.interrupt();
                Log.i(TAG,"Потік #4 зупинений ");
            }catch (Exception ex){

            }
        }

        if (threads == 8){
            try {
                Thread1.interrupt();
                Log.i(TAG,"Потік #1 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread2.interrupt();
                Log.i(TAG,"Потік #2 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread3.interrupt();
                Log.i(TAG,"Потік #3 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread4.interrupt();
                Log.i(TAG,"Потік #4 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread5.interrupt();
                Log.i(TAG,"Потік #5 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread6.interrupt();
                Log.i(TAG,"Потік #6 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread7.interrupt();
                Log.i(TAG,"Потік #7 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread8.interrupt();
                Log.i(TAG,"Потік #8 зупинений ");
            }catch (Exception ex){

            }
        }

        if (threads == 16){
            try {
                Thread1.interrupt();
                Log.i(TAG,"Потік #1 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread2.interrupt();
                Log.i(TAG,"Потік #2 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread3.interrupt();
                Log.i(TAG,"Потік #3 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread4.interrupt();
                Log.i(TAG,"Потік #4 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread5.interrupt();
                Log.i(TAG,"Потік #5 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread6.interrupt();
                Log.i(TAG,"Потік #6 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread7.interrupt();
                Log.i(TAG,"Потік #7 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread8.interrupt();
                Log.i(TAG,"Потік #8 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread9.interrupt();
                Log.i(TAG,"Потік #9 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread10.interrupt();
                Log.i(TAG,"Потік #10 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread11.interrupt();
                Log.i(TAG,"Потік #11 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread12.interrupt();
                Log.i(TAG,"Потік #12 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread13.interrupt();
                Log.i(TAG,"Потік #13 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread14.interrupt();
                Log.i(TAG,"Потік #14 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread15.interrupt();
                Log.i(TAG,"Потік #15 зупинений ");
            }catch (Exception ex){

            }
            try {
                Thread16.interrupt();
                Log.i(TAG,"Потік #16 зупинений ");
            }catch (Exception ex){

            }
        }
    }


    protected static void Calcul(int n, int t){
        Log.i(TAG,t +" - Почав роботу");
        long io2 = 0,io1 = 0;
        if (t %2 == 0) {
            for (long i = 1, ar1 = -3; (int) i <= n; i++) {
                io2 += ar1;
                ar1 -= 4;
            }
        }
        else {
            for (long i = 1, ar2 = 1; (int) i <= t; i++) {
                io1 += ar2;
                ar2 += 4;
            }
        }
        Log.i(TAG,t +" - Закінчив роботу");

        io += io1 + io2;
        prog += 100/threads;
    }
    public static long io = 0;
}

