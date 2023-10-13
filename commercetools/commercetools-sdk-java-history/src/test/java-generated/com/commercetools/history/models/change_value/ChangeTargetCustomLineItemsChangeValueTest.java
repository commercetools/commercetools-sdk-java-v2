
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
public class ChangeTargetCustomLineItemsChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTargetCustomLineItemsChangeValueBuilder builder) {
        ChangeTargetCustomLineItemsChangeValue changeTargetCustomLineItemsChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetCustomLineItemsChangeValue)
                .isInstanceOf(ChangeTargetCustomLineItemsChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ChangeTargetCustomLineItemsChangeValue.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ChangeTargetCustomLineItemsChangeValue value = ChangeTargetCustomLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
