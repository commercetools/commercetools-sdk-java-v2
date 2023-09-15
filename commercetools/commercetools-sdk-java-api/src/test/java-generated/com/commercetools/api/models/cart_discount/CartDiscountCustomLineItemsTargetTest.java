
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
public class CartDiscountCustomLineItemsTargetTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountCustomLineItemsTargetBuilder builder) {
        CartDiscountCustomLineItemsTarget cartDiscountCustomLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountCustomLineItemsTarget).isInstanceOf(CartDiscountCustomLineItemsTarget.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountCustomLineItemsTarget.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        CartDiscountCustomLineItemsTarget value = CartDiscountCustomLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
