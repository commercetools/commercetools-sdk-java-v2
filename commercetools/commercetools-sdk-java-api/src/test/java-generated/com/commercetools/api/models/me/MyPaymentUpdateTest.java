
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentUpdateBuilder builder) {
        MyPaymentUpdate myPaymentUpdate = builder.buildUnchecked();
        Assertions.assertThat(myPaymentUpdate).isInstanceOf(MyPaymentUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyPaymentUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyPaymentUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyPaymentUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyPaymentUpdate value = MyPaymentUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyPaymentUpdate value = MyPaymentUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyPaymentUpdateActionImpl()));
    }
}
