
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreFaqUrlSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreFaqUrlSetMessagePayloadBuilder builder) {
        StoreFaqUrlSetMessagePayload storeFaqUrlSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeFaqUrlSetMessagePayload).isInstanceOf(StoreFaqUrlSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "faqUrl", StoreFaqUrlSetMessagePayload.builder().faqUrl("faqUrl") } };
    }

    @Test
    public void faqUrl() {
        StoreFaqUrlSetMessagePayload value = StoreFaqUrlSetMessagePayload.of();
        value.setFaqUrl("faqUrl");
        Assertions.assertThat(value.getFaqUrl()).isEqualTo("faqUrl");
    }
}
