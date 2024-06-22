public class Employee {
  private String id;
  private String name;
  private String allergies;
  private String medicalConditions;
  private String contactEmail;
  private String contactPhone;

  public Employee(String id, String name, String allergies, String medicalConditions, String contactEmail, String contactPhone) {
      this.id = id;
      this.name = name;
      this.allergies = allergies;
      this.medicalConditions = medicalConditions;
      this.contactEmail = contactEmail;
      this.contactPhone = contactPhone;
  }

  public String getId() {
      return id;
  }

  public String getName() {
      return name;
  }

  public String getAllergies() {
      return allergies;
  }

  public String getMedicalConditions() {
      return medicalConditions;
  }

  public String getContactEmail() {
      return contactEmail;
  }

  public String getContactPhone() {
      return contactPhone;
  }

  @Override
  public String toString() {
      return "ID do Funcionario: " + id + "\n" +
             "Nome: " + name + "\n" +
             "Alergia: " + allergies + "\n" +
             "Medicamento: " + medicalConditions + "\n" +
             "Email: " + contactEmail + "\n" +
             "Telefone: " + contactPhone;
  }
}
