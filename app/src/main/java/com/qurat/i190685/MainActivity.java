package com.qurat.i190685;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        }));

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        }));

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        }));

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        }));

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        }));

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        }));

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        }));

        button = (Button) findViewById(R.id.button8);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        }));

        button = (Button) findViewById(R.id.button9);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }
        }));

        button = (Button) findViewById(R.id.button10);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        }));

        button = (Button) findViewById(R.id.button11);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        }));

        button = (Button) findViewById(R.id.button12);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity12();
            }
        }));

        button = (Button) findViewById(R.id.button13);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        }));

        button = (Button) findViewById(R.id.button14);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        }));

        button = (Button) findViewById(R.id.button15);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }
        }));

        button = (Button) findViewById(R.id.button16);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        }));

        button = (Button) findViewById(R.id.button17);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity17();
            }
        }));

        button = (Button) findViewById(R.id.button18);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity18();
            }
        }));

        button = (Button) findViewById(R.id.button19);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity19();
            }
        }));

        button = (Button) findViewById(R.id.button20);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity20();
            }
        }));

        button = (Button) findViewById(R.id.button21);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity21();
            }
        }));

        button = (Button) findViewById(R.id.button22);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity22();
            }
        }));

        button = (Button) findViewById(R.id.button23);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity23();
            }
        }));
    }

    public void openActivity1()
    {
        Intent intent= new Intent(this, MainActivity1.class);
        startActivity(intent);
    }

    public void openActivity2()
    {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent= new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openActivity4()
    {
        Intent intent= new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openActivity5()
    {
        Intent intent= new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void openActivity6()
    {
        Intent intent= new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void openActivity7()
    {
        Intent intent= new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void openActivity8()
    {
        Intent intent= new Intent(this, MainActivity8.class);
        startActivity(intent);
    }

    public void openActivity9()
    {
        Intent intent= new Intent(this, MainActivity9.class);
        startActivity(intent);
    }

    public void openActivity10()
    {
        Intent intent= new Intent(this, MainActivity10.class);
        startActivity(intent);
    }

    public void openActivity11()
    {
        Intent intent= new Intent(this, MainActivity11.class);
        startActivity(intent);
    }

    public void openActivity12()
    {
        Intent intent= new Intent(this, MainActivity12.class);
        startActivity(intent);
    }

    public void openActivity13()
    {
        Intent intent= new Intent(this, MainActivity13.class);
        startActivity(intent);
    }

    public void openActivity14()
    {
        Intent intent= new Intent(this, MainActivity14.class);
        startActivity(intent);
    }

    public void openActivity15()
    {
        Intent intent= new Intent(this, MainActivity15.class);
        startActivity(intent);
    }

    public void openActivity16()
    {
        Intent intent= new Intent(this, MainActivity16.class);
        startActivity(intent);
    }

    public void openActivity17()
    {
        Intent intent= new Intent(this, MainActivity17.class);
        startActivity(intent);
    }

    public void openActivity18()
    {
        Intent intent= new Intent(this, MainActivity18.class);
        startActivity(intent);
    }

    public void openActivity19()
    {
        Intent intent= new Intent(this, MainActivity19.class);
        startActivity(intent);
    }

    public void openActivity20()
    {
        Intent intent= new Intent(this, MainActivity20.class);
        startActivity(intent);
    }

    public void openActivity21()
    {
        Intent intent= new Intent(this, MainActivity21.class);
        startActivity(intent);
    }

    public void openActivity22()
    {
        Intent intent= new Intent(this, MainActivity22.class);
        startActivity(intent);
    }

    public void openActivity23()
    {
        Intent intent= new Intent(this, MainActivity23.class);
        startActivity(intent);
    }
}