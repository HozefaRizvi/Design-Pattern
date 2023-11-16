/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidterm;

/**
 *
 * @author TechEnclave Computer
 */
class LiveMatchList implements MatchObserver {
    @Override
    public void update(Match match) {
        System.out.println("LiveMatchList: Match status updated - " + match.getLiveStatus());
    }

    public void displayLiveMatches() {
        System.out.println("LiveMatchList: Displaying list of live matches");
    }
}
