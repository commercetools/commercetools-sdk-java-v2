
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnItemDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnItemDraftBuilder builder) {
        ReturnItemDraft returnItemDraft = builder.buildUnchecked();
        Assertions.assertThat(returnItemDraft).isInstanceOf(ReturnItemDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quantity", ReturnItemDraft.builder().quantity(8L) },
                new Object[] { "lineItemId", ReturnItemDraft.builder().lineItemId("lineItemId") },
                new Object[] { "customLineItemId", ReturnItemDraft.builder().customLineItemId("customLineItemId") },
                new Object[] { "comment", ReturnItemDraft.builder().comment("comment") },
                new Object[] { "shipmentState",
                        ReturnItemDraft.builder()
                                .shipmentState(com.commercetools.importapi.models.order_patches.ReturnShipmentState
                                        .findEnum("Advised")) } };
    }

    @Test
    public void quantity() {
        ReturnItemDraft value = ReturnItemDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void lineItemId() {
        ReturnItemDraft value = ReturnItemDraft.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void customLineItemId() {
        ReturnItemDraft value = ReturnItemDraft.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void comment() {
        ReturnItemDraft value = ReturnItemDraft.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }

    @Test
    public void shipmentState() {
        ReturnItemDraft value = ReturnItemDraft.of();
        value.setShipmentState(
            com.commercetools.importapi.models.order_patches.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.importapi.models.order_patches.ReturnShipmentState.findEnum("Advised"));
    }
}
