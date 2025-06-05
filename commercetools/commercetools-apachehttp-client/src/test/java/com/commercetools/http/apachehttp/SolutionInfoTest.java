
package com.commercetools.http.apachehttp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new ApacheHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(Runtime.Version.parse(version).compareTo(Runtime.Version.parse("5.4.1"))).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("5.");
    }
}
