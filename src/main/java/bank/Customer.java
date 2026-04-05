package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private String password;
  private int accoundId;


  public Customer(int id, String name, String username, String password, int accoundId) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
    this.accoundId = accoundId;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccoundId() {
    return this.accoundId;
  }

  public void setAccoundId(int accoundId) {
    this.accoundId = accoundId;
  }
  
}
