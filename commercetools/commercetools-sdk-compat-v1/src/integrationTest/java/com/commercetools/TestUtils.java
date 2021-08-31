
package com.commercetools;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import org.apache.commons.io.IOUtils;

public class TestUtils {
    public static String stringFromResource(final String resourcePath) {
        try {
            return IOUtils.toString(
                Objects.requireNonNull(
                    Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath)),
                StandardCharsets.UTF_8);
        }
        catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
