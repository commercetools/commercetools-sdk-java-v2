
package com.commercetools.importapi.models.producttypes;

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
public class AttributeLocalizedEnumTypeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeLocalizedEnumTypeBuilder builder) {
        AttributeLocalizedEnumType attributeLocalizedEnumType = builder.buildUnchecked();
        Assertions.assertThat(attributeLocalizedEnumType).isInstanceOf(AttributeLocalizedEnumType.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributeLocalizedEnumType.builder()
                .values(Collections.singletonList(
                    new com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl())) } };
    }

    @Test
    public void values() {
        AttributeLocalizedEnumType value = AttributeLocalizedEnumType.of();
        value.setValues(Collections
                .singletonList(new com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl()));
        Assertions.assertThat(value.getValues())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValueImpl()));
    }
}
