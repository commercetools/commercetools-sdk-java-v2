
package com.commercetools.importapi.models.productvariants;

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
public class NumberSetAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(NumberSetAttributeBuilder builder) {
        NumberSetAttribute numberSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(numberSetAttribute).isInstanceOf(NumberSetAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { NumberSetAttribute.builder().value(Collections.singletonList(0.8275633)) } };
    }

    @Test
    public void value() {
        NumberSetAttribute value = NumberSetAttribute.of();
        value.setValue(Collections.singletonList(0.8275633));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(0.8275633));
    }
}
