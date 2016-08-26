
public class Story {

	 public void story() throws InterruptedException {
		 System.out.println("");
		String[] text = { 
				"\tІсторія ВІКІНГА\t", 
				"\tСтворено мною\t", 
				"\tдля себе самого\t",
				"     нажміть 1 для старту\t" };
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
			Thread.sleep(1000);
		}
	}

	   public void start() throws InterruptedException {
		String[] text = { 
				"\tПрокинься Вікінг\t", 
				"\tПрокидайся, вже пора\t", 
				"\t- Га? Що?", 
				"\t- Чортяки б вхопили це все, знову сон.\t",
				"\tПочувся голос збоку", 
				"\t- Далі дрихнеш здихлику, давай прокидайся і готуйся, ми майже на місці\t",
				"\tВікінг находився на Дракарі, він з групою інших побратимів відправилсь на розбій\t",
				"\tНаш герой вмився, витер собі лице\t",
				"\tВитягнув шолом\t",
				"\tІ зупинився на зброї\t",
				"\tЯку обрати?\t",
				"\t1 - молот \t",
				"\t2 - сокира\t",
				"\t3 - меч\t"
		};
		
		     for (int i = 0; i < text.length; i++) {
			   System.out.println(text[i]);
			     Thread.sleep(2000);

		} 
	}
	
	   public void ship() throws InterruptedException {
		   String[] text = { 
				   "\tПопереду виднілась земля з портовим містом\t",
				   " ",
				   "\t- Готуйтеся здихлики, нас чекає бій",
				   " ",
				   "\tДракар загудів",
				   "\t- Аррррр ",
				   "\t- ЗА ОДІНА",
				   " - ЗА ВАЛГАЛЛЛУ",
				   " ",
				   "\t1. За ТОРА",
				   "\t2. СМЕРТЬ",
				   "\t3. КРОВІ ДЛЯ НАШИХ БОГІВ",
				   "\t4. Мовчанка "
		   			};
		     for (int i = 0; i < text.length; i++) {
			   System.out.println(text[i]);
			     Thread.sleep(2000);
		     }
	   	}
	   
		void fight(){
			System.out.println(" Дракар наблизився до порту ");
			System.out.println("  ");
		
		
		}


			// TODO Auto-generated method stub
			
		}
		
		
		
		
		


	

