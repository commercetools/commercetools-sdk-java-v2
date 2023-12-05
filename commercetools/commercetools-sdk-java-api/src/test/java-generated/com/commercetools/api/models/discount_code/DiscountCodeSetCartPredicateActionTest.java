
package com.commercetools.api.models.discount_code;

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
public class DiscountCodeSetCartPredicateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeSetCartPredicateActionBuilder builder) {
        DiscountCodeSetCartPredicateAction discountCodeSetCartPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetCartPredicateAction)
                .isInstanceOf(DiscountCodeSetCartPredicateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DiscountCodeSetCartPredicateAction.builder().cartPredicate("cartPredicate") } };
    }

    @Test
    public void cartPredicate() {
        DiscountCodeSetCartPredicateAction value = DiscountCodeSetCartPredicateAction.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }
}
