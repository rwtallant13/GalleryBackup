package com.example.rwtallant13.gallerybackup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BackupFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_backup, null);
    }

    /*@Override
    public void onViewCreated(@NonNull View backupview, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(backupview, savedInstanceState);

        backupview.findViewById(R.id.toolsbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Tools and shit", Toast.LENGTH_SHORT);
            }
        });
    }*/
}
