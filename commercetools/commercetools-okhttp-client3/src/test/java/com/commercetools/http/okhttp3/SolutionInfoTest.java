
package com.commercetools.http.okhttp3;

import com.vdurmont.semver4j.Semver;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new OkHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(new Semver(version, Semver.SemverType.LOOSE).compareTo(new Semver("3.14.0"))).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("3.");
    }
}
