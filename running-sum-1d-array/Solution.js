function runningSum(nums) {
    acc = 0;
    output = [];
    for (i = 0; i < nums.length; i++) {
        acc += nums[i];
        output.push(acc);
    }

    return output;
};

function Main() {
    input = [[1, 2, 3, 4], [1, 1, 1, 1, 1], [3, 1, 2, 10, 1]];
    expectedOutput = [[1, 3, 6, 10], [1, 2, 3, 4, 5], [3, 4, 6, 16, 17]];

    for (j = 0; j < 3; j++) {
        output = runningSum(input[j]);
        console.log("\noutput: ", output);
        console.log("expected: ", expectedOutput[j]);
    }
}

Main();