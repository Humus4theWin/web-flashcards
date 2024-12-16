# TestServer

This is a simple Node.js test server for serving the frontend of the Flash Card App.

## Prerequisites

- Node.js (version 14 or higher)
- npm (Node Package Manager)

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/web-flashcards.git
    cd web-flashcards/TestServer
    ```

2. Install the dependencies:
    ```sh
    npm install
    ```

## Usage

1. Start the server:
    ```sh
    npm run start
    ```

2. Open your browser and navigate to:
    ```
    http://localhost:80
    ```

## Project Structure

- `main.js`: The main server file that sets up and starts the Express server.
- `package.json`: Contains the project metadata and dependencies.

## Dependencies

- [express](https://www.npmjs.com/package/express): Fast, unopinionated, minimalist web framework for Node.js.
- [cors](https://www.npmjs.com/package/cors): Node.js CORS middleware.
- [path](https://www.npmjs.com/package/path): Node.js package for handling and transforming file paths.

## License

This project is licensed under the MIT License. See the [LICENSE](../LICENSE) file for details.