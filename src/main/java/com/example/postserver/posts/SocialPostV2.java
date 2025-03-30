package com.example.postserver.posts;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class SocialPostV2 {

    private final int postId;
    private final String imageId;
    private final int uploaderId;
    private final String uploadDatetime;
    private final String contents;
    private final String uploadUserName;

    public SocialPostV2(int postId, String imageId, int uploaderId, String uploadDatetime, String contents, String uploadUserName) {
        this.postId = postId;
        this.imageId = imageId;
        this.uploaderId = uploaderId;
        this.uploadDatetime = uploadDatetime;
        this.contents = contents;
        this.uploadUserName = uploadUserName;
    }

    private SocialPostV2(PostEntity post) {
        this(post.getPostId(), post.getImageId(), post.getUploaderId(), post.getUploadDatetime().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm")), post.getContents(), null);
    }
    public SocialPostV2(SocialPostV2 post, String uploaderName) {
        this(post.getPostId(), post.getImageId(), post.getUploaderId(), post.getUploadDatetime(), post.getContents(), uploaderName);
    }

    public static SocialPostV2 fromPostEntity(PostEntity post) {
        return new SocialPostV2(post);
    }

    public static SocialPostV2 fromSocialPostV1(SocialPost post) {
        return new SocialPostV2(post.getPostId(), post.getImageId(), post.getUploaderId(), post.getUploadDatetime().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm")), post.getContents(), post.getUploadUserName());
    }
    public int getPostId() {
        return postId;
    }

    public String getImageId() {
        return imageId;
    }

    public int getUploaderId() {
        return uploaderId;
    }

    public String getUploadDatetime() {
        return uploadDatetime;
    }

    public String getContents() {
        return contents;
    }
    public String getUploadUserName() {
        return uploadUserName;
    }

}
