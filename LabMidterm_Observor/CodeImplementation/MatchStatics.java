/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidterm;

/**
 *
 * @author TechEnclave Computer
 */
class MatchStatistics implements MatchObserver {
    @Override
    public void update(Match match) {
        System.out.println("MatchStatistics: Match status updated - " + match.getLiveStatus());
    }

    public void displayStatistics() {
        System.out.println("MatchStatistics: Displaying match statistics");
    }
}
