
package io.vrap.rmf.base.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;

public class VersionLoader {

    public static String loadVersionInfo(final String groupId, final String artifactId, final String versionFile,
            final String versionProperty, final ClassLoader classLoader) {
        Properties loadedProps = null;
        try {
            try (final InputStream is = classLoader
                    .getResourceAsStream("META-INF/maven/" + groupId + "/" + artifactId + "/" + versionFile)) {
                if (is != null) {
                    final Properties props = new Properties();
                    props.load(is);
                    loadedProps = props;
                }
            }
        }
        catch (final IOException ignored) {
        }

        if (loadedProps != null) {
            return Optional.ofNullable(loadedProps.get(versionProperty)).map(Object::toString).orElse(null);
        }

        return null;
    }
}
