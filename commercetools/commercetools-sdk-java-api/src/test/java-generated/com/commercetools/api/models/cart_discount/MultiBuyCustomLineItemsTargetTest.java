
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
public class MultiBuyCustomLineItemsTargetTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MultiBuyCustomLineItemsTargetBuilder builder) {
        MultiBuyCustomLineItemsTarget multiBuyCustomLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(multiBuyCustomLineItemsTarget).isInstanceOf(MultiBuyCustomLineItemsTarget.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MultiBuyCustomLineItemsTarget.builder().predicate("predicate") },
                new Object[] { MultiBuyCustomLineItemsTarget.builder().triggerQuantity(8) },
                new Object[] { MultiBuyCustomLineItemsTarget.builder().discountedQuantity(3) },
                new Object[] { MultiBuyCustomLineItemsTarget.builder().maxOccurrence(7) },
                new Object[] { MultiBuyCustomLineItemsTarget.builder()
                        .selectionMode(
                            com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void predicate() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void triggerQuantity() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setTriggerQuantity(8);
        Assertions.assertThat(value.getTriggerQuantity()).isEqualTo(8);
    }

    @Test
    public void discountedQuantity() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setDiscountedQuantity(3);
        Assertions.assertThat(value.getDiscountedQuantity()).isEqualTo(3);
    }

    @Test
    public void maxOccurrence() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        MultiBuyCustomLineItemsTarget value = MultiBuyCustomLineItemsTarget.of();
        value.setSelectionMode(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
    }
}
