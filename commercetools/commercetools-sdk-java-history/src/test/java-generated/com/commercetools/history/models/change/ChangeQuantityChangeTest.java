
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
public class ChangeQuantityChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeQuantityChangeBuilder builder) {
        ChangeQuantityChange changeQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(changeQuantityChange).isInstanceOf(ChangeQuantityChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeQuantityChange.builder().change("change") },
                new Object[] { ChangeQuantityChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.InventoryQuantityValueImpl()) },
                new Object[] { ChangeQuantityChange.builder()
                        .nextValue(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeQuantityChange value = ChangeQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeQuantityChange value = ChangeQuantityChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
    }

    @Test
    public void nextValue() {
        ChangeQuantityChange value = ChangeQuantityChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.InventoryQuantityValueImpl());
    }
}
