package pekan6_2511531017;

public class Lagu_2511531017 {
    String judul_1017;
    String penyanyi_1017;
    Lagu_2511531017 next_1017;
    Lagu_2511531017 prev_1017;
    public Lagu_2511531017(String judul_1017, String penyanyi_1017) {
        this.judul_1017 = judul_1017;
        this.penyanyi_1017 = penyanyi_1017;
        this.next_1017 = null;
        this.prev_1017 = null;
    }
    public String getJudul_1017() {
        return judul_1017;
    }
    public String getPenyanyi_1017() {
        return penyanyi_1017;
    }
    public Lagu_2511531017 getNext_1017() {
        return next_1017;
    }
    public Lagu_2511531017 getPrev_1017() {
        return prev_1017;
    }
    public void setNext_1017(Lagu_2511531017 next_1017) {
        this.next_1017 = next_1017;
    }
    public void setPrev_1017(Lagu_2511531017 prev_1017) {
        this.prev_1017 = prev_1017;
    }
}
