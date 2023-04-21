package Bai1;

    public class HinhTru extends HinhTron {
        private double chieuCao;
    
        public double getChieuCao() {
            return chieuCao;
        }
    
        public void setChieuCao(double chieuCao) {
            this.chieuCao = chieuCao;
        }
        
        @Override
        public double getChuVi() {
            chuVi = 2 * Math.PI * banKinh + 2 * Math.PI * banKinh;
            return chuVi;
        }
        
        @Override
        public double getDienTich() {
            dienTich = 2 * Math.PI * banKinh * (banKinh + chieuCao);
            return dienTich;
        }
    }
    