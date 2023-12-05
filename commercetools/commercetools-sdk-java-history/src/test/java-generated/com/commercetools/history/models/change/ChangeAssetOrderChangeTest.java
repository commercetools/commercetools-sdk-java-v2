
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
public class ChangeAssetOrderChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeAssetOrderChangeBuilder builder) {
        ChangeAssetOrderChange changeAssetOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssetOrderChange).isInstanceOf(ChangeAssetOrderChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeAssetOrderChange.builder().change("change") },
                new Object[] { ChangeAssetOrderChange.builder()
                        .previousValue(Collections
                                .singletonList(new com.commercetools.history.models.common.LocalizedStringImpl())) },
                new Object[] { ChangeAssetOrderChange.builder()
                        .nextValue(Collections
                                .singletonList(new com.commercetools.history.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void change() {
        ChangeAssetOrderChange value = ChangeAssetOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssetOrderChange value = ChangeAssetOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
    }

    @Test
    public void nextValue() {
        ChangeAssetOrderChange value = ChangeAssetOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
    }
}
