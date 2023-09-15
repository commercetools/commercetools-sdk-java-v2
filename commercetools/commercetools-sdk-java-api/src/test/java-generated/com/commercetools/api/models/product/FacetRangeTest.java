
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
public class FacetRangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(FacetRangeBuilder builder) {
        FacetRange facetRange = builder.buildUnchecked();
        Assertions.assertThat(facetRange).isInstanceOf(FacetRange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { FacetRange.builder().from(0.470235) },
                new Object[] { FacetRange.builder().fromStr("fromStr") },
                new Object[] { FacetRange.builder().to(0.061924815) },
                new Object[] { FacetRange.builder().toStr("toStr") }, new Object[] { FacetRange.builder().count(2L) },
                new Object[] { FacetRange.builder().productCount(1L) },
                new Object[] { FacetRange.builder().total(0.60145235) },
                new Object[] { FacetRange.builder().min(0.34761357) },
                new Object[] { FacetRange.builder().max(0.4280588) },
                new Object[] { FacetRange.builder().mean(0.49018955) } };
    }

    @Test
    public void from() {
        FacetRange value = FacetRange.of();
        value.setFrom(0.470235);
        Assertions.assertThat(value.getFrom()).isEqualTo(0.470235);
    }

    @Test
    public void fromStr() {
        FacetRange value = FacetRange.of();
        value.setFromStr("fromStr");
        Assertions.assertThat(value.getFromStr()).isEqualTo("fromStr");
    }

    @Test
    public void to() {
        FacetRange value = FacetRange.of();
        value.setTo(0.061924815);
        Assertions.assertThat(value.getTo()).isEqualTo(0.061924815);
    }

    @Test
    public void toStr() {
        FacetRange value = FacetRange.of();
        value.setToStr("toStr");
        Assertions.assertThat(value.getToStr()).isEqualTo("toStr");
    }

    @Test
    public void count() {
        FacetRange value = FacetRange.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void productCount() {
        FacetRange value = FacetRange.of();
        value.setProductCount(1L);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1L);
    }

    @Test
    public void total() {
        FacetRange value = FacetRange.of();
        value.setTotal(0.60145235);
        Assertions.assertThat(value.getTotal()).isEqualTo(0.60145235);
    }

    @Test
    public void min() {
        FacetRange value = FacetRange.of();
        value.setMin(0.34761357);
        Assertions.assertThat(value.getMin()).isEqualTo(0.34761357);
    }

    @Test
    public void max() {
        FacetRange value = FacetRange.of();
        value.setMax(0.4280588);
        Assertions.assertThat(value.getMax()).isEqualTo(0.4280588);
    }

    @Test
    public void mean() {
        FacetRange value = FacetRange.of();
        value.setMean(0.49018955);
        Assertions.assertThat(value.getMean()).isEqualTo(0.49018955);
    }
}
