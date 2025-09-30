
package com.commercetools.api.models.project;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectBuilder builder) {
        Project project = builder.buildUnchecked();
        Assertions.assertThat(project).isInstanceOf(Project.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", Project.builder().version(2L) },
                new Object[] { "key", Project.builder().key("key") },
                new Object[] { "name", Project.builder().name("name") },
                new Object[] { "countries", Project.builder().countries(Collections.singletonList("countries")) },
                new Object[] { "currencies", Project.builder().currencies(Collections.singletonList("currencies")) },
                new Object[] { "languages", Project.builder().languages(Collections.singletonList("languages")) },
                new Object[] { "createdAt", Project.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "trialUntil", Project.builder().trialUntil("trialUntil") },
                new Object[] { "messages",
                        Project.builder()
                                .messages(new com.commercetools.api.models.message.MessagesConfigurationImpl()) },
                new Object[] { "carts",
                        Project.builder().carts(new com.commercetools.api.models.project.CartsConfigurationImpl()) },
                new Object[] { "shoppingLists", Project.builder()
                        .shoppingLists(new com.commercetools.api.models.project.ShoppingListsConfigurationImpl()) },
                new Object[] { "shippingRateInputType", Project.builder()
                        .shippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl()) },
                new Object[] { "externalOAuth",
                        Project.builder().externalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl()) },
                new Object[] { "searchIndexing", Project.builder()
                        .searchIndexing(new com.commercetools.api.models.project.SearchIndexingConfigurationImpl()) },
                new Object[] { "businessUnits", Project.builder()
                        .businessUnits(new com.commercetools.api.models.project.BusinessUnitConfigurationImpl()) },
                new Object[] { "discounts", Project.builder()
                        .discounts(new com.commercetools.api.models.project.DiscountsConfigurationImpl()) } };
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

    @Test
    public void discounts() {
        Project value = Project.of();
        value.setDiscounts(new com.commercetools.api.models.project.DiscountsConfigurationImpl());
        Assertions.assertThat(value.getDiscounts())
                .isEqualTo(new com.commercetools.api.models.project.DiscountsConfigurationImpl());
    }
}
