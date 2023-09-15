
package com.commercetools.api.models.common;

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
public class ClientLoggingTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ClientLoggingBuilder builder) {
        ClientLogging clientLogging = builder.buildUnchecked();
        Assertions.assertThat(clientLogging).isInstanceOf(ClientLogging.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ClientLogging.builder().clientId("clientId") },
                new Object[] { ClientLogging.builder().externalUserId("externalUserId") },
                new Object[] { ClientLogging.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { ClientLogging.builder().anonymousId("anonymousId") },
                new Object[] { ClientLogging.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void clientId() {
        ClientLogging value = ClientLogging.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void externalUserId() {
        ClientLogging value = ClientLogging.of();
        value.setExternalUserId("externalUserId");
        Assertions.assertThat(value.getExternalUserId()).isEqualTo("externalUserId");
    }

    @Test
    public void customer() {
        ClientLogging value = ClientLogging.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void anonymousId() {
        ClientLogging value = ClientLogging.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void associate() {
        ClientLogging value = ClientLogging.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
