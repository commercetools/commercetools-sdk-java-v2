
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitChangeNameActionBuilder builder) {
        MyBusinessUnitChangeNameAction myBusinessUnitChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeNameAction).isInstanceOf(MyBusinessUnitChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyBusinessUnitChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        MyBusinessUnitChangeNameAction value = MyBusinessUnitChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
