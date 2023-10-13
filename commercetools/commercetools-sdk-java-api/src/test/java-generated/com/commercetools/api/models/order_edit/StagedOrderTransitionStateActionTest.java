
package com.commercetools.api.models.order_edit;

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
public class StagedOrderTransitionStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderTransitionStateActionBuilder builder) {
        StagedOrderTransitionStateAction stagedOrderTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderTransitionStateAction).isInstanceOf(StagedOrderTransitionStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderTransitionStateAction.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { StagedOrderTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        StagedOrderTransitionStateAction value = StagedOrderTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        StagedOrderTransitionStateAction value = StagedOrderTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
