/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmidterm;

/**
 *
 * @author TechEnclave Computer
 */
public class LabMidterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating instances of subjects and observers
        Match cricketMatch = new Match("Cricket World Cup Final");

        BallByBallViewer ballByBallViewer = new BallByBallViewer();
        LiveMatchList liveMatchList = new LiveMatchList();
        MatchDetails matchDetails = new MatchDetails();
        MatchStatistics matchStatistics = new MatchStatistics();

        // Adding observers to the match
        cricketMatch.addObserver(ballByBallViewer);
        cricketMatch.addObserver(liveMatchList);
        cricketMatch.addObserver(matchDetails);
        cricketMatch.addObserver(matchStatistics);

        // Simulating match updates
        cricketMatch.setLiveStatus("In progress");

        // Displaying specific observer information
        ballByBallViewer.displayBallByBall();
        liveMatchList.displayLiveMatches();
        matchDetails.getDetails(cricketMatch);
        matchStatistics.displayStatistics();
    }
    
}
