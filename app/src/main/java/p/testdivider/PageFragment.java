package p.testdivider;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PageFragment extends Fragment {


    public static PageFragment getInstance(int position) {
        PageFragment fragment = new PageFragment();

        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);

        return fragment;
    }


    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_page, container, false);

        int position = getArguments().getInt("position");
        TextView textView = root.findViewById(R.id.text_view);
        textView.setText("Page Fragment " + position);

        return root;
    }

}
