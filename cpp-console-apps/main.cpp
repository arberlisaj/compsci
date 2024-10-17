#include <iostream>

struct User {
  std::string name;
  int age;
};

class Car {
private:
  std::string model;

public:
  Car(std::string m, std::string mod) : model(mod) {}

  void setModel(const std::string &mod) { model = mod; }

  std::string getModel() const { return model; }

  void displayInfo() const { std::cout << "Car model: " << model << std::endl; }
};

void sayHello(const std::string &name) {
  std::cout << "Hi, " << name << "!" << std::endl;
}

int main() {
  char firstName[20];
  char lastName[20];
  char fullName[40];
  int age, numHobbies;

  std::cout << "Enter given name: ";
  std::cin.getline(firstName, 20);

  std::cout << "Enter your last name: ";
  std::cin.getline(lastName, 20);

  int i = 0;
  while (firstName[i] != '\0') {
    fullName[i] = firstName[i];
    i++;
  }

  fullName[i] = ' ';
  i++;

  int j = 0;
  while (lastName[j] != '\0') {
    fullName[i] = lastName[j];
    i++;
    j++;
  }
  fullName[i] = '\0';

  std::cout << "Enter your age: ";
  std::cin >> age;
  std::cin.ignore();

  std::cout << "Hi " << fullName << std::endl;

  if (age < 18) {
    std::cout << "You are a minorrrrrrrrrr." << std::endl;
  } else {
    std::cout << "You are a dinosaur." << std::endl;
  }

  User users[] = {{"Alice", 30}, {"Bob", 25}, {"Charlie", 28}};

  int userCount = sizeof(users) / sizeof(users[0]);

  for (int i = 0; i < userCount; ++i) {
    std::cout << "User " << (i + 1) << ": " << users[i].name
              << ", Age: " << users[i].age << std::endl;
  }

  Car myCar("Toyota", "Corolla");

  myCar.setModel("Audi");
  myCar.displayInfo();

  sayHello("arberlisaj");

  return 0;
}
