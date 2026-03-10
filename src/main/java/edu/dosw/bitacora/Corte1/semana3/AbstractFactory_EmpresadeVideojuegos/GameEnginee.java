package edu.dosw.bitacora.semana3.AbstractFactory_EmpresadeVideojuegos;

public class GameEnginee {
    private  Game game;
    private UI ui;
    private Controller controller;

    public GameEnginee(ConsoleFactory factory) {
        game = factory.createGame();
        ui = factory.createUI();
        controller = factory.createController();
    }

    public void run(){
        System.out.println("[////////////////////]");
        System.out.println("Iniciando consola...\n");
        ui.render();
        controller.connect();
        game.start();

        System.out.println("\n[////////////////////]");

    }



}
