
package com.commercetools.api.models.common;

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
        return new Object[][] {
                new Object[] { "custom",
                        Address.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "id", Address.builder().id("id") } };
    }

    @Test
    public void custom() {
        Address value = Address.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void id() {
        Address value = Address.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
