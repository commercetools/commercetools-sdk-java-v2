
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
public class AttributePlainEnumValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributePlainEnumValueBuilder builder) {
        AttributePlainEnumValue attributePlainEnumValue = builder.buildUnchecked();
        Assertions.assertThat(attributePlainEnumValue).isInstanceOf(AttributePlainEnumValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AttributePlainEnumValue.builder().key("key") },
                new Object[] { AttributePlainEnumValue.builder().label("label") } };
    }

    @Test
    public void key() {
        AttributePlainEnumValue value = AttributePlainEnumValue.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void label() {
        AttributePlainEnumValue value = AttributePlainEnumValue.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
