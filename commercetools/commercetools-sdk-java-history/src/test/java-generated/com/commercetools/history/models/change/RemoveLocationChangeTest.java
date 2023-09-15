
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
public class RemoveLocationChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveLocationChangeBuilder builder) {
        RemoveLocationChange removeLocationChange = builder.buildUnchecked();
        Assertions.assertThat(removeLocationChange).isInstanceOf(RemoveLocationChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveLocationChange.builder().change("change") },
                new Object[] { RemoveLocationChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocationImpl()) },
                new Object[] { RemoveLocationChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocationImpl()) } };
    }

    @Test
    public void change() {
        RemoveLocationChange value = RemoveLocationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveLocationChange value = RemoveLocationChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocationImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocationImpl());
    }

    @Test
    public void nextValue() {
        RemoveLocationChange value = RemoveLocationChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocationImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocationImpl());
    }
}
