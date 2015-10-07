package co.example.junjen.mobileinstagram.elements;

import java.io.Serializable;

/**
 * Created by junjen on 30/09/2015.
 *
 * This class creates Like objects.
 */
public class Like implements Serializable{

    private Username username;
    private Image userImage;
    private String profName;
    private TimeSince timeSince;

    public Like(String username, Image userImage, String profName, TimeSince timeSince){
        this.username = new Username(username);
        this.userImage = userImage;
        this.profName = profName;
        this.timeSince = timeSince;
    }

    public Username getUsername() {
        return username;
    }

    public Image getUserImage() {
        return userImage;
    }

    public String getProfName() {
        return profName;
    }

    public TimeSince getTimeSince() {
        return timeSince;
    }
}
