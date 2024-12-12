# Kotlin MutableList removeIf Unexpected Behavior

This repository demonstrates an uncommon issue encountered when using the `removeIf` function with a `MutableList` in Kotlin. The `removeIf` function modifies the list while iterating over it, which can lead to unexpected behavior or exceptions.

## Problem Description

The provided code intends to remove all even numbers from a list. However, due to the concurrent modification, the result might not be as expected. The `removeIf` function iterates and removes elements, causing the index to shift, and the function may not be able to correctly remove all the intended even elements.

## Solution

The solution involves iterating over a copy of the list or using an alternative approach to remove elements safely without causing concurrent modification issues.  The solution in this repository uses a copy of the list.
