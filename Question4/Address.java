package Question4;

public class Address {
  private String zipCode; // 郵便番号
  private String prefecture; // 都道府県
  private String municipaities; // 市区町村
  private String addressBuilding; // 番地

  public Address(String zipCode, String prefecture, String municipaities, String addressBuilding) {
    this.zipCode = zipCode;
    this.prefecture = prefecture;
    this.municipaities = municipaities;
    this.addressBuilding = addressBuilding;
  }

  public String getZipCode() {
    return this.zipCode;
  }
  public String getPrefecture() {
    return this.prefecture;
  }
  public String getMunicipaities() {
    return this.municipaities;
  }
  public String getAddressBuilding() {
    return this.addressBuilding;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  public void setPrefecture(String prefecture) {
    this.prefecture = prefecture;
  }
  public void setMunicipaities(String municipaities) {
    this.municipaities = municipaities;
  }
  public void setAddressBuilding(String addressBuilding) {
    this.addressBuilding = addressBuilding;
  }

}
