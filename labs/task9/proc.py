import xml.etree.ElementTree as ET

xml_file = "library.xml"

tree = ET.parse(xml_file)
root = tree.getroot()

# Вывод списка книг
print("Список книг:")
for book in root.findall("book"):
    title = book.find("title").text
    author = book.find("author").text
    year = book.find("year").text
    genre = book.find("genre").text
    price = float(book.find("price").text)
    print(f"Название: {title}, Автор: {author}, Год: {year}, Жанр: {genre}, Цена: {price}")

# Средняя цена
prices = [float(book.find("price").text) for book in root.findall("book")]
avg_price = sum(prices) / len(prices)
print(f"\nСредняя цена книг: {avg_price:.2f}")

# Фильтрация (например, по жанру)
genre_filter = "Classic"
filtered_books = [book for book in root.findall("book") if book.find("genre").text == genre_filter]
print(f"\nКниги жанра '{genre_filter}':")
for book in filtered_books:
    print(book.find("title").text)
