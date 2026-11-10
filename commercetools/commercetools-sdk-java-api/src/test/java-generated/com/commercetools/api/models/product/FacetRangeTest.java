
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FacetRangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FacetRangeBuilder builder) {
        FacetRange facetRange = builder.buildUnchecked();
        Assertions.assertThat(facetRange).isInstanceOf(FacetRange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "from", FacetRange.builder().from(0.470235) },
                new Object[] { "fromStr", FacetRange.builder().fromStr("fromStr") },
                new Object[] { "to", FacetRange.builder().to(0.061924815) },
                new Object[] { "toStr", FacetRange.builder().toStr("toStr") },
                new Object[] { "count", FacetRange.builder().count(2L) },
                new Object[] { "productCount", FacetRange.builder().productCount(1L) },
                new Object[] { "total", FacetRange.builder().total(0.60145235) },
                new Object[] { "min", FacetRange.builder().min(0.34761357) },
                new Object[] { "max", FacetRange.builder().max(0.4280588) },
                new Object[] { "mean", FacetRange.builder().mean(0.49018955) } };
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
