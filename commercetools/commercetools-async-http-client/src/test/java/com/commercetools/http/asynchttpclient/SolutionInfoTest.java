
package com.commercetools.http.asynchttpclient;

import com.commercetools.http.asynchttp.AsyncHttpClientSolutionInfo;

import com.vdurmont.semver4j.Semver;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new AsyncHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(new Semver(version, Semver.SemverType.LOOSE).compareTo(new Semver("2.12.0"))).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("2.");
    }
}
