
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

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
public class OrderPatchImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderPatchImportRequestBuilder builder) {
        OrderPatchImportRequest orderPatchImportRequest = builder.buildUnchecked();
        Assertions.assertThat(orderPatchImportRequest).isInstanceOf(OrderPatchImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderPatchImportRequest.builder()
                .patches(Collections.singletonList(
                    new com.commercetools.importapi.models.order_patches.OrderPatchImportImpl())) } };
    }

    @Test
    public void patches() {
        OrderPatchImportRequest value = OrderPatchImportRequest.of();
        value.setPatches(
            Collections.singletonList(new com.commercetools.importapi.models.order_patches.OrderPatchImportImpl()));
        Assertions.assertThat(value.getPatches())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.order_patches.OrderPatchImportImpl()));
    }
}
