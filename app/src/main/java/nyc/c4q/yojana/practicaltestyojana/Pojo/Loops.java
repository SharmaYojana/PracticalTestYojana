package nyc.c4q.yojana.practicaltestyojana.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yojanasharma on 12/10/16.
 */

public class Loops {

    @SerializedName("count")
    @Expose
    private double count;
    @SerializedName("velocity")
    @Expose
    private double velocity;
    @SerializedName("onFire")
    @Expose
    private int onFire;

    /**
     * No args constructor for use in serialization
     *
     */
    public Loops() {
    }

    /**
     *
     * @param onFire
     * @param count
     * @param velocity
     */
    public Loops(double count, double velocity, int onFire) {
        super();
        this.count = count;
        this.velocity = velocity;
        this.onFire = onFire;
    }

    /**
     *
     * @return
     * The count
     */
    public double getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(double count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The velocity
     */
    public double getVelocity() {
        return velocity;
    }

    /**
     *
     * @param velocity
     * The velocity
     */
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    /**
     *
     * @return
     * The onFire
     */
    public int getOnFire() {
        return onFire;
    }

    /**
     *
     * @param onFire
     * The onFire
     */
    public void setOnFire(int onFire) {
        this.onFire = onFire;
    }

}
