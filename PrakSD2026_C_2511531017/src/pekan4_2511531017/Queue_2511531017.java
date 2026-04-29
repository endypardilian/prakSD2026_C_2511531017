package pekan4_2511531017;

public class Queue_2511531017 {
    int front, rear, max;
    String queue[];

    public Queue_2511531017(int max) {
        this.max = max;
        queue = new String[max];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty_1017() {
        return (front == -1);
    }

    public boolean isFull_1017() {
        return (rear == max - 1);
    }

    public void enqueue_1017(String data) {
        if (isFull_1017()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_1017()) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    public void dequeue_1017() {
        if (isEmpty_1017()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue[front] + " telah dilayani");
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    public void display_1017() {
        if (isEmpty_1017()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no = 1;
            for (int i = front; i <= rear; i++) {
                System.out.println(no + ". " + queue[i]);
                no++;
            }
        }
    }

    public void reverse_1017() {
        if (isEmpty_1017()) {
            System.out.println("Antrian kosong!");
        } else {
            int start = front;
            int end = rear;
            while (start < end) {
                String temp = queue[start];
                queue[start] = queue[end];
                queue[end] = temp;
                start++;
                end--;
            }
        }
    }
}
