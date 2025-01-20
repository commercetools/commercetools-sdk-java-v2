
package com.commercetools.http.okhttp4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new OkHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(version).isEqualTo("4.12.0");
    }
}
