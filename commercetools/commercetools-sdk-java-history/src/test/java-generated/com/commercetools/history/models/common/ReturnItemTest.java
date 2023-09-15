
package com.commercetools.history.models.common;

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
public class ReturnItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReturnItemBuilder builder) {
        ReturnItem returnItem = builder.buildUnchecked();
        Assertions.assertThat(returnItem).isInstanceOf(ReturnItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReturnItem.builder().id("id") },
                new Object[] { ReturnItem.builder().quantity(8) }, new Object[] { ReturnItem.builder().type("type") },
                new Object[] { ReturnItem.builder().comment("comment") },
                new Object[] { ReturnItem.builder()
                        .shipmentState(
                            com.commercetools.history.models.common.ReturnShipmentState.findEnum("Advised")) },
                new Object[] {
                        ReturnItem.builder()
                                .paymentState(com.commercetools.history.models.common.ReturnPaymentState
                                        .findEnum("NonRefundable")) },
                new Object[] { ReturnItem.builder().lastModifiedAt("lastModifiedAt") },
                new Object[] { ReturnItem.builder().createdAt("createdAt") } };
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
