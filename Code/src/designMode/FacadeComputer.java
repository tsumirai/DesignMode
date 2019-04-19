package designMode;

public class FacadeComputer {
    private FacadeCpu cpu;
    private FacadeMemory memory;
    private FacadeDisk disk;

    public FacadeComputer() {
        cpu = new FacadeCpu();
        memory = new FacadeMemory();
        disk = new FacadeDisk();
    }

    public void startup() {
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start the computer finished");
    }

    public void shutdown() {
        System.out.println("shut down the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed");
    }
}
