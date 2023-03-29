
package com.commercetools.api.models.quote;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
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
import com.commercetools.api.models.quote_request.QuoteRequestReference;
import com.commercetools.api.models.staged_quote.StagedQuoteReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Quote
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Quote quote = Quote.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .quoteState(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteImpl.class)
public interface Quote extends BaseResource, QuoteMixin, com.commercetools.api.models.DomainResource<Quote>,
        com.commercetools.api.models.Referencable<Quote>, com.commercetools.api.models.ResourceIdentifiable<Quote>,
        com.commercetools.api.models.Customizable<Quote>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Quote.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Quote.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time (UTC) the Quote was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Quote was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @return quoteRequest
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequestReference getQuoteRequest();

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @return stagedQuote
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuoteReference getStagedQuote();

    /**
     *  <p>The Buyer who requested the Quote.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Used for Product Variant price selection.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Expiration date for the Quote.</p>
     * @return validTo
     */

    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>Message from the Seller included in the offer.</p>
     * @return sellerComment
     */

    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p>Message from the Buyer included in the renegotiation request.</p>
     * @return buyerComment
     */

    @JsonProperty("buyerComment")
    public String getBuyerComment();

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
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
     *  <p>Custom Fields on the Quote.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     * @return quoteState
     */
    @NotNull
    @JsonProperty("quoteState")
    public QuoteState getQuoteState();

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Unique identifier of the Quote.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Quote.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Date and time (UTC) the Quote was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Quote was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Quote Request related to the Quote.</p>
     * @param quoteRequest value to be set
     */

    public void setQuoteRequest(final QuoteRequestReference quoteRequest);

    /**
     *  <p>Staged Quote related to the Quote.</p>
     * @param stagedQuote value to be set
     */

    public void setStagedQuote(final StagedQuoteReference stagedQuote);

    /**
     *  <p>The Buyer who requested the Quote.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Used for Product Variant price selection.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Expiration date for the Quote.</p>
     * @param validTo value to be set
     */

    public void setValidTo(final ZonedDateTime validTo);

    /**
     *  <p>Message from the Seller included in the offer.</p>
     * @param sellerComment value to be set
     */

    public void setSellerComment(final String sellerComment);

    /**
     *  <p>Message from the Buyer included in the renegotiation request.</p>
     * @param buyerComment value to be set
     */

    public void setBuyerComment(final String buyerComment);

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItem> lineItems);

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
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
     *  <p>Custom Fields on the Quote.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     * @param quoteState value to be set
     */

    public void setQuoteState(final QuoteState quoteState);

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     * factory method
     * @return instance of Quote
     */
    public static Quote of() {
        return new QuoteImpl();
    }

    /**
     * factory method to create a shallow copy Quote
     * @param template instance to be copied
     * @return copy instance
     */
    public static Quote of(final Quote template) {
        QuoteImpl instance = new QuoteImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setQuoteRequest(template.getQuoteRequest());
        instance.setStagedQuote(template.getStagedQuote());
        instance.setCustomer(template.getCustomer());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setValidTo(template.getValidTo());
        instance.setSellerComment(template.getSellerComment());
        instance.setBuyerComment(template.getBuyerComment());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setCountry(template.getCountry());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDirectDiscounts(template.getDirectDiscounts());
        instance.setCustom(template.getCustom());
        instance.setQuoteState(template.getQuoteState());
        instance.setState(template.getState());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setBusinessUnit(template.getBusinessUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of Quote
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Quote deepCopy(@Nullable final Quote template) {
        if (template == null) {
            return null;
        }
        QuoteImpl instance = new QuoteImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setQuoteRequest(Optional.ofNullable(template.getQuoteRequest())
                .map(com.commercetools.api.models.quote_request.QuoteRequestReference::deepCopy)
                .orElse(null));
        instance.setStagedQuote(Optional.ofNullable(template.getStagedQuote())
                .map(com.commercetools.api.models.staged_quote.StagedQuoteReference::deepCopy)
                .orElse(null));
        instance.setCustomer(Optional.ofNullable(template.getCustomer())
                .map(com.commercetools.api.models.customer.CustomerReference::deepCopy)
                .orElse(null));
        instance.setCustomerGroup(Optional.ofNullable(template.getCustomerGroup())
                .map(com.commercetools.api.models.customer_group.CustomerGroupReference::deepCopy)
                .orElse(null));
        instance.setValidTo(template.getValidTo());
        instance.setSellerComment(template.getSellerComment());
        instance.setBuyerComment(template.getBuyerComment());
        instance.setStore(Optional.ofNullable(template.getStore())
                .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                .orElse(null));
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
        instance.setTotalPrice(Optional.ofNullable(template.getTotalPrice())
                .map(com.commercetools.api.models.common.TypedMoney::deepCopy)
                .orElse(null));
        instance.setTaxedPrice(Optional.ofNullable(template.getTaxedPrice())
                .map(com.commercetools.api.models.cart.TaxedPrice::deepCopy)
                .orElse(null));
        instance.setShippingAddress(Optional.ofNullable(template.getShippingAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        instance.setBillingAddress(Optional.ofNullable(template.getBillingAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setCountry(template.getCountry());
        instance.setShippingInfo(Optional.ofNullable(template.getShippingInfo())
                .map(com.commercetools.api.models.cart.ShippingInfo::deepCopy)
                .orElse(null));
        instance.setPaymentInfo(Optional.ofNullable(template.getPaymentInfo())
                .map(com.commercetools.api.models.order.PaymentInfo::deepCopy)
                .orElse(null));
        instance.setShippingRateInput(Optional.ofNullable(template.getShippingRateInput())
                .map(com.commercetools.api.models.cart.ShippingRateInput::deepCopy)
                .orElse(null));
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
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setQuoteState(template.getQuoteState());
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setBusinessUnit(Optional.ofNullable(template.getBusinessUnit())
                .map(com.commercetools.api.models.business_unit.BusinessUnitKeyReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for Quote
     * @return builder
     */
    public static QuoteBuilder builder() {
        return QuoteBuilder.of();
    }

    /**
     * create builder for Quote instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteBuilder builder(final Quote template) {
        return QuoteBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuote(Function<Quote, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.QUOTE;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Quote> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Quote>() {
            @Override
            public String toString() {
                return "TypeReference<Quote>";
            }
        };
    }
}
