
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerUpdateBuilder builder) {
        MyCustomerUpdate myCustomerUpdate = builder.buildUnchecked();
        Assertions.assertThat(myCustomerUpdate).isInstanceOf(MyCustomerUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyCustomerUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyCustomerUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyCustomerUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyCustomerUpdate value = MyCustomerUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyCustomerUpdate value = MyCustomerUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.me.MyCustomerUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.me.MyCustomerUpdateActionImpl()));
    }
}
