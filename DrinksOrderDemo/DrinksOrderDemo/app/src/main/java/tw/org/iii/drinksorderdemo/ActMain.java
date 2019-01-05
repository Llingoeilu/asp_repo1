package tw.org.iii.drinksorderdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  ActMain extends Activity {
   int n1=0;
    private View.OnClickListener btnRedTea_click=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            int t=Integer.parseInt(lblDues.getText().toString());
            if(t==0)
                lblDues.setText("20");
            else
                lblDues.setText(lblDues.getText().toString()+"20");
        }
    };
    private View.OnClickListener btnGreenTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblDues.getText().toString());
            if(t==0)
                lblDues.setText("25");
            else
                lblDues.setText(lblDues.getText().toString()+"25");
        }
    };
    private View.OnClickListener btnOolongTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblDues.getText().toString());
            if(t==0)
                lblDues.setText("20");
            else
                lblDues.setText(lblDues.getText().toString()+"20");

        }
    };
    private View.OnClickListener btnBubbleTea_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int t=Integer.parseInt(lblDues.getText().toString());
            if(t==0)
                lblDues.setText("30");
            else
                lblDues.setText(lblDues.getText().toString()+"30");
        }
    };
    private View.OnClickListener btn2_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*2));



        }
    };
    private View.OnClickListener btnPlus_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText("0");

        }
    };
    private View.OnClickListener btnCalc_clic=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int n2=Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1+n2));
        }
    };
    private View.OnClickListener btn3_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*3));
        }
    };
    private View.OnClickListener btn4_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*4));
        }
    };
    private View.OnClickListener btn5_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*5));
        }
    };
    private View.OnClickListener btn6_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*6));
        }
    };
    private View.OnClickListener btn7_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*7));
        }
    };
    private View.OnClickListener btn8_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*8));
        }
    };
    private View.OnClickListener btn9_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblDues.setText(String.valueOf(n1*9));
        }
    };
    private View.OnClickListener btnOddChange_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int inputMoney = Integer.parseInt(textInputMoney.getText().toString());
            n1 = Integer.parseInt(lblDues.getText().toString());
            lblOddChange.setText( String.valueOf(inputMoney - n1));
        }

        ;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmain);
        initialComponent();
    }

    private void initialComponent() {
         lblDues=findViewById(R.id.lblDues);
         lblOddChange=findViewById(R.id.btnOddChange);
         btnRedTea=findViewById(R.id.btnRedTea);
         btnRedTea.setOnClickListener(btnRedTea_click);
         btnGreenTea=findViewById(R.id.btnGreenTea);
         btnGreenTea.setOnClickListener(btnGreenTea_click);
         btnOolongTea=findViewById(R.id.btnOolongTea);
         btnOolongTea.setOnClickListener(btnOolongTea_click);
         btnBubbleTea=findViewById(R.id.btnBubbleTea);
         btnBubbleTea.setOnClickListener(btnBubbleTea_click);
         btn2=findViewById(R.id.btn2);
         btn2.setOnClickListener(btn2_click);
         btn3=findViewById(R.id.btn3);
         btn3.setOnClickListener(btn3_click);
         btn4=findViewById(R.id.btn4);
         btn4.setOnClickListener(btn4_click);
         btn5=findViewById(R.id.btn5);
         btn5.setOnClickListener(btn5_click);
         btn6=findViewById(R.id.btn6);
         btn6.setOnClickListener(btn6_click);
        btn7=findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_click);
        btn8=findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_click);
        btn9=findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_click);
        btnPlus=findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(btnPlus_click);
        btnCalc=findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(btnCalc_clic);
        lblInputMoney=findViewById(R.id.lblInputMoney);
        textInputMoney=findViewById(R.id.txtInputMoney);
        btnOddChange=findViewById(R.id.btnOddChange);
        btnOddChange.setOnClickListener(btnOddChange_click);

    }
    Button btnRedTea;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPlus;
    Button btnCalc;

    Button btnGreenTea;
    Button btnOolongTea;
    Button btnBubbleTea;
    TextView lblDues;
    Button btnOddChange;
    TextView lblInputMoney;
    EditText textInputMoney;
    TextView lblOddChange;
}

