
package com.commercetools.http.netty;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new NettyHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(version).startsWith("1.2.");
    }
}
