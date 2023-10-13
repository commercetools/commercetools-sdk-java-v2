
package com.commercetools.history.models.common;

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
public class ProductSelectionSettingTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionSettingBuilder builder) {
        ProductSelectionSetting productSelectionSetting = builder.buildUnchecked();
        Assertions.assertThat(productSelectionSetting).isInstanceOf(ProductSelectionSetting.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSelectionSetting.builder()
                        .productSelection(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { ProductSelectionSetting.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        ProductSelectionSetting value = ProductSelectionSetting.of();
        value.setProductSelection(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void active() {
        ProductSelectionSetting value = ProductSelectionSetting.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
