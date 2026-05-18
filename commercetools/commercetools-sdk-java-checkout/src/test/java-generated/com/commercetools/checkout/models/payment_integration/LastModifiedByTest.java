
package com.commercetools.checkout.models.payment_integration;

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
                new Object[] { "sessionId", LastModifiedBy.builder().sessionId("sessionId") },
                new Object[] { "externalUserId", LastModifiedBy.builder().externalUserId("externalUserId") },
                new Object[] { "anonymousId", LastModifiedBy.builder().anonymousId("anonymousId") },
                new Object[] { "customer",
                        LastModifiedBy.builder()
                                .customer(new com.commercetools.checkout.models.common.ReferenceImpl()) },
                new Object[] { "associate",
                        LastModifiedBy.builder()
                                .associate(new com.commercetools.checkout.models.common.ReferenceImpl()) },
                new Object[] { "user",
                        LastModifiedBy.builder().user(new com.commercetools.checkout.models.common.ReferenceImpl()) },
                new Object[] { "isPlatformClient", LastModifiedBy.builder().isPlatformClient(true) } };
    }

    @Test
    public void clientId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void sessionId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setSessionId("sessionId");
        Assertions.assertThat(value.getSessionId()).isEqualTo("sessionId");
    }

    @Test
    public void externalUserId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setExternalUserId("externalUserId");
        Assertions.assertThat(value.getExternalUserId()).isEqualTo("externalUserId");
    }

    @Test
    public void anonymousId() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void customer() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setCustomer(new com.commercetools.checkout.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.checkout.models.common.ReferenceImpl());
    }

    @Test
    public void associate() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setAssociate(new com.commercetools.checkout.models.common.ReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.checkout.models.common.ReferenceImpl());
    }

    @Test
    public void user() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setUser(new com.commercetools.checkout.models.common.ReferenceImpl());
        Assertions.assertThat(value.getUser()).isEqualTo(new com.commercetools.checkout.models.common.ReferenceImpl());
    }

    @Test
    public void isPlatformClient() {
        LastModifiedBy value = LastModifiedBy.of();
        value.setIsPlatformClient(true);
        Assertions.assertThat(value.getIsPlatformClient()).isEqualTo(true);
    }
}
