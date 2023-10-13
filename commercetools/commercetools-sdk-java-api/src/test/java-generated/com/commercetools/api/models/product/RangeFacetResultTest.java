
package com.commercetools.api.models.product;

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
public class RangeFacetResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RangeFacetResultBuilder builder) {
        RangeFacetResult rangeFacetResult = builder.buildUnchecked();
        Assertions.assertThat(rangeFacetResult).isInstanceOf(RangeFacetResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RangeFacetResult.builder()
                .ranges(Collections.singletonList(new com.commercetools.api.models.product.FacetRangeImpl())) } };
    }

    @Test
    public void ranges() {
        RangeFacetResult value = RangeFacetResult.of();
        value.setRanges(Collections.singletonList(new com.commercetools.api.models.product.FacetRangeImpl()));
        Assertions.assertThat(value.getRanges())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.FacetRangeImpl()));
    }
}
