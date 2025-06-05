
package com.commercetools.http.okhttp4;

import com.vdurmont.semver4j.Semver;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionInfoTest {
    @Test
    public void version() {
        String version = new OkHttpClientSolutionInfo().getVersion();

        Assertions.assertThat(new Semver(version).compareTo(new Semver("4.12.0"))).isGreaterThanOrEqualTo(0);
        Assertions.assertThat(version).startsWith("4.");
    }
}
