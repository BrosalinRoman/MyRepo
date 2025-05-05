from lxml import etree 

xml_file = "library.xml"
xsd_file = "library.xsd"

# Чтение XML и XSD
with open(xml_file, "rb") as xml, open(xsd_file, "rb") as xsd:
    xml_doc = etree.parse(xml)
    xsd_doc = etree.XMLSchema(etree.parse(xsd))

# Валидация
try:
    xsd_doc.assertValid(xml_doc)
    print("XML-документ валиден!")
except etree.DocumentInvalid as e:
    print("Ошибка валидации:", e)
