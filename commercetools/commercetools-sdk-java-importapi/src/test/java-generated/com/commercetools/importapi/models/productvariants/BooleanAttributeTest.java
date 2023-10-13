
package com.commercetools.importapi.models.productvariants;

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
public class BooleanAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BooleanAttributeBuilder builder) {
        BooleanAttribute booleanAttribute = builder.buildUnchecked();
        Assertions.assertThat(booleanAttribute).isInstanceOf(BooleanAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BooleanAttribute.builder().value(true) } };
    }

    @Test
    public void value() {
        BooleanAttribute value = BooleanAttribute.of();
        value.setValue(true);
        Assertions.assertThat(value.getValue()).isEqualTo(true);
    }
}
