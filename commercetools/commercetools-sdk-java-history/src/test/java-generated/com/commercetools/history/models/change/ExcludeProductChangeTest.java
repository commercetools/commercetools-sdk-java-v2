
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExcludeProductChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExcludeProductChangeBuilder builder) {
        ExcludeProductChange excludeProductChange = builder.buildUnchecked();
        Assertions.assertThat(excludeProductChange).isInstanceOf(ExcludeProductChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ExcludeProductChange.builder().change("change") },
                new Object[] { "variantExclusion", ExcludeProductChange.builder()
                        .variantExclusion(new com.commercetools.history.models.common.ProductVariantExclusionImpl()) },
                new Object[] { "nextValue", ExcludeProductChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        ExcludeProductChange value = ExcludeProductChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void variantExclusion() {
        ExcludeProductChange value = ExcludeProductChange.of();
        value.setVariantExclusion(new com.commercetools.history.models.common.ProductVariantExclusionImpl());
        Assertions.assertThat(value.getVariantExclusion())
                .isEqualTo(new com.commercetools.history.models.common.ProductVariantExclusionImpl());
    }

    @Test
    public void nextValue() {
        ExcludeProductChange value = ExcludeProductChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
