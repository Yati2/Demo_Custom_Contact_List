package sg.edu.rp.c346.id20028056.democustomcontactlist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context=context;
        layout_id=resource;
        contactList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(layout_id,parent,false);

        TextView tvName=rowView.findViewById(R.id.textViewName);
        TextView tvCode=rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum=rowView.findViewById(R.id.textViewPhoneNum);
        ImageView ivGender=rowView.findViewById(R.id.imageViewGender);

        Contact currentItem =contactList.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText("+"+currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNum()+"");
        if(currentItem.getGender()=='F')
        {   ivGender.setImageResource(R.drawable.female);}
        else
        { ivGender.setImageResource(R.drawable.male);}


        return rowView;
    }
}
