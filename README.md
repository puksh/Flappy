## Flappier

Flappier is a Flappy Bird clone built using the libGDX framework. The game involves navigating a bird through a series of pipes without hitting them.

## Installation

To set up the project, follow these steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/puksh/Flappier.git
    cd Flappy
    ```

2. Ensure you have Java Development Kit (JDK) installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

3. Install [Gradle](https://gradle.org/install/) if you haven't already.

4. Build the project:
    ```sh
    ./gradlew build
    ```

## Running the Game

To run the game on different platforms, use the following commands:

### Desktop

```sh
./gradlew desktop:run
```

### Android

```sh
./gradlew android:installDebug
./gradlew android:run
```

### iOS

```sh
./gradlew ios:launchIPhoneSimulator
```

## Project Structure

The project is organized into multiple modules for different platforms:

- core - Contains the main game logic and assets.
- desktop - Desktop-specific launcher and configurations.
- android - Android-specific launcher and configurations.
- ios - iOS-specific launcher and configurations.

## Gameplay

- Tap the screen to make the bird flap its wings and fly.
- Navigate the bird through the gaps between the pipes.
- Avoid hitting the pipes or the ground to keep playing.
- The game ends when the bird collides with a pipe or the ground.

## Credits

- Built using the libGDX framework
- Inspired by the original Flappy Bird game by Dong Nguyen
