package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){ // vip면 1000원 할인
            return discountFixAmount;
        }
        else{ // 아니면 없음 ㅋㅋ
            return 0;
        }
    }
}
