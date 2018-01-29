package com.example.fib;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.Arrays;
@RestController
public class mainController {

    @RequestMapping(value = "/goalnumber" , method = RequestMethod.GET)
    public String showIndex(
        @RequestParam("goalnumber") int goalNumber) {
        int i = 4;
        ArrayList<Integer> fibSequence = new ArrayList<Integer>() {{add(0); add(1); add(1); add(2);}};  //Creates the array list and then .adds the two values to it in the same line
        while (fibSequence.get(i-1) < goalNumber) {                                     //I need to do that to enable the following math, which is helped by the sequence always being the same
            fibSequence.add(fibSequence.get(i - 3) + fibSequence.get(i - 4) + fibSequence.get(i - 2) + fibSequence.get(i - 1));               //And I'm using array lists as they don't have to have an assigned size
            i++;
        }
        return (Arrays.toString(fibSequence.toArray()));
    }

}
