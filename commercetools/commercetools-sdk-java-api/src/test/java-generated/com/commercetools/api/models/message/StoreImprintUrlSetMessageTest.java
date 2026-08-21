
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreImprintUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreImprintUrlSetMessageBuilder builder) {
        StoreImprintUrlSetMessage storeImprintUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeImprintUrlSetMessage).isInstanceOf(StoreImprintUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "imprintUrl", StoreImprintUrlSetMessage.builder().imprintUrl("imprintUrl") } };
    }

    @Test
    public void imprintUrl() {
        StoreImprintUrlSetMessage value = StoreImprintUrlSetMessage.of();
        value.setImprintUrl("imprintUrl");
        Assertions.assertThat(value.getImprintUrl()).isEqualTo("imprintUrl");
    }
}
