package ru.netology.domain;

public class CommentsInfo {
    private int count;   // количество комментариев
    private boolean canPost;   // возможность написания комментария
    private boolean groupsCanPost; // возможность написания комментария для сообществ
    private String comment; // сам комментарий
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи

    // + get/set на все поля
}