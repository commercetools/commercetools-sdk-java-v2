
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreLanguagesChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreLanguagesChangedMessagePayloadBuilder builder) {
        StoreLanguagesChangedMessagePayload storeLanguagesChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeLanguagesChangedMessagePayload)
                .isInstanceOf(StoreLanguagesChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedLanguages",
                        StoreLanguagesChangedMessagePayload.builder()
                                .addedLanguages(Collections.singletonList("addedLanguages")) },
                new Object[] { "removedLanguages", StoreLanguagesChangedMessagePayload.builder()
                        .removedLanguages(Collections.singletonList("removedLanguages")) } };
    }

    @Test
    public void addedLanguages() {
        StoreLanguagesChangedMessagePayload value = StoreLanguagesChangedMessagePayload.of();
        value.setAddedLanguages(Collections.singletonList("addedLanguages"));
        Assertions.assertThat(value.getAddedLanguages()).isEqualTo(Collections.singletonList("addedLanguages"));
    }

    @Test
    public void removedLanguages() {
        StoreLanguagesChangedMessagePayload value = StoreLanguagesChangedMessagePayload.of();
        value.setRemovedLanguages(Collections.singletonList("removedLanguages"));
        Assertions.assertThat(value.getRemovedLanguages()).isEqualTo(Collections.singletonList("removedLanguages"));
    }
}
