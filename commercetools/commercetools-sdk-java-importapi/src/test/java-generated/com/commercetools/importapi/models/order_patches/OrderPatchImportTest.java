
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
public class OrderPatchImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPatchImportBuilder builder) {
        OrderPatchImport orderPatchImport = builder.buildUnchecked();
        Assertions.assertThat(orderPatchImport).isInstanceOf(OrderPatchImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderPatchImport.builder().orderNumber("orderNumber") },
                new Object[] { OrderPatchImport.builder()
                        .fields(new com.commercetools.importapi.models.order_patches.OrderFieldImpl()) } };
    }

    @Test
    public void orderNumber() {
        OrderPatchImport value = OrderPatchImport.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void fields() {
        OrderPatchImport value = OrderPatchImport.of();
        value.setFields(new com.commercetools.importapi.models.order_patches.OrderFieldImpl());
        Assertions.assertThat(value.getFields())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.OrderFieldImpl());
    }
}
