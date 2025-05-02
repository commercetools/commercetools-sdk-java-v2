
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreNameSetMessageBuilder builder) {
        StoreNameSetMessage storeNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeNameSetMessage).isInstanceOf(StoreNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        StoreNameSetMessage.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "nameAllLocales",
                        StoreNameSetMessage.builder()
                                .nameAllLocales(Collections.singletonList(
                                    new com.commercetools.api.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void name() {
        StoreNameSetMessage value = StoreNameSetMessage.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void nameAllLocales() {
        StoreNameSetMessage value = StoreNameSetMessage.of();
        value.setNameAllLocales(
            Collections.singletonList(new com.commercetools.api.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getNameAllLocales())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.LocalizedStringImpl()));
    }
}
