
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
public class ProductTypeChangeInputHintActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeInputHintActionBuilder builder) {
        ProductTypeChangeInputHintAction productTypeChangeInputHintAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeInputHintAction).isInstanceOf(ProductTypeChangeInputHintAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeChangeInputHintAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeInputHintAction.builder()
                        .newValue(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine")) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeInputHintAction value = ProductTypeChangeInputHintAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangeInputHintAction value = ProductTypeChangeInputHintAction.of();
        value.setNewValue(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine"));
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(com.commercetools.api.models.product_type.TextInputHint.findEnum("SingleLine"));
    }
}
