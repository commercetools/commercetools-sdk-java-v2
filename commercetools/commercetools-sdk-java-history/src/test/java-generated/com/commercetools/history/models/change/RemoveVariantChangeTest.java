
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
public class RemoveVariantChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveVariantChangeBuilder builder) {
        RemoveVariantChange removeVariantChange = builder.buildUnchecked();
        Assertions.assertThat(removeVariantChange).isInstanceOf(RemoveVariantChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveVariantChange.builder().change("change") },
                new Object[] { RemoveVariantChange.builder()
                        .previousValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { RemoveVariantChange.builder()
                        .nextValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { RemoveVariantChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void nextValue() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setNextValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void catalogData() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
