var removeCoveredIntervals = function (intervals) {
    {
        let itemsToRemove = [];

        for (i = 0; i < intervals.length; i++) {

            current = intervals[i];

            for (j = 0; j < intervals.length; j++) {
                if (i === j) {
                    continue;
                }
                if (isCovered(current, intervals[j])) {
                    itemsToRemove.push(i);
                    break;
                }
            }
        }
        console.log("itens a remover: ", itemsToRemove);
        return intervals.length - itemsToRemove.length;
    }
}
// Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.
// Interval [3,8) is covered by interval [2,9) if and only if 2 <= 3 and 8 <= 9.
// For example, [3, 8) is the interval of real numbers between 3 and 8, including 3 and excluding 8.

function isCovered(first, second) {
    if ((second[0] <= first[0]) && (first[1] <= second[1])) {
        return true;
    } else {
        return false;
    }
}

function Main() {
    intervals = [
        [[1, 4], [3, 6], [2, 8]],
        [[1, 4], [2, 3]],
        [[0, 10], [5, 12]],
        [[3, 10], [4, 10], [5, 11]],
        [[1, 2], [1, 4], [3, 4]]
    ];

    expectedResult = [2, 1, 2, 2, 1];

    for (pointer = 0; pointer < 5; pointer++) {
        result = removeCoveredIntervals(intervals[pointer]);
        if (result === expectedResult[pointer]) {
            console.log("Sucesso!!! ");
        } else {
            console.log("Falhou: ");
        }
        console.log(result);
    }
}

Main();