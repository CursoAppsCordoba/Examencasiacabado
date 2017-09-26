package es.checkitt.apps.contactosmortal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apps on 25/09/2017.
 */

public class ContactoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Contacto> agenda;

    public ContactoAdapter(Context context, ArrayList<Contacto> agenda) {
        this.context = context;
        this.agenda = agenda;
    }
    public ArrayList<Contacto> getData(){
        return agenda;
    }

    @Override
    public int getCount() {
        return agenda.size();
    }

    @Override
    public Object getItem(int i) {
        return agenda.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.list_item_view, viewGroup, false);

        }
        TextView name = (TextView) view.findViewById(R.id.tv_name);
        TextView title = (TextView) view.findViewById(R.id.tv_title);
        TextView company = (TextView) view.findViewById(R.id.tv_company);

        Contacto contacto= this.agenda.get(i);
        name.setText(contacto.getNombre().toString());
        title.setText(contacto.getEmail().toString());
        company.setText(contacto.getTelefono().toString());


        return view;
    }
}