
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeliveryCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeliveryCustomTypeChangeBuilder builder) {
        SetDeliveryCustomTypeChange setDeliveryCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryCustomTypeChange).isInstanceOf(SetDeliveryCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDeliveryCustomTypeChange.builder().change("change") },
                new Object[] { "deliveryId", SetDeliveryCustomTypeChange.builder().deliveryId("deliveryId") },
                new Object[] { "previousValue",
                        SetDeliveryCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetDeliveryCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetDeliveryCustomTypeChange value = SetDeliveryCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void deliveryId() {
        SetDeliveryCustomTypeChange value = SetDeliveryCustomTypeChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void previousValue() {
        SetDeliveryCustomTypeChange value = SetDeliveryCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetDeliveryCustomTypeChange value = SetDeliveryCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
