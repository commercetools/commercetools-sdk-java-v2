
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetLocaleActionBuilder builder) {
        ReviewSetLocaleAction reviewSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetLocaleAction).isInstanceOf(ReviewSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", ReviewSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        ReviewSetLocaleAction value = ReviewSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
