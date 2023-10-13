
package com.commercetools.history.models.change_value;

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
public class TransactionChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TransactionChangeValueBuilder builder) {
        TransactionChangeValue transactionChangeValue = builder.buildUnchecked();
        Assertions.assertThat(transactionChangeValue).isInstanceOf(TransactionChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TransactionChangeValue.builder().id("id") },
                new Object[] { TransactionChangeValue.builder().interactionId("interactionId") },
                new Object[] { TransactionChangeValue.builder().timestamp("timestamp") } };
    }

    @Test
    public void id() {
        TransactionChangeValue value = TransactionChangeValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void interactionId() {
        TransactionChangeValue value = TransactionChangeValue.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }

    @Test
    public void timestamp() {
        TransactionChangeValue value = TransactionChangeValue.of();
        value.setTimestamp("timestamp");
        Assertions.assertThat(value.getTimestamp()).isEqualTo("timestamp");
    }
}
