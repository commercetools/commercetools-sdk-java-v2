
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
public class ChangeIsSearchableChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeIsSearchableChangeBuilder builder) {
        ChangeIsSearchableChange changeIsSearchableChange = builder.buildUnchecked();
        Assertions.assertThat(changeIsSearchableChange).isInstanceOf(ChangeIsSearchableChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeIsSearchableChange.builder().change("change") },
                new Object[] { ChangeIsSearchableChange.builder().previousValue(true) },
                new Object[] { ChangeIsSearchableChange.builder().nextValue(true) },
                new Object[] { ChangeIsSearchableChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }

    @Test
    public void attributeName() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
