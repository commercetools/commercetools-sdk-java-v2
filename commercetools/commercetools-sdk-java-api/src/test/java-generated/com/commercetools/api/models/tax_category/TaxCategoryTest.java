
package com.commercetools.api.models.tax_category;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryBuilder builder) {
        TaxCategory taxCategory = builder.buildUnchecked();
        Assertions.assertThat(taxCategory).isInstanceOf(TaxCategory.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", TaxCategory.builder().id("id") },
                new Object[] { "version", TaxCategory.builder().version(2L) },
                new Object[] { "createdAt", TaxCategory.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        TaxCategory.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        TaxCategory.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        TaxCategory.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "name", TaxCategory.builder().name("name") },
                new Object[] { "description", TaxCategory.builder().description("description") },
                new Object[] { "rates",
                        TaxCategory.builder()
                                .rates(Collections
                                        .singletonList(new com.commercetools.api.models.tax_category.TaxRateImpl())) },
                new Object[] { "key", TaxCategory.builder().key("key") } };
    }

    @Test
    public void id() {
        TaxCategory value = TaxCategory.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        TaxCategory value = TaxCategory.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        TaxCategory value = TaxCategory.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        TaxCategory value = TaxCategory.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        TaxCategory value = TaxCategory.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        TaxCategory value = TaxCategory.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        TaxCategory value = TaxCategory.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        TaxCategory value = TaxCategory.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void rates() {
        TaxCategory value = TaxCategory.of();
        value.setRates(Collections.singletonList(new com.commercetools.api.models.tax_category.TaxRateImpl()));
        Assertions.assertThat(value.getRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.tax_category.TaxRateImpl()));
    }

    @Test
    public void key() {
        TaxCategory value = TaxCategory.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
