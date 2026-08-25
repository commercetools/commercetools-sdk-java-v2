
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreFaqUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreFaqUrlSetMessageBuilder builder) {
        StoreFaqUrlSetMessage storeFaqUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeFaqUrlSetMessage).isInstanceOf(StoreFaqUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "faqUrl", StoreFaqUrlSetMessage.builder().faqUrl("faqUrl") } };
    }

    @Test
    public void faqUrl() {
        StoreFaqUrlSetMessage value = StoreFaqUrlSetMessage.of();
        value.setFaqUrl("faqUrl");
        Assertions.assertThat(value.getFaqUrl()).isEqualTo("faqUrl");
    }
}
