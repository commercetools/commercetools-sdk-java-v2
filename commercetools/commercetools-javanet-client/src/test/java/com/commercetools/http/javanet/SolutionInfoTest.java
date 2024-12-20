
package com.commercetools.http.javanet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new JavaNetHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(version).isNotEmpty();
    }
}
