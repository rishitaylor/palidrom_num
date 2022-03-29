package com.example.palidromnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    TextView res;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.num);
        res=findViewById(R.id.res);
        add=findViewById(R.id.btn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=Integer.parseInt(num.getText().toString());
                int r,sum=0;
                int temp=n;
                while (n>0){
                    r=n%10;
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum)
                    res.setText("Palidrom No : "+temp);
                    else{
                        res.setText("Not Palidrom : "+temp);
                    }
                }

        });
    }
}
// Java program to find palindrome number
// import java.util.*;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        //Take input from the user
//        //Create instance of the Scanner class
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num=sc.nextInt();
//        int r,sum=0;
//        int temp=num;
//        while(num>0)
//        {
//            r=num%10;
//            sum=(sum*10)+r;
//            num=num/10;
//        }
//        if(temp==sum)
//            System.out.println("The entered number "+temp+" is a palindrome number ");
//        else
//            System.out.println("The entered number "+temp+" is not a palindrome");
//    }
//
//}
