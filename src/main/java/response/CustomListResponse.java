package response;

import java.util.ArrayList;

/**
 * Created by rohit on 2/25/16.
 */
public class CustomListResponse<T> {
    private ArrayList<T> items;

    private int total;
    private int count;
    private int offset_;
    private String lang;


    public CustomListResponse(ArrayList<T> items) {
        this.items = items;
        this.count= items.size();
        this.total= items.size();
        this.offset_=0;
        this.lang="en";
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset_() {
        return offset_;
    }

    public void setOffset_(int offset) {
        this.offset_ = offset;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
