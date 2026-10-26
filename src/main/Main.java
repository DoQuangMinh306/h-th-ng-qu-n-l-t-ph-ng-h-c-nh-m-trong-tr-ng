package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ ĐẶT PHÒNG HỌC NHÓM ===");
    }
    // PHẦN 2
    Room r1 = new NormalRoom("R101", "Phòng Học 101", 30);
        Room r2 = new ProjectorRoom("R102", "Phòng Chuyên Đề A", 50, "Sony 4K", 50000);
        Room r3 = new SeminarRoom("R103", "Hội Trường B", 150, true, 200000, 100000);

        roomService.addRoom(r1);
        roomService.addRoom(r2);
        roomService.addRoom(r3);

        roomService.displayAllRooms();

        int duration = 3;
        System.out.println("\n=== THÔNG TIN TÍNH PHÍ THUÊ (" + duration + " GIỜ) ===");
        System.out.println("Phí R101: " + roomService.calculateRoomBookingFee("R101", duration) + " VNĐ");
        System.out.println("Phí R102: " + roomService.calculateRoomBookingFee("R102", duration) + " VNĐ");
        System.out.println("Phí R103: " + roomService.calculateRoomBookingFee("R103", duration) + " VNĐ");

        System.out.println("\n--> Cập nhật chính sách tính phí cho R101...");
        r1.setFeePolicy(new ProjectorRoomFeePolicy(40000));
        System.out.println("Phí R101 mới (3 giờ): " + roomService.calculateRoomBookingFee("R101", duration) + " VNĐ");
    }
}
