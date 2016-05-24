package kr.hs.emirim.sebin2519.viewflipertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlip;//필드로 선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev); //view로 반환되므로 형변환
        Button butNext=(Button)findViewById(R.id.but_next);
        butPrev.setOnClickListener(this);//버튼을 감시하고있다가 클릭이 되면 실행
        butNext.setOnClickListener(this);
        viewFlip=(ViewFlipper)findViewById(R.id.view_flip);//임플레이션(메모리에 적재된 다음)
        viewFlip.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */


    @Override
    public void onClick(View v) { //v: View객체의 참조값
        switch (v.getId()) {
            case R.id.but_prev:
                viewFlip.showPrevious();
                break;
            case R.id.but_next:
                viewFlip.showNext();
                break;
        }
    }
}
