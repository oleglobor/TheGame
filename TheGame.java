import java.util.Scanner;

public class TheGame {

	public static void main(String[] args) throws InterruptedException 
	{
		Picture p = new Picture();
		  Story c = new Story();
		   p.picture1();
		    c.story();

		Scanner sc = new Scanner(System.in);
		  int n1 = sc.nextInt();
			 if (n1 == 1){
				 System.out.println("Почнемо гру");	
				 System.out.println(" ");	
			 }
				
			 c.start();	
				int n2 = sc.nextInt();
				 if (n2 == 1){
					 System.out.println("Ви обрали молот. І наче сам Тор буде вражати ним ворогів");
				 		}else if  (n2 ==2){
				 			System.out.println("Сокира - символ вікінгів. Вірте в нього, і він в вас врятує");
				 				}else if  (n2 ==3){
				 					System.out.println("Меч. Благородний, не зовсім практичний, але у вправних руках смертельна зброя.");
				}
			c.ship();		
			 int n3 = sc.nextInt();
			  if (n3 == 1){
				 System.out.println("ЗА ТОРА, - прокричав вікінг");
			   }else if  (n3 ==2){
				  System.out.println("СМЕРТЬ - прорерів наш герой");
			     }else if  (n3 ==3){
				    System.out.println("КРОВІ ДЛЯ НАШИХ БОГІВ, - очі вікінга налились кровю");
			         }else if  (n3 ==4){
				        System.out.println("Мовчання золото, - подумав вікінг і спокійно дивився в порт");
			 }
			
			 c.fight();
			 
			 
			 

		sc.close();
		

		
	
       }
}


