
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

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
public class CartDiscountPatternTargetTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountPatternTargetBuilder builder) {
        CartDiscountPatternTarget cartDiscountPatternTarget = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountPatternTarget).isInstanceOf(CartDiscountPatternTarget.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountPatternTarget.builder()
                        .triggerPattern(Collections.singletonList(
                            new com.commercetools.api.models.cart_discount.PatternComponentImpl())) },
                new Object[] { CartDiscountPatternTarget.builder()
                        .targetPattern(Collections.singletonList(
                            new com.commercetools.api.models.cart_discount.PatternComponentImpl())) },
                new Object[] { CartDiscountPatternTarget.builder().maxOccurrence(7) },
                new Object[] { CartDiscountPatternTarget.builder()
                        .selectionMode(
                            com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest")) } };
    }

    @Test
    public void triggerPattern() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setTriggerPattern(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
        Assertions.assertThat(value.getTriggerPattern())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
    }

    @Test
    public void targetPattern() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setTargetPattern(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
        Assertions.assertThat(value.getTargetPattern())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.cart_discount.PatternComponentImpl()));
    }

    @Test
    public void maxOccurrence() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setMaxOccurrence(7);
        Assertions.assertThat(value.getMaxOccurrence()).isEqualTo(7);
    }

    @Test
    public void selectionMode() {
        CartDiscountPatternTarget value = CartDiscountPatternTarget.of();
        value.setSelectionMode(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
        Assertions.assertThat(value.getSelectionMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.SelectionMode.findEnum("Cheapest"));
    }
}
