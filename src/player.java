///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author yasmin
// */
//public class player {
//    private String name;
//    private int score=0;
//    char char_X_o;
//    
//    
//    void calculate_score(boolean check)
//    {
//        if(check)
//        {
//            score++;
//        }
//    }
//    player()
//    {}
//    player(String name,char char_X_o) {
//        this.name = name;
//        this.char_X_o=char_X_o;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//    
//}
 class player {
    String name;
    int score;
    char ch;
    boolean ishuman;
    player(String name,char ch,boolean ishuman)
    {
        this.name=name;
        this.ch=ch;
        this.ishuman=ishuman;
    }
    void calculate_score()
    {
        score++;
    }
}
class human extends player
{
    human(String name,char ch)
    {
        super(name,ch,true);
    }
}

class computer extends player
{
    computer(String name,char ch)
    {
        super(name,ch,false);
    }
}
        