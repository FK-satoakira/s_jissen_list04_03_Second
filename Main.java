package list04_03;


import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name; /*}*/  /* equals()をオーバーライドしていない */

	//	ここは自分で記述	/*①	*/
public boolean equals(Object o) {
	if(o==this)return true;
	if(o==null)return false;
	if(!(o instanceof Hero))return false;
	Hero h = (Hero)o;
	if(!this.name.trim().equals(h.name.trim())) {return false;}
	return true;
}

//@Override
//public String toString() {
//	return "Hero [name=" + name + "]";
//	}
}
/*---------*/

public class Main {
    public static void main(String[] args) {
//        Hero型のリストを作る
        List<Hero> list = new ArrayList<Hero>();
        Hero h1 = new Hero();h1.name="test";
        Hero h2 = new Hero();h2.name="test";
        Hero h3 = new Hero();h3.name="test";
        Hero h4 = new Hero();h4.name="test";
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        System.out.println(h1+"=h1");
        System.out.println(list.get(0)+"=list.get(0)");
        h1 = new Hero();h1.name="test";
		System.out.println("h1を変更");
		System.out.println(h1+"=h1");
        System.out.println(list.get(0)+"=list.get(0)");
        System.out.println("要素数=" + list.size());
        System.out.println(list.remove(h1));            /* 名前が「ミナト」の勇者を削除 */
        System.out.println("要素数=" + list.size());
    }
}
//31行と41行のh1は同じ変数で参照型だからh1を上書きしたらlistのh1も上書きされると思うのでequalsやhashcode無しでも行ける気がするのだが、そこが謎。