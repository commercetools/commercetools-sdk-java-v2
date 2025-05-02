
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewResourceIdentifierBuilder builder) {
        ReviewResourceIdentifier reviewResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(reviewResourceIdentifier).isInstanceOf(ReviewResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ReviewResourceIdentifier.builder().id("id") },
                new Object[] { "key", ReviewResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ReviewResourceIdentifier value = ReviewResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ReviewResourceIdentifier value = ReviewResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
