package com.test.cards;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class People {

    //发牌
    public List<List<Poker>> game(List<Poker> pokers) {

        //创建一个集合接收洗过的牌
        List<Poker> newPokers = pokers;

        //创建集合

        List<List<Poker>> peopleList= new ArrayList<>();

        //创建第一个打牌的人手持有的牌的集合
        List<Poker> peopleList1 = new ArrayList<>();

        //创建第二个打牌的人手持有的牌的集合
        List<Poker> peopleList2 = new ArrayList<>();


        for (int i = 0; i < 26; i++) {
            peopleList1.add(newPokers.get(i));

        }

        for (int j = 26; j < 52; j++) {

            peopleList2.add(newPokers.get(j));


        }

        peopleList.add(peopleList1);
        peopleList.add(peopleList2);

        return peopleList;

    }

}
