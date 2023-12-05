
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionBuilder builder) {
        ProductSelection productSelection = builder.buildUnchecked();
        Assertions.assertThat(productSelection).isInstanceOf(ProductSelection.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelection.builder().id("id") },
                new Object[] { ProductSelection.builder().version(2L) },
                new Object[] { ProductSelection.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductSelection.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ProductSelection.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] {
                        ProductSelection.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { ProductSelection.builder().key("key") },
                new Object[] { ProductSelection.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductSelection.builder().productCount(1) },
                new Object[] { ProductSelection.builder()
                        .mode(com.commercetools.api.models.product_selection.ProductSelectionMode
                                .findEnum("Individual")) },
                new Object[] {
                        ProductSelection.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        ProductSelection value = ProductSelection.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ProductSelection value = ProductSelection.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ProductSelection value = ProductSelection.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ProductSelection value = ProductSelection.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ProductSelection value = ProductSelection.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ProductSelection value = ProductSelection.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        ProductSelection value = ProductSelection.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductSelection value = ProductSelection.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void productCount() {
        ProductSelection value = ProductSelection.of();
        value.setProductCount(1);
        Assertions.assertThat(value.getProductCount()).isEqualTo(1);
    }

    @Test
    public void mode() {
        ProductSelection value = ProductSelection.of();
        value.setMode(com.commercetools.api.models.product_selection.ProductSelectionMode.findEnum("Individual"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.product_selection.ProductSelectionMode.findEnum("Individual"));
    }

    @Test
    public void custom() {
        ProductSelection value = ProductSelection.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
