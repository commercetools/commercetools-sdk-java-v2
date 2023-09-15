
package com.commercetools.api.models.product_type;

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
public class AttributeEnumTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeEnumTypeBuilder builder) {
        AttributeEnumType attributeEnumType = builder.buildUnchecked();
        Assertions.assertThat(attributeEnumType).isInstanceOf(AttributeEnumType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeEnumType.builder()
                .values(Collections.singletonList(
                    new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl())) } };
    }

    @Test
    public void values() {
        AttributeEnumType value = AttributeEnumType.of();
        value.setValues(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.AttributePlainEnumValueImpl()));
    }
}
