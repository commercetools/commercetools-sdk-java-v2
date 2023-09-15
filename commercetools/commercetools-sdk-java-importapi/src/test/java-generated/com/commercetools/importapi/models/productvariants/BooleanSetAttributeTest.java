
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
public class BooleanSetAttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BooleanSetAttributeBuilder builder) {
        BooleanSetAttribute booleanSetAttribute = builder.buildUnchecked();
        Assertions.assertThat(booleanSetAttribute).isInstanceOf(BooleanSetAttribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BooleanSetAttribute.builder().value(Collections.singletonList(true)) } };
    }

    @Test
    public void value() {
        BooleanSetAttribute value = BooleanSetAttribute.of();
        value.setValue(Collections.singletonList(true));
        Assertions.assertThat(value.getValue()).isEqualTo(Collections.singletonList(true));
    }
}
