package Bai1;

public class HinhVuong extends HinhChuNhat{
        private double canh;
    
        public double getCanh() {
            return canh;
        }
    
        public void setCanh(double canh) {
            this.canh = canh;
        }
        
        @Override
        public double getChuVi() {
            chuVi = 4 * canh;
            return chuVi;
        }
        
        @Override
        public double getDienTich() {
            dienTich = Math.pow(canh, 2);
            return dienTich;
        }
    }
    
    
   