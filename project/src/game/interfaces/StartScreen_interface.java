package game.interfaces;

public interface StartScreen_interface {
    //shows the startscreen canvas
    public void startscreen();
    
    //button that starts the game
    public void start_game();
    
    //button that brings to the select scene screen   
    //will be locked until the player has progressed in the game
    public void select_scene();
    
    //button exits the game
    public void exit();
}
