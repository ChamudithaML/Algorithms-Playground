# Bubble Sort

## What is Bubble Sort

Bubble sort is a sorting algorithm that can be used to sort an array of numbers. It works by repeatedly swapping adjacent numbers. The algorithm checks adjacent pairs and moves the greater value to the right side, or vice versa.

## The steps of sorting are as follows

### Iteration 1

![bubble1](../images/bubble-sort/1.jpg)

### Iteration 2

![bubble2](../images/bubble-sort/2.jpg)

## Notes

- During the first iteration, the maximum value is placed at the end.
- In the second iteration, the second maximum value is placed in the position before the last one.
- Similarly, each iteration moves the maximum value to the position before the previously found maximum.
- Therefore, the number of iterations can be reduced by decreasing the array size by 1 with each iteration.

- The number of main iterations is the array length - 1.
