
package com.commercetools.history.models.change;

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
public class RemoveProductSelectionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveProductSelectionChangeBuilder builder) {
        RemoveProductSelectionChange removeProductSelectionChange = builder.buildUnchecked();
        Assertions.assertThat(removeProductSelectionChange).isInstanceOf(RemoveProductSelectionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveProductSelectionChange.builder().change("change") },
                new Object[] { RemoveProductSelectionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl()) } };
    }

    @Test
    public void change() {
        RemoveProductSelectionChange value = RemoveProductSelectionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveProductSelectionChange value = RemoveProductSelectionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
    }
}
