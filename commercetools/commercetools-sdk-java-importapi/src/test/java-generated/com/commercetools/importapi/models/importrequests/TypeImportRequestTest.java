
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
public class TypeImportRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeImportRequestBuilder builder) {
        TypeImportRequest typeImportRequest = builder.buildUnchecked();
        Assertions.assertThat(typeImportRequest).isInstanceOf(TypeImportRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.types.TypeImportImpl())) } };
    }

    @Test
    public void resources() {
        TypeImportRequest value = TypeImportRequest.of();
        value.setResources(Collections.singletonList(new com.commercetools.importapi.models.types.TypeImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.types.TypeImportImpl()));
    }
}
