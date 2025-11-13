
package com.commercetools.http.okhttp5;

import com.vdurmont.semver4j.Semver;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new OkHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(new Semver(version, Semver.SemverType.LOOSE).compareTo(new Semver("5.3.0")))
                .isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("5.");
    }
}
