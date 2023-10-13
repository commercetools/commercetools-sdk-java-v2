
package com.commercetools.api.models.type;

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
public class CustomFieldsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldsBuilder builder) {
        CustomFields customFields = builder.buildUnchecked();
        Assertions.assertThat(customFields).isInstanceOf(CustomFields.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomFields.builder().type(new com.commercetools.api.models.type.TypeReferenceImpl()) },
                new Object[] {
                        CustomFields.builder().fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        CustomFields value = CustomFields.of();
        value.setType(new com.commercetools.api.models.type.TypeReferenceImpl());
        Assertions.assertThat(value.getType()).isEqualTo(new com.commercetools.api.models.type.TypeReferenceImpl());
    }

    @Test
    public void fields() {
        CustomFields value = CustomFields.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
