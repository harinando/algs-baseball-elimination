public class BaseballElimination {

    /*
     * create a baseball division from given filename in format specified below
     */
    public BaseballElimination(String filename) {
    }

    /*
     * number of teams
     */
    public int numberOfTeams() {
        return 0;
    }

    /*
     * all teams
     */
    public Iterable<String> teams() {
        return null;
    }

    /*
     * Number of wins for given team
     */
    public int wins(String team) {
        return 0;
    }

    /*
     * Number of losses for given team
     */
    public int losses(String team) {
        return 0;
    }

    /*
     * Number of remaining games for given team
     */
    public int remaining(String team) {
        return 0;
    }

    /*
     * Number of remaining games between team1 and team2
     */
    public int against(String team1, String team2) {
        return 0;
    }

    /*
     * Is given team eliminated?
     */
    public boolean isEliminated(String team) {
        return false;
    }

    /*
     * Subset R of teams that eliminates given team; null if not eliminated
     */
    public Iterable<String> certificateOfElimination(String team) {
        return null;
    }
}
