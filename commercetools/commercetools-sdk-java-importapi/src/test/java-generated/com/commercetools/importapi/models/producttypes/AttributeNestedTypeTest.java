
package com.commercetools.importapi.models.producttypes;

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
public class AttributeNestedTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeNestedTypeBuilder builder) {
        AttributeNestedType attributeNestedType = builder.buildUnchecked();
        Assertions.assertThat(attributeNestedType).isInstanceOf(AttributeNestedType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeNestedType.builder()
                .typeReference(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl()) } };
    }

    @Test
    public void typeReference() {
        AttributeNestedType value = AttributeNestedType.of();
        value.setTypeReference(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
        Assertions.assertThat(value.getTypeReference())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
    }
}
