package com.yzc.lovehuali.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yzc.lovehuali.R;

/**
 * Created by Administrator on 2015/1/30 0030.
 */
public class UserToolListViewAdapter extends ArrayAdapter{

    private Context context;
    private int listViewCellId;
    private String stringUserToollist[] = {"个人信息","我的成绩","软件公告","关于我们","建议我们","系统设置","退出登录"};
    private int iconUserToollist[] = {R.drawable.ic_user_info,R.drawable.ic_score,R.drawable.ic_announcement,
    R.drawable.ic_info,R.drawable.ic_sent_massage,R.drawable.ic_settings,R.drawable.ic_login_off};
    public UserToolListViewAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.listViewCellId = resource;
    }

    @Override
    public int getCount() {
        return stringUserToollist.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView tvUserToolItem;
        ImageView ivUserToolItem;

        convertView = LayoutInflater.from(context).inflate(listViewCellId,null);
        tvUserToolItem = (TextView) convertView.findViewById(R.id.tvUserToolItem);
        tvUserToolItem.setText(stringUserToollist[position]);

        ivUserToolItem = (ImageView) convertView.findViewById(R.id.ivUserToolItem);
        ivUserToolItem.setImageResource(iconUserToollist[position]);

        return convertView;
    }
}
