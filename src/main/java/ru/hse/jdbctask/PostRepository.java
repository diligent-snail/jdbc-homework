package ru.hse.jdbctask;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    /**
     * Сохраняет переданную запись.
     *
     * @param post для сохранения
     * @return {@link Post} с выставленным {@link Post#id()}
     * @throws IllegalArgumentException если у переданного {@link Post} {@code id} уже проставлен
     */
    Post save(Post post);

    /**
     * Найти {@link Post} по идентификатору
     *
     * @param id идентификатор для поиска
     * @return {@link Optional} с записью или {@link Optional#empty()}, если записи с таким {@code id} нет
     */
    Optional<Post> findById(long id);

    /**
     * Найти все записи
     *
     * @return список со всеми записями
     */
    List<Post> findAll();

    /**
     * Найти все записи определённого автора
     *
     * @param author имя автора
     * @return список с записями автора
     */
    List<Post> findByAuthor(String author);

    /**
     * Обновляет указанную запись по идентификатору
     *
     * @param post для обновления
     * @throws IllegalArgumentException если у записи нет {@link Post#id()}
     */
    void update(Post post);

    /**
     * Удаляет запись по идентификатору
     *
     * @param id идентификатор для удаления
     */
    void deleteById(long id);

    /**
     * Удаляет все записи
     */
    void deleteAll();

    /**
     * @return количество записей
     */
    long count();
}
