package com.hana.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto("id01"
                ,"pwd01"
                ,"james01",10,20000,
                LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id02"
                ,"pwd02"
                ,"james02",10,20000,
                LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id03"
                ,"pwd03"
                ,"james03",10,20000,
                LocalDate.parse("2024-03-14")));

        // id02 삭제 한다.
//        for(UserDto u:list){
//            if(u.getId().equals("id03")){
//                list.remove(u);
//                break;
//            }
//        }

        // id03을 이름을 말숙 이로 수정
//        for(UserDto u:list){
//            if(u.getId().equals("id03")){
//                u.setName("말숙이");
//                break;
//            }
//        }

        // id03 정보를 조회 하라
        for(UserDto u:list){
            if(u.getId().equals("id03")){
                System.out.println(u);
            }
        }



        System.out.println("-------------------------------------------------------");

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy년 M월 d일");

        for(UserDto c:list){
            System.out.printf("고객정보: %s %s %d %,d원 %s %n",
                    c.getId(),
                    c.getName(),
                    c.getAge(),
                    c.getMoney(),
                    c.getRegdate().format(formatter)
                  );
        }
    }

}
