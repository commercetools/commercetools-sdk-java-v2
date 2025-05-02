
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCreateEmailTokenTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCreateEmailTokenBuilder builder) {
        CustomerCreateEmailToken customerCreateEmailToken = builder.buildUnchecked();
        Assertions.assertThat(customerCreateEmailToken).isInstanceOf(CustomerCreateEmailToken.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerCreateEmailToken.builder().id("id") },
                new Object[] { "version", CustomerCreateEmailToken.builder().version(2L) },
                new Object[] { "ttlMinutes", CustomerCreateEmailToken.builder().ttlMinutes(1L) } };
    }

    @Test
    public void id() {
        CustomerCreateEmailToken value = CustomerCreateEmailToken.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        CustomerCreateEmailToken value = CustomerCreateEmailToken.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void ttlMinutes() {
        CustomerCreateEmailToken value = CustomerCreateEmailToken.of();
        value.setTtlMinutes(1L);
        Assertions.assertThat(value.getTtlMinutes()).isEqualTo(1L);
    }
}
