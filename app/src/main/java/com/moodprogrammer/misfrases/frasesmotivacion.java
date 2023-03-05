package com.moodprogrammer.misfrases;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class frasesmotivacion extends AppCompatActivity {

    ImageButton BotonCompartirf,BotonCompartirf1,
            BotonCompartirf2, BotonCompartirf3, BotonCompartirf4, BotonCompartirf5, BotonCompartirf6, BotonCompartirf7,
            BotonCompartirf8, BotonCompartirf9, BotonCompartirf10, BotonCompartirf11, BotonCompartirf12, BotonCompartirf13,
            BotonCompartirf14, BotonCompartirf15, BotonCompartirf16,  BotonCompartirf17,  BotonCompartirf18,
            BotonCompartirf19, BotonCompartirf20, BotonCompartirf21, BotonCompartirf22,
            BotonCompartirf23, BotonCompartirf24, BotonCompartirf25, BotonCompartirf26,
            BotonCompartirf27, BotonCompartirf28, BotonCompartirf29, BotonCompartirf30,
            BotonCompartirf31,  BotonCompartirf32, BotonCompartirf33, BotonCompartirf34, BotonCompartirf35;

    ImageButton copy1, copy2, copy3, copy4, copy5, copy6,
    copy7, copy8, copy9, copy10, copy11, copy12, copy13, copy14, copy15, copy16, copy17,
    copy18, copy19, copy20, copy21, copy22, copy23, copy24, copy25, copy26, copy27,
    copy28, copy29, copy30, copy31, copy32, copy33, copy34, copy35;

    TextView text1, text2, text3, text4, text5, text6,
            text7, text8, text9, text10, text11, text12,
            text13, text14, text15, text16, text17, text18, text19, text20, text21, text22,
            text23, text24, text25, text26, text27, text28, text29, text30, text31, text32, text33,
            text34, text35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frasesmotivacion);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Frases de Motivación");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);




            //Texto copiado
            text1 = findViewById(R.id.text1);
            copy1 = findViewById(R.id.copy1);



            copy1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //
                    ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clipData = ClipData.newPlainText("Text1",  text1.getText().toString());
                    clipboardManager.setPrimaryClip(clipData);

                    //

                    //
                    Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
                }
            });

            text2 = findViewById(R.id.text2);
            copy2 = findViewById(R.id.copy2);



            copy2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //
                    ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clipData = ClipData.newPlainText("Text2", text2.getText().toString());
                    clipboardManager.setPrimaryClip(clipData);

                    //

                    //
                    Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
                }
            });

            text3 = findViewById(R.id.text3);
            copy3 = findViewById(R.id.copy3);



            copy3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //
                    ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clipData = ClipData.newPlainText("Text3", text3.getText().toString());
                    clipboardManager.setPrimaryClip(clipData);

                    //

                    //
                    Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
                }
            });

        text4 = findViewById(R.id.text4);
        copy4 = findViewById(R.id.copy4);

        copy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text4", text4.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text5 = findViewById(R.id.text5);
        copy5 = findViewById(R.id.copy5);

        copy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text5", text5.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text6 = findViewById(R.id.text6);
        copy6 = findViewById(R.id.copy6);

        copy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text3", text6.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text7 = findViewById(R.id.text7);
        copy7 = findViewById(R.id.copy7);



        copy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text7", text7.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text8 = findViewById(R.id.text8);
        copy8= findViewById(R.id.copy8);



        copy8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text8", text8.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text9 = findViewById(R.id.text9);
        copy9 = findViewById(R.id.copy9);



        copy9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text9", text9.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text10 = findViewById(R.id.text10);
        copy10 = findViewById(R.id.copy10);



        copy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text3", text10.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text11 = findViewById(R.id.text11);
        copy11 = findViewById(R.id.copy11);



        copy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text11", text11.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text12 = findViewById(R.id.text12);
        copy12 = findViewById(R.id.copy12);

        copy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text12", text12.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text13 = findViewById(R.id.text13);
        copy13 = findViewById(R.id.copy13);

        copy13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text13", text13.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text14 = findViewById(R.id.text14);
        copy14 = findViewById(R.id.copy14);



        copy14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text14", text14.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text15 = findViewById(R.id.text15);
        copy15 = findViewById(R.id.copy15);

        copy15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text15", text15.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text16 = findViewById(R.id.text16);
        copy16 = findViewById(R.id.copy16);

        copy16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text16", text16.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text17 = findViewById(R.id.text17);
        copy17 = findViewById(R.id.copy17);

        copy17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text17", text17.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text18 = findViewById(R.id.text18);
        copy18 = findViewById(R.id.copy18);

        copy18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text18", text18.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text19 = findViewById(R.id.text19);
        copy19 = findViewById(R.id.copy19);

        copy19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text19", text19.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text20 = findViewById(R.id.text20);
        copy20 = findViewById(R.id.copy20);

        copy20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text20", text20.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text21 = findViewById(R.id.text21);
        copy21 = findViewById(R.id.copy21);



        copy21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text21", text21.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text22 = findViewById(R.id.text22);
        copy22 = findViewById(R.id.copy22);

        copy22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text22", text22.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text23 = findViewById(R.id.text23);
        copy23 = findViewById(R.id.copy23);

        copy23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text23", text23.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text24 = findViewById(R.id.text24);
        copy24 = findViewById(R.id.copy24);

        copy24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text24", text24.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text25 = findViewById(R.id.text25);
        copy25 = findViewById(R.id.copy25);

        copy25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text25", text25.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text26 = findViewById(R.id.text26);
        copy26 = findViewById(R.id.copy26);

        copy26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text26", text26.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text27 = findViewById(R.id.text27);
        copy27 = findViewById(R.id.copy27);

        copy27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text27", text27.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text28 = findViewById(R.id.text28);
        copy28 = findViewById(R.id.copy28);

        copy28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text28", text28.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text29 = findViewById(R.id.text29);
        copy29 = findViewById(R.id.copy29);

        copy29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text29", text29.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text30 = findViewById(R.id.text30);
        copy30 = findViewById(R.id.copy30);

        copy30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text30", text30.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text31 = findViewById(R.id.text31);
        copy31 = findViewById(R.id.copy31);

        copy31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text31", text31.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text32 = findViewById(R.id.text32);
        copy32 = findViewById(R.id.copy32);

        copy32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text32", text32.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text33 = findViewById(R.id.text33);
        copy33 = findViewById(R.id.copy33);

        copy33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text33", text33.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text34 = findViewById(R.id.text34);
        copy34 = findViewById(R.id.copy34);

        copy34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text34", text34.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

        text35 = findViewById(R.id.text35);
        copy35 = findViewById(R.id.copy35);



        copy35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Text35", text35.getText().toString());
                clipboardManager.setPrimaryClip(clipData);

                //

                //
                Toast.makeText(frasesmotivacion.this, "Texto copiado", Toast.LENGTH_SHORT).show();
            }
        });

            BotonCompartirf = findViewById(R.id.BotonCompartirf);

            BotonCompartirf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    CompartirF();
                }
            });

        BotonCompartirf1 = findViewById(R.id.BotonCompartirf1);

        BotonCompartirf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf1();
            }
        });

        BotonCompartirf2 = findViewById(R.id.BotonCompartirf2);

        BotonCompartirf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf2();
            }
        });

        BotonCompartirf3 = findViewById(R.id.BotonCompartirf3);

        BotonCompartirf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf3();
            }
        });

        BotonCompartirf4 = findViewById(R.id.BotonCompartirf4);

        BotonCompartirf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf4();
            }
        });

        BotonCompartirf5 = findViewById(R.id.BotonCompartirf5);

        BotonCompartirf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf5();
            }
        });

        BotonCompartirf6 = findViewById(R.id.BotonCompartirf6);

        BotonCompartirf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf6();
            }
        });

        BotonCompartirf7 = findViewById(R.id.BotonCompartirf7);

        BotonCompartirf7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf7();
            }
        });

        BotonCompartirf8 = findViewById(R.id.BotonCompartirf8);

        BotonCompartirf8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf8();
            }
        });

        BotonCompartirf9 = findViewById(R.id.BotonCompartirf9);

        BotonCompartirf9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf9();
            }
        });

        BotonCompartirf10 = findViewById(R.id.BotonCompartirf10);

        BotonCompartirf10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf10();
            }
        });

        BotonCompartirf11 = findViewById(R.id.BotonCompartirf11);

        BotonCompartirf11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf11();
            }
        });

        BotonCompartirf12 = findViewById(R.id.BotonCompartirf12);

        BotonCompartirf12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf12();
            }
        });

        BotonCompartirf13 = findViewById(R.id.BotonCompartirf13);

        BotonCompartirf13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf13();
            }
        });

        BotonCompartirf14 = findViewById(R.id.BotonCompartirf14);

        BotonCompartirf14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf14();
            }
        });

        BotonCompartirf15 = findViewById(R.id.BotonCompartirf15);

        BotonCompartirf15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf15();
            }
        });

        BotonCompartirf16 = findViewById(R.id.BotonCompartirf16);

        BotonCompartirf16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf16();
            }
        });

        BotonCompartirf17 = findViewById(R.id.BotonCompartirf17);

        BotonCompartirf17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf17();
            }
        });

        BotonCompartirf18 = findViewById(R.id.BotonCompartirf18);

        BotonCompartirf18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf18();
            }
        });

        BotonCompartirf19 = findViewById(R.id.BotonCompartirf19);

        BotonCompartirf19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf19();
            }
        });

        BotonCompartirf20 = findViewById(R.id.BotonCompartirf20);

        BotonCompartirf20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf20();
            }
        });

        BotonCompartirf21 = findViewById(R.id.BotonCompartirf21);

        BotonCompartirf21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf21();
            }
        });

        BotonCompartirf22 = findViewById(R.id.BotonCompartirf22);

        BotonCompartirf22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf22();
            }
        });

        BotonCompartirf23 = findViewById(R.id.BotonCompartirf23);

        BotonCompartirf23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf23();
            }
        });

        BotonCompartirf24 = findViewById(R.id.BotonCompartirf24);

        BotonCompartirf24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf24();
            }
        });

        BotonCompartirf25 = findViewById(R.id.BotonCompartirf25);

        BotonCompartirf25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf25();
            }
        });

        BotonCompartirf26 = findViewById(R.id.BotonCompartirf26);

        BotonCompartirf26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf26();
            }
        });

        BotonCompartirf27 = findViewById(R.id.BotonCompartirf27);

        BotonCompartirf27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf27();
            }
        });

        BotonCompartirf28 = findViewById(R.id.BotonCompartirf28);

        BotonCompartirf28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf28();
            }
        });

        BotonCompartirf29 = findViewById(R.id.BotonCompartirf29);

        BotonCompartirf29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf29();
            }
        });

        BotonCompartirf30 = findViewById(R.id.BotonCompartirf30);

        BotonCompartirf30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf30();
            }
        });

        BotonCompartirf31 = findViewById(R.id.BotonCompartirf31);

        BotonCompartirf31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf31();
            }
        });

        BotonCompartirf32 = findViewById(R.id.BotonCompartirf32);

        BotonCompartirf32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf32();
            }
        });

        BotonCompartirf33 = findViewById(R.id.BotonCompartirf33);

        BotonCompartirf33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf33();
            }
        });

        BotonCompartirf34 = findViewById(R.id.BotonCompartirf34);

        BotonCompartirf34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Compartirf34();
            }
        });



        }

    private void Compartirf34() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Dios nunca te dará una carga que no puedas llevar, porque él sabe hasta dónde tus fuerzas llegarán\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf33() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Tus sueños no tienen fecha de caducidad, respira hondo y sigue adelante\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf32() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Para empezar un gran proyecto hace falta valentía, para terminar un gran proyecto hace falta perseverancia\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf31() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "No te detengas hasta que te sientas orgulloso \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf30() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Respira, ha sido un mal día, no una mala vida  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf29() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Siempre te parecerá imposible hasta que se hace  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf28() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Los errores no son fracasos, son señal de que lo estamos intentando \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf27() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Una persona positiva convierte sus problemas en retos, nunca en obstáculos\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf26() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Todo es muy difícil antes de ser fácil, no te desanimes\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf25() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Pierde el miedo, para no perder oportunidades \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf24() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "El cambio comienza por ti, tu puedes! \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf23() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Enfocado en mi meta, no hay excusas para dejar de luchar  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf22() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = " Si te caes seis veces, levantate siete  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf21() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Siempre enfocado en salir adelante y sin mirar atras  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf20() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Manten una actitud positiva y las coas te saldran mejor \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf19() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Lo imposible solo es aquello que no intentas \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf18() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Eres lo que haces, no lo que dices que harás, empieza ya! \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf17() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "El momento que da más miedo es siempre justo antes de empezar \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf16() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "La disciplina es el puente entre tus metas y tus logros \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf15() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = " Hazlo diferente y veras los cambios\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf14() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = " Trabaja en silencio, haz que el éxito haga todo el ruido\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf13() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = " Quien no arriesga, no gana y vivira arrepentido toda su vida por pensar que hubiera pasado\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf12() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Tu bien sabes lo que vales, no esperes menos  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf11() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Los errores que cometas, miralos como aprendizaje y crece  \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf10() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Con dominar tu cuerpo y mente, tendras la vida perfecta \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf9() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "El que quiera gastar sin ver la cuenta, tiene que trabajar sin ver el reloj\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf8() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "No te enfoques en como va el de al lado, la vida no es una carrera\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf7() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Siempre manten tu mentalidad en salir adelante\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf6() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "La queja trae pobreza, la gratitud trae abundancia\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf5() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Los sacrificios en un futuro seran los grandes placeres de tu vida\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf4() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "El exito te espera, pero no ira a buscarte\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf3() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Confia en ti cada dia, nunca le bajes\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf2() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Enfocate en ti, en tus proyectos y en tu paz interna para que tu vida cambie totalmente\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void Compartirf1() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "Mientras tu dudas de ti, otros te temen por tu potencial\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }

    private void CompartirF() {
            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
                String mensaje = "Los limites solo los pones tu, puedes mas de lo que crees\n";

                intent.putExtra(Intent.EXTRA_TEXT, mensaje);
                startActivity(intent);
            }
            catch (Exception e){
                Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

            }
        }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(frasesmotivacion.this, inicio.class);
        startActivity(intent);
        finish();

        return super.onOptionsItemSelected(item);
    }

}