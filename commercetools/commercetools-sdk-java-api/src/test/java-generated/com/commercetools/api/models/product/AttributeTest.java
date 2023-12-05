
package com.commercetools.api.models.product;

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
public class AttributeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AttributeBuilder builder) {
        Attribute attribute = builder.buildUnchecked();
        Assertions.assertThat(attribute).isInstanceOf(Attribute.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Attribute.builder().name("name") },
                new Object[] { Attribute.builder().value("value") } };
    }

    @Test
    public void name() {
        Attribute value = Attribute.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        Attribute value = Attribute.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
