package kasus1;

public class Inventori {
	Barang[] barangs;
	
	void initBarang() { //membuat objek barang
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10);
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	void showBarang() { //output data barang
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	void pengadaan() { //mengisi stok
		initBarang();
		
		barangs[0].addBarang(20); //menambah stok 20 pada barang indeks ke-0
		
		/*  syntax dibawah sudah tidak diperlukan lagi
			barangs[0].stok -= 30; 
			barangs[0].stok *= 30;
		 */
		
		showBarang(); //memanggil method untuk mengoutputkan
	}
	
	/* Main Class untuk membuat pengadaan barang atau menambah stok barang */
	public static void main(String[] args) {
		Inventori beli = new Inventori();
		beli.pengadaan();
	}
}
