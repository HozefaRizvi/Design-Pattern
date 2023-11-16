/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidterm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TechEnclave Computer
 */
public class Match {
    private String matchTitle;
    private String liveStatus;
    private List<MatchObserver> observers = new ArrayList<>();

    public Match(String matchTitle) {
        this.matchTitle = matchTitle;
        this.liveStatus = "Not started";
    }

    public void addObserver(MatchObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MatchObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (MatchObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setLiveStatus(String status) {
        this.liveStatus = status;
        notifyObservers();
    }

    public String getMatchTitle() {
        return matchTitle;
    }

    public String getLiveStatus() {
        return liveStatus;
    }
}
