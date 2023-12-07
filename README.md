
# Takuzu-03a

Takuzu is a puzzle game that involves filling a grid with the numbers 0 and 1 using logical deduction.

This puzzle goes by several names, including Takuzu, Tohu-Wa-Vohu, Binairo, or Unruly. There are some variations in the symbols used for this game, such as the letters X and O, black and white colors, although 0 and 1 are the most commonly used symbols.

## Compilation

With CMake:

```bash
mkdir build ; cd build ; cmake .. ; make
```
## Rules

We have a grid similar to that of Sudoku, which we must fill with zeros and ones.

Each row and column must contain the same number of zeros and ones.
No row or column can contain three consecutive cells of the same number.
Some games also include an additional rule (called uniqueness), stating that no row or column can contain the same exact sequence of zeros and ones. (A row and a column can match, however.) But we will not consider this rule here.

## How to play on the terminal interface

By convention, the square in the ith row and jth column of the grid is called the coordinate (i,j), and the coordinate (0,0) corresponds to the upper left corner (as in matrices).

Note that immutable/unchangeable squares are represented by a capital letter.

In summary, the game uses 3 different square states, which can be printed in the terminal as a single character:

* empty, by typing: e i j; where i and j are the coordinates
* one/black, by typing: b i j
* zero/white, by typing: w i j

## How to play on the graphical interface

