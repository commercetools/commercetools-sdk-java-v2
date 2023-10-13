
package com.commercetools.api.models.project;

import java.time.ZonedDateTime;
import java.util.Collections;

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
public class ProjectTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectBuilder builder) {
        Project project = builder.buildUnchecked();
        Assertions.assertThat(project).isInstanceOf(Project.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Project.builder().version(2L) },
                new Object[] { Project.builder().key("key") }, new Object[] { Project.builder().name("name") },
                new Object[] { Project.builder().countries(Collections.singletonList("countries")) },
                new Object[] { Project.builder().currencies(Collections.singletonList("currencies")) },
                new Object[] { Project.builder().languages(Collections.singletonList("languages")) },
                new Object[] { Project.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Project.builder().trialUntil("trialUntil") },
                new Object[] { Project.builder()
                        .messages(new com.commercetools.api.models.message.MessagesConfigurationImpl()) },
                new Object[] {
                        Project.builder().carts(new com.commercetools.api.models.project.CartsConfigurationImpl()) },
                new Object[] { Project.builder()
                        .shoppingLists(new com.commercetools.api.models.project.ShoppingListsConfigurationImpl()) },
                new Object[] { Project.builder()
                        .shippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl()) },
                new Object[] {
                        Project.builder().externalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl()) },
                new Object[] { Project.builder()
                        .searchIndexing(new com.commercetools.api.models.project.SearchIndexingConfigurationImpl()) },
                new Object[] { Project.builder()
                        .businessUnits(new com.commercetools.api.models.project.BusinessUnitConfigurationImpl()) } };
    }

    @Test
    public void version() {
        Project value = Project.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        Project value = Project.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        Project value = Project.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void countries() {
        Project value = Project.of();
        value.setCountries(Collections.singletonList("countries"));
        Assertions.assertThat(value.getCountries()).isEqualTo(Collections.singletonList("countries"));
    }

    @Test
    public void currencies() {
        Project value = Project.of();
        value.setCurrencies(Collections.singletonList("currencies"));
        Assertions.assertThat(value.getCurrencies()).isEqualTo(Collections.singletonList("currencies"));
    }

    @Test
    public void languages() {
        Project value = Project.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }

    @Test
    public void createdAt() {
        Project value = Project.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void trialUntil() {
        Project value = Project.of();
        value.setTrialUntil("trialUntil");
        Assertions.assertThat(value.getTrialUntil()).isEqualTo("trialUntil");
    }

    @Test
    public void messages() {
        Project value = Project.of();
        value.setMessages(new com.commercetools.api.models.message.MessagesConfigurationImpl());
        Assertions.assertThat(value.getMessages())
                .isEqualTo(new com.commercetools.api.models.message.MessagesConfigurationImpl());
    }

    @Test
    public void carts() {
        Project value = Project.of();
        value.setCarts(new com.commercetools.api.models.project.CartsConfigurationImpl());
        Assertions.assertThat(value.getCarts())
                .isEqualTo(new com.commercetools.api.models.project.CartsConfigurationImpl());
    }

    @Test
    public void shoppingLists() {
        Project value = Project.of();
        value.setShoppingLists(new com.commercetools.api.models.project.ShoppingListsConfigurationImpl());
        Assertions.assertThat(value.getShoppingLists())
                .isEqualTo(new com.commercetools.api.models.project.ShoppingListsConfigurationImpl());
    }

    @Test
    public void shippingRateInputType() {
        Project value = Project.of();
        value.setShippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl());
        Assertions.assertThat(value.getShippingRateInputType())
                .isEqualTo(new com.commercetools.api.models.project.ShippingRateInputTypeImpl());
    }

    @Test
    public void externalOAuth() {
        Project value = Project.of();
        value.setExternalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl());
        Assertions.assertThat(value.getExternalOAuth())
                .isEqualTo(new com.commercetools.api.models.project.ExternalOAuthImpl());
    }

    @Test
    public void searchIndexing() {
        Project value = Project.of();
        value.setSearchIndexing(new com.commercetools.api.models.project.SearchIndexingConfigurationImpl());
        Assertions.assertThat(value.getSearchIndexing())
                .isEqualTo(new com.commercetools.api.models.project.SearchIndexingConfigurationImpl());
    }

    @Test
    public void businessUnits() {
        Project value = Project.of();
        value.setBusinessUnits(new com.commercetools.api.models.project.BusinessUnitConfigurationImpl());
        Assertions.assertThat(value.getBusinessUnits())
                .isEqualTo(new com.commercetools.api.models.project.BusinessUnitConfigurationImpl());
    }
}
