# Conway's Game of Life
> A boilerplate to implement Conway's »Game of Life« using test-driven Java.

# Introduction
> Following rules taken from [Wikipedia](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)

The *Game of Life* is a cellular automaton devised by the British mathematician John Horton Conway in 1970.

The "game" is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input.
One interacts with the Game of Life by creating an initial configuration and observing how it evolves, or,
for advanced "players", by creating patterns with particular properties.

## Rules

The universe of the *Game of Life* is an infinite two-dimensional orthogonal grid of square "cells", each of which is in one
of two possible states, alive or dead, (or "populated" and "unpopulated" respectively). Every cell interacts with its
eight neighbours, which are the cells that are horizontally, vertically, or diagonally adjacent. At each step in time,
the following transitions occur:

- Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any live cell with more than three live neighbours dies, as if by overpopulation.
- Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules
simultaneously to every cell in the seed—births and deaths occur simultaneously, and the discrete moment at which
this happens is sometimes called a tick (in other words, each generation is a pure function of the preceding one).
The rules continue to be applied repeatedly to create further generations.

## Project overview

The boilerplate is designed for job interviews, code retreats or for in-house practise. Required for the project
is a [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) version 8 or later and [Maven](https://maven.apache.org/) both available on the command line.

Also included is a `project.iml` to startup for coding with [Intellij IDEA](https://www.jetbrains.com/idea/).

### Maven targets

- Run all tests: `mvn test` or `mvn test -q` for test output only
- Build jar-artifact: `mvn install`
- Run main application: `mvn exec:java` or `mvn exec:java -q` for application output only
