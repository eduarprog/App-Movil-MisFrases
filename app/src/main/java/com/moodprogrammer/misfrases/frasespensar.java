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

public class frasespensar extends AppCompatActivity {

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
        setContentView(R.layout.frasespensar);



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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(frasespensar.this, "Texto copiado", Toast.LENGTH_SHORT).show();
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







        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Frases para Pensar");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

    }

    private void Compartirf34() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "No hay destino marcado ni futuro que no se construya \n";
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
            String mensaje = "Tanto si piensas que puedes como si no, estaras en lo cierto \n";
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
            String mensaje = "No tengo todo calculado, ni mi vida resuelta, solo tengo una sonrisa y espero una devuelta\n";
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
            String mensaje = "Haz lo que sientas, no estamos aqui para siempre\n";
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
            String mensaje = "Conocidos son muchos, amigos son pocos\n";
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
            String mensaje = "El dolor es inevitable, pero el sufrimiento es opcional\n";
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
            String mensaje = "Hacer dos cosas al mismo tiempo, es no hacer ninguna de ellas\n";
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
            String mensaje = "El silencio es el grito mas poderoso\n";
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
            String mensaje = "No te ahogas al caer en el agua, te ahogas por quedarte en ella\n";
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
            String mensaje = "No cambies tu esencia para tener una aprobación\n";
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
            String mensaje = "Existen personas que no te quieren perder, pero tampoco saben como cuidarte\n";
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
            String mensaje = "En la vida hay algo peor que el fracaso, no haber intentado nada\n";
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
            String mensaje = "La vida no es un problema para ser resuelto, es un misterio para ser vivido \n";
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
            String mensaje = "El amor no tiene cura, pero es la unica cura para todos los males\n";
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
            String mensaje = "Para seguir adelante, lo que tienes que hacer es dejar de leer el mismo capítulo de tu vida y empezar con el siguiente\n";

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
            String mensaje = "La risa es el lenguaje del alma \n";

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
            String mensaje = "La experiencia más dolorosa es al final la mejor maestra \n";

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
            String mensaje = "Si el universo te esta haciendo esperar, preparate para recibir mas de lo que perdiste \n";

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
            String mensaje = " El amor propio no es egoísta, es revolucionario\n";

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
            String mensaje = "Juzgar la belleza es algo complicado, ya que es un enigma difícil de resolver \n";

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
            String mensaje = " Para pensar en grande, debes pensar primero en pequeño \n";

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
            String mensaje = "No es que haya errado en la vida, lo que me ha ocurrido es que me he encontrado con 1000 caminos que no eran el mío \n";

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
            String mensaje = "Quién es amigo de todos, es amigo de nadie, recuerda eso \n";

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
            String mensaje = "Si puedes imaginarlo, es que es real \n";

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
            String mensaje = "Todo lo que hagas, es todo lo que eres \n";

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
            String mensaje = "Haz lo que sea necesario para ser la mejor versión de ti mismo\n";

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
            String mensaje = "El universo te está dando exactamente lo que necesitas experimentar\n";

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
            String mensaje = " Que la vida me perdone las veces que no la viví\n";

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
            String mensaje = " La vida es similar a un rompecabezas, cada pieza tiene una razón, un lugar y un porqué. No insistas en colocar piezas donde no caben\n";

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
            String mensaje = " El tiempo nos enseña que para descubrir a dónde vamos, tenemos que volver la vista atrás con cariño\n";

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
            String mensaje = "Si quieres el éxito a tu lado, tienes que pensar, darte tantas oportunidades como necesites y deshacerte del miedo a fracasar \n";

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
            String mensaje = "En esta vida, el dinero no es importante cuando hay salud y amor\n";

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
            String mensaje = "La peor experiencia es la mejor maestra\n";

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
            String mensaje = "No dejes que tu mente te domine, eres mas fuerte de lo que crees\n";

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
            String mensaje = "El tiempo no es infinito, asi que no lo desaproveches\n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getParent(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();

        }
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = new Intent(frasespensar.this, inicio.class);
        startActivity(intent);
        finish();

        return super.onOptionsItemSelected(item);
    }

}