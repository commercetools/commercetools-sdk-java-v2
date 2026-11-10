
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreLanguagesChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreLanguagesChangedMessageBuilder builder) {
        StoreLanguagesChangedMessage storeLanguagesChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeLanguagesChangedMessage).isInstanceOf(StoreLanguagesChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedLanguages",
                        StoreLanguagesChangedMessage.builder()
                                .addedLanguages(Collections.singletonList("addedLanguages")) },
                new Object[] { "removedLanguages", StoreLanguagesChangedMessage.builder()
                        .removedLanguages(Collections.singletonList("removedLanguages")) } };
    }

    @Test
    public void addedLanguages() {
        StoreLanguagesChangedMessage value = StoreLanguagesChangedMessage.of();
        value.setAddedLanguages(Collections.singletonList("addedLanguages"));
        Assertions.assertThat(value.getAddedLanguages()).isEqualTo(Collections.singletonList("addedLanguages"));
    }

    @Test
    public void removedLanguages() {
        StoreLanguagesChangedMessage value = StoreLanguagesChangedMessage.of();
        value.setRemovedLanguages(Collections.singletonList("removedLanguages"));
        Assertions.assertThat(value.getRemovedLanguages()).isEqualTo(Collections.singletonList("removedLanguages"));
    }
}
