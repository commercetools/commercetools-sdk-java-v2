
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddDeliveryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddDeliveryChangeBuilder builder) {
        AddDeliveryChange addDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(addDeliveryChange).isInstanceOf(AddDeliveryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddDeliveryChange.builder().change("change") },
                new Object[] { "previousValue", AddDeliveryChange.builder()
                        .previousValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl()) },
                new Object[] { "nextValue", AddDeliveryChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl()) } };
    }

    @Test
    public void change() {
        AddDeliveryChange value = AddDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddDeliveryChange value = AddDeliveryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
    }

    @Test
    public void nextValue() {
        AddDeliveryChange value = AddDeliveryChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.DeliveryChangeValueImpl());
    }
}
