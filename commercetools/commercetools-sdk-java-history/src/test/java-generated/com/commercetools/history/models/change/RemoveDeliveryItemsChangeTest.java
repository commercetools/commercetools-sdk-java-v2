
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDeliveryItemsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveDeliveryItemsChangeBuilder builder) {
        RemoveDeliveryItemsChange removeDeliveryItemsChange = builder.buildUnchecked();
        Assertions.assertThat(removeDeliveryItemsChange).isInstanceOf(RemoveDeliveryItemsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveDeliveryItemsChange.builder().change("change") },
                new Object[] { "previousValue", RemoveDeliveryItemsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DeliveryImpl()) } };
    }

    @Test
    public void change() {
        RemoveDeliveryItemsChange value = RemoveDeliveryItemsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveDeliveryItemsChange value = RemoveDeliveryItemsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DeliveryImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DeliveryImpl());
    }
}
