package PSC06.EX2;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("Lion", "Jonas", "454.768.989-23");
        System.out.println(pf1.dados());

        Empregado emp1 = new Empregado("Tobias", "Josh", "321.231.432-51");
        System.out.println(emp1.dados());
        System.out.println(emp1.salario());

        Mensalista emp2 = new Mensalista("Joao", "Harts", "563.123.546-75", 1500.00);
        System.out.println(emp2.dados());
        System.out.println(emp2.salario());

        Comissionado emp3 = new Comissionado("Kleitin", "Arrasta", "765.744.321-65", 1500.00, 8000.00);
        System.out.println(emp3.dados());
        System.out.println(emp3.salario());

        Horista emp4 = new Horista("Guilherme", "Michel", "856.646.323-23", 2000.00);
        System.out.println(emp4.dados());
        System.out.println(emp4.salario());

        Tarefeiro emp5 = new Tarefeiro("Beto", "Nunes", "767.435.231-32", 5000.00);
        System.out.println(emp5.dados());
        System.out.println(emp5.salario());

        Desempregado desemp1 = new Desempregado();
        System.out.println(desemp1.dados());

        Desempregado desemp2 = new Desempregado(1500.00, "Matheus", "Tarvin", "342.675.324-76");
        System.out.println(desemp2.dados());

        
    }
}
