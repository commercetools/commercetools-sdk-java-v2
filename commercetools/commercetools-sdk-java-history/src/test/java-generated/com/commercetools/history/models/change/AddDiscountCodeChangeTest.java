
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
public class AddDiscountCodeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddDiscountCodeChangeBuilder builder) {
        AddDiscountCodeChange addDiscountCodeChange = builder.buildUnchecked();
        Assertions.assertThat(addDiscountCodeChange).isInstanceOf(AddDiscountCodeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddDiscountCodeChange.builder().change("change") },
                new Object[] { AddDiscountCodeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl()) } };
    }

    @Test
    public void change() {
        AddDiscountCodeChange value = AddDiscountCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddDiscountCodeChange value = AddDiscountCodeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
    }
}
