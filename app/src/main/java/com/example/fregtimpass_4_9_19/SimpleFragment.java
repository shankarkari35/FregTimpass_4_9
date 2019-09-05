package com.example.fregtimpass_4_9_19;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SimpleFragment extends Fragment {
    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_simple,container,false);

        firstButton=view.findViewById(R.id.butfirst);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(view.getContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        return view;
      //  AlertDialog.Builder builder= new AlertDialog.Builder();
       // builder.show();

    }
}
