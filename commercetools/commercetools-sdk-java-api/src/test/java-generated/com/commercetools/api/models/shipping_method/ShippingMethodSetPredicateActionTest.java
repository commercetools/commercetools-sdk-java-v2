
package com.commercetools.api.models.shipping_method;

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
public class ShippingMethodSetPredicateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodSetPredicateActionBuilder builder) {
        ShippingMethodSetPredicateAction shippingMethodSetPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSetPredicateAction).isInstanceOf(ShippingMethodSetPredicateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodSetPredicateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ShippingMethodSetPredicateAction value = ShippingMethodSetPredicateAction.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
