
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductLabelBuilder builder) {
        ProductLabel productLabel = builder.buildUnchecked();
        Assertions.assertThat(productLabel).isInstanceOf(ProductLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "slug",
                        ProductLabel.builder()
                                .slug(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "name", ProductLabel.builder()
                        .name(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        ProductLabel value = ProductLabel.of();
        value.setSlug(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void name() {
        ProductLabel value = ProductLabel.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
