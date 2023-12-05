
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
public class ChangeRequiresDiscountCodeChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeRequiresDiscountCodeChangeBuilder builder) {
        ChangeRequiresDiscountCodeChange changeRequiresDiscountCodeChange = builder.buildUnchecked();
        Assertions.assertThat(changeRequiresDiscountCodeChange).isInstanceOf(ChangeRequiresDiscountCodeChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeRequiresDiscountCodeChange.builder().change("change") },
                new Object[] { ChangeRequiresDiscountCodeChange.builder().previousValue(true) },
                new Object[] { ChangeRequiresDiscountCodeChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeRequiresDiscountCodeChange value = ChangeRequiresDiscountCodeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeRequiresDiscountCodeChange value = ChangeRequiresDiscountCodeChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeRequiresDiscountCodeChange value = ChangeRequiresDiscountCodeChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
