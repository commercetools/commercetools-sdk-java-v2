
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
public class SetSellerCommentChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetSellerCommentChangeBuilder builder) {
        SetSellerCommentChange setSellerCommentChange = builder.buildUnchecked();
        Assertions.assertThat(setSellerCommentChange).isInstanceOf(SetSellerCommentChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetSellerCommentChange.builder().change("change") },
                new Object[] { SetSellerCommentChange.builder().previousValue("previousValue") },
                new Object[] { SetSellerCommentChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetSellerCommentChange value = SetSellerCommentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetSellerCommentChange value = SetSellerCommentChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetSellerCommentChange value = SetSellerCommentChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
