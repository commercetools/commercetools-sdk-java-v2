
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
public class SetImageLabelChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetImageLabelChangeBuilder builder) {
        SetImageLabelChange setImageLabelChange = builder.buildUnchecked();
        Assertions.assertThat(setImageLabelChange).isInstanceOf(SetImageLabelChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetImageLabelChange.builder().change("change") },
                new Object[] { SetImageLabelChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ImageImpl()) },
                new Object[] { SetImageLabelChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ImageImpl()) },
                new Object[] { SetImageLabelChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ImageImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ImageImpl());
    }

    @Test
    public void nextValue() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ImageImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.ImageImpl());
    }

    @Test
    public void catalogData() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
