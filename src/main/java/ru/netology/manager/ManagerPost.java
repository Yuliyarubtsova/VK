package ru.netology.manager;

import ru.netology.domain.Post;

public class ManagerPost {
    private Post[]posts;

    public Post[] viewPosts(int id,int fromId,int ownerId,String text,String imageURL,String iconURL,String comment,boolean canButtonToReport){ //просмотр поста

        return posts;
    }
    public Post[] searchPosts(int id,int ownerId,String text){  // поиск поста по Id, автору поста, по содержанию поста

        return posts;
    }
    public Post[] deletePost(){  // удаление поста
       return null
    }

}
