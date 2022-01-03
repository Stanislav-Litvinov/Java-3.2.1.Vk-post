package ru.netology.domain;

public class VkPost {
    private int id;
    private int ownerId;
    private int toId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private boolean followGroup; // этого пункта нет, но на слайде есть кнопка follow
    private boolean actionButton; // этот тип я добавил вместо списка array вложения

    private ImageInfo imageInfo; // так же сам добавил информацию картинки.
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private NavigationInfo navigationInfo;
    private CopyrightInfo copyrightInfo;
    private GeoInfo geoInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    // + get/set на все поля
}
