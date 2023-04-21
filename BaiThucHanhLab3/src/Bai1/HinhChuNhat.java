package Bai1;

     public class HinhChuNhat extends HinhHoc {
        private double chieuDai;
        private double chieuRong;
    
        public double getChieuDai() {
            return chieuDai;
        }
    
        public void setChieuDai(double chieuDai) {
            this.chieuDai = chieuDai;
        }
    
        public double getChieuRong() {
            return chieuRong;
        }
    
        public void setChieuRong(double chieuRong) {
            this.chieuRong = chieuRong;
        }
        
        @Override
        public double getChuVi() {
            chuVi = 2 * (chieuDai + chieuRong);
            return chuVi;
        }
        
        @Override
        public double getDienTich() {
            dienTich = chieuDai * chieuRong;
            return dienTich;
        }
    }
