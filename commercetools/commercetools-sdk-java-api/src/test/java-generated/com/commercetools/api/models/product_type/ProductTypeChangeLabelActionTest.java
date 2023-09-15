
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
public class ProductTypeChangeLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeLabelActionBuilder builder) {
        ProductTypeChangeLabelAction productTypeChangeLabelAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeLabelAction).isInstanceOf(ProductTypeChangeLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeChangeLabelAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeLabelAction.builder()
                        .label(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeLabelAction value = ProductTypeChangeLabelAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void label() {
        ProductTypeChangeLabelAction value = ProductTypeChangeLabelAction.of();
        value.setLabel(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
