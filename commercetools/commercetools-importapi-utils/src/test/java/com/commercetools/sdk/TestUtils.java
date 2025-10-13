package com.commercetools.sdk;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class TestUtils {
    public static String stringFromResource(final String resourcePath) {
        try {
            return Files.readString(Path.of(resourcePath));
        }
        catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
