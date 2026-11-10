
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddressTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddressBuilder builder) {
        Address address = builder.buildUnchecked();
        Assertions.assertThat(address).isInstanceOf(Address.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "custom",
                Address.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void custom() {
        Address value = Address.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
