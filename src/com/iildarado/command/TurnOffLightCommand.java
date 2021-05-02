package com.iildarado.command;

public class TurnOffLightCommand implements Command{
    private Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    @Override
    public void execute(){
        theLight.turnOff();
    }
}
