package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name: Ajit Saste", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No:989898989", "600"},
                    {"Doctor Name: Prasad Pawar", "Hospital Address : Nigdi ", "Exp : 15yrs", "Mobile No:989898989", "900"},
                    {"Doctor Name: Swapnil Kale", "Hospital Address : Pune", "Exp : 5yrs", "Mobile No:989898989", "800"},
                    {"Doctor Name: Deepak Deshmuk ", "Hospital Address : Katraj", "Exp : 4yrs", "Mobile No:989898989", "300"},
                    {"Doctor Name: Ashok Panda ", "Hospital Address : Chindri", "Exp : 14yrs", "Mobile No:989898989", "1200"},
            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name: Neelan Patil", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No:989898989", "600"},
                    {"Doctor Name: Swati Pawar", "Hospital Address : Nigdi ", "Exp : 15yrs", "Mobile No:989898989", "900"},
                    {"Doctor Name: Neeraj Kale", "Hospital Address : Pune", "Exp : 8yrs", "Mobile No:989898989", "800"},
                    {"Doctor Name: Mayuri Deshmuk ", "Hospital Address : Katraj", "Exp : 3yrs", "Mobile No:989898989", "300"},
                    {"Doctor Name: Minakshi Panda ", "Hospital Address : Chindri", "Exp : 4yrs", "Mobile No:9898989894", "300"},
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name: Seema Patil", "Hospital Address : Pimpri", "Exp : 6yrs", "Mobile No:989898989", "600"},
                    {"Doctor Name: Neha Pawar", "Hospital Address : Nigdi ", "Exp : 15yrs", "Mobile No:989898989", "1500"},
                    {"Doctor Name: Monish Kale", "Hospital Address : Pune", "Exp : 8yrs", "Mobile No:989898989", "800"},
                    {"Doctor Name: Vishal Deshmuk ", "Hospital Address : Katraj", "Exp : 3yrs", "Mobile No:989898989", "300"},
                    {"Doctor Name: Aman Panda ", "Hospital Address : Chindri", "Exp : 4yrs", "Mobile No:9898989894", "300"},
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name: Amol Patil", "Hospital Address : Pimpri", "Exp : 2yrs", "Mobile No:989898989", "300"},
                    {"Doctor Name: Pnkaj Pawar", "Hospital Address : Nigdi ", "Exp : 12yrs", "Mobile No:989898989", "2000"},
                    {"Doctor Name: Nishant Kale", "Hospital Address : Pune", "Exp : 7yrs", "Mobile No:989898989", "800"},
                    {"Doctor Name: Kausal Deshmuk ", "Hospital Address : Katraj", "Exp : 3yrs", "Mobile No:989898989", "400"},
                    {"Doctor Name: Shrikhant Panda ", "Hospital Address : Chindri", "Exp : 1yrs", "Mobile No:9898989894", "200"},
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor Name: Nilesh Patil", "Hospital Address : Pimpri", "Exp : 7yrs", "Mobile No:989898989", "600"},
                    {"Doctor Name: Pamkaj Pawar", "Hospital Address : Nigdi ", "Exp : 14yrs", "Mobile No:989898989", "1500"},
                    {"Doctor Name: Swapnil Kale", "Hospital Address : Pune", "Exp : 8yrs", "Mobile No:989898989", "1000"},
                    {"Doctor Name: Deepak Deshmuk ", "Hospital Address : Katraj", "Exp : 3yrs", "Mobile No:989898989", "500"},
                    {"Doctor Name: Ashok Panda ", "Hospital Address : Chindri", "Exp : 4yrs", "Mobile No:9898989894", "300"},
            };
    TextView tv;
    Button btn;

    String[][] doctor_details = {};
    HashMap<String, String> item;
    ArrayList list;

    ListView lst;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);


        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonLTBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physician")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this, Brain_Teasure.class));
            }
        });

//        list  = new ArrayList();
//        for(int i=0;i<doctor_details.length;i++){
//            item = new HashMap<String, String >();
//            item.put("link1", doctor_details[i][0]);
//            item.put("link2",doctor_details[i][1]);
//            item.put("link3",doctor_details[i][2]);
//            item.put("link4",doctor_details[i][3]);
//            item.put("link5","Cons Fees"+doctor_details[i][4]+"/-");
//            list.add(item);
//        }
//        sa = new SimpleAdapter(this,list,R.layout.multi_line,
//                new String[]{"line1","line2","line3","line4","line5"},
//                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
//
//        lst = findViewById(R.id.listViewLT);
//        lst.setAdapter(sa);

        ///packages wala haiii
        list = new ArrayList();
        for(int i=0;i<doctor_details.length;i++)
        {
            item = new HashMap<String ,String >();
            item.put("line1",doctor_details[i][0]);
            item.put("line2",doctor_details[i][1]);
            item.put("line3",doctor_details[i][2]);
            item.put("line4",doctor_details[i][3]);
            item.put("line5","Cons Fees : " + doctor_details[i][4] + "/-");
            list.add(item);
        }
        sa = new SimpleAdapter(this,list,R.layout.multi_line,
                new String[]{"line1","line2","line2","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});

        lst = findViewById(R.id.listViewLT);
        lst.setAdapter(sa);
        ///yaha tk hai pura codeee

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent it = new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
            it.putExtra("text1",title);
            it.putExtra("text2",doctor_details[i][0]);
            it.putExtra("text3",doctor_details[i][1]);
            it.putExtra("text4",doctor_details[i][3]);
            it.putExtra("text5",doctor_details[i][4]);
            startActivity(it);
            }
        });
    }
}