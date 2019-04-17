package com.qf.vo;



public class UserInfoVo {
  private String username;
  private String password;
  private Integer age;
  private String sex;
  private String name;
  private String email;
  private String phone;
  private String country;
  private String province;
  private String city;
  private String birthYear;
  private String birthMonth;
  private String birthYMD;
  private String flag;




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


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
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

    public String getBirthYMD() {
        return birthYMD;
    }

    public void setBirthYMD(String birthYMD) {
        this.birthYMD = birthYMD;
    }

    public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "UserInfoVo{" +
            "username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", country='" + country + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", birthYear='" + birthYear + '\'' +
            ", birthMonth='" + birthMonth + '\'' +
            ", flag='" + flag + '\'' +
            '}';
  }
}
