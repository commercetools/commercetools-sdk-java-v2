
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartImpl.class)
public interface Cart extends BaseResource, com.commercetools.api.models.DomainResource<Cart> {

    /**
    *  <p>The unique ID of the cart.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-specific unique identifier of the cart.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The current version of the cart.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @JsonProperty("customerId")
    public String getCustomerId();

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
    *  <p>Identifies carts and orders belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
    *  <p>The sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists).
    *  <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
    *  <p>Not set until the shipping address is set.
    *  Will be set automatically in the <code>Platform</code> TaxMode.
    *  For the <code>External</code> tax mode it will be set  as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
    */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    @NotNull
    @JsonProperty("cartState")
    public CartState getCartState();

    /**
    *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
    */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
    *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
    */
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
    *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
    */
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
    *  <p>Set automatically when the customer is set and the customer is a member of a customer group.
    *  Used for product variant
    *  price selection.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
    *  Used for product variant price selection.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Set automatically once the ShippingMethod is set.</p>
    */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    @Valid
    @JsonProperty("discountCodes")
    public List<DiscountCodeInfo> getDiscountCodes();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    @JsonProperty("locale")
    public String getLocale();

    /**
    *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.</p>
    */

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    /**
    *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from the cart.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("refusedGifts")
    public List<CartDiscountReference> getRefusedGifts();

    /**
    *  <p>The origin field indicates how this cart was created.
    *  The value <code>Customer</code> indicates, that the cart was created by the customer.</p>
    */
    @NotNull
    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
    *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.</p>
    */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
    *  <p>Contains addresses for carts with multiple shipping addresses.
    *  Line items reference these addresses under their <code>shippingDetails</code>.
    *  The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate.
    *  Only the cart's <code>shippingAddress</code> is used for this.</p>
    */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    public void setId(final String id);

    public void setKey(final String key);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setCustomerId(final String customerId);

    public void setCustomerEmail(final String customerEmail);

    public void setAnonymousId(final String anonymousId);

    public void setStore(final StoreKeyReference store);

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    public void setLineItems(final List<LineItem> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setCartState(final CartState cartState);

    public void setShippingAddress(final Address shippingAddress);

    public void setBillingAddress(final Address billingAddress);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setTaxMode(final TaxMode taxMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setCountry(final String country);

    public void setShippingInfo(final ShippingInfo shippingInfo);

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

    public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);

    public void setCustom(final CustomFields custom);

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    public void setLocale(final String locale);

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    @JsonIgnore
    public void setRefusedGifts(final CartDiscountReference... refusedGifts);

    public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);

    public void setOrigin(final CartOrigin origin);

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    public static Cart of() {
        return new CartImpl();
    }

    public static Cart of(final Cart template) {
        CartImpl instance = new CartImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setCartState(template.getCartState());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCountry(template.getCountry());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setCustom(template.getCustom());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setLocale(template.getLocale());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setRefusedGifts(template.getRefusedGifts());
        instance.setOrigin(template.getOrigin());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        return instance;
    }

    public static CartBuilder builder() {
        return CartBuilder.of();
    }

    public static CartBuilder builder(final Cart template) {
        return CartBuilder.of(template);
    }

    default <T> T withCart(Function<Cart, T> helper) {
        return helper.apply(this);
    }
}
