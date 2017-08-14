package game.interfaces;

public interface Character_interface{
    //shows the character in the canvas
    public void showcharacter();
    
    //hides the character in the canvas
    public void hidecharacter();

    //will get the character's name and get it from the asset folders
    //expression_number is for getting the characters intitial expression
    public void setcharacter(String name, int expression_number);
    
    //changes the expression on the character
    public void change_expression(int expression_number);
}
