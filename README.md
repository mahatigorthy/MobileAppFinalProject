# FinalProject

The final project of my Mobile Applications class in which I learned to program and devlop applications using [Android Studio](https://developer.android.com/) and JAVA. In this app, the user is presented with an interactive crime scene. The user is able to interact with various pieces of evidence left at the crime scene. The user can also navigate to a suspect list where descriptions and key facts are listed. With this and other information, the user must accurately frame a criminal. This app uses numerous technologies including data visualization, navigation systems, and fragments. 

It looks like you're working on an Android application with multiple fragments and activities. Here's a summary of what your code does and a few suggestions for improvements:

### Summary

1. **`User` Class**: Represents a user with methods to get and set employee names and results.

2. **`ThirdFragment`**:
   - Contains a spinner to select a criminal and guess the criminal's identity.
   - Provides hints and manages guesses with a limited number of attempts.
   - Navigates to a `FinalFragment` based on whether the guess was correct or the user gives up.

3. **`SecondFragment`**:
   - Displays information about suspects, including their name, age, height, weight, and description.

4. **`SecondActivity`**:
   - Displays information about evidence based on the button clicked in `FirstFragment`.
   - Provides an option to go back to the previous activity.

5. **`MainActivity`**:
   - Initializes the `Criminal` objects and sets up navigation with `BottomNavigationView`.

6. **`FourthFragment`**:
   - Displays a pie chart of medicines used for headaches using AnyChart library.

7. **`FirstFragment`**:
   - Provides buttons to select different evidence items, which are then displayed in `SecondActivity`.

