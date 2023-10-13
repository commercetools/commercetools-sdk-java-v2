
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
public class ProductSetAttributeInAllVariantsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetAttributeInAllVariantsActionBuilder builder) {
        ProductSetAttributeInAllVariantsAction productSetAttributeInAllVariantsAction = builder.buildUnchecked();
        Assertions.assertThat(productSetAttributeInAllVariantsAction)
                .isInstanceOf(ProductSetAttributeInAllVariantsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetAttributeInAllVariantsAction.builder().name("name") },
                new Object[] { ProductSetAttributeInAllVariantsAction.builder().value("value") },
                new Object[] { ProductSetAttributeInAllVariantsAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductSetAttributeInAllVariantsAction value = ProductSetAttributeInAllVariantsAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductSetAttributeInAllVariantsAction value = ProductSetAttributeInAllVariantsAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductSetAttributeInAllVariantsAction value = ProductSetAttributeInAllVariantsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
