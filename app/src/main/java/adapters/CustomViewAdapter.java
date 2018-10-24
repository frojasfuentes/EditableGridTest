package adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.laboratorios.editablegridtest.R;

import java.util.List;

import Classes.Student;

public class CustomViewAdapter extends RecyclerView.Adapter<CustomViewAdapter.CustomViewHolder> {

    public class CustomViewHolder extends  RecyclerView.ViewHolder{
        public TextView tv;
        public CustomViewHolder(View itemView){
            super(itemView);
            tv=itemView.findViewById(R.id.custom);
        }
    }

    public List<Student> students;

    public CustomViewAdapter(List<Student> students){
        this.students=students;
    }

    @NonNull
    @Override
    public CustomViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_view1, viewGroup, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        Student student=students.get(i);
        TextView textView=customViewHolder.tv;
    }


    @Override
    public int getItemCount() {
        return students.size();
    }
}
