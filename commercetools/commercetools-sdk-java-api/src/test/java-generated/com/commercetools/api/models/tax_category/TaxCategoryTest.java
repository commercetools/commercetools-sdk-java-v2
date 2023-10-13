
package com.commercetools.api.models.tax_category;

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
public class TaxCategoryTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryBuilder builder) {
        TaxCategory taxCategory = builder.buildUnchecked();
        Assertions.assertThat(taxCategory).isInstanceOf(TaxCategory.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategory.builder().id("id") },
                new Object[] { TaxCategory.builder().version(2L) },
                new Object[] { TaxCategory.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { TaxCategory.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { TaxCategory.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        TaxCategory.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { TaxCategory.builder().name("name") },
                new Object[] { TaxCategory.builder().description("description") },
                new Object[] {
                        TaxCategory.builder()
                                .rates(Collections
                                        .singletonList(new com.commercetools.api.models.tax_category.TaxRateImpl())) },
                new Object[] { TaxCategory.builder().key("key") } };
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
