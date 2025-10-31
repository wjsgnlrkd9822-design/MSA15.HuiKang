package day09.Compare.Comparabel;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Person 클래스
class Person implements Comparable<Person> {

    String name;
    int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // toString
    @Override
    public String toString() {
        return name + " (" + age + "세)";
    }

    /*
     * compareTo()
     * - 해당 객체 this 와 비교 객체 o의 크기 기준을 설정하여 반환하는 메소드
     * return
     *      양수(1)      : 해당 객체 > 비교 객체
     *      0            : 해당 객체 = 비교 객체
     *      음수(-1)     : 해당 객체 < 비교 객체
     */

    // ✅ [1] 나이순 오름차순 정렬
//    @Override
//    public int compareTo(Person o) {
//        return this.age - o.age;
//    }

    // ✅ [2] 이름순(사전순) 오름차순 정렬
//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//    }

    // ✅ [3] 복합 정렬: 나이 오름차순 → 나이 같으면 이름순 오름차순
    @Override
    public int compareTo(Person o) {
        if (this.age == o.age) {
            return this.name.compareTo(o.name); // 이름순
        }
        return this.age - o.age; // 나이순
    }
}

// 실행 클래스
public class ComparableEx {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("릴리", 24));
        personList.add(new Person("해원", 23));
        personList.add(new Person("설윤", 22));
        personList.add(new Person("배이", 22));
        personList.add(new Person("지우", 21));
        personList.add(new Person("규진", 20));

        // 정렬 전
        System.out.println("정렬 전");
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("---------------------");

        // 정렬
        Collections.sort(personList);

        // 정렬 후
        System.out.println("정렬 후");
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("---------------------");
    }
}
