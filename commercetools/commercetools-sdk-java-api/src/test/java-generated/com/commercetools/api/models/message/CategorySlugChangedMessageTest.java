
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySlugChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySlugChangedMessageBuilder builder) {
        CategorySlugChangedMessage categorySlugChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(categorySlugChangedMessage).isInstanceOf(CategorySlugChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "slug",
                        CategorySlugChangedMessage.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldSlug", CategorySlugChangedMessage.builder()
                        .oldSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        CategorySlugChangedMessage value = CategorySlugChangedMessage.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldSlug() {
        CategorySlugChangedMessage value = CategorySlugChangedMessage.of();
        value.setOldSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
