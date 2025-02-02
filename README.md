# tdd calculator
cph-mj1192@cphbusiness.dk
Markus Bjerrum Jørgensen

This is a calculator program

## Features
- **Addition of two integers**: `add(int a, int b)`
- **Addition of a string of integers separated by commas**: `add(String numbers)`
- **Addition of an array of integers**: `add(int[] numbers)`
- **Subtraction of two integers**: `subtract(int a, int b)`
- **Multiplication of two integers**: `multiply(int a, int b)`
- **Division of two integers**: `divide(int a, int b)`

## Git status
Before adding:
```
$ git status
On branch featureAddString
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   README.md
	modified:   src/main/java/tdd/Calculator.java
	modified:   src/test/java/tdd/CalculatorTest.java

no changes added to commit (use "git add" and/or "git commit -a")
```

Before committing:
```
$ git status
On branch featureAddString
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	modified:   README.md
	modified:   src/main/java/tdd/Calculator.java
	modified:   src/test/java/tdd/CalculatorTest.java
```

After committing:
```
$ git status
On branch featureAddString
nothing to commit, working tree clean
```

## Git log
```
$ git log
commit 9f4a1a478e3f439151c2ca8bb35e81c7681f3871 (HEAD -> main, featureAddString)
Author: Bojuuh <mbjerrumj@gmail.com>
Date:   Mon Feb 3 00:14:46 2025 +0100

    overloaded add method: add(String numbers) and add(int[] numbers) and tests for those methods added. README.md changes: description and feature list

commit d051839b4bae3f9a330286294af9d17b96e111d7 (origin/main)
Author: Bojuuh <mbjerrumj@gmail.com>
Date:   Sun Feb 2 23:06:21 2025 +0100

    Add README.md file

commit 0289f2836a2ca091de8b8a976c395af1cddff3c1
Author: Bojuuh <mbjerrumj@gmail.com>
Date:   Sun Feb 2 22:23:06 2025 +0100

    initial commit

```

