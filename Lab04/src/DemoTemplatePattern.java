public class DemoTemplatePattern {

    public abstract class MauDon {
        abstract void noidungchinh();
        abstract void ngayviet();
        abstract void kinhgui();
        abstract void tieude();
        public final void hienthi() {
            tieude();
            kinhgui();
            noidungchinh();
            ngayviet();
        }
    }
    
    public static class DonXinViec extends MauDon {      
        public void tieude() {
            System.out.println("ĐƠN XIN VIỆC");
        }
        
        public void kinhgui() {
            System.out.println("Kính gửi: Bộ phận tuyển dụng của công ty ABC");
        }
        
        public void noidungchinh() {
            System.out.println("Đọc được thông tin tuyển dụng của công ty, "
                    + "tôi được biết quý công ty đang có nhu cầu tuyển dụng vị trí: "
                    + "Giám đốc điều hành");
        }
        
        public void ngayviet() {
            System.out.println("Ngày 12 - 10 - 2021");
        }
    }
    
    public static class DonXinDKKH extends MauDon {      
        public void tieude() {
            System.out.println("ĐƠN ĐĂNG KÝ KẾT HÔN");
        }
        
        public void kinhgui() {
            System.out.println("Kính gửi: Ủy ban nhân dân thành phố PLEIKU");
        }
        
        public void noidungchinh() {
            System.out.println("Tôi tên: Phan Nhật Tân, sinh ngày 10-06-2001, dân tộc: Kinh\n"
                                + "Tôi tên: XYZ, ngày sinh xx-xx-xxxx, dân tộc:xx\n"
                                + "Chúng tôi cam đoan những gì khai ở trên hoàn toàn là sự thật."
                                + "Việc kết hôn của chúng tôi là tự nguyện, không vi phạm pháp luật");
        }
        
        public void ngayviet() {
            System.out.println("Ngày __ - __ - 20__");
        }
    }
    
    public static class DonXinGiamHP extends MauDon {      
        public void tieude() {
            System.out.println("ĐƠN XIN MIỄN GIẢM HỌC PHÍ");
        }
        
        public void kinhgui() {
            System.out.println("Kính gửi: Khoa Công Nghệ Thông Tin và Ban giám hiệu trường đại học Quy Nhơn");
        }
        
        public void noidungchinh() {
            System.out.println("Họ và tên: Nguyễn Văn C\nLà cha của em: Nguyễn Thị D\n"
                                + "Hiện đang học tại lớp: KLM thuộc khoa Công nghệ thông tin trường đại học Quy Nhơn\n"
                                + "Thuộc đối tượng: ....\n"
                                + "Căn cứ vào Nghị định số …/2021/NĐ-CP của Chính phủ, "
                                + "tôi làm đơn này đề nghị được xem xét để được miễn giảm học phí và"
                                + " cấp tiền hỗ trợ chi phí học tập theo quy định hiện hành.");
        }
        
        public void ngayviet() {
            System.out.println("Ngày 11 - 11 - 2021");
        }
    }
    
    public static class DonXinChuyenTruong extends MauDon {      
        public void tieude() {
            System.out.println("ĐƠN XIN CHUYỂN TRƯỜNG");
        }
        
        public void kinhgui() {
            System.out.println("Kính gửi: Ban giám hiệu nhà trường");
        }
        
        public void noidungchinh() {
            System.out.println("Tôi tên là: Nguyễn Văn A\nPhụ huynh của em: Nguyễn Văn B\n"
                    + "Là học sinh lớp 1, năm học 2021-2022 tại trường: THCS ABC\n"
                    + "Nay tôi viết đơn này để xin cho con tôi về học tại lớp 1, năm học 2021-2022 tại trường: THCS XYZ\n"
                    + "Lý do: ....\nKính mong được nhà trường chấp thuận");
        }
        
        public void ngayviet() {
            System.out.println("Ngày 4 - 2 - 2021");
        }
    }
  
    public static void main(String[] args) {
          MauDon xinViec = new DonXinViec();
          xinViec.hienthi();
          System.out.print("\n");
          
          MauDon ketHon = new DonXinDKKH();
          ketHon.hienthi();
          System.out.print("\n");
          
          MauDon mienHP = new DonXinGiamHP();
          mienHP.hienthi();
          System.out.print("\n");
          
          MauDon chuyenTruong = new DonXinChuyenTruong();
          chuyenTruong.hienthi();
          System.out.print("\n");
    } 
}
