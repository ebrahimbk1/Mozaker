package com.example.mozaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class free extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free);
    }
    /**
     * سبحان الله
     */
    int number=0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void counter1(View view) {
        number=number+1;
        displayNumber(number);
    }

    public void reset(View view) {
        number=0;
        displayNumber(number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumber(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.disply_number);
        quantityTextView.setText("" + number);
    }


    /**
     * الحمد لله
     */
    int number2=0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void counter2(View view) {
        number2=number2+1;
        displayNumber2(number2);
    }
    public void reset2(View view) {
        number2=0;
        displayNumber2(number2);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumber2(int number2) {
        TextView quantityTextView2 = (TextView) findViewById(
                R.id.disply_number2);
        quantityTextView2.setText("" + number2);
    }

    /**
     * الله اكبر
     */
    int number3=0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void counter3(View view) {
        number3=number3+1;
        displayNumber3(number3);
    }

    public void reset3(View view) {
        number3=0;
        displayNumber3(number3);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumber3(int number3) {
        TextView quantityTextView3 = (TextView) findViewById(
                R.id.disply_number3);
        quantityTextView3.setText("" + number3);
    }

    /**
     * الله اكبر
     */
    int number24=0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void counter4(View view) {
        number24=number24+1;
        displayNumber24(number24);
    }

    public void reset4(View view) {
        number24=0;
        displayNumber24(number24);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumber24(int number24) {
        TextView quantityTextView24 = (TextView) findViewById(
                R.id.disply_number24);
        quantityTextView24.setText("" + number24);
    }

    /**
     * الله اكبر
     */
    int number25=0;

    /**
     * This method is called when the plus button is clicked.
     */
    public void counter5(View view) {
        number25=number25+1;
        displayNumber25(number25);
    }

    public void reset5(View view) {
        number25=0;
        displayNumber25(number25);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayNumber25(int number25) {
        TextView quantityTextView25 = (TextView) findViewById(
                R.id.disply_number25);
        quantityTextView25.setText("" + number25);
    }


}
