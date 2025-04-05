package state_pattern.order;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();

        // Đơn hàng bắt đầu ở trạng thái Pending
        order.processOrder(); // Chuyển sang Processing
        order.shipOrder();    // Chuyển sang Shipped
        order.deliverOrder(); // Chuyển sang Delivered

        // Thử gọi lại phương thức trên đơn hàng đã giao
        order.processOrder(); // Sẽ báo lỗi vì đã giao xong
    }
}
