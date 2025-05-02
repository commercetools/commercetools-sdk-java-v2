
package com.commercetools.api.models.api_client;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApiClientDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApiClientDraftBuilder builder) {
        ApiClientDraft apiClientDraft = builder.buildUnchecked();
        Assertions.assertThat(apiClientDraft).isInstanceOf(ApiClientDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ApiClientDraft.builder().name("name") },
                new Object[] { "scope", ApiClientDraft.builder().scope("scope") },
                new Object[] { "deleteDaysAfterCreation", ApiClientDraft.builder().deleteDaysAfterCreation(4L) },
                new Object[] { "accessTokenValiditySeconds", ApiClientDraft.builder().accessTokenValiditySeconds(8) },
                new Object[] { "refreshTokenValiditySeconds",
                        ApiClientDraft.builder().refreshTokenValiditySeconds(7) } };
    }

    @Test
    public void name() {
        ApiClientDraft value = ApiClientDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void scope() {
        ApiClientDraft value = ApiClientDraft.of();
        value.setScope("scope");
        Assertions.assertThat(value.getScope()).isEqualTo("scope");
    }

    @Test
    public void deleteDaysAfterCreation() {
        ApiClientDraft value = ApiClientDraft.of();
        value.setDeleteDaysAfterCreation(4L);
        Assertions.assertThat(value.getDeleteDaysAfterCreation()).isEqualTo(4L);
    }

    @Test
    public void accessTokenValiditySeconds() {
        ApiClientDraft value = ApiClientDraft.of();
        value.setAccessTokenValiditySeconds(8);
        Assertions.assertThat(value.getAccessTokenValiditySeconds()).isEqualTo(8);
    }

    @Test
    public void refreshTokenValiditySeconds() {
        ApiClientDraft value = ApiClientDraft.of();
        value.setRefreshTokenValiditySeconds(7);
        Assertions.assertThat(value.getRefreshTokenValiditySeconds()).isEqualTo(7);
    }
}
