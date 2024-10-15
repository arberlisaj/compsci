#include <iostream>

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

    return 0;
}
