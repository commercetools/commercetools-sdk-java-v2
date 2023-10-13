
package com.commercetools.history.models.change;

import java.util.Collections;

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
public class RemoveImageChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveImageChangeBuilder builder) {
        RemoveImageChange removeImageChange = builder.buildUnchecked();
        Assertions.assertThat(removeImageChange).isInstanceOf(RemoveImageChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveImageChange.builder().change("change") },
                new Object[] {
                        RemoveImageChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] {
                        RemoveImageChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { RemoveImageChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void nextValue() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void catalogData() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
