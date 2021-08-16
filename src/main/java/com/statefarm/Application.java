package com.statefarm;

public class Application {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify a name and email");
        } else if (args.length == 1) {
            System.out.println("Please specify an email for Robert");
        } else {
            System.out.println(String.format(args[0]) + " <" + args[1] + ">");
        }


}
}