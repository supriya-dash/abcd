package org.oct3;
import java.util.Scanner;
public class Survey 
{
int memberType;
String memberTypes;
static int countChild,countWomen,countMen;
static int col;
static int pep;
static int pat;
static int dab;
static int ch;
static String ans="same values";
Scanner scan = new Scanner(System.in);
public Survey()
{
System.out.println("Type 1 or 2 or 3");
        
            this.memberType=scan.nextInt();
if(memberType==1) 
        {
            this.memberTypes="Child";
            countChild++;
            System.out.println("enter the type of paste ");
            ch=scan.nextInt();
            paste(ch);
        }
if(memberType==2) 
        {
            this.memberTypes="Women";
            countWomen++;
            System.out.println("enter the type of paste ");
            ch=scan.nextInt();
            paste(ch);
        }
if(memberType==3) 
        {
            this.memberTypes="Men";
            countMen++;
            System.out.println("enter the type of paste ");
            ch=scan.nextInt();
            paste(ch);
        }
}
public void paste(int ch)
{
switch(ch)
{
case 1:col++;
break;
case 2:pep++;
break;
case 3:pat++;
break;
case 4:dab++;
break;
}}
 public static String countMembers() {
	 if(col>pep && col>pat && col>dab) {
         ans="max is col";
     }
     if(pep>col && pep>pat && pep>dab) {
         ans="max is pep";
     }
     if(pat>col&& pat>pep && pat>dab) {
         ans="max is patp";
     }
     if(dab>col && dab>pat && dab>pep) {
         ans="max is dab";
     }


        
        return "Number of children: "+countChild+"\nNumber of women: "+countWomen+"\nNumber of Men: "+countMen+"\ncol: "+col +"\npep: "+pep+"\npat: "+pat+"\ndab: "+dab+"\nmaximum is :"+ans;


    }   
}

