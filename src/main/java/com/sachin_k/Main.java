package com.sachin_k;

import com.sachin_k.cli.Cli;

/** Thin entry point: all logic lives in {@link Cli}. */
public class Main {
    public static void main(String[] args) {
        System.exit(Cli.run(args));
    }
}
