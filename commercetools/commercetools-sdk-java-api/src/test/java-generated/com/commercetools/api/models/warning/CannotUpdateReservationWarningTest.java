
package com.commercetools.api.models.warning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CannotUpdateReservationWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CannotUpdateReservationWarningBuilder builder) {
        CannotUpdateReservationWarning cannotUpdateReservationWarning = builder.buildUnchecked();
        Assertions.assertThat(cannotUpdateReservationWarning).isInstanceOf(CannotUpdateReservationWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", CannotUpdateReservationWarning.builder().message("message") },
                new Object[] { "lineItemId", CannotUpdateReservationWarning.builder().lineItemId("lineItemId") },
                new Object[] { "requestedQuantity",
                        CannotUpdateReservationWarning.builder().requestedQuantity(0.13633853) },
                new Object[] { "reservedQuantity",
                        CannotUpdateReservationWarning.builder().reservedQuantity(0.36540937) },
                new Object[] { "productId", CannotUpdateReservationWarning.builder().productId("productId") },
                new Object[] { "sku", CannotUpdateReservationWarning.builder().sku("sku") }, new Object[] {
                        "supplyChannel", CannotUpdateReservationWarning.builder().supplyChannel("supplyChannel") } };
    }

    @Test
    public void message() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void lineItemId() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void requestedQuantity() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setRequestedQuantity(0.13633853);
        Assertions.assertThat(value.getRequestedQuantity()).isEqualTo(0.13633853);
    }

    @Test
    public void reservedQuantity() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setReservedQuantity(0.36540937);
        Assertions.assertThat(value.getReservedQuantity()).isEqualTo(0.36540937);
    }

    @Test
    public void productId() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setProductId("productId");
        Assertions.assertThat(value.getProductId()).isEqualTo("productId");
    }

    @Test
    public void sku() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void supplyChannel() {
        CannotUpdateReservationWarning value = CannotUpdateReservationWarning.of();
        value.setSupplyChannel("supplyChannel");
        Assertions.assertThat(value.getSupplyChannel()).isEqualTo("supplyChannel");
    }
}
