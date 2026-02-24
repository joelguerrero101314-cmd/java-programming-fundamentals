package ramses_rodriguez;

public class countdow_counter {
  int time = 10;

  System.out.println("inicio de cuenta regresiva");

  for(int i = time;i>=0;i--)
  {
    System.out.println("faltan " + i + " segundos");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("El conteo fue deteniso");
    }
    System.out.println("tiemo clompletado");
  }
}
