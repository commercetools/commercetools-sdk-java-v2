
package com.commercetools.api.models.product_type;

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
public class AttributeReferenceTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeReferenceTypeBuilder builder) {
        AttributeReferenceType attributeReferenceType = builder.buildUnchecked();
        Assertions.assertThat(attributeReferenceType).isInstanceOf(AttributeReferenceType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeReferenceType.builder()
                .referenceTypeId(
                    com.commercetools.api.models.product_type.AttributeReferenceTypeId.findEnum("cart")) } };
    }

    @Test
    public void referenceTypeId() {
        AttributeReferenceType value = AttributeReferenceType.of();
        value.setReferenceTypeId(com.commercetools.api.models.product_type.AttributeReferenceTypeId.findEnum("cart"));
        Assertions.assertThat(value.getReferenceTypeId())
                .isEqualTo(com.commercetools.api.models.product_type.AttributeReferenceTypeId.findEnum("cart"));
    }
}
