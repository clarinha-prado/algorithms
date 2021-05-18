function mostVisited(n, rounds) {
    output = [];
    visits = [];

    for (a = 0; a < n + 1; a++) {
        visits.push(0);
    }

    for (j = 0; j < rounds.length - 1; j++) {
        if (rounds[j] < rounds[j + 1]) {
            for (i = rounds[j]; i < rounds[j + 1]; i++) {
                visits[i] = visits[i] + 1;
            }
        } else {
            for (k = rounds[j]; k <= n; k++) {
                visits[k] = visits[k] + 1;
            }
            for (l = 1; l < rounds[j + 1]; l++) {
                visits[l] = visits[l] + 1;
            }
        }
    }
    visits[rounds[rounds.length - 1]]++;

    // pegar o número máximo
    max = Math.max.apply(Math, visits);

    // pegar todos com visitas = máximo
    for (m = 1; m < visits.length; m++) {
        if (visits[m] == max) {
            output.push(m);
        }
    }

    return output;
}

function main() {
    n = [4, 2, 7];

    input = [
        [1, 3, 1, 2],
        [2, 1, 2, 1, 2, 1, 2, 1, 2],
        [1, 3, 5, 7]
    ];

    expectedOutput = [
        [1, 2],
        [2],
        [1, 2, 3, 4, 5, 6, 7]
    ];

    for (o = 0; o < 3; o++) {
        output = mostVisited(n[o], input[o]);

        console.log("output: ", output);
        console.log("expected: ", expectedOutput[o]);
    }
}

main();