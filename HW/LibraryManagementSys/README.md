```
«interface»
  Displayable
    + display()
        ↑
      Book                    ← your base class
   - title, author, id       ← private fields (encapsulation)
   + Book()                  ← default constructor
   + Book(id, title, author) ← parameterized constructor
   + display()               ← implements interface
        ↑
  ReferenceBook               ← inherits from Book (inheritance)
   - department
   + ReferenceBook(...)       ← constructor overloading concept
   + display()                ← overrides Book's display()

  Library                     ← manages Book[] array
   - Book[] books             ← array of objects
   + addBook()
   + displayAll()
   + searchById()

  Main                        ← entry point, runs everything
  ```
