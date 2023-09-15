
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
public class ChangeTargetLineItemsChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTargetLineItemsChangeValueBuilder builder) {
        ChangeTargetLineItemsChangeValue changeTargetLineItemsChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetLineItemsChangeValue).isInstanceOf(ChangeTargetLineItemsChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeTargetLineItemsChangeValue.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ChangeTargetLineItemsChangeValue value = ChangeTargetLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
