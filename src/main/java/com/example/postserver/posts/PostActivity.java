package com.example.postserver.posts;

import java.time.ZonedDateTime;

public class PostActivity {
    private int userId;
    private ZonedDateTime lastUpdatedDateTime;
    private String lastUpdatedId;

    public PostActivity(int userId, ZonedDateTime lastUpdatedDateTime, String lastUpdatedId) {
        this.userId = userId;
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        this.lastUpdatedId = lastUpdatedId;
    }

    public int getUserId() {
        return userId;
    }

    public ZonedDateTime getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public String getLastUpdatedId() {
        return lastUpdatedId;
    }
}
