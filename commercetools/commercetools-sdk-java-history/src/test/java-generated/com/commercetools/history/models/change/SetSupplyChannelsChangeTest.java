
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
public class SetSupplyChannelsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetSupplyChannelsChangeBuilder builder) {
        SetSupplyChannelsChange setSupplyChannelsChange = builder.buildUnchecked();
        Assertions.assertThat(setSupplyChannelsChange).isInstanceOf(SetSupplyChannelsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetSupplyChannelsChange.builder().change("change") },
                new Object[] {
                        SetSupplyChannelsChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { SetSupplyChannelsChange.builder()
                        .nextValue(
                            Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl())) } };
    }

    @Test
    public void change() {
        SetSupplyChannelsChange value = SetSupplyChannelsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetSupplyChannelsChange value = SetSupplyChannelsChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        SetSupplyChannelsChange value = SetSupplyChannelsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }
}
