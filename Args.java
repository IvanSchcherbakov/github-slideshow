class Args {
	public static void main(String[] args) {
		// проверка аргументов
		if (args.length != 3)
		{
			System.out.println ("Неверное кол-во аргументов!");
			return;
		}
		// присваиваем значения аргументам и String msg
		int num1 = Integer.parseInt (args[0]);
		int num2 = Integer.parseInt (args[2]);
		String msg = args[0] + args[1] + args[2] + "=";
		// математический расчёт
		if ( args[1].equals("+") ) msg += (num1 + num2); 
			else if ( args[1].equals("-") ) msg += (num1 - num2);
			else if ( args[1].equals("*") ) msg += (num1 * num2);
			else if ( args[1].equals("/") ) msg += (num1 / num2);
		else msg = "Неверный аргумент!";
		// вывод решения
		System.out.println (msg);
	}
}