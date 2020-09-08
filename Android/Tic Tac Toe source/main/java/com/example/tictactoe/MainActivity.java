/*
* Ryan Berwald
* Tic Tac Toe App
* 7/8/2020
*
*/


package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;

import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import org.w3c.dom.Text;

import java.io.Console;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button btn1_1, btn1_3, btn1_2,btn2_1, btn2_3, btn2_2,btn3_1, btn3_3, btn3_2, btnReset;
    private TextView txtGameStatus;
    private boolean boolXTurn = false, boolGameOver = false;
    private int turnLimit=0;
    private String strWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1_1 = findViewById((R.id.btn1_1));
        btn1_2 = findViewById((R.id.btn1_2));
        btn1_3 = findViewById((R.id.btn1_3));
        btn2_1 = findViewById((R.id.btn2_1));
        btn2_2 = findViewById((R.id.btn2_2));
        btn2_3 = findViewById((R.id.btn2_3));
        btn3_1 = findViewById((R.id.btn3_1));
        btn3_2 = findViewById((R.id.btn3_2));
        btn3_3 = findViewById((R.id.btn3_3));
        btnReset = findViewById((R.id.btnReset));
        txtGameStatus = findViewById((R.id.txtGameStatus));
        newGame();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    //disables all buttons except reset on end of game
    public void disableAllButtons(){
        btn1_1.setEnabled(false);
        btn1_2.setEnabled(false);
        btn1_3.setEnabled(false);
        btn2_1.setEnabled(false);
        btn2_2.setEnabled(false);
        btn2_3.setEnabled(false);
        btn3_1.setEnabled(false);
        btn3_2.setEnabled(false);
        btn3_3.setEnabled(false);
    }
    //enabled all buttons on restart
    public void enableAllButtons(){
        btn1_1.setEnabled(true);
        btn1_2.setEnabled(true);
        btn1_3.setEnabled(true);
        btn2_1.setEnabled(true);
        btn2_2.setEnabled(true);
        btn2_3.setEnabled(true);
        btn3_1.setEnabled(true);
        btn3_2.setEnabled(true);
        btn3_3.setEnabled(true);
    }
    //checks if game is over, returns boolean value and sets strWinner to game winner.
    public boolean isGameOver(){
        turnLimit+=1;
        //row 1 straight across
        String btn = btn1_1.getText().toString();
        if(btn1_1.getText().toString().equals(btn1_2.getText().toString()) && btn1_1.getText().toString().equals(btn1_3.getText().toString()) && btn1_1.getText().toString() != ""){
            strWinner = btn1_1.getText().toString();
            return true;
        }
        //row 2 straight across
        else if  (btn2_1.getText().toString().equals(btn2_2.getText().toString()) && btn2_1.getText().toString().equals(btn2_3.getText().toString()) && btn2_1.getText().toString() != ""){
            strWinner = btn2_1.getText().toString();
            return true;
        }
        //row 3 straight across
        else if (btn3_1.getText().toString().equals(btn3_2.getText().toString()) && btn3_1.getText().toString().equals(btn3_3.getText().toString()) && btn3_1.getText().toString() != ""){
            strWinner = btn3_1.getText().toString();
            return true;
        }
        //diagonal from 1.1 to 3.3
        else if (btn1_1.getText().toString().equals(btn2_2.getText().toString()) && btn1_1.getText().toString().equals(btn3_3.getText().toString()) && btn1_1.getText().toString() != ""){
            strWinner = btn1_1.getText().toString();
            return true;
        }
        //diagonal from 1.3 to 3.1
        else if (btn1_3.getText().toString().equals(btn2_2.getText().toString()) && btn1_3.getText().toString().equals(btn3_1.getText().toString()) && btn1_3.getText().toString() != ""){
            strWinner = btn1_3.getText().toString();
            return true;
        }
        //vertical 1.1 to 3.1
        else if (btn1_1.getText().toString().equals(btn2_1.getText().toString()) && btn1_1.getText().toString().equals(btn3_1.getText().toString()) && btn1_1.getText().toString() != ""){
            strWinner = btn1_1.getText().toString();
            return  true;
        }
        //vertical 1.2 to 3.2
        else if (btn1_2.getText().toString().equals(btn2_2.getText().toString()) && btn1_2.getText().toString().equals(btn3_2.getText().toString()) && btn1_2.getText().toString() != ""){
            strWinner = btn1_2.getText().toString();
            return true;
        }
        //vertical 1.3 to 3.3
        else if (btn1_3.getText().toString().equals(btn2_3.getText().toString()) && btn1_3.getText().toString().equals(btn3_3.getText().toString()) && btn1_3.getText().toString() != ""){
            strWinner = btn1_3.getText().toString();
            return  true;
        }
        //Check is cats game based on all tiles being filled.
        else if (turnLimit == 10){
            strWinner = "CATS GAME!";
            return true;
        }
        //play on!
        else{
            return false;
        }
    }
    //called on reset button
    public void newGame(){
        btn1_1.setText("");
        btn1_2.setText("");
        btn1_3.setText("");
        btn2_1.setText("");
        btn2_2.setText("");
        btn2_3.setText("");
        btn3_1.setText("");
        btn3_2.setText("");
        btn3_3.setText("");
        enableAllButtons();
        txtGameStatus.setText("New Game Started!");
        turnLimit = 0;
    }
    //checks what button has been pushed and based on that and whose turn it is, it sets the text value and disabled said pushed button
    @Override
    public void onClick(View view){
        btn1_1.setOnClickListener(this);
        btn1_2.setOnClickListener(this);
        btn1_3.setOnClickListener(this);
        btn2_1.setOnClickListener(this);
        btn2_2.setOnClickListener(this);
        btn2_3.setOnClickListener(this);
        btn3_1.setOnClickListener(this);
        btn3_2.setOnClickListener(this);
        btn3_3.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        switch (view.getId()){
            case R.id.btn1_1:{

                if(!boolXTurn){
                    btn1_1.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn1_1.setText("X");
                    boolXTurn = false;
                }
                btn1_1.setEnabled(false);
                break;
            }
            case R.id.btn1_2:{
                if(!boolXTurn){
                    btn1_2.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn1_2.setText("X");
                    boolXTurn = false;
                }
                btn1_2.setEnabled(false);
                break;
            }
            case R.id.btn1_3:{
                if(!boolXTurn){
                    btn1_3.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn1_3.setText("X");
                    boolXTurn = false;
                }
                btn1_3.setEnabled(false);
                break;
            }
            case R.id.btn2_1:{
                if(!boolXTurn){
                    btn2_1.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn2_1.setText("X");
                    boolXTurn = false;
                }
                btn2_1.setEnabled(false);
                break;
            }
            case R.id.btn2_2:{
                if(!boolXTurn){
                    btn2_2.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn2_2.setText("X");
                    boolXTurn = false;
                }
                btn2_2.setEnabled(false);
                break;
            }
            case R.id.btn2_3:{
                if(!boolXTurn){
                    btn2_3.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn2_3.setText("X");
                    boolXTurn = false;
                }
                btn2_3.setEnabled(false);
                break;
            }
            case R.id.btn3_1:{
                if(!boolXTurn){
                    btn3_1.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn3_1.setText("X");
                    boolXTurn = false;
                }
                btn3_1.setEnabled(false);
                break;
            }
            case R.id.btn3_2:{
                if(!boolXTurn){
                    btn3_2.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn3_2.setText("X");
                    boolXTurn = false;
                }
                btn3_2.setEnabled(false);
                break;
            }
            case R.id.btn3_3:{
                if(!boolXTurn){
                    btn3_3.setText("O");
                    boolXTurn = true;
                }
                else{
                    btn3_3.setText("X");
                    boolXTurn = false;
                }
                btn3_3.setEnabled(false);
                break;
            }
            case R.id.btnReset:{
                newGame();
                break;
            }
        }

        if (isGameOver()) {
            if (strWinner.equals("CATS GAME!")) {
                txtGameStatus.setText(strWinner);
            }
            else {
                txtGameStatus.setText("The winner is " + strWinner + "!");
            }
            disableAllButtons();
        }
        else{
                if (boolXTurn)
                    txtGameStatus.setText("X player's turn");
                else
                    txtGameStatus.setText("O player's turn");
        }

    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("This is a tic tac toe app.");
                builder.create().show();
                return true;
            case R.id.newgame:
                newGame();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}

