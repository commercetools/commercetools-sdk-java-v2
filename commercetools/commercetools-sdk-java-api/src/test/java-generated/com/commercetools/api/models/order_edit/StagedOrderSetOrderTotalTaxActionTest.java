
package com.commercetools.api.models.order_edit;

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
public class StagedOrderSetOrderTotalTaxActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetOrderTotalTaxActionBuilder builder) {
        StagedOrderSetOrderTotalTaxAction stagedOrderSetOrderTotalTaxAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetOrderTotalTaxAction).isInstanceOf(StagedOrderSetOrderTotalTaxAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetOrderTotalTaxAction.builder()
                        .externalTotalGross(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { StagedOrderSetOrderTotalTaxAction.builder()
                        .externalTaxPortions(
                            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl())) } };
    }

    @Test
    public void externalTotalGross() {
        StagedOrderSetOrderTotalTaxAction value = StagedOrderSetOrderTotalTaxAction.of();
        value.setExternalTotalGross(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalTotalGross())
                .isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTaxPortions() {
        StagedOrderSetOrderTotalTaxAction value = StagedOrderSetOrderTotalTaxAction.of();
        value.setExternalTaxPortions(
            Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
        Assertions.assertThat(value.getExternalTaxPortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.TaxPortionDraftImpl()));
    }
}
