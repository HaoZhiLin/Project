package max.jy.hzl.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import max.jy.hzl.myapplication.bean.Student;

/**
 * Created by asus on 2019/5/29.
 */

public class RLVadapter extends RecyclerView.Adapter<RLVadapter.ViewHolder> {
    private Context context;

    public RLVadapter(Context context) {
        this.context = context;
    }
    private ArrayList<Student> list=new ArrayList<>();

    public void setList(ArrayList<Student> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context,R.layout.item,null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = list.get(position);
        holder.name.setText(student.getName());
        holder.sex.setText(student.getSex());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name,sex;
        public ViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            sex=itemView.findViewById(R.id.sex);
        }
    }
}
