package C5.Java;

// 1. Classe base para todos os Ninjas
abstract class Ninja {
    protected String nome;

    public Ninja(String nome) {
        this.nome = nome;
    }

    // Método abstrato: cada clã DEVE implementar o seu
    public abstract void habilidadeEspecial();
}

// 2. Especialização do Clã Uzumaki
class Uzumaki extends Ninja {
    public Uzumaki(String nome) {
        super(nome);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou: Rasengan!");
    }
}

// 3. Especialização do Clã Uchiha
class Uchiha extends Ninja {
    public Uchiha(String nome) {
        super(nome);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou: Chidori!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Uso de Polimorfismo: tratamos todos como "Ninja"
        Ninja naruto = new Uzumaki("Naruto Uzumaki");
        Ninja sasuke = new Uchiha("Sasuke Uchiha");

        naruto.habilidadeEspecial();
        sasuke.habilidadeEspecial();
    }
}
