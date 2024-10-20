package com.dmdev.cs.homework.funcProgrammingHM;



import java.util.*;


import static java.util.stream.Collectors.*;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class StudentsRunner {
    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student("Ivan", "Ivanov", 1, Arrays.asList(4, 3, 2, 5, 4)),
                new Student("Stepan", "Stepochkin", 2, Arrays.asList(2, 4, 4, 3)),
                new Student("Kate", "Krusheva", 3, Arrays.asList(3, 3, 4, 4)),
                new Student("Valentina", "Bondareva", 1, Arrays.asList(5, 5, 5, 4, 3)),
                new Student("Vasiliy", "Matveev", 2, Arrays.asList(3, 3, 4, 5)),
                new Student("Ivan", "Rubiy", 4, Arrays.asList(5, 5)),
                new Student("Ivan", "Konev", 4, Arrays.asList(5, 5, 5, 5))
        );
        Map<Integer, Double> marksMap = studentsList.stream()
                .filter(student -> student.getMarks().size() > 3)
                .collect(groupingBy(Student::getCourse,
                        averagingDouble(student -> student.getMarks()
                                .stream()
                                .mapToDouble(Integer::doubleValue)
                                .average()
                                .orElse(0.0))));
        System.out.println(marksMap);

        Map<Integer, List<String>> namesMap = studentsList.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(groupingBy(Student::getCourse,
                        mapping(Student::getFullName, toList())));
        System.out.println(namesMap);

        TreeMap<Integer, TreeMap<Double, List<String>>> namesAndMarksMap = studentsList.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(groupingBy(Student::getCourse, TreeMap::new, groupingBy(student -> student.getMarks()
                        .stream()
                        .mapToDouble(Integer::doubleValue)
                        .summaryStatistics()
                        .getAverage(), TreeMap::new, mapping(Student::getFullName, toList()))));
        System.out.println(namesAndMarksMap);
    }
}


