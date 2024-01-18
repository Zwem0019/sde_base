package edu.hz.io;

public class StoppedState implements GameStates{

    private Game context;

    public StoppedState(Game context){
        this.context = context;
    }
    @Override
    public void start(){
        this.context.changeState(new RunningState(this.context));
    }
    @Override
    public void stop(){
        throw new UnsupportedOperationException("Stopped game can't be stopped");
    }
}
