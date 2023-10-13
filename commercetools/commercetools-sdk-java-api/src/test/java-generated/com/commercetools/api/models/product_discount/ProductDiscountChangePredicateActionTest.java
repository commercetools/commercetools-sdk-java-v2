
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountChangePredicateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountChangePredicateActionBuilder builder) {
        ProductDiscountChangePredicateAction productDiscountChangePredicateAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangePredicateAction)
                .isInstanceOf(ProductDiscountChangePredicateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductDiscountChangePredicateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ProductDiscountChangePredicateAction value = ProductDiscountChangePredicateAction.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
