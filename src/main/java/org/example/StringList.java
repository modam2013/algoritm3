package org.example;

public interface StringList {
    String add(String item);
    String add(int index, String item);
    String set(int index, String item);
    String remove(String item);
    String remove(int index);
    boolean contains(String item);
    int indexOf(String item);
    int lastIndexOf(String item);
    String get(int index);
    boolean equals(StringList otherList);

    // Вернуть фактическое количество элементов.
    int size();

    // Вернуть true,
    // если элементов в списке нет,
    // иначе false.
    boolean isEmpty();

    // Удалить все элементы из списка.
    void clear();

    // Создать новый массив
    // из строк в списке
    // и вернуть его.
    String[] toArray();

}
