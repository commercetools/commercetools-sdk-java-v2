
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
public class NumberAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(NumberAttributeBuilder builder) {
        NumberAttribute numberAttribute = builder.buildUnchecked();
        Assertions.assertThat(numberAttribute).isInstanceOf(NumberAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { NumberAttribute.builder().value(0.8275633) } };
    }

    @Test
    public void value() {
        NumberAttribute value = NumberAttribute.of();
        value.setValue(0.8275633);
        Assertions.assertThat(value.getValue()).isEqualTo(0.8275633);
    }
}
