
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
public class SetDistributionChannelsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetDistributionChannelsChangeBuilder builder) {
        SetDistributionChannelsChange setDistributionChannelsChange = builder.buildUnchecked();
        Assertions.assertThat(setDistributionChannelsChange).isInstanceOf(SetDistributionChannelsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetDistributionChannelsChange.builder().change("change") },
                new Object[] {
                        SetDistributionChannelsChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { SetDistributionChannelsChange.builder()
                        .nextValue(
                            Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl())) } };
    }

    @Test
    public void change() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }
}
