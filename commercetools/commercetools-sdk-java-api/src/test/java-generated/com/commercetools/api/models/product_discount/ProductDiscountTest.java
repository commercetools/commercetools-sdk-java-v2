
package com.commercetools.api.models.product_discount;

import java.time.ZonedDateTime;
import java.util.Collections;

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
public class ProductDiscountTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountBuilder builder) {
        ProductDiscount productDiscount = builder.buildUnchecked();
        Assertions.assertThat(productDiscount).isInstanceOf(ProductDiscount.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscount.builder().id("id") },
                new Object[] { ProductDiscount.builder().version(2L) },
                new Object[] { ProductDiscount.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductDiscount.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductDiscount.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        ProductDiscount.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] {
                        ProductDiscount.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDiscount.builder().key("key") },
                new Object[] { ProductDiscount.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDiscount.builder()
                        .value(new com.commercetools.api.models.product_discount.ProductDiscountValueImpl()) },
                new Object[] { ProductDiscount.builder().predicate("predicate") },
                new Object[] { ProductDiscount.builder().sortOrder("sortOrder") },
                new Object[] { ProductDiscount.builder().isActive(true) },
                new Object[] {
                        ProductDiscount.builder()
                                .references(Collections
                                        .singletonList(new com.commercetools.api.models.common.ReferenceImpl())) },
                new Object[] { ProductDiscount.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductDiscount.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        ProductDiscount value = ProductDiscount.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductDiscount value = ProductDiscount.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ProductDiscount value = ProductDiscount.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ProductDiscount value = ProductDiscount.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ProductDiscount value = ProductDiscount.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ProductDiscount value = ProductDiscount.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        ProductDiscount value = ProductDiscount.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        ProductDiscount value = ProductDiscount.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        ProductDiscount value = ProductDiscount.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void value() {
        ProductDiscount value = ProductDiscount.of();
        value.setValue(new com.commercetools.api.models.product_discount.ProductDiscountValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountValueImpl());
    }

    @Test
    public void predicate() {
        ProductDiscount value = ProductDiscount.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void sortOrder() {
        ProductDiscount value = ProductDiscount.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void isActive() {
        ProductDiscount value = ProductDiscount.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void references() {
        ProductDiscount value = ProductDiscount.of();
        value.setReferences(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getReferences())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
    }

    @Test
    public void validFrom() {
        ProductDiscount value = ProductDiscount.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        ProductDiscount value = ProductDiscount.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
