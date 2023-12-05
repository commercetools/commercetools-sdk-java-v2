
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
public class ChangeTargetMultiBuyCustomLineItemsChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder) {
        ChangeTargetMultiBuyCustomLineItemsChangeValue changeTargetMultiBuyCustomLineItemsChangeValue = builder
                .buildUnchecked();
        Assertions.assertThat(changeTargetMultiBuyCustomLineItemsChangeValue)
                .isInstanceOf(ChangeTargetMultiBuyCustomLineItemsChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().predicate("predicate") },
                new Object[] { ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().triggerQuantity(8) },
                new Object[] { ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().discountedQuantity(3) },
                new Object[] { ChangeTargetMultiBuyCustomLineItemsChangeValue.builder().maxOccurrence(7) },
                new Object[] { ChangeTargetMultiBuyCustomLineItemsChangeValue.builder()
                        .selectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        ChangeTargetMultiBuyCustomLineItemsChangeValue value = ChangeTargetMultiBuyCustomLineItemsChangeValue.of();
        value.setSelectionMode(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.history.models.common.SelectionMode.findEnum("Cheapest"));
    }
}
