package kg.geeks.bookcompose.ui.components

data class Novel(
    val id: Int,
    val title: String,
    val writer: String,
    val summary: String,
    val genre: String,
    val imageUrl: String
)

object LibraryStorage {
    val novels = listOf(
        Novel(
            201, "Гарри Поттер", "Дж. К. Роулинг",
            "История о мальчике-волшебнике.", "Фэнтези",
            "https://m.media-amazon.com/images/I/81YOuOGFCJL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            202, "Моби Дик", "Герман Мелвилл",
            "Роман о поиске белого кита.", "Приключения",
            "https://m.media-amazon.com/images/I/71F4+6zToPL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            203, "Идиот", "Фёдор Достоевский",
            "Классика русской литературы.", "Классика",
            "https://m.media-amazon.com/images/I/81F3aXz1EHL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            204, "Метро 2033", "Дмитрий Глуховский",
            "Постапокалиптический роман.", "Фантастика",
            "https://m.media-amazon.com/images/I/91b0C2YNSrL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            205, "Пикник на обочине", "Братья Стругацкие",
            "Фантастика с философским подтекстом.", "Фантастика",
            "https://m.media-amazon.com/images/I/81eA0tF2q3L._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            206, "Властелин колец", "Дж. Р. Р. Толкин",
            "Эпическое фэнтези о борьбе добра и зла.", "Фэнтези",
            "https://m.media-amazon.com/images/I/91A3yyU0xPL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            207, "1984", "Джордж Оруэлл",
            "Антиутопия о тоталитарном обществе.", "Дистопия",
            "https://m.media-amazon.com/images/I/71kxa1-0mfL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            208, "Преступление и наказание", "Фёдор Достоевский",
            "Глубокий психологический роман.", "Классика",
            "https://m.media-amazon.com/images/I/81lO1E8xlUL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            209, "Шерлок Холмс", "Артур Конан Дойл",
            "Детективные истории о великом сыщике.", "Детектив",
            "https://m.media-amazon.com/images/I/81N7FmJhbhL._AC_UF1000,1000_QL80_.jpg"
        ),
        Novel(
            210, "Мастер и Маргарита", "Михаил Булгаков",
            "Мистический роман о добре и зле.", "Фантастика",
            "https://m.media-amazon.com/images/I/81p9vG9k8nL._AC_UF1000,1000_QL80_.jpg"
        )
    )

    val genres = listOf("Все", "Фэнтези", "Приключения", "Классика", "Фантастика")
}