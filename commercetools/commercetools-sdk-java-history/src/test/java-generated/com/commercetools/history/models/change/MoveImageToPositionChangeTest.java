
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
public class MoveImageToPositionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MoveImageToPositionChangeBuilder builder) {
        MoveImageToPositionChange moveImageToPositionChange = builder.buildUnchecked();
        Assertions.assertThat(moveImageToPositionChange).isInstanceOf(MoveImageToPositionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MoveImageToPositionChange.builder().change("change") },
                new Object[] {
                        MoveImageToPositionChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] {
                        MoveImageToPositionChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { MoveImageToPositionChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        MoveImageToPositionChange value = MoveImageToPositionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        MoveImageToPositionChange value = MoveImageToPositionChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void nextValue() {
        MoveImageToPositionChange value = MoveImageToPositionChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void catalogData() {
        MoveImageToPositionChange value = MoveImageToPositionChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
