
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyQuoteChangeMyQuoteStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyQuoteChangeMyQuoteStateActionBuilder builder) {
        MyQuoteChangeMyQuoteStateAction myQuoteChangeMyQuoteStateAction = builder.buildUnchecked();
        Assertions.assertThat(myQuoteChangeMyQuoteStateAction).isInstanceOf(MyQuoteChangeMyQuoteStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quoteState", MyQuoteChangeMyQuoteStateAction.builder()
                .quoteState(com.commercetools.api.models.me.MyQuoteState.findEnum("Declined")) } };
    }

    @Test
    public void quoteState() {
        MyQuoteChangeMyQuoteStateAction value = MyQuoteChangeMyQuoteStateAction.of();
        value.setQuoteState(com.commercetools.api.models.me.MyQuoteState.findEnum("Declined"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.me.MyQuoteState.findEnum("Declined"));
    }
}
