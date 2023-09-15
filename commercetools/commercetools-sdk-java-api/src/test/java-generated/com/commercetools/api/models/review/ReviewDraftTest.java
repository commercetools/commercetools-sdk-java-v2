
package com.commercetools.api.models.review;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ReviewDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewDraftBuilder builder) {
        ReviewDraft reviewDraft = builder.buildUnchecked();
        Assertions.assertThat(reviewDraft).isInstanceOf(ReviewDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewDraft.builder().key("key") },
                new Object[] { ReviewDraft.builder().uniquenessValue("uniquenessValue") },
                new Object[] { ReviewDraft.builder().locale("locale") },
                new Object[] { ReviewDraft.builder().authorName("authorName") },
                new Object[] { ReviewDraft.builder().title("title") },
                new Object[] { ReviewDraft.builder().text("text") },
                new Object[] { ReviewDraft.builder()
                        .target(new com.commercetools.api.models.common.ResourceIdentifierImpl()) },
                new Object[] { ReviewDraft.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { ReviewDraft.builder().rating(5) },
                new Object[] { ReviewDraft.builder()
                        .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] {
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
