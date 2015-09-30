package co.example.junjen.mobileinstagram.elements;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by junjen on 1/10/2015.
 *
 * Custom Like button that can be toggled off
 */

public class LikeButton extends RadioButton {

    public LikeButton(Context context) {
        super(context);
    }

    public LikeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LikeButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    @Override
    public void toggle() {
        if(isChecked()) {
            if(getParent() instanceof RadioGroup) {
                ((RadioGroup)getParent()).clearCheck();
            }
        } else {
            setChecked(true);
        }
    }
}