
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
public class ProductTypeImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeImportRequestBuilder builder) {
        ProductTypeImportRequest productTypeImportRequest = builder.buildUnchecked();
        Assertions.assertThat(productTypeImportRequest).isInstanceOf(ProductTypeImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeImportRequest.builder()
                .resources(Collections.singletonList(
                    new com.commercetools.importapi.models.producttypes.ProductTypeImportImpl())) } };
    }

    @Test
    public void resources() {
        ProductTypeImportRequest value = ProductTypeImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.producttypes.ProductTypeImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.producttypes.ProductTypeImportImpl()));
    }
}
