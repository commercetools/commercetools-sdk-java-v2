
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
public class AddLocationChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddLocationChangeBuilder builder) {
        AddLocationChange addLocationChange = builder.buildUnchecked();
        Assertions.assertThat(addLocationChange).isInstanceOf(AddLocationChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddLocationChange.builder().change("change") },
                new Object[] { AddLocationChange.builder()
                        .previousValue(new com.commercetools.history.models.common.LocationImpl()) },
                new Object[] { AddLocationChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LocationImpl()) } };
    }

    @Test
    public void change() {
        AddLocationChange value = AddLocationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddLocationChange value = AddLocationChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocationImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocationImpl());
    }

    @Test
    public void nextValue() {
        AddLocationChange value = AddLocationChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocationImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocationImpl());
    }
}
