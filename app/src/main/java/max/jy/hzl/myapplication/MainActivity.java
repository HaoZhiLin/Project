package max.jy.hzl.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.xts.greendaodemo.db.DBdao;

import java.util.ArrayList;

import max.jy.hzl.myapplication.bean.Student;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRlv;
    private RLVadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initgetData();
        initsetData();

    }

    private void initgetData() {
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.setName("haozhilin"+i);
            student.setSex("男");

            DBdao.insert(student);
        }
    }

    private void initsetData() {
        ArrayList<Student> students = DBdao.queryAll();
        adapter.setList(students);
    }

    private void initView() {
        mRlv = (RecyclerView) findViewById(R.id.rlv);
        mRlv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RLVadapter(this);
        mRlv.setAdapter(adapter);

    }
}
