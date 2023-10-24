package XII_ObjectModel.CreationalDesignPattern;

//An abstract class acts as a factory which creates many other factories

interface CPU {
    abstract void manufacture();
}

interface GPU {
    abstract void manufacture();
}

interface RAM {
    abstract void manufacture();
}

class I5 implements CPU {
    @Override
    public void manufacture() {
        System.out.print("I5 ");
    }
}

class Ryzen5 implements CPU {
    @Override
    public void manufacture() {
        System.out.print("Ryzen5 ");
    }
}

class GTX1650 implements GPU {
    @Override
    public void manufacture() {
        System.out.print("GTX1650 ");
    }
}

class RTX3050 implements GPU {
    @Override
    public void manufacture() {
        System.out.print("RTX3050 ");
    }
}

class DDR8GB implements RAM {
    @Override
    public void manufacture() {
        System.out.print("DDR8GB ");
    }
}

class DDR16BG implements RAM {
    @Override
    public void manufacture() {
        System.out.print("DDR16BG ");
    }
}

//Abstract Factory
abstract class Manufacturer {
    public abstract CPU installCPU();
    public abstract GPU installGPU();
    public abstract RAM installRAM();
}

//Factories
class HP extends Manufacturer {

    @Override
    public CPU installCPU() {
        return new I5();
    }

    @Override
    public GPU installGPU() {
        return new GTX1650();
    }

    @Override
    public RAM installRAM() {
        return new DDR8GB();
    }
}

class Asus extends Manufacturer {

    @Override
    public CPU installCPU() {
        return new Ryzen5();
    }

    @Override
    public GPU installGPU() {
        return new RTX3050();
    }

    @Override
    public RAM installRAM() {
        return new DDR16BG();
    }
}

public class III_AbstractFactoryMethod {
    public static void main (String[] args) {
        Manufacturer hp = new HP();
        hp.installCPU().manufacture();
        hp.installGPU().manufacture();
        hp.installRAM().manufacture();

        System.out.println();

        Manufacturer asus = new Asus();
        asus.installCPU().manufacture();
        asus.installGPU().manufacture();
        asus.installRAM().manufacture();
    }
}
