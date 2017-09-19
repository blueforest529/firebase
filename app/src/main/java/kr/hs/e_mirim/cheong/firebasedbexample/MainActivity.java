package kr.hs.e_mirim.cheong.firebasedbexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnContextClickListener{
    private TextView mNameTextView;
    private TextView mGithubTextView;
    private ImageView mProfilImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameTextView = (TextView) findViewById(R.id.profile_name);
        mGithubTextView = (TextView) findViewById(R.id.profile_github);
        mProfilImageView = (ImageView) findViewById(R.id.profile_image);

        ImageView mProfileImageView;
        Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(mProfileImageView);
        Picasso.with(context)
                .load(url)
                .resize(50, 50)
                .centerCrop()
                .into(imageView)
    }
    public void onClick(View view){
    switch (view.getId()){
        case R.id.profile_github:
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Url rul = Utl.parse(mGithubTextView.getText().toString());
            Intent.setData(url);
            startActivity(intent);
            break;
    }
    }
}
