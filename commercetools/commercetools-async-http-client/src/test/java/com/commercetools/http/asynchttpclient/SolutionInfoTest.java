
package com.commercetools.http.asynchttpclient;

import com.commercetools.http.asynchttp.AsyncHttpClientSolutionInfo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new AsyncHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(version).startsWith("2.12.");
    }
}
