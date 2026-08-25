
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetFaqUrlActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetFaqUrlActionBuilder builder) {
        StoreSetFaqUrlAction storeSetFaqUrlAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetFaqUrlAction).isInstanceOf(StoreSetFaqUrlAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "faqUrl", StoreSetFaqUrlAction.builder().faqUrl("faqUrl") } };
    }

    @Test
    public void faqUrl() {
        StoreSetFaqUrlAction value = StoreSetFaqUrlAction.of();
        value.setFaqUrl("faqUrl");
        Assertions.assertThat(value.getFaqUrl()).isEqualTo("faqUrl");
    }
}
