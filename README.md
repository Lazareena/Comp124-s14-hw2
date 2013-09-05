Comp 124: Homework 2
====

These assignments were developed by Paul Cantrell for Comp 124 and are reused with his permission. Thanks, Paul!

General tips for programming assignments:

- **Build up your answer in small, testable steps.** Don't just start at the top and work all the way to the bottom before you try running it. Build up your answer a little bit at a time, and test it at each step to make sure it's doing what you think it should. Do a git commit every time you have a new step working.
- **Be very clear about what your goal is at each step.** Resist the temptation to type in lots of random stuff and hope that it eventually makes sense. Know what each expression's goal is. Know what you expect the result to be. If you find that you aren't sure, then stop and think about it. Draw a syntax tree if necessary. Always know what your ultimate goal is; don't let the details make you lost sight of the big picture.
- **Once you have it working, take a little time to clean it up.** Is it clear to a human reader? Is there any unnecessary redundancy? Any leftover tidbits of your work that don't matter anymore? Anything that could use a better name? A comment? Remember that code has two audiences, the computer and the human. Write well for both audiences.
- **If you can't get it to work, hand in what you've got.** Explain what works and what doesn't. Explain any theories you have about where you went wrong. Partial credit is better than no credit!
- **Ask your instructor & preceptor for help.** Our office hours are your time to use. You have our contact info. Bring questions! Bring confusions! Bring your completed or uncompleted work to get feedback! I am a resource for you, so use that resource. Same goes for Nick.

General ethics reminder: I encourage you to discuss the problems and give each other tips, but **looking at someone else's code is cheating.**

Problem 1: Number Guessing Game
---

Make a game in which the human player tries to guess the number the computer is thinking of. The player types in a number, and the computer
tells you "Higher" or "Lower." The game ends when the player guesses correctly. The computer then asks the player whether they'd like to play again.

It should look like this (note that the human types the text in **bold**):

<pre>
  I'm thinking of a number between 0 and 99!
  Your guess: <b>50</b>
  Higher.
  Your guess: <b>75</b>
  Lower.
  Your guess: <b>60</b>
  Lower.
  Your Guess: <b>55</b>
  Higher.
  Your Guess: <b>57</b>
  You got it!
  Would you like to play again? (true or false) <b>true</b>
  I'm thinking of a number between 0 and 99!
  Your guess: <b>65</b>
  Lower.
  Your guess: <b>32</b>
  Lower.
  Your guess: <b>17</b>
  Higher.
  Your Guess: <b>26</b>
  You got it!
  Would you like to play again? (true or false) <b>false</b>
  OK, bye bye!
</pre>

Starting point:

- I have already created a `GuessNumber` class for you. It extends `ConsoleProgram`, which gives you `println`, `readInt`, and `readBoolean` methods you can use.
- I provided code to generate a random number, and assign it to a variable called `answer`. This is your starting point.
- The starting code I provided prints out the correct answer. Leave that in there until everything is working! It will be easier for you to test if you know what the answer is.

Suggested steps (commit after **each step** when you get each one working):

- First add code to give the user just a single guess, then print out "Higher," "Lower" or "You got it!"
- Next, change the code to let the user guess repeatedly until they get it right.
- Now add the code to offer the user another game. (Make sure it's a different answer each time!)
- Finally, now that everything is working, remove the code that prints the answer.

When it's all done, don't forget to push: right click on the project in the Package Explorer -> Team... -> Push to Upstream. Remember, **if you don't push, it's not handed in!**


Problem 2: This code is a mess!
---

Here is a little game:

1. Start with some positive integer. Call that the “seed.”
2. If it is even, divide it by 2. Otherwise, multiply it by 3 and add 1.
3. If the result equals 1, then stop. Otherwise go back to step 2.

Here is how it plays out for numbers up to 12:

<table>
  <tr>
    <th>seed</th>
    <th>sequence</th>
    <th>iterations to reach 1</th>
  </tr>
  <tr>
      <td>1</td>
      <td>1</td>
      <td>0</td>
  </tr>
  <tr>
      <td>2</td>
      <td>2, 1</td>
      <td>1</td>
  </tr>
  <tr>
      <td>3</td>
      <td>3, 10, 5, 16, 8, 4, 2, 1</td>
      <td>7</td>
  </tr>
  <tr>
      <td>4</td>
      <td>4, 2, 1</td>
      <td>2</td>
  </tr>
  <tr>
      <td>5</td>
      <td>5, 16, 8, 4, 2, 1</td>
      <td>5</td>
  </tr>
  <tr>
      <td>6</td>
      <td>6, 3, 10, 5, 16, 8, 4, 2, 1</td>
      <td>8</td>
  </tr>
  <tr>
      <td>7</td>
      <td>7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1</td>
      <td>16</td>
  </tr>
  <tr>
      <td>8</td>
      <td>8, 4, 2, 1</td>
      <td>3</td>
  </tr>
  <tr>
      <td>9</td>
      <td>9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1</td>
      <td>19</td>
  </tr>
  <tr>
      <td>10</td>
      <td>10, 5, 16, 8, 4, 2, 1</td>
      <td>6</td>
  </tr>
  <tr>
      <td>11</td>
      <td>11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1</td>
      <td>14</td>
  </tr>
  <tr>
      <td>12</td>
      <td>12, 6, 3, 10, 5, 16, 8, 4, 2, 1</td>
      <td>9</td>
  </tr>
</table>

But does it always eventually reach 1? Nobody knows. This is called the [Collatz conjecture](http://en.wikipedia.org/wiki/Collatz_conjecture). Researchers have used computers to test all integers up to 5,764,607,523,034,234,880 (whoa!), and so far, the conjucture holds true — but nobody has yet managed to prove it.

How long can the sequence go before reaching 1? What seeds generate the longest sequences? That's another interesting open question. For example, you can see from the table above that 9 is the record-setting seed less than or equal to 12.

I wrote a program, `CollatzIterator`, which finds the record-setting seed less than or equal to some maximum. It works correctly, but it's _terrible_ code. **Your mission: clean it up.** You goal is not necessarily to make the code as _small_ as possible, but as _simple and clear_ as possible.

- All the variables are declared up at the top. That's no good. Narrow the scope of each variable as much as possible by moving the declaration down to where the variable is first used.
- Once you've done that, decompose that single big method into three smaller ones:
    - `iterate(int x)`: Applies one iteration of the sequence (step 2 above) and returns the result.
    - `sequenceLength(int seed)`: Returns the length of the sequence for a given seed.
    - `recordSettingSeed(int max)`: Returns the seed that yields the longest sequence less than or equal to max.
      (This method is already there, and will return the same results — but it will be much smaller now!)
- Some of the boolean expressions are unnecessarily complex. Simplify them.
- Look out for unnecessary intermediate variables, redundant tests, and verbose expressions for which Java provides a standard shortcut.
- Keep simplifying. Each simplification will reveal others.
- **Test early and test often.** I have given you a `CollatzIteratorTest`. The smart approach is to run it after _each_ simplification you make. The tests pass now, and they must still pass (without any modifications!) when you are done.

_**Challenge:** Make a plot of seed vs. sequence length, like [this](http://en.wikipedia.org/wiki/File:Collatz-stopping-time.svg)._

