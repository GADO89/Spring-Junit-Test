package com.spring;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DataArguments implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of("Ahmed" ,21, "01235"),
                Arguments.of("Karim" ,19, "012254"),
                Arguments.of("Jo" ,17, "0125558")
        );
    }
}
