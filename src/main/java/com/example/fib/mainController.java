package com.example.fib;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

@RestController
public class mainController {

    @RequestMapping("/")
    public String showIndex() {
        Scanner numberInput = new Scanner(System.in);
        int number = numberInput.nextInt();
        int i = 2;
        int sumNumbers = 0;
        ArrayList<Integer> fibSequence = new ArrayList();
        fibSequence.add(0);
        fibSequence.add(1);

        while (fibSequence.get(i-1) <= number) {
            fibSequence.add(fibSequence.get(i-2) + fibSequence.get(i-1));
            i++;
        }
        for (int n = 0; n < 4; n++) {
            sumNumbers = sumNumbers + fibSequence.get((i-1)-n);
        }

        System.out.println(Arrays.toString(fibSequence.toArray()));
        System.out.println(sumNumbers);
    return null;
    }
}
