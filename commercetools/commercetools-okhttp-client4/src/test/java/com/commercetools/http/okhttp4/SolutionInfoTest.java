
package com.commercetools.http.okhttp4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new OkHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(Runtime.Version.parse(version).compareTo(Runtime.Version.parse("4.12.0"))).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("4.");
    }
}
