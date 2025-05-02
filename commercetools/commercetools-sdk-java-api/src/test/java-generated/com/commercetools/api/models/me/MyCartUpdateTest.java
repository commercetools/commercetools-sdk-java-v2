
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartUpdateBuilder builder) {
        MyCartUpdate myCartUpdate = builder.buildUnchecked();
        Assertions.assertThat(myCartUpdate).isInstanceOf(MyCartUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyCartUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyCartUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyCartUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyCartUpdate value = MyCartUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyCartUpdate value = MyCartUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyCartUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyCartUpdateActionImpl()));
    }
}
