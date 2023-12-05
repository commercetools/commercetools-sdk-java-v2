
package com.commercetools.api.models.review;

import java.time.ZonedDateTime;

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
public class ReviewTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewBuilder builder) {
        Review review = builder.buildUnchecked();
        Assertions.assertThat(review).isInstanceOf(Review.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Review.builder().id("id") },
                new Object[] { Review.builder().version(2L) },
                new Object[] { Review.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Review.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        Review.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { Review.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { Review.builder().key("key") },
                new Object[] { Review.builder().uniquenessValue("uniquenessValue") },
                new Object[] { Review.builder().locale("locale") },
                new Object[] { Review.builder().authorName("authorName") },
                new Object[] { Review.builder().title("title") }, new Object[] { Review.builder().text("text") },
                new Object[] { Review.builder().target(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { Review.builder().includedInStatistics(true) },
                new Object[] { Review.builder().rating(5) },
                new Object[] { Review.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] {
                        Review.builder().customer(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { Review.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        Review value = Review.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Review value = Review.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Review value = Review.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Review value = Review.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Review value = Review.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Review value = Review.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Review value = Review.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void uniquenessValue() {
        Review value = Review.of();
        value.setUniquenessValue("uniquenessValue");
        Assertions.assertThat(value.getUniquenessValue()).isEqualTo("uniquenessValue");
    }

    @Test
    public void locale() {
        Review value = Review.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void authorName() {
        Review value = Review.of();
        value.setAuthorName("authorName");
        Assertions.assertThat(value.getAuthorName()).isEqualTo("authorName");
    }

    @Test
    public void title() {
        Review value = Review.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void text() {
        Review value = Review.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }

    @Test
    public void target() {
        Review value = Review.of();
        value.setTarget(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getTarget()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void includedInStatistics() {
        Review value = Review.of();
        value.setIncludedInStatistics(true);
        Assertions.assertThat(value.getIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void rating() {
        Review value = Review.of();
        value.setRating(5);
        Assertions.assertThat(value.getRating()).isEqualTo(5);
    }

    @Test
    public void state() {
        Review value = Review.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void customer() {
        Review value = Review.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void custom() {
        Review value = Review.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
