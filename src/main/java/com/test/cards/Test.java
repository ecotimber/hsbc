package com.test.cards;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Test {
    public static void main(String[] args) {
        //初始化牌
        Poker poker= new Poker();
        List<Poker> pokers= poker.buyPoker();
        System.out.println("------初始化牌-----");
        System.out.println(pokers);

        //洗牌
        poker.shuffle(pokers);
        System.out.println("-----洗牌-----");
        System.out.println(pokers);

        //发牌
        People people= new People();
        List<List<Poker>> game = people.game(pokers);
        System.out.println("第一个人的牌的集合是：");
        System.out.println(game.get(0));

        System.out.println("第二个人的牌的集合是:");
        System.out.println(game.get(1));

        //比较两人手牌的第一张大小
        if(game.get(0).get(0).getNumber()>=game.get(1).get(0).getNumber()){

            System.out.println("-----第一个人先出牌------：");

            System.out.println(game.get(0).remove(0));

            for(int i=1; i<game.get(0).size(); i++){
                    System.out.println("第二个人出的牌：" + game.get(1).remove(i));
                    System.out.println("第一个人出的牌：" + game.get(0).remove(i + 1));
            }

        }else{
        System.out.println("------第二个人先出牌------: ");

            System.out.println(game.get(1).remove(0));

            for(int i=1; i<game.get(1).size(); i++){
                System.out.println("第一个人出的牌: "+game.get(0).remove(i));
                System.out.println("第二个人出的牌: "+game.get(1).remove(i+1));
            }
        }


    }
}
