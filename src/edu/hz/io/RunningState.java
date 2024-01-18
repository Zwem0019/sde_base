package edu.hz.io;

public class RunningState implements GameStates{

    private Game context;

    public RunningState(Game context){
        this.context = context;
    }
    @Override
    public void start(){
        throw new UnsupportedOperationException("Running Game can't be run");
    }
    @Override
    public void stop(){
        this.context.changeState(new StoppedState(this.context));
    }
}
