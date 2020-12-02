fun main()
{
   println("O seu bonus a receber é ${calcBonus("vendedor",1600f)}");
}

fun calcBonus(cargo: String , salario: Float) : Float{

   var retorno: Float = salario
   if(cargo.contains("vendedor")){
      retorno *= 0.3f
   }

   if(cargo.contains("coordenador")){
      retorno *= 0.20f
   }

   if(cargo.contains("gerente")){
      retorno *= 0.25f
   }

   return retorno
}