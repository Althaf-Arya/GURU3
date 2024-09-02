public class TesGuru {
  int nip;
  String nama;
  String mapel;
  String status;

  public int getNip() {
    return this.nip;
  }

  public void setNip(int nip) {
    this.nip = nip;
  }

  public String getNama() {
    return this.nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getMapel() {
    return this.mapel;
  }

  public void setMapel(String mapel) {
    this.mapel = mapel;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  //Constructor Default
  public TesGuru() {
   nip = 0;
   nama = "Kosong";
   mapel = "Kosong";
   status = "Kosong";
  }

  public void print() {
    System.out.println("NIP: "+nip);
    System.out.println("Nama: "+nama);
    System.out.println("Mata Pelajaran: "+mapel);
    System.out.println("Status: "+status);
  }
}
