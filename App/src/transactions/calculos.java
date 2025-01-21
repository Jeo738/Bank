package transactions;

public class calculos {
 private double money;
 private double prejudice;
 private String name;
 
 public void setName(String Nome) {
   this.name = Nome;
 }
 
 public double getDinheiro() {
   return money ;
 }
 public void setAddMoney(double addMoney) {
   this.money = money + addMoney;
 }
 public void setRemoveMoney(double removeMoney) {
   this.money = money - removeMoney;
 }
 
 
}
