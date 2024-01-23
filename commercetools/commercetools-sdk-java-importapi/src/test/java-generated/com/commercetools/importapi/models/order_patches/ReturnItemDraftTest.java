
package com.commercetools.importapi.models.order_patches;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ReturnItemDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReturnItemDraftBuilder builder) {
        ReturnItemDraft returnItemDraft = builder.buildUnchecked();
        Assertions.assertThat(returnItemDraft).isInstanceOf(ReturnItemDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReturnItemDraft.builder().quantity(8L) },
                new Object[] { ReturnItemDraft.builder().lineItemId("lineItemId") },
                new Object[] { ReturnItemDraft.builder().customLineItemId("customLineItemId") },
                new Object[] { ReturnItemDraft.builder().comment("comment") },
                new Object[] { ReturnItemDraft.builder()
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
