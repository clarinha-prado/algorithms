// let str = "barfoofoobarthefoobarman";
// let substrArr = ["bar", "foo", "the"];

// let str = "wordgoodgoodgoodbestword";
// let substrArr = ["word", "good", "best", "word"];

let str = "barfoothefoobarman";
let substrArr = ["foo", "bar"];

let result = [];

let currentStr;
let sizeBefore;

function Main() {
    // get substrs length
    substrSize = substrArr[0].length;

    // while substr array not empty
    for (let index = 0; index < str.length - (substrSize * substrArr.length) + 1; index++) {
        currentStr = str.substr(index, substrSize);
        sizeBefore = substrArr.length;

        // cópia do array
        modifiedArr = substrArr.slice();

        while (true) {
            modifiedArr = findAndRemoveSubstr(currentStr, modifiedArr);

            if (modifiedArr.length === sizeBefore) {
                break;
            } else if (modifiedArr.length === 0) {
                result.push(index);
                break;
            } else {
                sizeBefore = modifiedArr.length;
                qtyFound = substrArr.length - modifiedArr.length;
                currentStr = str.substr(index + substrSize * qtyFound, substrSize);
            }
        }
    }

    console.log('Resultado: ', result.toString());
}

function findAndRemoveSubstr(currentStr, substrArr) {

    for (let index = 0; index < substrArr.length; index++) {
        if (substrArr[index] === currentStr) {
            substrArr.splice(index, 1);
            break;
        }
    }

    return substrArr;
}

Main();