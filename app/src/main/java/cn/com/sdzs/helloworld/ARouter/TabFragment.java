package cn.com.sdzs.helloworld.ARouter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import cn.com.sdzs.helloworld.R;

public class TabFragment extends Fragment implements AdapterView.OnItemClickListener{
    private static final String EXTRA_CONTENT = "content";

    public static TabFragment getInstance(String content){
        Bundle args = new Bundle();
        args.putString(EXTRA_CONTENT, content);
        TabFragment tabFragment = new TabFragment();
        tabFragment.setArguments(args);
        return  tabFragment;
    }

/*    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.activity_login, null);
        return contentView;
    }*/

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
