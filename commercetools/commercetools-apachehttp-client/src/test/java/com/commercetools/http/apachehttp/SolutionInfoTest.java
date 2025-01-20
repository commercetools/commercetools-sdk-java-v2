
package com.commercetools.http.apachehttp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new ApacheHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(version).isEqualTo("5.4.1");
    }
}
