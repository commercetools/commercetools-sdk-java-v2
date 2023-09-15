
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
public class ProductTypeSetInputTipActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeSetInputTipActionBuilder builder) {
        ProductTypeSetInputTipAction productTypeSetInputTipAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeSetInputTipAction).isInstanceOf(ProductTypeSetInputTipAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeSetInputTipAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeSetInputTipAction.builder()
                        .inputTip(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void attributeName() {
        ProductTypeSetInputTipAction value = ProductTypeSetInputTipAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void inputTip() {
        ProductTypeSetInputTipAction value = ProductTypeSetInputTipAction.of();
        value.setInputTip(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getInputTip())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
