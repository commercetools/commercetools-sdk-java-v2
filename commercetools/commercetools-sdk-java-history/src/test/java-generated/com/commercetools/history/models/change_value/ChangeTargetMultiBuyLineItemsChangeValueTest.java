
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
public class ChangeTargetMultiBuyLineItemsChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTargetMultiBuyLineItemsChangeValueBuilder builder) {
        ChangeTargetMultiBuyLineItemsChangeValue changeTargetMultiBuyLineItemsChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeTargetMultiBuyLineItemsChangeValue)
                .isInstanceOf(ChangeTargetMultiBuyLineItemsChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ChangeTargetMultiBuyLineItemsChangeValue.builder().predicate("predicate") },
                new Object[] { ChangeTargetMultiBuyLineItemsChangeValue.builder().triggerQuantity(8) },
                new Object[] { ChangeTargetMultiBuyLineItemsChangeValue.builder().discountedQuantity(3) },
                new Object[] { ChangeTargetMultiBuyLineItemsChangeValue.builder().maxOccurrence(7) },
                new Object[] { ChangeTargetMultiBuyLineItemsChangeValue.builder()
                        .selectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        ChangeTargetMultiBuyLineItemsChangeValue value = ChangeTargetMultiBuyLineItemsChangeValue.of();
        value.setSelectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
    }
}
