function checkAndReplace(str, searchValue, fallbackValue) {
    // includes()와 ||를 사용하여 문자열을 확인하고 대체
    return str.includes(searchValue) ? str : fallbackValue;
}

const inputStr = "Hello, world!";
const result = checkAndReplace(inputStr, "world", "리다");
console.log(result);  // "Hello, world!" (포함됨)

const result2 = checkAndReplace(inputStr, "planet", "리다");
console.log(result2);  // "***" (포함되지 않음)
