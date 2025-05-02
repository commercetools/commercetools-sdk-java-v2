
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ClientLoggingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ClientLoggingBuilder builder) {
        ClientLogging clientLogging = builder.buildUnchecked();
        Assertions.assertThat(clientLogging).isInstanceOf(ClientLogging.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "clientId", ClientLogging.builder().clientId("clientId") },
                new Object[] { "externalUserId", ClientLogging.builder().externalUserId("externalUserId") },
                new Object[] { "customer",
                        ClientLogging.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "anonymousId", ClientLogging.builder().anonymousId("anonymousId") },
                new Object[] { "associate", ClientLogging.builder()
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
