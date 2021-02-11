package ru.netology.domain;

// файл Post.java
public class Post {
    private int id; // идентификатор записи
    private int fromId;  // идентификатор автора записи
    private int ownerId;   // идентификатор владельца стены, на которой размещена запись
    private int createdBy; // идентификатор администратора, который опубликовал запись
    private int date; // время публикации записи
    private String text; // текст записи
    private int replyOwnerID; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; // идентификатор записи, в отчет на которую была оставлена текущая
    private int friendsOnly; // если запись была создана "Только для друзей"
    private boolean canPin; // информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; // информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; // информация о том, может ли текцщий пользователь редактировать запись
    private boolean isPined; // информация о том, что запись закреплена
    private boolean markedAsAds; // информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; // информация о том, добавлен ли объект в закладки у текущего пользователя
    private Donut donut;
    private String imageURL;
    private Copyright copyright;
    private Like like;
    private ViewsPost viewsPost; // число просмотров записи
    private CommentsInfo commentsInfo;
    private IconPost iconPost;
    private ButtonToReport buttonToReport;
    private User user;
    private Repost repost;
    private Geo geo;
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем

        // + get/set на все поля
    }
}
