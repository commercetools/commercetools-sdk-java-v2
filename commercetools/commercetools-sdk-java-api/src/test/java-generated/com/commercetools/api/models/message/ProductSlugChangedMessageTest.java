
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSlugChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSlugChangedMessageBuilder builder) {
        ProductSlugChangedMessage productSlugChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(productSlugChangedMessage).isInstanceOf(ProductSlugChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "slug",
                        ProductSlugChangedMessage.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldSlug", ProductSlugChangedMessage.builder()
                        .oldSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        ProductSlugChangedMessage value = ProductSlugChangedMessage.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldSlug() {
        ProductSlugChangedMessage value = ProductSlugChangedMessage.of();
        value.setOldSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
