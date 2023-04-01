<!DOCTYPE html>
<html>

<head>
    <title>List of Books</title>
    <link rel="stylesheet" href="style.css">
    <style>
        /* CSS styles */
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }

        h1 {
            font-size: 24px;
            text-align: center;
            margin-top: 50px;
        }

        .book-list {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
            margin: 50px auto;
            width: 90%;
            max-width: 1200px;
        }

        .book {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
            width: 30%;
            margin-bottom: 40px;
        }

        .book img {
            width: 100%;
            height: 250px;
            object-fit: cover;
            border-top-left-radius: 5px;
            border-top-right-radius: 5px;
        }

        .book-info {
            padding: 20px;
        }

        .book-title {
            font-size: 20px;
            margin-bottom: 10px;
        }

        .book-author {
            font-style: italic;
            color: #777;
            margin-bottom: 10px;
        }

        .book-description {
            font-size: 14px;
            line-height: 1.5;
        }

        @media screen and (max-width: 768px) {
            .book {
                width: 45%;
            }
        }

        @media screen and (max-width: 480px) {
            .book {
                width: 100%;
            }
        }
    </style>
</head>

<header>
    <h1>City Library</h1>
</header>
<nav>
    <ul>
        <li><a href="./">Home</a></li>
        <li><a href="book">About</a></li>
        <li><a href="login">Login</a></li>
    </ul>
</nav>
<main>
    <h1>List of Books</h1>
    <div class="book-list">
        <div class="book">
            <img src="image/mencariarumbawangi.jpg" alt="Book 1" style="height: fit-content;">
            <div class="book-info">
                <h2 class="book-title">Mencari Arumbawangi</h2>
                <p class="book-author">rien</p>
                <p class="book-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis euismod urna
                    id dolor tincidunt, vel bibendum ipsum vehicula. Aenean varius, ex vitae consequat convallis, nulla
                    mi iaculis mi, in suscipit tellus velit non velit.</p>
            </div>
        </div>
        <div class="book">
            <img src="image/spiderman.jpg" alt="Book 2" style="height: fit-content;">
            <div class="book-info">
                <h2 class="book-title">Amazing Spider-Man Vol 5 42</h2>
                <p class="book-author">kyruuu</p>
                <p class="book-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis euismod urna
                    id dolor tincidunt, vel bibendum ipsum vehicula. Aenean varius, ex vitae consequat convallis, nulla
                    mi iaculis mi, in suscipit tellus velit non velit.</p>
            </div>
        </div>
        <div class="book">
            <img src="image/filosofiteras.jpg" alt="Book 3" style="height: fit-content;">
            <div class="book-info">
                <h2 class="book-title">Filosofi Teras</h2>
                <p class="book-author">lipis</p>
                <p class="book-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis euismod urna
                    id dolor tincidunt, vel bibendum ipsum vehicula. Aenean varius, ex vitae consequat convallis, nulla
                    mi iaculis mi, in suscipit tellus velit non velit.</p>
            </div>
        </div>
    </div>
</main>

<footer>
    <p>Copyright &copy; 2023 Red Team 2</p>
</footer>
</body>
</html>