
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
public class ChangeTransactionStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTransactionStateChangeBuilder builder) {
        ChangeTransactionStateChange changeTransactionStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeTransactionStateChange).isInstanceOf(ChangeTransactionStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTransactionStateChange.builder().change("change") },
                new Object[] { ChangeTransactionStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial")) },
                new Object[] { ChangeTransactionStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial")) },
                new Object[] { ChangeTransactionStateChange.builder()
                        .transaction(
                            new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
    }

    @Test
    public void nextValue() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
    }

    @Test
    public void transaction() {
        ChangeTransactionStateChange value = ChangeTransactionStateChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }
}
