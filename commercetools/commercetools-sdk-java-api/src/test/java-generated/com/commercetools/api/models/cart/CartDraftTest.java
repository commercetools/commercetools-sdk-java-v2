
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDraftBuilder builder) {
        CartDraft cartDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDraft).isInstanceOf(CartDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "currency", CartDraft.builder().currency("currency") },
                new Object[] { "key", CartDraft.builder().key("key") },
                new Object[] { "customerId", CartDraft.builder().customerId("customerId") },
                new Object[] { "customerEmail", CartDraft.builder().customerEmail("customerEmail") },
                new Object[] { "customerGroup", CartDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) },
                new Object[] { "anonymousId", CartDraft.builder().anonymousId("anonymousId") },
                new Object[] { "businessUnit", CartDraft.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { "store",
                        CartDraft.builder()
                                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) },
                new Object[] { "lineItems",
                        CartDraft.builder()
                                .lineItems(Collections
                                        .singletonList(new com.commercetools.api.models.cart.LineItemDraftImpl())) },
                new Object[] { "customLineItems",
                        CartDraft.builder()
                                .customLineItems(Collections.singletonList(
                                    new com.commercetools.api.models.cart.CustomLineItemDraftImpl())) },
                new Object[] { "taxMode",
                        CartDraft.builder().taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) },
                new Object[] { "externalTaxRateForShippingMethod",
                        CartDraft.builder()
                                .externalTaxRateForShippingMethod(
                                    new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "priceRoundingMode", CartDraft.builder()
                        .priceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxRoundingMode",
                        CartDraft.builder()
                                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxCalculationMode",
                        CartDraft.builder()
                                .taxCalculationMode(
                                    com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) },
                new Object[] { "inventoryMode",
                        CartDraft.builder()
                                .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] { "billingAddress",
                        CartDraft.builder().billingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingAddress",
                        CartDraft.builder()
                                .shippingAddress(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingMethod", CartDraft.builder()
                        .shippingMethod(
                            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl()) },
                new Object[] { "shippingRateInput", CartDraft.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl()) },
                new Object[] { "shippingMode",
                        CartDraft.builder()
                                .shippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single")) },
                new Object[] { "customShipping",
                        CartDraft.builder()
                                .customShipping(Collections.singletonList(
                                    new com.commercetools.api.models.cart.CustomShippingDraftImpl())) },
                new Object[] { "shipping",
                        CartDraft.builder()
                                .shipping(Collections
                                        .singletonList(new com.commercetools.api.models.cart.ShippingDraftImpl())) },
                new Object[] { "itemShippingAddresses",
                        CartDraft.builder()
                                .itemShippingAddresses(Collections
                                        .singletonList(new com.commercetools.api.models.common.BaseAddressImpl())) },
                new Object[] { "discountCodes",
                        CartDraft.builder().discountCodes(Collections.singletonList("discountCodes")) },
                new Object[] { "country", CartDraft.builder().country("country") },
                new Object[] { "locale", CartDraft.builder().locale("locale") },
                new Object[] { "origin",
                        CartDraft.builder().origin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer")) },
                new Object[] { "deleteDaysAfterLastModification",
                        CartDraft.builder().deleteDaysAfterLastModification(3L) },
                new Object[] { "custom",
                        CartDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "purchaseOrderNumber",
                        CartDraft.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void currency() {
        CartDraft value = CartDraft.of();
        value.setCurrency("currency");
        Assertions.assertThat(value.getCurrency()).isEqualTo("currency");
    }

    @Test
    public void key() {
        CartDraft value = CartDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customerId() {
        CartDraft value = CartDraft.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void customerEmail() {
        CartDraft value = CartDraft.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void customerGroup() {
        CartDraft value = CartDraft.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }

    @Test
    public void anonymousId() {
        CartDraft value = CartDraft.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void businessUnit() {
        CartDraft value = CartDraft.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void store() {
        CartDraft value = CartDraft.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }

    @Test
    public void lineItems() {
        CartDraft value = CartDraft.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemDraftImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.LineItemDraftImpl()));
    }

    @Test
    public void customLineItems() {
        CartDraft value = CartDraft.of();
        value.setCustomLineItems(
            Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemDraftImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemDraftImpl()));
    }

    @Test
    public void taxMode() {
        CartDraft value = CartDraft.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }

    @Test
    public void externalTaxRateForShippingMethod() {
        CartDraft value = CartDraft.of();
        value.setExternalTaxRateForShippingMethod(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRateForShippingMethod())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void priceRoundingMode() {
        CartDraft value = CartDraft.of();
        value.setPriceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPriceRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxRoundingMode() {
        CartDraft value = CartDraft.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        CartDraft value = CartDraft.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void inventoryMode() {
        CartDraft value = CartDraft.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void billingAddress() {
        CartDraft value = CartDraft.of();
        value.setBillingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingAddress() {
        CartDraft value = CartDraft.of();
        value.setShippingAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingMethod() {
        CartDraft value = CartDraft.of();
        value.setShippingMethod(
            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
    }

    @Test
    public void shippingRateInput() {
        CartDraft value = CartDraft.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputDraftImpl());
    }

    @Test
    public void shippingMode() {
        CartDraft value = CartDraft.of();
        value.setShippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
        Assertions.assertThat(value.getShippingMode())
                .isEqualTo(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
    }

    @Test
    public void customShipping() {
        CartDraft value = CartDraft.of();
        value.setCustomShipping(
            Collections.singletonList(new com.commercetools.api.models.cart.CustomShippingDraftImpl()));
        Assertions.assertThat(value.getCustomShipping())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CustomShippingDraftImpl()));
    }

    @Test
    public void shipping() {
        CartDraft value = CartDraft.of();
        value.setShipping(Collections.singletonList(new com.commercetools.api.models.cart.ShippingDraftImpl()));
        Assertions.assertThat(value.getShipping())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ShippingDraftImpl()));
    }

    @Test
    public void itemShippingAddresses() {
        CartDraft value = CartDraft.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.BaseAddressImpl()));
    }

    @Test
    public void discountCodes() {
        CartDraft value = CartDraft.of();
        value.setDiscountCodes(Collections.singletonList("discountCodes"));
        Assertions.assertThat(value.getDiscountCodes()).isEqualTo(Collections.singletonList("discountCodes"));
    }

    @Test
    public void country() {
        CartDraft value = CartDraft.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void locale() {
        CartDraft value = CartDraft.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void origin() {
        CartDraft value = CartDraft.of();
        value.setOrigin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
        Assertions.assertThat(value.getOrigin())
                .isEqualTo(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
    }

    @Test
    public void deleteDaysAfterLastModification() {
        CartDraft value = CartDraft.of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }

    @Test
    public void custom() {
        CartDraft value = CartDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void purchaseOrderNumber() {
        CartDraft value = CartDraft.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
