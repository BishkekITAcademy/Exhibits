package com.chyngyz.exhibit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.chyngyz.loader.ExhibitRepository;
import com.chyngyz.model.Exhibit;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(new ExhibitRepository(this, this));
        mPresenter.loadData();
    }

    @Override
    public void showExhibitList(ArrayList<Exhibit.ExhibitItem> exhibitList) {
        Toast.makeText(this, exhibitList.get(0).getTitle(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
