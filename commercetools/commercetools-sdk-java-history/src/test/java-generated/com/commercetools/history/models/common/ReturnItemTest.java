
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnItemBuilder builder) {
        ReturnItem returnItem = builder.buildUnchecked();
        Assertions.assertThat(returnItem).isInstanceOf(ReturnItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ReturnItem.builder().id("id") },
                new Object[] { "quantity", ReturnItem.builder().quantity(8) },
                new Object[] { "type", ReturnItem.builder().type("type") },
                new Object[] { "comment", ReturnItem.builder().comment("comment") },
                new Object[] { "shipmentState",
                        ReturnItem.builder()
                                .shipmentState(
                                    com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised")) },
                new Object[] { "paymentState",
                        ReturnItem.builder()
                                .paymentState(com.commercetools.history.models.common.ReturnPaymentState
                                        .findEnum("NonRefundable")) },
                new Object[] { "lastModifiedAt", ReturnItem.builder().lastModifiedAt("lastModifiedAt") },
                new Object[] { "createdAt", ReturnItem.builder().createdAt("createdAt") } };
    }

    @Test
    public void id() {
        ReturnItem value = ReturnItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void quantity() {
        ReturnItem value = ReturnItem.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void type() {
        ReturnItem value = ReturnItem.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void comment() {
        ReturnItem value = ReturnItem.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }

    @Test
    public void shipmentState() {
        ReturnItem value = ReturnItem.of();
        value.setShipmentState(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised"));
    }

    @Test
    public void paymentState() {
        ReturnItem value = ReturnItem.of();
        value.setPaymentState(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
    }

    @Test
    public void lastModifiedAt() {
        ReturnItem value = ReturnItem.of();
        value.setLastModifiedAt("lastModifiedAt");
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo("lastModifiedAt");
    }

    @Test
    public void createdAt() {
        ReturnItem value = ReturnItem.of();
        value.setCreatedAt("createdAt");
        Assertions.assertThat(value.getCreatedAt()).isEqualTo("createdAt");
    }
}
