
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountDraftBuilder builder) {
        ProductDiscountDraft productDiscountDraft = builder.buildUnchecked();
        Assertions.assertThat(productDiscountDraft).isInstanceOf(ProductDiscountDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductDiscountDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDiscountDraft.builder().key("key") },
                new Object[] { ProductDiscountDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDiscountDraft.builder()
                        .value(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl()) },
                new Object[] { ProductDiscountDraft.builder().predicate("predicate") },
                new Object[] { ProductDiscountDraft.builder().sortOrder("sortOrder") },
                new Object[] { ProductDiscountDraft.builder().isActive(true) },
                new Object[] { ProductDiscountDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductDiscountDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
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
