/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidterm;

/**
 *
 * @author TechEnclave Computer
 */
class MatchDetails implements MatchObserver {
    @Override
    public void update(Match match) {
        System.out.println("MatchDetails: Match status updated - " + match.getLiveStatus());
    }

    public void getDetails(Match match) {
        System.out.println("MatchDetails: Getting details for " + match.getMatchTitle());
    }
}