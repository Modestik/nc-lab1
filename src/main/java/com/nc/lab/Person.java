package com.nc.lab;

import org.joda.time.LocalDate;

/**
 * Класс Person
 * @author Modest
 * @version 1
 * @
 */
public class Person {

    /**
     * Поле идентификатор
     */
    private int id;

    /**
     * Поле имя
     */
    private String name;

    /**
     * Поле пол
     */
    private String sex;

    /**
     * Поле день рождения
     */
    private LocalDate birthday;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param id   - идентификатор
     * @param name - имя
     * @param sex - пол
     * @param birthday - день рождения
     * //@see Person#Person()
     */
    public Person(final int id, final String name, final String sex, final LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    /**
     * Конструктор - создание нового объекта
     */
    public Person() {
        name = new String();
        sex = new String();
        birthday = new LocalDate();
    }

    /**
     * Функция получения значения поля {@link Person#id}
     * @return идентификатор
     */
    public int getId() {
        return id;
    }

    /**
     * Процедура определения идентификатора {@link Person#id}
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Функция получения значения поля {@link Person#name}
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Процедура определения имени {@link Person#name}
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция получения значения поля {@link Person#sex}
     * @return пол
     */
    public String getMale() {
        return name;
    }

    /**
     * Процедура определения идентификатора {@link Person#sex}
     * @param sex
     */
    public void setMale(String sex) {
        this.sex = sex;
    }

    /**
     * Функция получения значения поля {@link Person#birthday}
     * @return день рождения
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Процедура определения дня рождения {@link Person#birthday}
     * @param birthday
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Функция получения возраста по дате рождения
     * @return возраст
     */
    public int getAge() {
        int year = LocalDate.now().getYear() - birthday.getYear();
        if (LocalDate.now().getMonthOfYear() < birthday.getMonthOfYear()) {
            return year - 1;
        }
        if (LocalDate.now().getMonthOfYear() == birthday.getMonthOfYear()) {
            if (LocalDate.now().getDayOfMonth() < birthday.getDayOfMonth())
                return year - 1;
        }
        return year;
    }

    /**
     * Функция конвертации данных класса в строку
     *
     * @return строка о личности
     */
    @Override
    public String toString() {
        return "ID " + id + "; Name: " + name + "; Male: " + sex + "; Birthday: " + birthday;
    }
}