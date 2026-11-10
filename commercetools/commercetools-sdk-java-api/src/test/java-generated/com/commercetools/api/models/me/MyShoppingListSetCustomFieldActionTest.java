
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListSetCustomFieldActionBuilder builder) {
        MyShoppingListSetCustomFieldAction myShoppingListSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListSetCustomFieldAction)
                .isInstanceOf(MyShoppingListSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyShoppingListSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyShoppingListSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyShoppingListSetCustomFieldAction value = MyShoppingListSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyShoppingListSetCustomFieldAction value = MyShoppingListSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
