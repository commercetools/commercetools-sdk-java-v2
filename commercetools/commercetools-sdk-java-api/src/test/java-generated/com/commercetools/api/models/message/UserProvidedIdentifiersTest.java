
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UserProvidedIdentifiersTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UserProvidedIdentifiersBuilder builder) {
        UserProvidedIdentifiers userProvidedIdentifiers = builder.buildUnchecked();
        Assertions.assertThat(userProvidedIdentifiers).isInstanceOf(UserProvidedIdentifiers.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", UserProvidedIdentifiers.builder().key("key") },
                new Object[] { "externalId", UserProvidedIdentifiers.builder().externalId("externalId") },
                new Object[] { "orderNumber", UserProvidedIdentifiers.builder().orderNumber("orderNumber") },
                new Object[] { "customerNumber", UserProvidedIdentifiers.builder().customerNumber("customerNumber") },
                new Object[] { "sku", UserProvidedIdentifiers.builder().sku("sku") },
                new Object[] { "slug",
                        UserProvidedIdentifiers.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "containerAndKey", UserProvidedIdentifiers.builder()
                        .containerAndKey(new com.commercetools.api.models.message.ContainerAndKeyImpl()) } };
    }

    @Test
    public void key() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void externalId() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void orderNumber() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void customerNumber() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }

    @Test
    public void sku() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void slug() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void containerAndKey() {
        UserProvidedIdentifiers value = UserProvidedIdentifiers.of();
        value.setContainerAndKey(new com.commercetools.api.models.message.ContainerAndKeyImpl());
        Assertions.assertThat(value.getContainerAndKey())
                .isEqualTo(new com.commercetools.api.models.message.ContainerAndKeyImpl());
    }
}
