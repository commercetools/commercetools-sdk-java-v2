
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
public class AddExternalImageChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddExternalImageChangeBuilder builder) {
        AddExternalImageChange addExternalImageChange = builder.buildUnchecked();
        Assertions.assertThat(addExternalImageChange).isInstanceOf(AddExternalImageChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddExternalImageChange.builder().change("change") },
                new Object[] {
                        AddExternalImageChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] {
                        AddExternalImageChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { AddExternalImageChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void nextValue() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void catalogData() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
