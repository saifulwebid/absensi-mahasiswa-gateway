package polban.jtk.absensimahasiswa.gateway.response;

public class Kelas {
	
	private String id;
	private String nama;
	private String tingkat;
	
	public Kelas(String id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}

	public String getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}

}
