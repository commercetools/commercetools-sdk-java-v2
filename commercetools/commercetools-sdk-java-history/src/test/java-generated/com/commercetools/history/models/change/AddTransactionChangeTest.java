
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
public class AddTransactionChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddTransactionChangeBuilder builder) {
        AddTransactionChange addTransactionChange = builder.buildUnchecked();
        Assertions.assertThat(addTransactionChange).isInstanceOf(AddTransactionChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AddTransactionChange.builder().change("change") },
                new Object[] { AddTransactionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TransactionImpl()) } };
    }

    @Test
    public void change() {
        AddTransactionChange value = AddTransactionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddTransactionChange value = AddTransactionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TransactionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TransactionImpl());
    }
}
