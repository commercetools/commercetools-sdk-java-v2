
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * StagedOrder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderImpl implements StagedOrder, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String orderNumber;

    private String purchaseOrderNumber;

    private String customerId;

    private String customerEmail;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private String anonymousId;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice;

    private com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.common.Address billingAddress;

    private com.commercetools.api.models.common.Address shippingAddress;

    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    private String shippingKey;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    private com.commercetools.api.models.type.CustomFields shippingCustomFields;

    private java.util.List<com.commercetools.api.models.cart.Shipping> shipping;

    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    private java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;

    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    private String country;

    private String locale;

    private com.commercetools.api.models.cart.CartOrigin origin;

    private com.commercetools.api.models.cart.CartReference cart;

    private com.commercetools.api.models.quote.QuoteReference quote;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.state.StateReference state;

    private java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo;

    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    private com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination;

    @Deprecated
    private Long lastMessageSequenceNumber;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime completedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber,
            @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.CentPrecisionMoney totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice,
            @JsonProperty("taxedShippingPrice") final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice,
            @JsonProperty("discountOnTotalPrice") final com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.Address billingAddress,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress,
            @JsonProperty("shippingMode") final com.commercetools.api.models.cart.ShippingMode shippingMode,
            @JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput,
            @JsonProperty("shippingCustomFields") final com.commercetools.api.models.type.CustomFields shippingCustomFields,
            @JsonProperty("shipping") final java.util.List<com.commercetools.api.models.cart.Shipping> shipping,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses,
            @JsonProperty("discountCodes") final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes,
            @JsonProperty("directDiscounts") final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts,
            @JsonProperty("refusedGifts") final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts,
            @JsonProperty("paymentInfo") final com.commercetools.api.models.order.PaymentInfo paymentInfo,
            @JsonProperty("country") final String country, @JsonProperty("locale") final String locale,
            @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartReference cart,
            @JsonProperty("quote") final com.commercetools.api.models.quote.QuoteReference quote,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("syncInfo") final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo,
            @JsonProperty("returnInfo") final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo,
            @JsonProperty("discountTypeCombination") final com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination,
            @JsonProperty("lastMessageSequenceNumber") final Long lastMessageSequenceNumber,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.orderNumber = orderNumber;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerGroup = customerGroup;
        this.anonymousId = anonymousId;
        this.businessUnit = businessUnit;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.taxedShippingPrice = taxedShippingPrice;
        this.discountOnTotalPrice = discountOnTotalPrice;
        this.taxMode = taxMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.inventoryMode = inventoryMode;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.shippingMode = shippingMode;
        this.shippingKey = shippingKey;
        this.shippingInfo = shippingInfo;
        this.shippingRateInput = shippingRateInput;
        this.shippingCustomFields = shippingCustomFields;
        this.shipping = shipping;
        this.itemShippingAddresses = itemShippingAddresses;
        this.discountCodes = discountCodes;
        this.directDiscounts = directDiscounts;
        this.refusedGifts = refusedGifts;
        this.paymentInfo = paymentInfo;
        this.country = country;
        this.locale = locale;
        this.origin = origin;
        this.cart = cart;
        this.quote = quote;
        this.orderState = orderState;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.state = state;
        this.syncInfo = syncInfo;
        this.returnInfo = returnInfo;
        this.discountTypeCombination = discountTypeCombination;
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
        this.custom = custom;
        this.completedAt = completedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
    }

    /**
     * create empty instance
     */
    public StagedOrderImpl() {
    }

    /**
     *  <p>Unique identifier of the Order.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Order.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Order was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Order was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined identifier of the Order that is unique across a Project.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-defined identifier of a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p><code>id</code> of the Customer that the Order belongs to.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for Line Item price selection.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Anonymous session associated with the Order.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Reference to a Business Unit the Order belongs to. Only available for B2B-enabled Projects.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     */

    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     */

    public com.commercetools.api.models.cart.TaxedPrice getTaxedShippingPrice() {
        return this.taxedShippingPrice;
    }

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     */

    public com.commercetools.api.models.cart.DiscountOnTotalPrice getDiscountOnTotalPrice() {
        return this.discountOnTotalPrice;
    }

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Order.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     */

    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     */

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Indicates whether there can be one or multiple Shipping Methods.</p>
     */

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod for <code>Single</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     */

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     */

    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.Shipping> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    /**
     *  <p>Payment information related to the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Used for Line Item price selection.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Languages of the Order. Can only contain languages supported by the Project.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Indicates the origin of the Cart from which the Order was created.</p>
     */

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     */

    public com.commercetools.api.models.quote.QuoteReference getQuote() {
        return this.quote;
    }

    /**
     *  <p>Current status of the Order.</p>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>Shipment status of the Order.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Payment status of the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     */

    public java.util.List<com.commercetools.api.models.order.SyncInfo> getSyncInfo() {
        return this.syncInfo;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    /**
     *  <p>Indicates if a combination of discount types can apply on an Order.</p>
     */

    public com.commercetools.api.models.cart.DiscountTypeCombination getDiscountTypeCombination() {
        return this.discountTypeCombination;
    }

    /**
     *  <p>Internal-only field.</p>
     */
    @Deprecated
    public Long getLastMessageSequenceNumber() {
        return this.lastMessageSequenceNumber;
    }

    /**
     *  <p>Custom Fields of the Order.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined date and time (UTC) of the Order. Present only on an Order created using Order Import.</p>
     */

    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     *  <p>IDs and references that last modified the Order.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Order.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }

    public void setCustomLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTaxedShippingPrice(final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice) {
        this.taxedShippingPrice = taxedShippingPrice;
    }

    public void setDiscountOnTotalPrice(
            final com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice) {
        this.discountOnTotalPrice = discountOnTotalPrice;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setBillingAddress(final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setShippingMode(final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setShippingCustomFields(final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingCustomFields = shippingCustomFields;
    }

    public void setShipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
    }

    public void setShipping(final java.util.List<com.commercetools.api.models.cart.Shipping> shipping) {
        this.shipping = shipping;
    }

    public void setItemShippingAddresses(final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public void setDiscountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
    }

    public void setDiscountCodes(
            final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public void setDirectDiscounts(final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
    }

    public void setDirectDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
    }

    public void setRefusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
    }

    public void setRefusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
    }

    public void setPaymentInfo(final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
    }

    public void setCart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setQuote(final com.commercetools.api.models.quote.QuoteReference quote) {
        this.quote = quote;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setSyncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        this.syncInfo = new ArrayList<>(Arrays.asList(syncInfo));
    }

    public void setSyncInfo(final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo) {
        this.syncInfo = syncInfo;
    }

    public void setReturnInfo(final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
    }

    public void setReturnInfo(final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
    }

    public void setDiscountTypeCombination(
            final com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination) {
        this.discountTypeCombination = discountTypeCombination;
    }

    @Deprecated
    public void setLastMessageSequenceNumber(final Long lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setCompletedAt(final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderImpl that = (StagedOrderImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(orderNumber, that.orderNumber)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedShippingPrice, that.taxedShippingPrice)
                .append(discountOnTotalPrice, that.discountOnTotalPrice)
                .append(taxMode, that.taxMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingMode, that.shippingMode)
                .append(shippingKey, that.shippingKey)
                .append(shippingInfo, that.shippingInfo)
                .append(shippingRateInput, that.shippingRateInput)
                .append(shippingCustomFields, that.shippingCustomFields)
                .append(shipping, that.shipping)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(discountCodes, that.discountCodes)
                .append(directDiscounts, that.directDiscounts)
                .append(refusedGifts, that.refusedGifts)
                .append(paymentInfo, that.paymentInfo)
                .append(country, that.country)
                .append(locale, that.locale)
                .append(origin, that.origin)
                .append(cart, that.cart)
                .append(quote, that.quote)
                .append(orderState, that.orderState)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(state, that.state)
                .append(syncInfo, that.syncInfo)
                .append(returnInfo, that.returnInfo)
                .append(discountTypeCombination, that.discountTypeCombination)
                .append(lastMessageSequenceNumber, that.lastMessageSequenceNumber)
                .append(custom, that.custom)
                .append(completedAt, that.completedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(orderNumber, that.orderNumber)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedShippingPrice, that.taxedShippingPrice)
                .append(discountOnTotalPrice, that.discountOnTotalPrice)
                .append(taxMode, that.taxMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingMode, that.shippingMode)
                .append(shippingKey, that.shippingKey)
                .append(shippingInfo, that.shippingInfo)
                .append(shippingRateInput, that.shippingRateInput)
                .append(shippingCustomFields, that.shippingCustomFields)
                .append(shipping, that.shipping)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(discountCodes, that.discountCodes)
                .append(directDiscounts, that.directDiscounts)
                .append(refusedGifts, that.refusedGifts)
                .append(paymentInfo, that.paymentInfo)
                .append(country, that.country)
                .append(locale, that.locale)
                .append(origin, that.origin)
                .append(cart, that.cart)
                .append(quote, that.quote)
                .append(orderState, that.orderState)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(state, that.state)
                .append(syncInfo, that.syncInfo)
                .append(returnInfo, that.returnInfo)
                .append(discountTypeCombination, that.discountTypeCombination)
                .append(lastMessageSequenceNumber, that.lastMessageSequenceNumber)
                .append(custom, that.custom)
                .append(completedAt, that.completedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(orderNumber)
                .append(purchaseOrderNumber)
                .append(customerId)
                .append(customerEmail)
                .append(customerGroup)
                .append(anonymousId)
                .append(businessUnit)
                .append(store)
                .append(lineItems)
                .append(customLineItems)
                .append(totalPrice)
                .append(taxedPrice)
                .append(taxedShippingPrice)
                .append(discountOnTotalPrice)
                .append(taxMode)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(inventoryMode)
                .append(billingAddress)
                .append(shippingAddress)
                .append(shippingMode)
                .append(shippingKey)
                .append(shippingInfo)
                .append(shippingRateInput)
                .append(shippingCustomFields)
                .append(shipping)
                .append(itemShippingAddresses)
                .append(discountCodes)
                .append(directDiscounts)
                .append(refusedGifts)
                .append(paymentInfo)
                .append(country)
                .append(locale)
                .append(origin)
                .append(cart)
                .append(quote)
                .append(orderState)
                .append(shipmentState)
                .append(paymentState)
                .append(state)
                .append(syncInfo)
                .append(returnInfo)
                .append(discountTypeCombination)
                .append(lastMessageSequenceNumber)
                .append(custom)
                .append(completedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("orderNumber", orderNumber)
                .append("purchaseOrderNumber", purchaseOrderNumber)
                .append("customerId", customerId)
                .append("customerEmail", customerEmail)
                .append("customerGroup", customerGroup)
                .append("anonymousId", anonymousId)
                .append("businessUnit", businessUnit)
                .append("store", store)
                .append("lineItems", lineItems)
                .append("customLineItems", customLineItems)
                .append("totalPrice", totalPrice)
                .append("taxedPrice", taxedPrice)
                .append("taxedShippingPrice", taxedShippingPrice)
                .append("discountOnTotalPrice", discountOnTotalPrice)
                .append("taxMode", taxMode)
                .append("taxRoundingMode", taxRoundingMode)
                .append("taxCalculationMode", taxCalculationMode)
                .append("inventoryMode", inventoryMode)
                .append("billingAddress", billingAddress)
                .append("shippingAddress", shippingAddress)
                .append("shippingMode", shippingMode)
                .append("shippingKey", shippingKey)
                .append("shippingInfo", shippingInfo)
                .append("shippingRateInput", shippingRateInput)
                .append("shippingCustomFields", shippingCustomFields)
                .append("shipping", shipping)
                .append("itemShippingAddresses", itemShippingAddresses)
                .append("discountCodes", discountCodes)
                .append("directDiscounts", directDiscounts)
                .append("refusedGifts", refusedGifts)
                .append("paymentInfo", paymentInfo)
                .append("country", country)
                .append("locale", locale)
                .append("origin", origin)
                .append("cart", cart)
                .append("quote", quote)
                .append("orderState", orderState)
                .append("shipmentState", shipmentState)
                .append("paymentState", paymentState)
                .append("state", state)
                .append("syncInfo", syncInfo)
                .append("returnInfo", returnInfo)
                .append("discountTypeCombination", discountTypeCombination)
                .append("lastMessageSequenceNumber", lastMessageSequenceNumber)
                .append("custom", custom)
                .append("completedAt", completedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .build();
    }

}
