
package com.commercetools.importapi.models.customfields;

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
public class CustomTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomBuilder builder) {
        Custom custom = builder.buildUnchecked();
        Assertions.assertThat(custom).isInstanceOf(Custom.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        Custom.builder().type(new com.commercetools.importapi.models.common.TypeKeyReferenceImpl()) },
                new Object[] { Custom.builder()
                        .fields(new com.commercetools.importapi.models.customfields.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        Custom value = Custom.of();
        value.setType(new com.commercetools.importapi.models.common.TypeKeyReferenceImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.importapi.models.common.TypeKeyReferenceImpl());
    }

    @Test
    public void fields() {
        Custom value = Custom.of();
        value.setFields(new com.commercetools.importapi.models.customfields.FieldContainerImpl());
        Assertions.assertThat(value.getFields())
                .isEqualTo(new com.commercetools.importapi.models.customfields.FieldContainerImpl());
    }
}
