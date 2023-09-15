
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
public class CategoryImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CategoryImportRequestBuilder builder) {
        CategoryImportRequest categoryImportRequest = builder.buildUnchecked();
        Assertions.assertThat(categoryImportRequest).isInstanceOf(CategoryImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CategoryImportRequest.builder()
                .resources(Collections
                        .singletonList(new com.commercetools.importapi.models.categories.CategoryImportImpl())) } };
    }

    @Test
    public void resources() {
        CategoryImportRequest value = CategoryImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.categories.CategoryImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.categories.CategoryImportImpl()));
    }
}
