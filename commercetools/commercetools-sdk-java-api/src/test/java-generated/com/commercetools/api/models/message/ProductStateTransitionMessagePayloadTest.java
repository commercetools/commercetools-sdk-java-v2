
package com.commercetools.api.models.message;

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
public class ProductStateTransitionMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductStateTransitionMessagePayloadBuilder builder) {
        ProductStateTransitionMessagePayload productStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productStateTransitionMessagePayload)
                .isInstanceOf(ProductStateTransitionMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductStateTransitionMessagePayload.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { ProductStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        ProductStateTransitionMessagePayload value = ProductStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        ProductStateTransitionMessagePayload value = ProductStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
