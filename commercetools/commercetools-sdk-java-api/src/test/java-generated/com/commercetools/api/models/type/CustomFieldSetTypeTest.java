
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
public class CustomFieldSetTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldSetTypeBuilder builder) {
        CustomFieldSetType customFieldSetType = builder.buildUnchecked();
        Assertions.assertThat(customFieldSetType).isInstanceOf(CustomFieldSetType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                CustomFieldSetType.builder().elementType(new com.commercetools.api.models.type.FieldTypeImpl()) } };
    }

    @Test
    public void elementType() {
        CustomFieldSetType value = CustomFieldSetType.of();
        value.setElementType(new com.commercetools.api.models.type.FieldTypeImpl());
        Assertions.assertThat(value.getElementType()).isEqualTo(new com.commercetools.api.models.type.FieldTypeImpl());
    }
}
