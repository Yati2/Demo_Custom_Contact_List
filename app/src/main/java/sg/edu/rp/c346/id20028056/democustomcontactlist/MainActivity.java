package sg.edu.rp.c346.id20028056.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView imgvLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvLogo=findViewById(R.id.imgViewLogo);
        lvContact=findViewById(R.id.listViewContacts);
        alContactList=new ArrayList<>();

        String imageUrl="https://www.mansworldindia.com/wp-content/uploads/2020/04/harry-poruduy8re.jpg";
        Picasso.with(this).load(imageUrl).into(imgvLogo);

        Contact item1= new Contact("Mary", 65, 1234567, 'F');
        Contact item2= new Contact("Ken", 65, 7654321, 'M');
        alContactList.add(item1);
        alContactList.add(item2);

        caContact= new CustomAdapter(this,R.layout.row,alContactList);
        lvContact.setAdapter(caContact);
    }
}