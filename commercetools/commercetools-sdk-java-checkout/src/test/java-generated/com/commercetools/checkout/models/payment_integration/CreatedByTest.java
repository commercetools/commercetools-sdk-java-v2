
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CreatedByTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CreatedByBuilder builder) {
        CreatedBy createdBy = builder.buildUnchecked();
        Assertions.assertThat(createdBy).isInstanceOf(CreatedBy.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "clientId", CreatedBy.builder().clientId("clientId") },
                new Object[] { "externalUserId", CreatedBy.builder().externalUserId("externalUserId") },
                new Object[] { "customer",
                        CreatedBy.builder().customer(new com.commercetools.checkout.models.common.ReferenceImpl()) },
                new Object[] { "anonymousId", CreatedBy.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void clientId() {
        CreatedBy value = CreatedBy.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void externalUserId() {
        CreatedBy value = CreatedBy.of();
        value.setExternalUserId("externalUserId");
        Assertions.assertThat(value.getExternalUserId()).isEqualTo("externalUserId");
    }

    @Test
    public void customer() {
        CreatedBy value = CreatedBy.of();
        value.setCustomer(new com.commercetools.checkout.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.checkout.models.common.ReferenceImpl());
    }

    @Test
    public void anonymousId() {
        CreatedBy value = CreatedBy.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
