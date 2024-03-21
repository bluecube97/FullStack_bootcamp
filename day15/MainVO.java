package day15;

public class MainVO {
    int size;
    int start_page;
    int end_page;
    int[] input;

    public MainVO() {
        super();
    }

    public MainVO(int size, int start_page, int end_page, int[] input) {
        this.size = size;
        this.start_page = start_page;
        this.end_page = end_page;
        this.input = input;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStart_page() {
        return start_page;
    }

    public void setStart_page(int start_page) {
        this.start_page = start_page;
    }

    public int getEnd_page() {
        return end_page;
    }

    public void setEnd_page(int end_page) {
        this.end_page = end_page;
    }

    public int[] getInput() {
        return input;
    }

    public void setInput(int[] input) {
        this.input = input;
    }
}
