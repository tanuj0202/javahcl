package day17;

public class Java15 {
    public static void main(String[] args) {
        String message = "Hello Students\n" + "Welcome to Java\n" + "Today we are learning text blocks";
        System.out.println(message);
        System.out.println("==========TEXT BLOCK===========");
        String message2 = """
                Hello Students
                Welcome to Java
                Today we are learning Text Blocks
                """;

        System.out.println(message2);

        String json = """
    {
        "name": "John Doe",
        "age": 30,
        "isDeveloper": true
    }
    """;

    System.out.println(json);

        String html = """
<!DOCTYPE html>
<html>
  <head>
    <title>Hello, World!</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
      <h1 class="title">Hello World!</h1>
      <p id="currentTime"></p>
      <script src="script.js"></script>
  </body>
</html>
                """;

        System.out.println(html);

        String name = "Tanuj";
        int marks = 92;
        String sql = """
                Select * from students where name = %s and marks = %d;
                """.formatted(name,marks);

        System.out.println(sql);
    }
}
