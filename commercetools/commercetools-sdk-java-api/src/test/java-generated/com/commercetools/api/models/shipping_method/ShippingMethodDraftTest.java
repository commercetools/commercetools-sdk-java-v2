
package com.commercetools.api.models.shipping_method;

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
public class ShippingMethodDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodDraftBuilder builder) {
        ShippingMethodDraft shippingMethodDraft = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodDraft).isInstanceOf(ShippingMethodDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodDraft.builder().key("key") },
                new Object[] { ShippingMethodDraft.builder().name("name") },
                new Object[] { ShippingMethodDraft.builder()
                        .localizedName(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ShippingMethodDraft.builder().description("description") },
                new Object[] { ShippingMethodDraft.builder()
                        .localizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ShippingMethodDraft.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { ShippingMethodDraft.builder()
                        .zoneRates(Collections
                                .singletonList(new com.commercetools.api.models.shipping_method.ZoneRateDraftImpl())) },
                new Object[] { ShippingMethodDraft.builder().active(true) },
                new Object[] { ShippingMethodDraft.builder().isDefault(true) },
                new Object[] { ShippingMethodDraft.builder().predicate("predicate") },
                new Object[] { ShippingMethodDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void localizedName() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setLocalizedName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedName())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void localizedDescription() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setLocalizedDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void taxCategory() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void zoneRates() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setZoneRates(
            Collections.singletonList(new com.commercetools.api.models.shipping_method.ZoneRateDraftImpl()));
        Assertions.assertThat(value.getZoneRates())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.shipping_method.ZoneRateDraftImpl()));
    }

    @Test
    public void active() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }

    @Test
    public void isDefault() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setIsDefault(true);
        Assertions.assertThat(value.getIsDefault()).isEqualTo(true);
    }

    @Test
    public void predicate() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void custom() {
        ShippingMethodDraft value = ShippingMethodDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
