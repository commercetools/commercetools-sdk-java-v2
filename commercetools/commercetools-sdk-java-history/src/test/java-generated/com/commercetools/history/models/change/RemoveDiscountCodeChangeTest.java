
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
public class RemoveDiscountCodeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RemoveDiscountCodeChangeBuilder builder) {
        RemoveDiscountCodeChange removeDiscountCodeChange = builder.buildUnchecked();
        Assertions.assertThat(removeDiscountCodeChange).isInstanceOf(RemoveDiscountCodeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RemoveDiscountCodeChange.builder().change("change") },
                new Object[] { RemoveDiscountCodeChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl()) } };
    }

    @Test
    public void change() {
        RemoveDiscountCodeChange value = RemoveDiscountCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveDiscountCodeChange value = RemoveDiscountCodeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountCodeInfoImpl());
    }
}
