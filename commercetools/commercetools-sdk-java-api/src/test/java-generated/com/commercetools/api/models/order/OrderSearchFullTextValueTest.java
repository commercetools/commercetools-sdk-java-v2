
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSearchFullTextValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSearchFullTextValueBuilder builder) {
        OrderSearchFullTextValue orderSearchFullTextValue = builder.buildUnchecked();
        Assertions.assertThat(orderSearchFullTextValue).isInstanceOf(OrderSearchFullTextValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", OrderSearchFullTextValue.builder().value("value") },
                new Object[] { "language", OrderSearchFullTextValue.builder().language("language") },
                new Object[] { "mustMatch", OrderSearchFullTextValue.builder()
                        .mustMatch(com.commercetools.api.models.order.OrderSearchMatchType.findEnum("any")) } };
    }

    @Test
    public void value() {
        OrderSearchFullTextValue value = OrderSearchFullTextValue.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void language() {
        OrderSearchFullTextValue value = OrderSearchFullTextValue.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void mustMatch() {
        OrderSearchFullTextValue value = OrderSearchFullTextValue.of();
        value.setMustMatch(com.commercetools.api.models.order.OrderSearchMatchType.findEnum("any"));
        Assertions.assertThat(value.getMustMatch())
                .isEqualTo(com.commercetools.api.models.order.OrderSearchMatchType.findEnum("any"));
    }
}
