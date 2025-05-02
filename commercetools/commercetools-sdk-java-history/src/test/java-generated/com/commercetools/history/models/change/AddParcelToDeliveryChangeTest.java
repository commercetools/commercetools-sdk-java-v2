
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddParcelToDeliveryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddParcelToDeliveryChangeBuilder builder) {
        AddParcelToDeliveryChange addParcelToDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(addParcelToDeliveryChange).isInstanceOf(AddParcelToDeliveryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddParcelToDeliveryChange.builder().change("change") },
                new Object[] { "nextValue",
                        AddParcelToDeliveryChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ParcelImpl()) },
                new Object[] { "deliveryId", AddParcelToDeliveryChange.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void change() {
        AddParcelToDeliveryChange value = AddParcelToDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddParcelToDeliveryChange value = AddParcelToDeliveryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ParcelImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.ParcelImpl());
    }

    @Test
    public void deliveryId() {
        AddParcelToDeliveryChange value = AddParcelToDeliveryChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
