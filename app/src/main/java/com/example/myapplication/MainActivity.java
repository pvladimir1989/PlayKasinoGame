package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button buttonLoseGame1;
    Button buttonLoseGame2;
    Button buttonLoseGame3;
    Button buttonWinGame;
    TextView textViewWinSum;
    TextView textViewRateSum;
    TextView textViewLastWinSum;
    Button buttonRefresh;
    String[] arrStr1 = new String[]{"Win", "Lose", "Lose", "Lose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playGame();

    }

    public void playGame() {

        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonLoseGame1 = findViewById(R.id.buttonLoseGame1);
        buttonLoseGame2 = findViewById(R.id.buttonLoseGame2);
        buttonLoseGame3 = findViewById(R.id.buttonLoseGame3);
        buttonWinGame = findViewById(R.id.buttonWinGame);

//        Integer[] arr = new Integer[4];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        Collections.shuffle(Arrays.asList(arr));
//        Arrays.toString(arr);

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
////                buttonLoseGame1.setText("Проигрыш");
//                buttonLoseGame1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                        buttonLoseGame1.setText("Lose");
//                        buttonLoseGame2.setText("Lose");
//                        buttonLoseGame3.setText("Lose");
//                        buttonWinGame.setText("Win");
//                    }
//                });
//
//            } else if (arr[i] == 2) {
//                buttonLoseGame2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        buttonLoseGame1.setText("Проигрыш");
//                        buttonLoseGame2.setText("Проигрыш");
//                        buttonLoseGame3.setText("Проигрыш");
//                        buttonWinGame.setText("Выигрыш");
//                    }
//                });
//
//            } else if (arr[i] == 3) {
//                buttonLoseGame3.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        buttonLoseGame1.setText("Проигрыш");
//                        buttonLoseGame2.setText("Проигрыш");
//                        buttonLoseGame3.setText("Проигрыш");
//                        buttonWinGame.setText("Выигрыш");
//                    }
//                });
//            } else {
//                buttonWinGame.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        buttonLoseGame1.setText("Проигрыш");
//                        buttonLoseGame2.setText("Проигрыш");
//                        buttonLoseGame3.setText("Проигрыш");
//                        buttonWinGame.setText("Выигрыш");
//                    }
//                });
//            }
//
//        }

        buttonLoseGame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Collections.shuffle(Arrays.asList(arrStr1));

                if (arrStr1[0].equals("Win")) {
//                    buttonLoseGame1.setText(arrStr1[0]);
//                    buttonLoseGame2.setText(arrStr1[1]);
//                    buttonLoseGame3.setText(arrStr1[2]);
//                    buttonWinGame.setText(arrStr1[3]);
//
//                    textViewWinSum = findViewById(R.id.textViewWinSum);
////                    textViewWinSum.getText();
//
//                    if (textViewWinSum.getText().equals("0")) {
//                        textViewWinSum.setText(String.valueOf(100));
////                        textViewWinSum.setText(((Integer.parseInt(textViewWinSum.getText().toString()) + 100) + ""));
//                    } else {
//                        textViewWinSum.setText(((Integer.parseInt(textViewWinSum.getText().toString()) * 5) + ""));
//                    }
                    messageOnButtons();
                    toastMessageWin();

                } else {
//                    buttonLoseGame1.setText(arrStr1[0]);
//                    buttonLoseGame2.setText(arrStr1[1]);
//                    buttonLoseGame3.setText(arrStr1[2]);
//                    buttonWinGame.setText(arrStr1[3]);
                    refreshIfLose();
                    toastMessageLose();

                }

            }
        });
        buttonLoseGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Collections.shuffle(Arrays.asList(arrStr1));

                if (arrStr1[0].equals("Win")) {
//                    buttonLoseGame2.setText(arrStr1[0]);
//                    buttonLoseGame1.setText(arrStr1[1]);
//                    buttonLoseGame3.setText(arrStr1[2]);
//                    buttonWinGame.setText(arrStr1[3]);
//
//                    textViewWinSum = findViewById(R.id.textViewWinSum);
//                    if (textViewWinSum.getText().equals("0")) {
//                        textViewWinSum.setText(String.valueOf(100));
//                    } else {
//                        textViewWinSum.setText(((Integer.parseInt(textViewWinSum.getText().toString()) * 5) + ""));
//                    }
                    messageOnButtons();
                    toastMessageWin();
                } else {
//                    buttonLoseGame2.setText(arrStr1[0]);
//                    buttonLoseGame1.setText(arrStr1[1]);
//                    buttonLoseGame3.setText(arrStr1[2]);
//                    buttonWinGame.setText(arrStr1[3]);
                    refreshIfLose();
                    toastMessageLose();
                }
            }
        });

        buttonLoseGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Collections.shuffle(Arrays.asList(arrStr1));

                if (arrStr1[0].equals("Win")) {
//                    buttonLoseGame3.setText(arrStr1[0]);
//                    buttonLoseGame1.setText(arrStr1[1]);
//                    buttonLoseGame2.setText(arrStr1[2]);
//                    buttonWinGame.setText(arrStr1[3]);
//
//                    textViewWinSum = findViewById(R.id.textViewWinSum);
//                    if (textViewWinSum.getText().equals("0")) {
//                        textViewWinSum.setText(String.valueOf(100));
//                    } else {
//                        textViewWinSum.setText(((Integer.parseInt(textViewWinSum.getText().toString()) * 5) + ""));
//                    }
                    messageOnButtons();
                    toastMessageWin();

                } else {
//                    buttonLoseGame3.setText(arrStr1[0]);
//                    buttonLoseGame1.setText(arrStr1[1]);
//                    buttonLoseGame2.setText(arrStr1[2]);
//                    buttonWinGame.setText(arrStr1[3]);
                    refreshIfLose();
                    toastMessageLose();

                }

            }
        });
        buttonWinGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(Arrays.asList(arrStr1));

                if (arrStr1[0].equals("Win")) {
//                    buttonWinGame.setText(arrStr1[0]);
//                    buttonLoseGame1.setText(arrStr1[1]);
//                    buttonLoseGame2.setText(arrStr1[2]);
//                    buttonLoseGame3.setText(arrStr1[3]);
//                    textViewWinSum = findViewById(R.id.textViewWinSum);
//                    if (textViewWinSum.getText().equals("0")) {
//                        textViewWinSum.setText(String.valueOf(100));
//                    } else {
//                        textViewWinSum.setText(((Integer.parseInt(textViewWinSum.getText().toString()) * 5) + ""));
//                    }
                    messageOnButtons();
                    toastMessageWin();

                } else {
//                    buttonWinGame.setText(arrStr1[0]);
//                    buttonLoseGame1.setText(arrStr1[1]);
//                    buttonLoseGame2.setText(arrStr1[2]);
//                    buttonLoseGame3.setText(arrStr1[3]);
                    refreshIfLose();
                    toastMessageLose();
                }
            }
        });


    }

    public void refreshGame(View view) {

        TextView txtWinSum = findViewById(R.id.textViewWinSum);
        TextView txtRateSum = findViewById(R.id.textViewRateSum);
        TextView txtLastWinSum = findViewById(R.id.textViewLastWinSum);

        Button buttonLoseGame1 = findViewById(R.id.buttonLoseGame1);
        Button buttonLoseGame2 = findViewById(R.id.buttonLoseGame2);
        Button buttonLoseGame3 = findViewById(R.id.buttonLoseGame3);
        Button buttonWinGame = findViewById(R.id.buttonWinGame);

        txtWinSum.setText("0");
        txtRateSum.setText("0");
        txtLastWinSum.setText("0");

        buttonLoseGame1.setText("Secret");
        buttonLoseGame2.setText("Secret");
        buttonLoseGame3.setText("Secret");
        buttonWinGame.setText("Secret");


    }

    public void refreshIfLose() {
        TextView txtWinSum = findViewById(R.id.textViewWinSum);
        TextView txtRateSum = findViewById(R.id.textViewRateSum);
        TextView txtLastWinSum = findViewById(R.id.textViewLastWinSum);

        final Button buttonLoseGame1 = findViewById(R.id.buttonLoseGame1);
        final Button buttonLoseGame2 = findViewById(R.id.buttonLoseGame2);
        final Button buttonLoseGame3 = findViewById(R.id.buttonLoseGame3);
        final Button buttonWinGame = findViewById(R.id.buttonWinGame);

        txtWinSum.setText("0");
        txtRateSum.setText("0");
        txtLastWinSum.setText("0");

//        buttonLoseGame1.setText("Secret");
//        buttonLoseGame2.setText("Secret");
//        buttonLoseGame3.setText("Secret");
//        buttonWinGame.setText("Secret");

        buttonWinGame.setText(arrStr1[0]);
        buttonLoseGame1.setText(arrStr1[1]);
        buttonLoseGame2.setText(arrStr1[2]);
        buttonLoseGame3.setText(arrStr1[3]);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                buttonLoseGame1.setText("Secret");
                buttonLoseGame2.setText("Secret");
                buttonLoseGame3.setText("Secret");
                buttonWinGame.setText("Secret");
            }
        }, 2000);

    }

    public void toastMessageWin() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "You won. Do we play further?", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastMessageLose() {
        Toast toast = Toast.makeText(getApplicationContext(),
                "You are a loser", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void messageOnButtons() {
//        Collections.shuffle(Arrays.asList(arrStr1));
        buttonWinGame.setText(arrStr1[0]);
        buttonLoseGame1.setText(arrStr1[1]);
        buttonLoseGame2.setText(arrStr1[2]);
        buttonLoseGame3.setText(arrStr1[3]);
        textViewWinSum = findViewById(R.id.textViewWinSum);
        if (textViewWinSum.getText().equals("0")) {
            textViewWinSum.setText(String.valueOf(100));
        } else {
            textViewWinSum.setText(((Integer.parseInt(textViewWinSum.getText().toString()) * 5) + ""));
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                buttonLoseGame1.setText("Secret");
                buttonLoseGame2.setText("Secret");
                buttonLoseGame3.setText("Secret");
                buttonWinGame.setText("Secret");
            }
        }, 2000);

    }

    public void secretButton() {

        buttonWinGame.setText(arrStr1[0]);
        buttonLoseGame1.setText(arrStr1[1]);
        buttonLoseGame2.setText(arrStr1[2]);
        buttonLoseGame3.setText(arrStr1[3]);
    }

    public void timeHandler(){

    }


}






