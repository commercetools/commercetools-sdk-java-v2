
package com.commercetools.api.models.api_client;

import java.time.LocalDate;
import java.time.ZonedDateTime;

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
public class ApiClientTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApiClientBuilder builder) {
        ApiClient apiClient = builder.buildUnchecked();
        Assertions.assertThat(apiClient).isInstanceOf(ApiClient.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApiClient.builder().id("id") },
                new Object[] { ApiClient.builder().name("name") }, new Object[] { ApiClient.builder().scope("scope") },
                new Object[] { ApiClient.builder().secret("secret") },
                new Object[] { ApiClient.builder().lastUsedAt(LocalDate.parse("2023-06-01")) },
                new Object[] { ApiClient.builder().deleteAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ApiClient.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ApiClient.builder().accessTokenValiditySeconds(8) },
                new Object[] { ApiClient.builder().refreshTokenValiditySeconds(7) } };
    }

    @Test
    public void id() {
        ApiClient value = ApiClient.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        ApiClient value = ApiClient.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void scope() {
        ApiClient value = ApiClient.of();
        value.setScope("scope");
        Assertions.assertThat(value.getScope()).isEqualTo("scope");
    }

    @Test
    public void secret() {
        ApiClient value = ApiClient.of();
        value.setSecret("secret");
        Assertions.assertThat(value.getSecret()).isEqualTo("secret");
    }

    @Test
    public void lastUsedAt() {
        ApiClient value = ApiClient.of();
        value.setLastUsedAt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLastUsedAt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void deleteAt() {
        ApiClient value = ApiClient.of();
        value.setDeleteAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getDeleteAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdAt() {
        ApiClient value = ApiClient.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void accessTokenValiditySeconds() {
        ApiClient value = ApiClient.of();
        value.setAccessTokenValiditySeconds(8);
        Assertions.assertThat(value.getAccessTokenValiditySeconds()).isEqualTo(8);
    }

    @Test
    public void refreshTokenValiditySeconds() {
        ApiClient value = ApiClient.of();
        value.setRefreshTokenValiditySeconds(7);
        Assertions.assertThat(value.getRefreshTokenValiditySeconds()).isEqualTo(7);
    }
}
