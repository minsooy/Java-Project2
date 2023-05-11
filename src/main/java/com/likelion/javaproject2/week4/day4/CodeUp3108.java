package com.likelion.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String code;
    private int testId; // String -> int 로 바뀌었는데 나중 결과보고 수정...
    private String name;

    // 멤버변수에 직접 접근하는 것을 막기 위해 생성자를 만든다
    public Student(String code, String testId, String name) {
        this.code = code;
        this.testId = Integer.parseInt(testId);
        this.name = name;
    }

    // Getter
    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

// 이하 main method

public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, String testNum, String name) {
        // 입력 받은 값을 Object로 만들어 줌
        return new Student(code, testNum, name);
    }
    // 수험번호 중복 화인
    private boolean isExist(Student pStudent) {
        for (Student student :
                students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    // 리스트에 학생 추가
    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }
    // 리스트에 학생 삭제
    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()) students.remove(i);
        }
    }
    // code가 I일 경우 학생추가
    // code가 D일 경우 학생삭제
    public void process(Student pStudent) {
        switch (pStudent.getCode()) {
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }

    // print기능
    private void printStudents(String[] indexList) {
        for (int i = 0; i < indexList.length; i++) {
            int index = Integer.parseInt(indexList[i]) - 1;
            System.out.printf("%d %s\n",students.get(index).getTestId() ,students.get(index).getName());
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count = sc. nextInt();
        sc.nextLine();
        CodeUp3108 codeUp3108 = new CodeUp3108();

        for (int i = 0; i < count; i++) {
            codeUp3108.process(codeUp3108.makeAStudent(sc.next(),sc.next(),sc.next()));
        }
        sc.nextLine();
        String[] indexList = sc.nextLine().split(" ");

        codeUp3108.students.sort((s1, s2) -> Integer.compare(s1.getTestId(), s2.getTestId()));

        codeUp3108.printStudents(indexList);


    }

}
