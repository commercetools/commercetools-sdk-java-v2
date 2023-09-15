
package com.commercetools.api.models.cart;

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
public class CartTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartBuilder builder) {
        Cart cart = builder.buildUnchecked();
        Assertions.assertThat(cart).isInstanceOf(Cart.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Cart.builder().id("id") }, new Object[] { Cart.builder().version(2L) },
                new Object[] { Cart.builder().key("key") }, new Object[] { Cart.builder().customerId("customerId") },
                new Object[] { Cart.builder().customerEmail("customerEmail") },
                new Object[] { Cart.builder()
                        .customerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl()) },
                new Object[] { Cart.builder().anonymousId("anonymousId") },
                new Object[] { Cart.builder()
                        .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { Cart.builder().store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) },
                new Object[] { Cart.builder()
                        .lineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl())) },
                new Object[] {
                        Cart.builder()
                                .customLineItems(Collections
                                        .singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl())) },
                new Object[] { Cart.builder().totalLineItemQuantity(6L) },
                new Object[] {
                        Cart.builder().totalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { Cart.builder().taxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] {
                        Cart.builder().taxedShippingPrice(new com.commercetools.api.models.cart.TaxedPriceImpl()) },
                new Object[] { Cart.builder().taxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform")) },
                new Object[] { Cart.builder()
                        .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { Cart.builder()
                        .taxCalculationMode(
                            com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel")) },
                new Object[] { Cart.builder()
                        .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) },
                new Object[] {
                        Cart.builder().cartState(com.commercetools.api.models.cart.CartState.findEnum("Active")) },
                new Object[] { Cart.builder().billingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { Cart.builder().shippingAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { Cart.builder()
                        .shippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single")) },
                new Object[] { Cart.builder().shippingKey("shippingKey") },
                new Object[] { Cart.builder().shippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl()) },
                new Object[] { Cart.builder()
                        .shippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl()) },
                new Object[] {
                        Cart.builder().shippingCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { Cart.builder()
                        .shipping(Collections.singletonList(new com.commercetools.api.models.cart.ShippingImpl())) },
                new Object[] { Cart.builder()
                        .itemShippingAddresses(
                            Collections.singletonList(new com.commercetools.api.models.common.AddressImpl())) },
                new Object[] {
                        Cart.builder()
                                .discountCodes(Collections
                                        .singletonList(new com.commercetools.api.models.cart.DiscountCodeInfoImpl())) },
                new Object[] {
                        Cart.builder()
                                .directDiscounts(Collections
                                        .singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl())) },
                new Object[] { Cart.builder()
                        .refusedGifts(Collections.singletonList(
                            new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl())) },
                new Object[] { Cart.builder().paymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl()) },
                new Object[] { Cart.builder().country("country") }, new Object[] { Cart.builder().locale("locale") },
                new Object[] {
                        Cart.builder().origin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer")) },
                new Object[] { Cart.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { Cart.builder().deleteDaysAfterLastModification(3) },
                new Object[] { Cart.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Cart.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        Cart.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { Cart.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) } };
    }

    @Test
    public void id() {
        Cart value = Cart.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Cart value = Cart.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        Cart value = Cart.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customerId() {
        Cart value = Cart.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void customerEmail() {
        Cart value = Cart.of();
        value.setCustomerEmail("customerEmail");
        Assertions.assertThat(value.getCustomerEmail()).isEqualTo("customerEmail");
    }

    @Test
    public void customerGroup() {
        Cart value = Cart.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupReferenceImpl());
    }

    @Test
    public void anonymousId() {
        Cart value = Cart.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }

    @Test
    public void businessUnit() {
        Cart value = Cart.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void store() {
        Cart value = Cart.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }

    @Test
    public void lineItems() {
        Cart value = Cart.of();
        value.setLineItems(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
        Assertions.assertThat(value.getLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.LineItemImpl()));
    }

    @Test
    public void customLineItems() {
        Cart value = Cart.of();
        value.setCustomLineItems(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
        Assertions.assertThat(value.getCustomLineItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CustomLineItemImpl()));
    }

    @Test
    public void totalLineItemQuantity() {
        Cart value = Cart.of();
        value.setTotalLineItemQuantity(6L);
        Assertions.assertThat(value.getTotalLineItemQuantity()).isEqualTo(6L);
    }

    @Test
    public void totalPrice() {
        Cart value = Cart.of();
        value.setTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        Cart value = Cart.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice()).isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void taxedShippingPrice() {
        Cart value = Cart.of();
        value.setTaxedShippingPrice(new com.commercetools.api.models.cart.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedShippingPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedPriceImpl());
    }

    @Test
    public void taxMode() {
        Cart value = Cart.of();
        value.setTaxMode(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxMode.findEnum("Platform"));
    }

    @Test
    public void taxRoundingMode() {
        Cart value = Cart.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxCalculationMode() {
        Cart value = Cart.of();
        value.setTaxCalculationMode(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
        Assertions.assertThat(value.getTaxCalculationMode())
                .isEqualTo(com.commercetools.api.models.cart.TaxCalculationMode.findEnum("LineItemLevel"));
    }

    @Test
    public void inventoryMode() {
        Cart value = Cart.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }

    @Test
    public void cartState() {
        Cart value = Cart.of();
        value.setCartState(com.commercetools.api.models.cart.CartState.findEnum("Active"));
        Assertions.assertThat(value.getCartState())
                .isEqualTo(com.commercetools.api.models.cart.CartState.findEnum("Active"));
    }

    @Test
    public void billingAddress() {
        Cart value = Cart.of();
        value.setBillingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getBillingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingAddress() {
        Cart value = Cart.of();
        value.setShippingAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getShippingAddress())
                .isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingMode() {
        Cart value = Cart.of();
        value.setShippingMode(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
        Assertions.assertThat(value.getShippingMode())
                .isEqualTo(com.commercetools.api.models.cart.ShippingMode.findEnum("Single"));
    }

    @Test
    public void shippingKey() {
        Cart value = Cart.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void shippingInfo() {
        Cart value = Cart.of();
        value.setShippingInfo(new com.commercetools.api.models.cart.ShippingInfoImpl());
        Assertions.assertThat(value.getShippingInfo())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingInfoImpl());
    }

    @Test
    public void shippingRateInput() {
        Cart value = Cart.of();
        value.setShippingRateInput(new com.commercetools.api.models.cart.ShippingRateInputImpl());
        Assertions.assertThat(value.getShippingRateInput())
                .isEqualTo(new com.commercetools.api.models.cart.ShippingRateInputImpl());
    }

    @Test
    public void shippingCustomFields() {
        Cart value = Cart.of();
        value.setShippingCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getShippingCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void shipping() {
        Cart value = Cart.of();
        value.setShipping(Collections.singletonList(new com.commercetools.api.models.cart.ShippingImpl()));
        Assertions.assertThat(value.getShipping())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ShippingImpl()));
    }

    @Test
    public void itemShippingAddresses() {
        Cart value = Cart.of();
        value.setItemShippingAddresses(
            Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
        Assertions.assertThat(value.getItemShippingAddresses())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AddressImpl()));
    }

    @Test
    public void discountCodes() {
        Cart value = Cart.of();
        value.setDiscountCodes(Collections.singletonList(new com.commercetools.api.models.cart.DiscountCodeInfoImpl()));
        Assertions.assertThat(value.getDiscountCodes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DiscountCodeInfoImpl()));
    }

    @Test
    public void directDiscounts() {
        Cart value = Cart.of();
        value.setDirectDiscounts(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
        Assertions.assertThat(value.getDirectDiscounts())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.DirectDiscountImpl()));
    }

    @Test
    public void refusedGifts() {
        Cart value = Cart.of();
        value.setRefusedGifts(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl()));
        Assertions.assertThat(value.getRefusedGifts())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountReferenceImpl()));
    }

    @Test
    public void paymentInfo() {
        Cart value = Cart.of();
        value.setPaymentInfo(new com.commercetools.api.models.order.PaymentInfoImpl());
        Assertions.assertThat(value.getPaymentInfo())
                .isEqualTo(new com.commercetools.api.models.order.PaymentInfoImpl());
    }

    @Test
    public void country() {
        Cart value = Cart.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void locale() {
        Cart value = Cart.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }

    @Test
    public void origin() {
        Cart value = Cart.of();
        value.setOrigin(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
        Assertions.assertThat(value.getOrigin())
                .isEqualTo(com.commercetools.api.models.cart.CartOrigin.findEnum("Customer"));
    }

    @Test
    public void custom() {
        Cart value = Cart.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void deleteDaysAfterLastModification() {
        Cart value = Cart.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }

    @Test
    public void createdAt() {
        Cart value = Cart.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Cart value = Cart.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Cart value = Cart.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Cart value = Cart.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }
}
