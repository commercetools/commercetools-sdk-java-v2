
package com.commercetools.api.models.quote_request;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DirectDiscount;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * QuoteRequest
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequest quoteRequest = QuoteRequest.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestImpl.class)
public interface QuoteRequest extends BaseResource, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the QuoteRequest.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the QuoteRequest.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the QuoteRequest.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time (UTC) the QuoteRequest was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the QuoteRequest was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the QuoteRequest.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the QuoteRequest.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Indicates the current state of the Quote Request in the negotiation process.</p>
     * @return quoteRequestState
     */
    @NotNull
    @JsonProperty("quoteRequestState")
    public QuoteRequestState getQuoteRequestState();

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @return comment
     */

    @JsonProperty("comment")
    public String getComment();

    /**
     *  <p>The Buyer who owns the request.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote Request creation. Used for Product Variant price selection.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Line Items for which a Quote is requested.</p>
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *  <p>The Custom Line Items for which a Quote is requested.</p>
     * @return customLineItems
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
     *  <p>Address used for invoicing.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
     *  <p>Inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>When calculating total prices on LineItems and CustomLineItems, the selected mode is used for rounding.</p>
     * @return priceRoundingMode
     */
    @NotNull
    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
     * @return taxRoundingMode
     */
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
     * @return taxCalculationMode
     */
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Used for Product Variant price selection.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     * @return paymentInfo
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @return directDiscounts
     */
    @Valid
    @JsonProperty("directDiscounts")
    public List<DirectDiscount> getDirectDiscounts();

    /**
     *  <p>Custom Fields of the Quote Request.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>State of the Quote Request. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>The Cart from which a Quote is requested.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>The BusinessUnit for the Quote Request. Only available for B2B-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Unique identifier of the QuoteRequest.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the QuoteRequest.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the QuoteRequest.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Date and time (UTC) the QuoteRequest was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the QuoteRequest was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the QuoteRequest.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the QuoteRequest.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Indicates the current state of the Quote Request in the negotiation process.</p>
     * @param quoteRequestState value to be set
     */

    public void setQuoteRequestState(final QuoteRequestState quoteRequestState);

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     * @param comment value to be set
     */

    public void setComment(final String comment);

    /**
     *  <p>The Buyer who owns the request.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote Request creation. Used for Product Variant price selection.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>The Line Items for which a Quote is requested.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    /**
     *  <p>The Line Items for which a Quote is requested.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItem> lineItems);

    /**
     *  <p>The Custom Line Items for which a Quote is requested.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    /**
     *  <p>The Custom Line Items for which a Quote is requested.</p>
     * @param customLineItems values to be set
     */

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final TypedMoney totalPrice);

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final Address shippingAddress);

    /**
     *  <p>Address used for invoicing.</p>
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final Address billingAddress);

    /**
     *  <p>Inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>When calculating total prices on LineItems and CustomLineItems, the selected mode is used for rounding.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
     * @param taxCalculationMode value to be set
     */

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    /**
     *  <p>Used for Product Variant price selection.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfo shippingInfo);

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     * @param paymentInfo value to be set
     */

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param directDiscounts values to be set
     */

    @JsonIgnore
    public void setDirectDiscounts(final DirectDiscount... directDiscounts);

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     * @param directDiscounts values to be set
     */

    public void setDirectDiscounts(final List<DirectDiscount> directDiscounts);

    /**
     *  <p>Custom Fields of the Quote Request.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>State of the Quote Request. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>The Cart from which a Quote is requested.</p>
     * @param cart value to be set
     */

    public void setCart(final CartReference cart);

    /**
     *  <p>The BusinessUnit for the Quote Request. Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     * factory method
     * @return instance of QuoteRequest
     */
    public static QuoteRequest of() {
        return new QuoteRequestImpl();
    }

    /**
     * factory method to create a shallow copy QuoteRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteRequest of(final QuoteRequest template) {
        QuoteRequestImpl instance = new QuoteRequestImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setComment(template.getComment());
        instance.setCustomer(template.getCustomer());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxMode(template.getTaxMode());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setCountry(template.getCountry());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDirectDiscounts(template.getDirectDiscounts());
        instance.setCustom(template.getCustom());
        instance.setState(template.getState());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setCart(template.getCart());
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    public QuoteRequest copyDeep();

    /**
     * factory method to create a deep copy of QuoteRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequest deepCopy(@Nullable final QuoteRequest template) {
        if (template == null) {
            return null;
        }
        QuoteRequestImpl instance = new QuoteRequestImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setQuoteRequestState(template.getQuoteRequestState());
        instance.setComment(template.getComment());
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.LineItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomLineItems(Optional.ofNullable(template.getCustomLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.CustomLineItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalPrice(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setShippingAddress(
            com.commercetools.api.models.common.Address.deepCopy(template.getShippingAddress()));
        instance.setBillingAddress(com.commercetools.api.models.common.Address.deepCopy(template.getBillingAddress()));
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxMode(template.getTaxMode());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setCountry(template.getCountry());
        instance.setShippingInfo(com.commercetools.api.models.cart.ShippingInfo.deepCopy(template.getShippingInfo()));
        instance.setPaymentInfo(com.commercetools.api.models.order.PaymentInfo.deepCopy(template.getPaymentInfo()));
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInput.deepCopy(template.getShippingRateInput()));
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Address::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDirectDiscounts(Optional.ofNullable(template.getDirectDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DirectDiscount::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setCart(com.commercetools.api.models.cart.CartReference.deepCopy(template.getCart()));
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
        return instance;
    }

    /**
     * builder factory method for QuoteRequest
     * @return builder
     */
    public static QuoteRequestBuilder builder() {
        return QuoteRequestBuilder.of();
    }

    /**
     * create builder for QuoteRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestBuilder builder(final QuoteRequest template) {
        return QuoteRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequest(Function<QuoteRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequest>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequest>";
            }
        };
    }
}
