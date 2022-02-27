package kasus1;

public class Barang {
	//state
	String nama_barang;
	String kode_barang;
	private int stok; //ubah state stok menjadi private
	
	public int getStok() { //mengambil data stok yang sudah di private
		return stok;
	}

	public Barang(String kode, String nama, int stk) { //konstruktor barang
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	
	public void addBarang(int barang) { //membuat method tambah barang yang hanya bisa pertambahan
		this.stok += barang;
	}

}
