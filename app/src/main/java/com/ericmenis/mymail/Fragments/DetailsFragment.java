package com.ericmenis.mymail.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ericmenis.mymail.Models.Mail;
import com.ericmenis.mymail.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsFragment extends Fragment {

    @BindView(R.id.textViewFragmentSubject)TextView textViewSubject;
    @BindView(R.id.textViewFragmentSenderName)TextView textViewSender;
    @BindView(R.id.textViewFragmentMessage)TextView textViewMessage;

    private LinearLayout wrapper;

    public DetailsFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        ButterKnife.bind(this, view);

        wrapper = (LinearLayout) view.findViewById(R.id.fragmentDetailsMailWrapper);

        return view;
    }

    public void renderMail(Mail mail) {
        wrapper.setVisibility(View.VISIBLE);
        textViewSubject.setText(mail.getSubject());
        textViewSender.setText(mail.getSenderName());
        textViewMessage.setText(mail.getMessage());
    }
}
