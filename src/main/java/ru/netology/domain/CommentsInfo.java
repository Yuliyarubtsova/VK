package ru.netology.domain;

public class CommentsInfo {
    private int commentId;  // идентификатор комментария
    private int count;   // количество комментариев
    private boolean canPost;   // возможность написания комментария
    private String comment; // сам комментарий
    private boolean canAnswerPost;   // возможность написания ответа на комментарий

     ...
    // + get/set на все поля
}