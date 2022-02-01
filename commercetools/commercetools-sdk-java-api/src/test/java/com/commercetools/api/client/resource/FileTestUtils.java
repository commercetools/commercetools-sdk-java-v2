
package com.commercetools.api.client.resource;

import java.io.File;
import java.net.URISyntaxException;

public class FileTestUtils {
    public static File fileFromResource(final String resourcePath) {
        try {
            return new File(Thread.currentThread().getContextClassLoader().getResource(resourcePath).toURI());
        }
        catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static File testFileFor(Class<?> clazz) {
        return fileFromResource("numbers.json");
    }
}
