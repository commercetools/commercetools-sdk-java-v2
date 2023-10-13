
package com.commercetools.api.models.cart;

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
public class CartSetCartTotalTaxActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartSetCartTotalTaxActionBuilder builder) {
        CartSetCartTotalTaxAction cartSetCartTotalTaxAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCartTotalTaxAction).isInstanceOf(CartSetCartTotalTaxAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartSetCartTotalTaxAction.builder()
                        .externalTotalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { CartSetCartTotalTaxAction.builder()
                        .externalTaxPortions(
                            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl())) } };
    }

    @Test
    public void externalTotalGross() {
        CartSetCartTotalTaxAction value = CartSetCartTotalTaxAction.of();
        value.setExternalTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalTotalGross())
                .isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTaxPortions() {
        CartSetCartTotalTaxAction value = CartSetCartTotalTaxAction.of();
        value.setExternalTaxPortions(
            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
        Assertions.assertThat(value.getExternalTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
    }
}
