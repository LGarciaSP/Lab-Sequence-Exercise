package com.exercise.springbootlabexercise;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;

/**
 * The LabSequence class provides a method for calculating the sequence.
 */
public class LabSequence {
    /**
     * Calculates the labseq value for a given integer n.
     *
     * @param n The input integer for which the lab sequence ("labseq") value should be calculated.
     * @return The calculated labseq value for the given n as a long.
     */
        @Cacheable("labseqCache")
        public long calculateLabSeq(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Input n must be a non-negative integer.");
            }
            if (n < 4) {
                return n % 2;
            } else {
                long[] labSeq = new long[n + 1];
                for (int i = 0; i < 4; i++) {
                    labSeq[i] = i % 2;
                }
                for (int i = 4; i <= n; i++) {
                    labSeq[i] = labSeq[i - 4] + labSeq[i - 3];
                }
                return labSeq[n];
            }

        }
    }