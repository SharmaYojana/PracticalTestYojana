package nyc.c4q.yojana.practicaltestyojana.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yojanasharma on 12/10/16.
 */

public class Likes {

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("anchorStr")
    @Expose
    private String anchorStr;
    @SerializedName("records")
    @Expose
    private List<Record_> records = null;
    @SerializedName("previousPage")
    @Expose
    private Object previousPage;
    @SerializedName("backAnchor")
    @Expose
    private String backAnchor;
    @SerializedName("anchor")
    @Expose
    private int anchor;
    @SerializedName("nextPage")
    @Expose
    private int nextPage;
    @SerializedName("size")
    @Expose
    private int size;

    /**
     * No args constructor for use in serialization
     *
     */
    public Likes() {
    }

    /**
     *
     * @param nextPage
     * @param count
     * @param backAnchor
     * @param anchorStr
     * @param records
     * @param previousPage
     * @param size
     * @param anchor
     */
    public Likes(int count, String anchorStr, List<Record_> records, Object previousPage, String backAnchor, int anchor, int nextPage, int size) {
        super();
        this.count = count;
        this.anchorStr = anchorStr;
        this.records = records;
        this.previousPage = previousPage;
        this.backAnchor = backAnchor;
        this.anchor = anchor;
        this.nextPage = nextPage;
        this.size = size;
    }

    /**
     *
     * @return
     * The count
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The anchorStr
     */
    public String getAnchorStr() {
        return anchorStr;
    }

    /**
     *
     * @param anchorStr
     * The anchorStr
     */
    public void setAnchorStr(String anchorStr) {
        this.anchorStr = anchorStr;
    }

    /**
     *
     * @return
     * The records
     */
    public List<Record_> getRecords() {
        return records;
    }

    /**
     *
     * @param records
     * The records
     */
    public void setRecords(List<Record_> records) {
        this.records = records;
    }

    /**
     *
     * @return
     * The previousPage
     */
    public Object getPreviousPage() {
        return previousPage;
    }

    /**
     *
     * @param previousPage
     * The previousPage
     */
    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    /**
     *
     * @return
     * The backAnchor
     */
    public String getBackAnchor() {
        return backAnchor;
    }

    /**
     *
     * @param backAnchor
     * The backAnchor
     */
    public void setBackAnchor(String backAnchor) {
        this.backAnchor = backAnchor;
    }

    /**
     *
     * @return
     * The anchor
     */
    public int getAnchor() {
        return anchor;
    }

    /**
     *
     * @param anchor
     * The anchor
     */
    public void setAnchor(int anchor) {
        this.anchor = anchor;
    }

    /**
     *
     * @return
     * The nextPage
     */
    public int getNextPage() {
        return nextPage;
    }

    /**
     *
     * @param nextPage
     * The nextPage
     */
    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    /**
     *
     * @return
     * The size
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(int size) {
        this.size = size;
    }

}