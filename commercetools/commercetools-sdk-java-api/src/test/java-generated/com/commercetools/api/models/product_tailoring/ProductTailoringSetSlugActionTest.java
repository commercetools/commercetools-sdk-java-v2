
package com.commercetools.api.models.product_tailoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringSetSlugActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringSetSlugActionBuilder builder) {
        ProductTailoringSetSlugAction productTailoringSetSlugAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetSlugAction).isInstanceOf(ProductTailoringSetSlugAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "slug",
                        ProductTailoringSetSlugAction.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "staged", ProductTailoringSetSlugAction.builder().staged(true) } };
    }

    @Test
    public void slug() {
        ProductTailoringSetSlugAction value = ProductTailoringSetSlugAction.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductTailoringSetSlugAction value = ProductTailoringSetSlugAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
