public class Main
{
  public static void main (String[] args)
  {
  System.out.println("Debut");
  int[] alfons = {1,2,3,4,5,6,7,8,9,10,11,12,13};
  boolean[][] adjazenzm = new boolean[8][8];
  int start = 2;
   

  //alfons = BFS.bfs(adjazenzm,start);
  for(int i = 0 ; i < alfons.length ; i++)
  {
     // Jetzt nach rechts schauen!
     System.out.print("next Element -> "+ alfons[i] +", ");
  }
  }
}