
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringSetAttributeInAllVariantsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetAttributeInAllVariantsActionBuilder builder) {
        ProductTailoringSetAttributeInAllVariantsAction productTailoringSetAttributeInAllVariantsAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTailoringSetAttributeInAllVariantsAction)
                .isInstanceOf(ProductTailoringSetAttributeInAllVariantsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetAttributeInAllVariantsAction.builder().name("name") },
                new Object[] { ProductTailoringSetAttributeInAllVariantsAction.builder().value("value") },
                new Object[] { ProductTailoringSetAttributeInAllVariantsAction.builder().staged(true) } };
    }

    @Test
    public void name() {
        ProductTailoringSetAttributeInAllVariantsAction value = ProductTailoringSetAttributeInAllVariantsAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductTailoringSetAttributeInAllVariantsAction value = ProductTailoringSetAttributeInAllVariantsAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void staged() {
        ProductTailoringSetAttributeInAllVariantsAction value = ProductTailoringSetAttributeInAllVariantsAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
