
package com.commercetools.api.models.message;

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
public class UserProvidedIdentifiersTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(UserProvidedIdentifiersBuilder builder) {
        UserProvidedIdentifiers userProvidedIdentifiers = builder.buildUnchecked();
        Assertions.assertThat(userProvidedIdentifiers).isInstanceOf(UserProvidedIdentifiers.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { UserProvidedIdentifiers.builder().key("key") },
                new Object[] { UserProvidedIdentifiers.builder().externalId("externalId") },
                new Object[] { UserProvidedIdentifiers.builder().orderNumber("orderNumber") },
                new Object[] { UserProvidedIdentifiers.builder().customerNumber("customerNumber") },
                new Object[] { UserProvidedIdentifiers.builder().sku("sku") },
                new Object[] { UserProvidedIdentifiers.builder()
                        .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { UserProvidedIdentifiers.builder()
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
