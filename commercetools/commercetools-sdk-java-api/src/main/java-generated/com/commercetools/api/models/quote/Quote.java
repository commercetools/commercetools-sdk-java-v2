
package com.commercetools.api.models.quote;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Quote.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Quote.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Date and time (UTC) the Quote was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Quote was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Quote Request related to the Quote.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("quoteRequest")
    public QuoteRequestReference getQuoteRequest();

    /**
     *  <p>Staged Quote related to the Quote.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("stagedQuote")
    public StagedQuoteReference getStagedQuote();

    /**
     *  <p>The Buyer who requested the Quote.</p>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Used for Product Variant price selection.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Expiration date for the Quote.</p>
     */

    @JsonProperty("validTo")
    public ZonedDateTime getValidTo();

    /**
     *  <p>Message from the Seller included in the offer.</p>
     */

    @JsonProperty("sellerComment")
    public String getSellerComment();

    /**
     *  <p>Message from the Buyer included in the renegotiation request.</p>
     */

    @JsonProperty("buyerComment")
    public String getBuyerComment();

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Line Items for which the Quote is requested.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *  <p>The Custom Line Items for which the Quote is requested.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
     *  <p>Address used for invoicing.</p>
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
     *  <p>Inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     */
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
     *  <p>Used for Product Variant price selection.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     */
    @Valid
    @JsonProperty("directDiscounts")
    public List<DirectDiscount> getDirectDiscounts();

    /**
     *  <p>Custom Fields on the Quote.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Predefined states tracking the status of the Quote.</p>
     */
    @NotNull
    @JsonProperty("quoteState")
    public QuoteState getQuoteState();

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>The BusinessUnit for the Quote.</p>
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setQuoteRequest(final QuoteRequestReference quoteRequest);

    public void setStagedQuote(final StagedQuoteReference stagedQuote);

    public void setCustomer(final CustomerReference customer);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setValidTo(final ZonedDateTime validTo);

    public void setSellerComment(final String sellerComment);

    public void setBuyerComment(final String buyerComment);

    public void setStore(final StoreKeyReference store);

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    public void setLineItems(final List<LineItem> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setShippingAddress(final Address shippingAddress);

    public void setBillingAddress(final Address billingAddress);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setTaxMode(final TaxMode taxMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public void setCountry(final String country);

    public void setShippingInfo(final ShippingInfo shippingInfo);

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    @JsonIgnore
    public void setDirectDiscounts(final DirectDiscount... directDiscounts);

    public void setDirectDiscounts(final List<DirectDiscount> directDiscounts);

    public void setCustom(final CustomFields custom);

    public void setQuoteState(final QuoteState quoteState);

    public void setState(final StateReference state);

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    public static Quote of() {
        return new QuoteImpl();
    }

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

    public static QuoteBuilder builder() {
        return QuoteBuilder.of();
    }

    public static QuoteBuilder builder(final Quote template) {
        return QuoteBuilder.of(template);
    }

    default <T> T withQuote(Function<Quote, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.QUOTE;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Quote> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Quote>() {
            @Override
            public String toString() {
                return "TypeReference<Quote>";
            }
        };
    }
}
