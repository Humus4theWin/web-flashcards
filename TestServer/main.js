const cors = require("cors");
const express = require("express");
const path = require("path");

// Start node Server
const app = express();
app.use(cors());
app.options("*", cors());
app.use(express.json());

let port = 80

app.listen(port, () => {
    console.log(`App listening at http://localhost:${port}`);
});

// Serve Frontend
app.use(express.static(path.join(__dirname, "../Frontend/")));
app.get("/", (req, res) => {
    res.sendFile("index.html", {
        root: path.join(__dirname, "../Frontend/"),
    });
});