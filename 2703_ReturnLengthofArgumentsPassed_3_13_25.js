<<<<<<< HEAD
// * 2703. Return Length of Arguments Passed
// Write a function argumentsLength that returns the count of arguments passed to it.

// Example 1:
// Input: args = [5]
// Output: 1
// Explanation:
// argumentsLength(5); // 1
// One value was passed to the function so it should return 1.

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
  return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */

// Runtime 46ms Beats 64.62%

// ====== OR ========

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
  let count = 0;
  while (args[count++] !== undefined) {}
  return count - 1;
};
=======
// * 2703. Return Length of Arguments Passed
// Write a function argumentsLength that returns the count of arguments passed to it.

// Example 1:
// Input: args = [5]
// Output: 1
// Explanation:
// argumentsLength(5); // 1
// One value was passed to the function so it should return 1.

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
  return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */

// Runtime 46ms Beats 64.62%

// ====== OR ========

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function (...args) {
  let count = 0;
  while (args[count++] !== undefined) {}
  return count - 1;
};
>>>>>>> eead8d0143e97c2c3b238477bd394cc0f8a77c96
