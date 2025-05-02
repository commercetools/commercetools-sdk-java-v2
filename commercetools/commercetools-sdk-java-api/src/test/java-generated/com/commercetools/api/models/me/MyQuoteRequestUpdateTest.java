
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyQuoteRequestUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyQuoteRequestUpdateBuilder builder) {
        MyQuoteRequestUpdate myQuoteRequestUpdate = builder.buildUnchecked();
        Assertions.assertThat(myQuoteRequestUpdate).isInstanceOf(MyQuoteRequestUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyQuoteRequestUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyQuoteRequestUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyQuoteRequestUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyQuoteRequestUpdate value = MyQuoteRequestUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyQuoteRequestUpdate value = MyQuoteRequestUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.me.MyQuoteRequestUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.me.MyQuoteRequestUpdateActionImpl()));
    }
}
