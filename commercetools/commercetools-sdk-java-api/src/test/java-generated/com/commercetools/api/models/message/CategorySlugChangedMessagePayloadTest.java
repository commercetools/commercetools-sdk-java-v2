
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategorySlugChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategorySlugChangedMessagePayloadBuilder builder) {
        CategorySlugChangedMessagePayload categorySlugChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(categorySlugChangedMessagePayload).isInstanceOf(CategorySlugChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "slug",
                        CategorySlugChangedMessagePayload.builder()
                                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "oldSlug", CategorySlugChangedMessagePayload.builder()
                        .oldSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        CategorySlugChangedMessagePayload value = CategorySlugChangedMessagePayload.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldSlug() {
        CategorySlugChangedMessagePayload value = CategorySlugChangedMessagePayload.of();
        value.setOldSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
