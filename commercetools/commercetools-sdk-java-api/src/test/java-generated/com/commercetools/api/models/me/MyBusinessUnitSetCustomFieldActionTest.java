
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitSetCustomFieldActionBuilder builder) {
        MyBusinessUnitSetCustomFieldAction myBusinessUnitSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetCustomFieldAction)
                .isInstanceOf(MyBusinessUnitSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyBusinessUnitSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyBusinessUnitSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyBusinessUnitSetCustomFieldAction value = MyBusinessUnitSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyBusinessUnitSetCustomFieldAction value = MyBusinessUnitSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
