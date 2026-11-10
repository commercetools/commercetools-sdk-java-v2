
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewLabelBuilder builder) {
        ReviewLabel reviewLabel = builder.buildUnchecked();
        Assertions.assertThat(reviewLabel).isInstanceOf(ReviewLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ReviewLabel.builder().key("key") },
                new Object[] { "title", ReviewLabel.builder().title("title") } };
    }

    @Test
    public void key() {
        ReviewLabel value = ReviewLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void title() {
        ReviewLabel value = ReviewLabel.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
