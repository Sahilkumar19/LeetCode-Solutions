Here are the essential bitwise rules and tricks used in programming, categorized by operation.
## 1. XOR (^) Properties
XOR is highly powerful for puzzles and encryption because it acts as a toggle.

* Identity: x ^ 0 = x (XOR with 0 changes nothing)
* Self-Inversion: x ^ x = 0 (XOR with itself clears the value)
* Commutative/Associative: a ^ b ^ a = b (Order does not matter; duplicates cancel out)

## 2. AND (&) Properties
AND is primarily used for masking (extracting specific bits) and checking states.

* Annihilation: x & 0 = 0 (Forces bits to 0)
* Identity: x & 1 = x (Keeps the original bit value)
* Even/Odd Check: (x & 1) == 0 is true if x is even, and 1 if odd.
* Power of Two Check: (x & (x - 1)) == 0 checks if a number is a power of 2.

## 3. OR (|) Properties
OR is used to set specific bits to 1 without altering others.

* Identity: x | 0 = x (Changes nothing)
* Saturation: x | ~0 = ~0 (Sets all bits to 1)
* Bit Setting: x | (1 << n) sets the $n$-th bit to 1.

## 4. Bit Shifting Rules
Shifting bits left or right scales numbers by powers of 2.

* Left Shift (<<): x << n multiplies x by $2^n$.
* Right Shift (>>): x >> n divides x by $2^n$ (floored integer division).

## 5. Two's Complement (Negation)
How computers store negative numbers.

* Bitwise NOT (~): ~x = -x - 1 (Flips all bits).
* Negation: -x = ~x + 1 (Flip all bits and add 1).
* Get Lowest Set Bit: x & -x isolates the lowest 1 bit.
