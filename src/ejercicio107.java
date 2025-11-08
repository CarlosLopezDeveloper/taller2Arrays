public class ejercicio107 {
    static void main(String[] args) {
        String[] candidatos = {"DISTRITO ", "CANDIDATO A ", "CANDIDATO B ", "CANDIDATO C ", "CANDIDATO D "};
        int[] numeroCandidatos = {1, 2, 3, 4, 5};
        int[] a = {194, 180, 221, 432, 820};
        int[] b = {48, 20, 90, 50, 61};
        int[] c = {206, 320, 140, 821, 946};
        int[] d = {45, 16, 20, 14, 18};

        for (var i = 0; i < candidatos.length; i++)
            System.out.print(candidatos[i]);
        System.out.println("\n");
        System.out.println("   "+numeroCandidatos[0]+"       "+a[0]+"         "+b[0]+"           "+c[0]+"          "+d[0]+ "  ");
        System.out.println("   "+numeroCandidatos[1]+"       "+a[1]+"         "+b[1]+"           "+c[1]+"          "+d[1]+ "  ");
        System.out.println("   "+numeroCandidatos[2]+"       "+a[2]+"         "+b[2]+"           "+c[2]+"          "+d[2]+ "  ");
        System.out.println("   "+numeroCandidatos[3]+"       "+a[3]+"         "+b[3]+"           "+c[3]+"          "+d[3]+ "  ");
        System.out.println("   "+numeroCandidatos[4]+"       "+a[4]+"         "+b[4]+"           "+c[4]+"          "+d[4]+ "  ");
        System.out.println("\n");
        {

            int h = 0;
            float  total1 = 0;
            for (h = 0; h < a.length; h++)
                total1 += a[h];
            System.out.println("el total de votos del candidato A es: " + total1);


            int o;
            float total2 =0;

            for (o = 0; o < b.length; o++)
                total2 += b[o];


            System.out.println("el total de votos del candidato B es: " + total2 );



            int p;
            float total3 = 0;
            for (p = 0; p < c.length; p++)
                total3 += c[p];
            System.out.println("el total de votos del candidato C es: " + total3);



            int m;
            float total4 = 0;
            for (m = 0; m < d.length; m++)
                total4 += d[m];
            System.out.println("el total de votos del candidato D es: " + total4);
            float totalVotos=0;
            totalVotos= total1+total2+total3+total4;
            System.out.println("el total de votos contados es : " + totalVotos);
            float participaciona=0;
            float participacionb=0;
            float participacionc=0;
            float participaciond=0;

            participaciona = total1/totalVotos*100;
            System.out.println("el porcentaje  de votos del candidato A es: " + participaciona+"%");
            participacionb = total2/totalVotos*100;
            System.out.println("el porcentaje  de votos del candidato B es: " + participacionb+"%");
            participacionc = total3/totalVotos*100;
            System.out.println("el porcentaje  de votos del candidato C es: " + participacionc+"%");
            participaciond = total4/totalVotos*100;
            System.out.println("el porcentaje  de votos del candidato D es: " + participaciond+"%");
            System.out.println("El candidato Ganador de estas elecciones, con el "+participacionc+"% es el candidato C");



        }


    }
}
