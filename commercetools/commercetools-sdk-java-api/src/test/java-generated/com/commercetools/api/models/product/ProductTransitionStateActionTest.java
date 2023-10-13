
package com.commercetools.api.models.product;

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
public class ProductTransitionStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTransitionStateActionBuilder builder) {
        ProductTransitionStateAction productTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(productTransitionStateAction).isInstanceOf(ProductTransitionStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTransitionStateAction.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { ProductTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        ProductTransitionStateAction value = ProductTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        ProductTransitionStateAction value = ProductTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
