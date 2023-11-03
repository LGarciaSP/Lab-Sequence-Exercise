package com.exercise.springbootlabexercise;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * The LabSequenceController class provides a REST API for calculating the lab sequence.
 */
@RestController
public class LabSequenceController {
    /**
     * Calculates the lab sequence ("labseq") value for a given non-negative integer n.
     *
     * @param n The non-negative integer for which the labseq value should be calculated.
     * @return The calculated labseq value for the given non-negative n.
     */
    private LabSequence labSequence = new LabSequence();

    @GetMapping("/labseq/{n}")
    @Cacheable("labseqCache")
    public long calculateLabSeq(@PathVariable int n) {

        return labSequence.calculateLabSeq(n);
    }
}
