
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeliveryItemsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeliveryItemsChangeBuilder builder) {
        SetDeliveryItemsChange setDeliveryItemsChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryItemsChange).isInstanceOf(SetDeliveryItemsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDeliveryItemsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetDeliveryItemsChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { "nextValue",
                        SetDeliveryItemsChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.DeliveryItemImpl())) },
                new Object[] { "deliveryId", SetDeliveryItemsChange.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void change() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void nextValue() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }

    @Test
    public void deliveryId() {
        SetDeliveryItemsChange value = SetDeliveryItemsChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
