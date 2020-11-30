fun soma(a:Int, b:Int) = a + b;

fun sub(a:Int, b:Int) = a - b;

fun multi(a:Int, b:Int) = a * b;

fun div(a:Int, b:Int) = a / b;

fun rest(a:Int, b:Int) = a % b;

fun main()
{
   println("12 + 5 = ${soma(12,5)}");
   println("12 - 5 = ${sub(12,5)}");
   println("12 / 5 = ${div(12,5)}");
   println("12 * 5 = ${multi(12,5)}");
   println("12 % 5 = ${rest(12,5)} (Retorna o resto da operação)");

   // Simplificação

   var num: Int = 16;

   println("numero++ = ${num++}");
   println("numero-- = ${num--}");
   println("++numero = ${++num}");
   println("--numero = ${--num}");

   num += 2;
   println("numero + 2 = ${num}");

   num -= 2;
   println("numero - 2 = ${num}");

   num /= 2;
   println("numero / 2 = ${num}");

   num *= 2;
   println("numero * 2 = ${num}");

   num %= 3;
   println("numero % 3 = ${num}");
}