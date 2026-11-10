
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetTitleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetTitleActionBuilder builder) {
        MyCustomerSetTitleAction myCustomerSetTitleAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetTitleAction).isInstanceOf(MyCustomerSetTitleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "title", MyCustomerSetTitleAction.builder().title("title") } };
    }

    @Test
    public void title() {
        MyCustomerSetTitleAction value = MyCustomerSetTitleAction.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
