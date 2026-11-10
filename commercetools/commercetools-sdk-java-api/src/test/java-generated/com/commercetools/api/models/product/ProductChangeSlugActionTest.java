
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductChangeSlugActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductChangeSlugActionBuilder builder) {
        ProductChangeSlugAction productChangeSlugAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeSlugAction).isInstanceOf(ProductChangeSlugAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "slug",
                        ProductChangeSlugAction.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductChangeSlugAction.builder().staged(true) } };
    }

    @Test
    public void slug() {
        ProductChangeSlugAction value = ProductChangeSlugAction.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductChangeSlugAction value = ProductChangeSlugAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
