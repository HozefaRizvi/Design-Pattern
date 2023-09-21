/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObservorPattern;

/**
 *
 * @author fa20-bse-019
 */
import java.util.ArrayList;
import java.util.List;

 class Subject 
{
    private List<Observor> observors = new ArrayList<Observor>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notfiyAllObservors();
    }
    public void attach(Observor obs)
    {
        observors.add(obs);
    }
    
    public void deattach(Observor obs)
    {
        observors.remove(obs);
    }
    
    public void notfiyAllObservors()
    {
        for (Observor obs : observors)
        {
            obs.update();
        }
    }
    
    
}
