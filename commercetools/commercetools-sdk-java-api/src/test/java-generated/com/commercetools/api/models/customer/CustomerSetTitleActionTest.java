
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetTitleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetTitleActionBuilder builder) {
        CustomerSetTitleAction customerSetTitleAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetTitleAction).isInstanceOf(CustomerSetTitleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "title", CustomerSetTitleAction.builder().title("title") } };
    }

    @Test
    public void title() {
        CustomerSetTitleAction value = CustomerSetTitleAction.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
