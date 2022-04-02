
package Unit_01;


interface in_HelloWorld {

    String messages();

    String strips();

    String proc_print_messages(String res_messages, String res_strips);

    void out_print_messages(String res_proc_print_messages);
}

abstract class abs_print_messages implements in_HelloWorld {

    @Override
    public String messages() {
        String results = "HelloWorld";
        return results;
    }

    @Override
    public String strips() {
        String results = "\n" + "-----------------------" + "\n";
        return results;
    }
}

class print_messages extends abs_print_messages {

    @Override
    public String proc_print_messages(String res_messages, String res_strips) {
        String results = res_strips + res_messages + res_strips;
        return results;
    }

    @Override
    public void out_print_messages(String res_proc_messages) {
        System.out.println(res_proc_messages);
    }

}

public class P1_Task01_FirstJavaBasedCode {

    public static void main(String[] args) {
    	Unit_01.print_messages print_messages = new Unit_01.print_messages();
        
        String messages=print_messages.messages();
        String strips=print_messages.strips();
        String proc_print_messages=print_messages.proc_print_messages(messages, strips);
        
        print_messages.out_print_messages(proc_print_messages);
    }

}