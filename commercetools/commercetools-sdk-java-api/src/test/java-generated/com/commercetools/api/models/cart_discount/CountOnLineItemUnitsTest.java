
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
public class CountOnLineItemUnitsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CountOnLineItemUnitsBuilder builder) {
        CountOnLineItemUnits countOnLineItemUnits = builder.buildUnchecked();
        Assertions.assertThat(countOnLineItemUnits).isInstanceOf(CountOnLineItemUnits.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CountOnLineItemUnits.builder().predicate("predicate") },
                new Object[] { CountOnLineItemUnits.builder().minCount(1) },
                new Object[] { CountOnLineItemUnits.builder().maxCount(8) },
                new Object[] { CountOnLineItemUnits.builder().excludeCount(4) } };
    }

    @Test
    public void predicate() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void minCount() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setMinCount(1);
        Assertions.assertThat(value.getMinCount()).isEqualTo(1);
    }

    @Test
    public void maxCount() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setMaxCount(8);
        Assertions.assertThat(value.getMaxCount()).isEqualTo(8);
    }

    @Test
    public void excludeCount() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setExcludeCount(4);
        Assertions.assertThat(value.getExcludeCount()).isEqualTo(4);
    }
}
