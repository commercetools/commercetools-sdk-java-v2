
package com.commercetools.history.models.change_history;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ModifiedByTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ModifiedByBuilder builder) {
        ModifiedBy modifiedBy = builder.buildUnchecked();
        Assertions.assertThat(modifiedBy).isInstanceOf(ModifiedBy.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "isPlatformClient", ModifiedBy.builder().isPlatformClient(true) },
                new Object[] { "id", ModifiedBy.builder().id("id") },
                new Object[] { "type", ModifiedBy.builder().type("type") },
                new Object[] { "clientId", ModifiedBy.builder().clientId("clientId") },
                new Object[] { "anonymousId", ModifiedBy.builder().anonymousId("anonymousId") },
                new Object[] { "customer",
                        ModifiedBy.builder().customer(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "associate",
                        ModifiedBy.builder().associate(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void isPlatformClient() {
        ModifiedBy value = ModifiedBy.of();
        value.setIsPlatformClient(true);
        Assertions.assertThat(value.getIsPlatformClient()).isEqualTo(true);
    }

    @Test
    public void id() {
        ModifiedBy value = ModifiedBy.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void type() {
        ModifiedBy value = ModifiedBy.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void clientId() {
        ModifiedBy value = ModifiedBy.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }

    @Test
    public void anonymousId() {
        ModifiedBy value = ModifiedBy.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void customer() {
        ModifiedBy value = ModifiedBy.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void associate() {
        ModifiedBy value = ModifiedBy.of();
        value.setAssociate(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
