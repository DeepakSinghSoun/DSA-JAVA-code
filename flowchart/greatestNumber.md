// Flowchart to find the greatest from 2 numbers.

```mermaid
flowchart TD
    A([Start]) --> B[/Input two number num1 , num2/]
    B --> C{is num1 > num2 ?}
    C -- YES --> D[/Print num1 is greatest/]
    C -- NO --> E[/Print num2 is greates/]
    D --> F([End])
    E --> F([End])
````