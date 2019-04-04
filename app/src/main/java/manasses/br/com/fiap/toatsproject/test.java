package manasses.br.com.fiap.toatsproject;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class test {
    public void showToast(Context context, String menssagen){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View customToastroot = inflater.inflate(R.layout.custom_toast, null);

        Toast customtoast = new Toast(context);
        customtoast.setView(customToastroot);

        TextView textview = (TextView) customToastroot.findViewById(R.id.textView1);
        textview.setText(menssagen);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0 ,0 );
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
}
