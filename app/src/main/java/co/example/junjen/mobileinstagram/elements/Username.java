package co.example.junjen.mobileinstagram.elements;

import android.text.Html;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.io.Serializable;

import co.example.junjen.mobileinstagram.NavigationBar;
import co.example.junjen.mobileinstagram.ProfileFragment;

/**
 * Created by junjen on 30/09/2015.
 *
 * This class creates Username objects.
 * Handles username clicks for profile popup.
 */

public class Username implements Serializable{

    private String username;
    private SpannableString username_link;

    public Username(String username) {
        this.username = username;
        String username_link = "<b>"+this.username+"</b>";
        this.username_link = StringFactory.createLink(Html.fromHtml(username_link), getOnClickListener());
    }

    private View.OnClickListener getOnClickListener(){
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Profile profile = null;
                NavigationBar navActivity = ((NavigationBar) v.getContext());
                LayoutInflater inflater = LayoutInflater.from(navActivity);

                if(username.equals(Parameters.default_username)){
                    profile = new Profile();
                } else {
                    // TODO:respond to click by going to profile of username
                }

                navActivity.showFragment(navActivity.getMainView(), navActivity.profileFragment);
            }
        };
        return onClickListener;
    }

    public String getUsername() {
        return username;
    }

    public SpannableString getUsername_link() {
        return username_link;
    }

    public String toString() {
        return this.username;
    }
}