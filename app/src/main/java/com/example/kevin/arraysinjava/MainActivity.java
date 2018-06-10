package com.example.kevin.arraysinjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*int[] integerNumbers = new int[100];

        integerNumbers[0] = 24;

        Log.i("LOG" , integerNumbers[0] + "");
        Log.i("LOG", integerNumbers[1] + "");

        integerNumbers[1] = 50;

        Log.i("LOG", "This is the number that is inside of the index 1 of intergetNumberArray " + integerNumbers[1]);*/

        /*String[] arrayOfStrings = {"Animal", "Home", "Table"};

        /*for (int index = 0; index < arrayOfStrings.length; index++) {

            Log.i("LOG", "Index number: " + index + "The value that is inside of that index: " + index + " is: " +
                                                               arrayOfStrings[index]);

        }*/

        /*Log.i("LOG", arrayOfStrings.length + " ");

        Log.i("LOG", arrayOfStrings[2]);*/


        TextView txtIndex = (TextView)findViewById(R.id.txtIndex);
        TextView txtValue = (TextView)findViewById(R.id.txtValue);
        String oldTxtIndexValue;
        String oldTxtValueValue;

        int[] intArray = new int[10];

        intArray[5] = 420;

        for (int counter = 0; counter < intArray.length; counter++) {

            oldTxtIndexValue = txtIndex.getText().toString();
            oldTxtValueValue = txtValue.getText().toString();

            txtIndex.setText(oldTxtIndexValue + counter + "\n");
            txtValue.setText(oldTxtValueValue + intArray[counter] + "\n");
        }








    }
}
