
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyQuoteUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyQuoteUpdateBuilder builder) {
        MyQuoteUpdate myQuoteUpdate = builder.buildUnchecked();
        Assertions.assertThat(myQuoteUpdate).isInstanceOf(MyQuoteUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyQuoteUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyQuoteUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyQuoteUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyQuoteUpdate value = MyQuoteUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyQuoteUpdate value = MyQuoteUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyQuoteUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyQuoteUpdateActionImpl()));
    }
}
