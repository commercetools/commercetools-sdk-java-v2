
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
public class ChangeTransactionInteractionIdChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTransactionInteractionIdChangeBuilder builder) {
        ChangeTransactionInteractionIdChange changeTransactionInteractionIdChange = builder.buildUnchecked();
        Assertions.assertThat(changeTransactionInteractionIdChange)
                .isInstanceOf(ChangeTransactionInteractionIdChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTransactionInteractionIdChange.builder().change("change") },
                new Object[] { ChangeTransactionInteractionIdChange.builder().previousValue("previousValue") },
                new Object[] { ChangeTransactionInteractionIdChange.builder().nextValue("nextValue") },
                new Object[] { ChangeTransactionInteractionIdChange.builder()
                        .transaction(
                            new com.commercetools.history.models.change_value.TransactionChangeValueImpl()) } };
    }

    @Test
    public void change() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void transaction() {
        ChangeTransactionInteractionIdChange value = ChangeTransactionInteractionIdChange.of();
        value.setTransaction(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.history.models.change_value.TransactionChangeValueImpl());
    }
}
