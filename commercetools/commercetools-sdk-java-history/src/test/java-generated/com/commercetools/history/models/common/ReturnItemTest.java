
package com.commercetools.history.models.common;

import java.time.ZonedDateTime;

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
                new Object[] { "key", ReturnItem.builder().key("key") },
                new Object[] { "quantity", ReturnItem.builder().quantity(8L) },
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
                new Object[] { "custom",
                        ReturnItem.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "lastModifiedAt",
                        ReturnItem.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdAt",
                        ReturnItem.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        ReturnItem value = ReturnItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ReturnItem value = ReturnItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void quantity() {
        ReturnItem value = ReturnItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
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
    public void custom() {
        ReturnItem value = ReturnItem.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void lastModifiedAt() {
        ReturnItem value = ReturnItem.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdAt() {
        ReturnItem value = ReturnItem.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
