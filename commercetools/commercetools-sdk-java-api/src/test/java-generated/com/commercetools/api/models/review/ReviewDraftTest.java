
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewDraftBuilder builder) {
        ReviewDraft reviewDraft = builder.buildUnchecked();
        Assertions.assertThat(reviewDraft).isInstanceOf(ReviewDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ReviewDraft.builder().key("key") },
                new Object[] { "uniquenessValue", ReviewDraft.builder().uniquenessValue("uniquenessValue") },
                new Object[] { "locale", ReviewDraft.builder().locale("locale") },
                new Object[] { "authorName", ReviewDraft.builder().authorName("authorName") },
                new Object[] { "title", ReviewDraft.builder().title("title") },
                new Object[] { "text", ReviewDraft.builder().text("text") },
                new Object[] { "target",
                        ReviewDraft.builder()
                                .target(new com.commercetools.api.models.common.ResourceIdentifierImpl()) },
                new Object[] { "state",
                        ReviewDraft.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "rating", ReviewDraft.builder().rating(5) },
                new Object[] { "customer",
                        ReviewDraft.builder()
                                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { "custom",
                        ReviewDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        ReviewDraft value = ReviewDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void uniquenessValue() {
        ReviewDraft value = ReviewDraft.of();
        value.setUniquenessValue("uniquenessValue");
        Assertions.assertThat(value.getUniquenessValue()).isEqualTo("uniquenessValue");
    }

    @Test
    public void locale() {
        ReviewDraft value = ReviewDraft.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void authorName() {
        ReviewDraft value = ReviewDraft.of();
        value.setAuthorName("authorName");
        Assertions.assertThat(value.getAuthorName()).isEqualTo("authorName");
    }

    @Test
    public void title() {
        ReviewDraft value = ReviewDraft.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void text() {
        ReviewDraft value = ReviewDraft.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }

    @Test
    public void target() {
        ReviewDraft value = ReviewDraft.of();
        value.setTarget(new com.commercetools.api.models.common.ResourceIdentifierImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.common.ResourceIdentifierImpl());
    }

    @Test
    public void state() {
        ReviewDraft value = ReviewDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void rating() {
        ReviewDraft value = ReviewDraft.of();
        value.setRating(5);
        Assertions.assertThat(value.getRating()).isEqualTo(5);
    }

    @Test
    public void customer() {
        ReviewDraft value = ReviewDraft.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void custom() {
        ReviewDraft value = ReviewDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
