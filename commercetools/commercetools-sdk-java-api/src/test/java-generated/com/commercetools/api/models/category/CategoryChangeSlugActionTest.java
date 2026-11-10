
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryChangeSlugActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryChangeSlugActionBuilder builder) {
        CategoryChangeSlugAction categoryChangeSlugAction = builder.buildUnchecked();
        Assertions.assertThat(categoryChangeSlugAction).isInstanceOf(CategoryChangeSlugAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "slug", CategoryChangeSlugAction.builder()
                .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        CategoryChangeSlugAction value = CategoryChangeSlugAction.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
