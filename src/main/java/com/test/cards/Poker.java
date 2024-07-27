package com.test.cards;


import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



@Component
@Data
public class Poker {

    private String suit;

    private int number;

    private static final String[] suits = {"黑桃", "红心", "方块", "梅花"};

    public List<Poker> buyPoker() {

        ArrayList<Poker> pokers = new ArrayList<>();

        //创建花色
        for (int i = 0; i < 4; i++) {
            //创建牌
            for (int j = 1; j <= 13; j++) {

                Poker poker = new Poker();
                poker.setSuit(suits[i]);
                poker.setNumber(j);
                pokers.add(poker);
            }
        }
        return pokers;
    }

    //洗牌
    public void shuffle(List<Poker> pokers) {
        for (int i = pokers.size() - 1; i > 0; i--) {

            Random random = new Random();

            int index = random.nextInt(i);

            swap(pokers, i, index);
        }
    }

    //根据索引交换牌
    private void swap(List<Poker> pokers, int i, int j) {

        Poker temp = pokers.get(i);
        pokers.set(i, pokers.get(j));
        pokers.set(j, temp);
    }

    @Override
    public String toString() {
        return "{" + suit + " " + number + "}";

    }


}



