package edu.dosw.bitacora.semana3.Command_Personajesdevideojuegos;

public class DefendCommand implements Command {
    private GameCharacter character;

    public DefendCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.defend();
    }
}