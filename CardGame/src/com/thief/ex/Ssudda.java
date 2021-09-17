package com.thief.ex;
import java.util.Scanner;
public class Ssudda {
	public static	String str="";
	public static	String str2="";
	public static int card[] = {1,2,3,4,5,6,7,8,9,10};
	public static int user[] = new int[2]; // 내 카드
	public static int com[] =new int[2];	// 컴퓨터 카드
	public static	int sum=0; // user카드의 패 값
	public static	int sum2=0; // com카드의 값
	public static	int win=0;
	public static	int draw=0;
	public static int lose=0;
	public static int end=1;
	public static Scanner sc= new Scanner(System.in);
	public void CardShuffle() { //카드 섞기
		for(int i=1; i<=card.length; i++) {
			int r=(int)(Math.random()*card.length);
			int r2=(int)(Math.random()*card.length);
			int tmp =card[r];
			card[r]=card[r2];
			card[r2]=tmp;
			user[0]=card[r];
			com[0]=card[r2];
		}
		System.out.println("유저의 패 : "+user[0]+"월");
		System.out.println();
		
		System.out.println("다음 카드를 받으시겠습니까? 1.Yes" );
		int a=sc.nextInt();
		if(a==1) {
		for(int i=1; i<=card.length; i++) {
			int r=(int)(Math.random()*card.length);
			int r2=(int)(Math.random()*card.length);
			int tmp =card[r];
			card[r]=card[r2];
			card[r2]=tmp;
			user[1]=card[r];
			com[1]=card[r2];
		}
		if(user[0]>user[1]) {
			int tmp = user[0];
			user[0]=user[1];
			user[1]=tmp;
		}
		if(com[0]>com[1]) {
			int tmp = com[0];
			com[0]=com[1];
			com[1]=tmp;
		}
		}
	
	}
	public void CardList() { // 섯다 카드게임 족보

		//user
		if(user[0]==3 && user[1]==8) {
			sum=30;
			str="삼팔광땡";
		}else if(user[0]==1 && user[1]==8 ) {
			sum=29;
			str="일팔광땡";
		}else if(user[0]==1 && user[1]==3 ) {
			sum=28;
			str="일삼광땡";
		}else if(user[0]==10 && user[1]==10 ) {
			sum=27;
			str="장땡";
		
		} else if(user[0]==9 && user[1]==9 ) {
			sum=26;
			str="구땡";
		
		}else if(user[0]==8 && user[1]==8 ) {
			sum=27;
			str="팔땡";
		
		}else if(user[0]==7 && user[1]==7 ) {
			sum=26;
			str="칠땡";
		
		}else if(user[0]==6 && user[1]==6) {
			sum=25;
			str="육땡";
		
		}else if(user[0]==5 && user[1]==5 ) {
			sum=24;
			str="오땡";
		
		} else if(user[0]==4 && user[1]==4 ) {
			sum=23;
			str="사땡";
		
		} else if(user[0]==3 && user[1]==3 ) {
			sum=22;
			str="삼땡";
		
		}
		if(user[0]==2 && user[1]==2 ) {
			sum=21;
			str="이땡";
		
		}else 
		if(user[0]==1 && user[1]==1 ) {
			sum=20;
			str="삥땡";
		
		}else 
		if(user[0]==1 && user[1]==2 ) {
			sum=19;
			str="알리";
		
		}else 
		if(user[0]==1 && user[1]==4 ) {
			sum=18;
			str="독사";
		
		}else 
		if(user[0]==1 && user[1]==9 ) {
			sum=17;
			str="구삥";
		
		}else 
		if(user[0]==1 && user[1]==10 ) {
			sum=16;
			str="장삥";
			str2="장삥";
		}else 
		if(user[0]==4 && user[1]==10 )  {
			sum=15;
			str="장사";
			str2="장사";
		
		}else 
		if(user[0]==4 && user[1]==6) {
			sum=14;
			str="세륙";
			str2="세륙";
		
		}else {
			sum=(user[0]+user[1])%10;
			str=sum+"끗";
			
		}
		
		
		//com
		if(com[0]==3 && com[1]==8) {
			sum2=30;
			str2="삼팔광땡";
		}else if(com[0]==1 && com[1]==8 ) {
			sum2=29;
			str2="일팔광땡";
		}else if(com[0]==1 && com[1]==3 ) {
			sum2=28;
			str2="일삼광땡";
		}else if(com[0]==10 && com[1]==10 ) {
			sum=27;
			str2="장땡";
		
		} else if(com[0]==9 && com[1]==9 ) {
			sum2=26;
			str2="구땡";
		
		}else if(com[0]==8 && com[1]==8 ) {
			sum2=27;
			str2="팔땡";
		
		}else if(com[0]==7 && com[1]==7 ) {
			sum2=26;
			str2="칠땡";
		
		}else if(com[0]==6 && com[1]==6) {
			sum2=25;
			str2="육땡";
		
		}else if(com[0]==5 && com[1]==5 ) {
			sum2=24;
			str2="오땡";
		
		} else if(com[0]==4 && com[1]==4 ) {
			sum2=23;
			str2="사땡";
		
		} else if(com[0]==3 && com[1]==3 ) {
			sum2=22;
			str2="삼땡";
		
		}
		if(com[0]==2 && com[1]==2 ) {
			sum2=21;
			str2="이땡";
		
		}else 
		if(com[0]==1 && com[1]==1 ) {
			sum2=20;
			str2="삥땡";
		
		}else 
		if(com[0]==1 && com[1]==2 ) {
			sum2=19;
			str2="알리";
		
		}else 
		if(com[0]==1 && com[1]==4 ) {
			sum2=18;
			str2="독사";
		
		}else 
		if(com[0]==1 && com[1]==9 ) {
			sum2=17;
			str2="구삥";
		
		}else 
		if(com[0]==1 && com[1]==10 ) {
			sum2=16;
			str2="장삥";
			
		}else 
		if(com[0]==4 && com[1]==10 )  {
			sum2=15;
			str2="장사";
			
		
		}else 
		if(com[0]==4 && com[1]==6) {
			sum2=14;
			str2="세륙";
			
		
		}else {
			sum2=(com[0]+com[1])%10;
			str2=sum2+"끗";
			
		}
		System.out.println("");
		System.out.println("유저의 패 : "+user[0]+"월 "+user[1]+"월 "+str);
		System.out.println("컴퓨터의 패 : "+com[0]+"월 "+com[1]+"월 "+str2);
		
		if(sum>sum2) {
			System.out.println();
			System.out.println("user가 이겼습니다");
			win++;
		} else if(sum==sum2) {
			System.out.println();
			System.out.println("비겼습니다.");
			draw++;
		}else {
			System.out.println();
			System.out.println("졌습니다.");
			lose++;
		}
		
	}
	public void GameEnd() {
		System.out.println("섯다 게임을 시작하겠습니다");
		
		while(end==1) {
		CardShuffle();
		CardList();
		System.out.println();
		System.out.println("승 :"+win+" 무 :"+draw+" 패 :"+lose);
		
		System.out.println("게임을 더 하시겠습니까? 1.계속 2.종료");
		end=sc.nextInt();
		if(end==2) {
			System.out.println("종료");
			break;
		}
		}
	}
	
	public static void main(String[] args)  {
		Ssudda t1= new Ssudda();
		t1.GameEnd();
	}
}
