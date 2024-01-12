
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
public class CustomFieldReferenceTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomFieldReferenceTypeBuilder builder) {
        CustomFieldReferenceType customFieldReferenceType = builder.buildUnchecked();
        Assertions.assertThat(customFieldReferenceType).isInstanceOf(CustomFieldReferenceType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomFieldReferenceType.builder()
                .referenceTypeId(
                    com.commercetools.api.models.type.CustomFieldReferenceValue.findEnum("associate-role")) } };
    }

    @Test
    public void referenceTypeId() {
        CustomFieldReferenceType value = CustomFieldReferenceType.of();
        value.setReferenceTypeId(
            com.commercetools.api.models.type.CustomFieldReferenceValue.findEnum("associate-role"));
        Assertions.assertThat(value.getReferenceTypeId())
                .isEqualTo(com.commercetools.api.models.type.CustomFieldReferenceValue.findEnum("associate-role"));
    }
}
