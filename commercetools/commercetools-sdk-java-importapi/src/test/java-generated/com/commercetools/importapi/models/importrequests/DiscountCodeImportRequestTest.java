
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
public class DiscountCodeImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeImportRequestBuilder builder) {
        DiscountCodeImportRequest discountCodeImportRequest = builder.buildUnchecked();
        Assertions.assertThat(discountCodeImportRequest).isInstanceOf(DiscountCodeImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeImportRequest.builder()
                .resources(Collections.singletonList(
                    new com.commercetools.importapi.models.discount_codes.DiscountCodeImportImpl())) } };
    }

    @Test
    public void resources() {
        DiscountCodeImportRequest value = DiscountCodeImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.discount_codes.DiscountCodeImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.discount_codes.DiscountCodeImportImpl()));
    }
}
