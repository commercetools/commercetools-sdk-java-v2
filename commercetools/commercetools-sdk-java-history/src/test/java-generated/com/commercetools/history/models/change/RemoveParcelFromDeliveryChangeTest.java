
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveParcelFromDeliveryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveParcelFromDeliveryChangeBuilder builder) {
        RemoveParcelFromDeliveryChange removeParcelFromDeliveryChange = builder.buildUnchecked();
        Assertions.assertThat(removeParcelFromDeliveryChange).isInstanceOf(RemoveParcelFromDeliveryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveParcelFromDeliveryChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveParcelFromDeliveryChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ParcelImpl()) },
                new Object[] { "deliveryId", RemoveParcelFromDeliveryChange.builder().deliveryId("deliveryId") },
                new Object[] { "shippingKey", RemoveParcelFromDeliveryChange.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void change() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ParcelImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ParcelImpl());
    }

    @Test
    public void deliveryId() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void shippingKey() {
        RemoveParcelFromDeliveryChange value = RemoveParcelFromDeliveryChange.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
