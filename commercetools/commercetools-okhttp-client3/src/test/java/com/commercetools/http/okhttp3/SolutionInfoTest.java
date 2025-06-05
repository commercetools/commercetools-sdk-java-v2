
package com.commercetools.http.okhttp3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new OkHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(Runtime.Version.parse(version).compareTo(Runtime.Version.parse("3.14.0"))).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("3.");
    }
}
