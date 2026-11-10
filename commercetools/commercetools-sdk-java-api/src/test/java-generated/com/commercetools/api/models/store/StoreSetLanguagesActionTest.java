
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetLanguagesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetLanguagesActionBuilder builder) {
        StoreSetLanguagesAction storeSetLanguagesAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetLanguagesAction).isInstanceOf(StoreSetLanguagesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "languages",
                StoreSetLanguagesAction.builder().languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void languages() {
        StoreSetLanguagesAction value = StoreSetLanguagesAction.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
