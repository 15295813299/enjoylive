package com.qf.pojo;


public class UserInfo {

  private long userInfoId;
  private String username;
  private String password;
  private long age;
  private String sex;
  private String name;
  private String email;
  private String phone;
  private String headPath;
  private String country;
  private String province;
  private String city;
  private String brief;
  private java.sql.Timestamp registrationDate;
  private String birthYear;
  private String birthMonth;
  private String birthYmd;
  private String emailCode;
  private String flag;


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getHeadPath() {
    return headPath;
  }

  public void setHeadPath(String headPath) {
    this.headPath = headPath;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }


  public java.sql.Timestamp getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(java.sql.Timestamp registrationDate) {
    this.registrationDate = registrationDate;
  }


  public String getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }


  public String getBirthMonth() {
    return birthMonth;
  }

  public void setBirthMonth(String birthMonth) {
    this.birthMonth = birthMonth;
  }


  public String getBirthYmd() {
    return birthYmd;
  }

  public void setBirthYmd(String birthYmd) {
    this.birthYmd = birthYmd;
  }


  public String getEmailCode() {
    return emailCode;
  }

  public void setEmailCode(String emailCode) {
    this.emailCode = emailCode;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "UserInfo{" +
            "userInfoId=" + userInfoId +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", headPath='" + headPath + '\'' +
            ", country='" + country + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", brief='" + brief + '\'' +
            ", registrationDate=" + registrationDate +
            ", birthYear='" + birthYear + '\'' +
            ", birthMonth='" + birthMonth + '\'' +
            ", birthYmd='" + birthYmd + '\'' +
            ", emailCode='" + emailCode + '\'' +
            ", flag='" + flag + '\'' +
            '}';
  }
}
