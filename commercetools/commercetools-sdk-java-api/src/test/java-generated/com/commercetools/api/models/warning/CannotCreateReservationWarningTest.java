
package com.commercetools.api.models.warning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CannotCreateReservationWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CannotCreateReservationWarningBuilder builder) {
        CannotCreateReservationWarning cannotCreateReservationWarning = builder.buildUnchecked();
        Assertions.assertThat(cannotCreateReservationWarning).isInstanceOf(CannotCreateReservationWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", CannotCreateReservationWarning.builder().message("message") },
                new Object[] { "productId", CannotCreateReservationWarning.builder().productId("productId") },
                new Object[] { "sku", CannotCreateReservationWarning.builder().sku("sku") },
                new Object[] { "supplyChannel",
                        CannotCreateReservationWarning.builder().supplyChannel("supplyChannel") },
                new Object[] { "quantity", CannotCreateReservationWarning.builder().quantity(0.52277106) } };
    }

    @Test
    public void message() {
        CannotCreateReservationWarning value = CannotCreateReservationWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void productId() {
        CannotCreateReservationWarning value = CannotCreateReservationWarning.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void sku() {
        CannotCreateReservationWarning value = CannotCreateReservationWarning.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void supplyChannel() {
        CannotCreateReservationWarning value = CannotCreateReservationWarning.of();
        value.setSupplyChannel("supplyChannel");
        Assertions.assertThat(value.getSupplyChannel()).isEqualTo("supplyChannel");
    }

    @Test
    public void quantity() {
        CannotCreateReservationWarning value = CannotCreateReservationWarning.of();
        value.setQuantity(0.52277106);
        Assertions.assertThat(value.getQuantity()).isEqualTo(0.52277106);
    }
}
