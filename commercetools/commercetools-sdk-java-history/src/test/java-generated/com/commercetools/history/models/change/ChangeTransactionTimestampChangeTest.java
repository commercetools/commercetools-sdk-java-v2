
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
public class ChangeTransactionTimestampChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTransactionTimestampChangeBuilder builder) {
        ChangeTransactionTimestampChange changeTransactionTimestampChange = builder.buildUnchecked();
        Assertions.assertThat(changeTransactionTimestampChange).isInstanceOf(ChangeTransactionTimestampChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTransactionTimestampChange.builder().change("change") },
                new Object[] { ChangeTransactionTimestampChange.builder().previousValue("previousValue") },
                new Object[] { ChangeTransactionTimestampChange.builder().nextValue("nextValue") },
                new Object[] { ChangeTransactionTimestampChange.builder()
                        .transaction(
                            new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void transaction() {
        ChangeTransactionTimestampChange value = ChangeTransactionTimestampChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }
}
