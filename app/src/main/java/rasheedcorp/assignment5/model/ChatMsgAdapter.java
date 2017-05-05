package rasheedcorp.assignment5.model;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import rasheedcorp.assignment5.R;


public class ChatMsgAdapter extends ArrayAdapter<ChatMessage> {
    public ChatMsgAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ChatMessage> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null)
            convertView= ((Activity)getContext()).getLayoutInflater().inflate(
                    R.layout.list_item,parent,false);

        TextView messageBody=(TextView)convertView.findViewById(R.id.body);
        TextView messageUser=(TextView)convertView.findViewById(R.id.message_user);
        TextView messageTime=(TextView)convertView.findViewById(R.id.message_time);
        ImageView messageImage=(ImageView)convertView.findViewById(R.id.image);

        ChatMessage  message=getItem(position);
        Log.i("This >>>"," df f f f f"+message.getUri());
       if(message.getUri()!=null) {
            Log.i("hhh >>>",message.getUri());
            Picasso.with(getContext())
                    .load(message.getUri())
                    .resize(20, 20)
                    .centerCrop()
                    .into(messageImage);


        }
        messageBody.setText(message.getMessageText());
        messageUser.setText(message.getMessageUser());
        messageTime.setText(message.getMessageTime());

        return convertView;
    }
}
