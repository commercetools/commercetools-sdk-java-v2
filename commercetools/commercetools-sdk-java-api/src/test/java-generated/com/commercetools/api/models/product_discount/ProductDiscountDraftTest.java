
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountDraftBuilder builder) {
        ProductDiscountDraft productDiscountDraft = builder.buildUnchecked();
        Assertions.assertThat(productDiscountDraft).isInstanceOf(ProductDiscountDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        ProductDiscountDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", ProductDiscountDraft.builder().key("key") },
                new Object[] { "description",
                        ProductDiscountDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "value", ProductDiscountDraft.builder()
                        .value(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl()) },
                new Object[] { "predicate", ProductDiscountDraft.builder().predicate("predicate") },
                new Object[] { "sortOrder", ProductDiscountDraft.builder().sortOrder("sortOrder") },
                new Object[] { "isActive", ProductDiscountDraft.builder().isActive(true) },
                new Object[] { "validFrom",
                        ProductDiscountDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        ProductDiscountDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void name() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void value() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setValue(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl());
    }

    @Test
    public void predicate() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void sortOrder() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void isActive() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void validFrom() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        ProductDiscountDraft value = ProductDiscountDraft.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
