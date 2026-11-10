
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListUpdateBuilder builder) {
        MyShoppingListUpdate myShoppingListUpdate = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListUpdate).isInstanceOf(MyShoppingListUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyShoppingListUpdate.builder().version(2L) },
                new Object[] { "actions",
                        MyShoppingListUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.me.MyShoppingListUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        MyShoppingListUpdate value = MyShoppingListUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        MyShoppingListUpdate value = MyShoppingListUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.me.MyShoppingListUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.me.MyShoppingListUpdateActionImpl()));
    }
}
