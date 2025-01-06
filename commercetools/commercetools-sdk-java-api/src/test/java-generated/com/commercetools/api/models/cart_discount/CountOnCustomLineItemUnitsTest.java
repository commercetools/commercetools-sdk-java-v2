
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
public class CountOnCustomLineItemUnitsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CountOnCustomLineItemUnitsBuilder builder) {
        CountOnCustomLineItemUnits countOnCustomLineItemUnits = builder.buildUnchecked();
        Assertions.assertThat(countOnCustomLineItemUnits).isInstanceOf(CountOnCustomLineItemUnits.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CountOnCustomLineItemUnits.builder().predicate("predicate") },
                new Object[] { CountOnCustomLineItemUnits.builder().minCount(1) },
                new Object[] { CountOnCustomLineItemUnits.builder().maxCount(8) },
                new Object[] { CountOnCustomLineItemUnits.builder().excludeCount(4) } };
    }

    @Test
    public void predicate() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void minCount() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setMinCount(1);
        Assertions.assertThat(value.getMinCount()).isEqualTo(1);
    }

    @Test
    public void maxCount() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setMaxCount(8);
        Assertions.assertThat(value.getMaxCount()).isEqualTo(8);
    }

    @Test
    public void excludeCount() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setExcludeCount(4);
        Assertions.assertThat(value.getExcludeCount()).isEqualTo(4);
    }
}
