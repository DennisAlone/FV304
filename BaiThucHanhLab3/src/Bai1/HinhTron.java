package Bai1;

public class HinhTron extends HinhHoc {
        protected double banKinh;
        
        public double getBanKinh() {
            return banKinh;
        }
        
        public void setBanKinh(double banKinh) {
            this.banKinh = banKinh;
        }
        
         @Override
        public double getChuVi() {
            chuVi = 2 * Math.PI * banKinh;
            return chuVi;
        }
        
        @Override
        public double getDienTich() {
        dienTich = Math.PI * Math.pow(banKinh, 2);
        return dienTich;
    }
 }
    
  