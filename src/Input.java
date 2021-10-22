/**
 * Input : This class manages the input data of users.
 *
 * @author Saliou
 * @version %G%
 */

public class Input {

    //Attributes declaration
    private String victoryRating;
    private String defeatRating;

    /**
     * Allows you to modify or initialize the user data.
     *
     * @param victoryRating the user victory rating.
     * @param defeatRating  the user defeat rating.
     */

    public Input(String victoryRating, String defeatRating) {
        this.victoryRating = victoryRating;
        this.defeatRating = defeatRating;
    }


    /**
     * Allows to get the victory rating of user.
     *
     * @return victoryRating.
     */
    public String getVictoryRating() {
        return victoryRating;
    }


    /**
     * Allows to modify the victory rating of user.
     *
     * @param victoryRating  The victory rating of user.
     */
    public void setVictoryRating(String victoryRating) {
        this.victoryRating = victoryRating;
    }

    /**
     * Allows to get the defeat rating of user.
     *
     * @return defeatRating.
     */
    public String getDefeatRating() {
        return defeatRating;
    }

    /**
     * Allows to modify the defeat rating of user.
     *
     * @param defeatRating  the defeat rating of user.
     */

    public void setDefeatRating(String defeatRating) {
        this.defeatRating = defeatRating;
    }
}
