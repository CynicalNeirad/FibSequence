package com.example.fib;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

@RestController
public class mainController {

    @RequestMapping("/")
    public String showIndex() {
        Scanner numberInput = new Scanner(System.in);
        int number = numberInput.nextInt();
        int[] fibSequence = {0,1,1};
        int i = 2;
        int sumNumbers = 0;

        while (fibSequence[i-1] <= number) {
            System.out.println(i);
            fibSequence[i] = fibSequence[i-2] + fibSequence[i-1];
            i++;
            fibSequence.push();
        }
        for (int n = 0; n < 4; n++) {
            sumNumbers = sumNumbers + fibSequence[(i-1)-n];
        }

        System.out.println(Arrays.toString(fibSequence));
        System.out.println(sumNumbers);
    return null;
    }
}
