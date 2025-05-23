
package com.commercetools.api.models.shipping_method;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodBuilder builder) {
        ShippingMethod shippingMethod = builder.buildUnchecked();
        Assertions.assertThat(shippingMethod).isInstanceOf(ShippingMethod.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ShippingMethod.builder().id("id") },
                new Object[] { "version", ShippingMethod.builder().version(2L) },
                new Object[] { "createdAt",
                        ShippingMethod.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        ShippingMethod.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        ShippingMethod.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        ShippingMethod.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", ShippingMethod.builder().key("key") },
                new Object[] { "name", ShippingMethod.builder().name("name") },
                new Object[] { "localizedName",
                        ShippingMethod.builder()
                                .localizedName(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description", ShippingMethod.builder().description("description") },
                new Object[] { "localizedDescription",
                        ShippingMethod.builder()
                                .localizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "taxCategory", ShippingMethod.builder()
                        .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl()) },
                new Object[] { "zoneRates",
                        ShippingMethod.builder()
                                .zoneRates(Collections.singletonList(
                                    new com.commercetools.api.models.shipping_method.ZoneRateImpl())) },
                new Object[] { "active", ShippingMethod.builder().active(true) },
                new Object[] { "isDefault", ShippingMethod.builder().isDefault(true) },
                new Object[] { "predicate", ShippingMethod.builder().predicate("predicate") }, new Object[] { "custom",
                        ShippingMethod.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        ShippingMethod value = ShippingMethod.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ShippingMethod value = ShippingMethod.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ShippingMethod value = ShippingMethod.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        ShippingMethod value = ShippingMethod.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ShippingMethod value = ShippingMethod.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        ShippingMethod value = ShippingMethod.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        ShippingMethod value = ShippingMethod.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ShippingMethod value = ShippingMethod.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void localizedName() {
        ShippingMethod value = ShippingMethod.of();
        value.setLocalizedName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ShippingMethod value = ShippingMethod.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void localizedDescription() {
        ShippingMethod value = ShippingMethod.of();
        value.setLocalizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void taxCategory() {
        ShippingMethod value = ShippingMethod.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl());
    }

    @Test
    public void zoneRates() {
        ShippingMethod value = ShippingMethod.of();
        value.setZoneRates(Collections.singletonList(new com.commercetools.api.models.shipping_method.ZoneRateImpl()));
        Assertions.assertThat(value.getZoneRates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.shipping_method.ZoneRateImpl()));
    }

    @Test
    public void active() {
        ShippingMethod value = ShippingMethod.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }

    @Test
    public void isDefault() {
        ShippingMethod value = ShippingMethod.of();
        value.setIsDefault(true);
        Assertions.assertThat(value.getIsDefault()).isEqualTo(true);
    }

    @Test
    public void predicate() {
        ShippingMethod value = ShippingMethod.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void custom() {
        ShippingMethod value = ShippingMethod.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
