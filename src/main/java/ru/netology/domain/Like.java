package ru.netology.domain;

public class Like {
   private int count; // число пользователей, которым понравилась запись
   private boolean userLikes; // наличие отметки "Мне нравится" от текущего пользователя
   private boolean canlike; // информация о том, может ли текущий пользователь поставить отметку "Мне нравится"
   private boolean canPublish; // информаци от том, может ли текущий пользователь сделать репост записи
   }
