
package com.commercetools.api.models.api_client;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ApiClientDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApiClientDraftBuilder builder) {
        ApiClientDraft apiClientDraft = builder.buildUnchecked();
        Assertions.assertThat(apiClientDraft).isInstanceOf(ApiClientDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApiClientDraft.builder().name("name") },
                new Object[] { ApiClientDraft.builder().scope("scope") },
                new Object[] { ApiClientDraft.builder().deleteDaysAfterCreation(4L) },
                new Object[] { ApiClientDraft.builder().accessTokenValiditySeconds(8) },
                new Object[] { ApiClientDraft.builder().refreshTokenValiditySeconds(7) } };
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
