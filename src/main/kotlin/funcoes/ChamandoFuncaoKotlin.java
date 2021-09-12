package funcoes;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;


public class ChamandoFuncaoKotlin {
  public static void main(String[] args) {
    ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
    System.out.println(SegundoElementoListKt.secondOrNull(list));
  }
}
