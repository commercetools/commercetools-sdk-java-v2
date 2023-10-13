
package com.commercetools.api.models.cart_discount;

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
public class MultiBuyLineItemsTargetTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MultiBuyLineItemsTargetBuilder builder) {
        MultiBuyLineItemsTarget multiBuyLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(multiBuyLineItemsTarget).isInstanceOf(MultiBuyLineItemsTarget.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MultiBuyLineItemsTarget.builder().predicate("predicate") },
                new Object[] { MultiBuyLineItemsTarget.builder().triggerQuantity(8) },
                new Object[] { MultiBuyLineItemsTarget.builder().discountedQuantity(3) },
                new Object[] { MultiBuyLineItemsTarget.builder().maxOccurrence(7) },
                new Object[] { MultiBuyLineItemsTarget.builder()
                        .selectionMode(
                            com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        MultiBuyLineItemsTarget value = MultiBuyLineItemsTarget.of();
        value.setSelectionMode(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
    }
}
