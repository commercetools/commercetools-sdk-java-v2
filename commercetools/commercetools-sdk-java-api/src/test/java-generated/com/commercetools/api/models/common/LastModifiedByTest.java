
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LastModifiedByTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LastModifiedByBuilder builder) {
        LastModifiedBy lastModifiedBy = builder.buildUnchecked();
        Assertions.assertThat(lastModifiedBy).isInstanceOf(LastModifiedBy.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "clientId", LastModifiedBy.builder().clientId("clientId") },
                new Object[] { "externalUserId", LastModifiedBy.builder().externalUserId("externalUserId") },
                new Object[] { "customer",
                        LastModifiedBy.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { "anonymousId", LastModifiedBy.builder().anonymousId("anonymousId") },
                new Object[] { "attributedTo",
                        LastModifiedBy.builder()
                                .attributedTo(new com.commercetools.api.models.common.AttributionImpl()) },
                new Object[] { "associate", LastModifiedBy.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) } };
    }

    @Test
    public void clientId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void externalUserId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setExternalUserId("externalUserId");
        Assertions.assertThat(value.getExternalUserId()).isEqualTo("externalUserId");
    }

    @Test
    public void customer() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void anonymousId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void attributedTo() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setAttributedTo(new com.commercetools.api.models.common.AttributionImpl());
        Assertions.assertThat(value.getAttributedTo())
                .isEqualTo(new com.commercetools.api.models.common.AttributionImpl());
    }

    @Test
    public void associate() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }
}
