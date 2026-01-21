
package com.commercetools.api.models.cart;

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
 * Cart
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartImpl implements Cart, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private String customerId;

    private String customerEmail;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private String anonymousId;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private Long totalLineItemQuantity;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice;

    private com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.CartState cartState;

    private com.commercetools.api.models.cart.FreezeStrategy freezeStrategy;

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

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination;

    private com.commercetools.api.models.cart.CartLock lock;

    private Integer deleteDaysAfterLastModification;

    private String purchaseOrderNumber;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key, @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems,
            @JsonProperty("totalLineItemQuantity") final Long totalLineItemQuantity,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.CentPrecisionMoney totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice,
            @JsonProperty("taxedShippingPrice") final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice,
            @JsonProperty("discountOnTotalPrice") final com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("priceRoundingMode") final com.commercetools.api.models.cart.RoundingMode priceRoundingMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("cartState") final com.commercetools.api.models.cart.CartState cartState,
            @JsonProperty("freezeStrategy") final com.commercetools.api.models.cart.FreezeStrategy freezeStrategy,
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
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("discountTypeCombination") final com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination,
            @JsonProperty("lock") final com.commercetools.api.models.cart.CartLock lock,
            @JsonProperty("deleteDaysAfterLastModification") final Integer deleteDaysAfterLastModification,
            @JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerGroup = customerGroup;
        this.anonymousId = anonymousId;
        this.businessUnit = businessUnit;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalLineItemQuantity = totalLineItemQuantity;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.taxedShippingPrice = taxedShippingPrice;
        this.discountOnTotalPrice = discountOnTotalPrice;
        this.taxMode = taxMode;
        this.priceRoundingMode = priceRoundingMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.inventoryMode = inventoryMode;
        this.cartState = cartState;
        this.freezeStrategy = freezeStrategy;
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
        this.custom = custom;
        this.discountTypeCombination = discountTypeCombination;
        this.lock = lock;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
    }

    /**
     * create empty instance
     */
    public CartImpl() {
    }

    /**
     *  <p>Unique identifier of the Cart.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Cart.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Cart was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Cart was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the Cart.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the Cart belongs to.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Cart.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Sum of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> quantities, excluding <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>. Only present when the Cart has at least one LineItem.</p>
     */

    public Long getTotalLineItemQuantity() {
        return this.totalLineItemQuantity;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     */

    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     */

    public com.commercetools.api.models.cart.TaxedPrice getTaxedShippingPrice() {
        return this.taxedShippingPrice;
    }

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
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
     *  <p>Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
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
     *  <p>Indicates how stock quantities are tracked for Line Items in the Cart.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Current status of the Cart.</p>
     */

    public com.commercetools.api.models.cart.CartState getCartState() {
        return this.cartState;
    }

    /**
     *  <p>Determines freezing behavior when <code>cartState</code> is <code>Frozen</code>.</p>
     */

    public com.commercetools.api.models.cart.FreezeStrategy getFreezeStrategy() {
        return this.freezeStrategy;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     */

    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     */

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Indicates whether the Cart has one or multiple Shipping Methods.</p>
     */

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     */

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.Shipping> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     */

    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Used for <span>Line Item price selection</span>.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Indicates how the Cart was created.</p>
     */

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Indicates if a combination of discount types can apply on a Cart.</p>
     */

    public com.commercetools.api.models.cart.DiscountTypeCombination getDiscountTypeCombination() {
        return this.discountTypeCombination;
    }

    /**
     *  <p>Indicates whether the Cart has been <span>locked</span>, preventing edits.</p>
     */

    public com.commercetools.api.models.cart.CartLock getLock() {
        return this.lock;
    }

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     */

    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>User-defined identifier of a purchase order.</p>
     *  <p>It is typically set by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Buyer" rel="nofollow">Buyer</a> or Merchant to track the purchase order during the <span>quote and order flow</span>.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Cart.</p>
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

    public void setKey(final String key) {
        this.key = key;
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

    public void setTotalLineItemQuantity(final Long totalLineItemQuantity) {
        this.totalLineItemQuantity = totalLineItemQuantity;
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

    public void setPriceRoundingMode(final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
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

    public void setCartState(final com.commercetools.api.models.cart.CartState cartState) {
        this.cartState = cartState;
    }

    public void setFreezeStrategy(final com.commercetools.api.models.cart.FreezeStrategy freezeStrategy) {
        this.freezeStrategy = freezeStrategy;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setDiscountTypeCombination(
            final com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination) {
        this.discountTypeCombination = discountTypeCombination;
    }

    public void setLock(final com.commercetools.api.models.cart.CartLock lock) {
        this.lock = lock;
    }

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
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

        CartImpl that = (CartImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalLineItemQuantity, that.totalLineItemQuantity)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedShippingPrice, that.taxedShippingPrice)
                .append(discountOnTotalPrice, that.discountOnTotalPrice)
                .append(taxMode, that.taxMode)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(cartState, that.cartState)
                .append(freezeStrategy, that.freezeStrategy)
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
                .append(custom, that.custom)
                .append(discountTypeCombination, that.discountTypeCombination)
                .append(lock, that.lock)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalLineItemQuantity, that.totalLineItemQuantity)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxedShippingPrice, that.taxedShippingPrice)
                .append(discountOnTotalPrice, that.discountOnTotalPrice)
                .append(taxMode, that.taxMode)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(cartState, that.cartState)
                .append(freezeStrategy, that.freezeStrategy)
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
                .append(custom, that.custom)
                .append(discountTypeCombination, that.discountTypeCombination)
                .append(lock, that.lock)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
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
                .append(key)
                .append(customerId)
                .append(customerEmail)
                .append(customerGroup)
                .append(anonymousId)
                .append(businessUnit)
                .append(store)
                .append(lineItems)
                .append(customLineItems)
                .append(totalLineItemQuantity)
                .append(totalPrice)
                .append(taxedPrice)
                .append(taxedShippingPrice)
                .append(discountOnTotalPrice)
                .append(taxMode)
                .append(priceRoundingMode)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(inventoryMode)
                .append(cartState)
                .append(freezeStrategy)
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
                .append(custom)
                .append(discountTypeCombination)
                .append(lock)
                .append(deleteDaysAfterLastModification)
                .append(purchaseOrderNumber)
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
                .append("key", key)
                .append("customerId", customerId)
                .append("customerEmail", customerEmail)
                .append("customerGroup", customerGroup)
                .append("anonymousId", anonymousId)
                .append("businessUnit", businessUnit)
                .append("store", store)
                .append("lineItems", lineItems)
                .append("customLineItems", customLineItems)
                .append("totalLineItemQuantity", totalLineItemQuantity)
                .append("totalPrice", totalPrice)
                .append("taxedPrice", taxedPrice)
                .append("taxedShippingPrice", taxedShippingPrice)
                .append("discountOnTotalPrice", discountOnTotalPrice)
                .append("taxMode", taxMode)
                .append("priceRoundingMode", priceRoundingMode)
                .append("taxRoundingMode", taxRoundingMode)
                .append("taxCalculationMode", taxCalculationMode)
                .append("inventoryMode", inventoryMode)
                .append("cartState", cartState)
                .append("freezeStrategy", freezeStrategy)
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
                .append("custom", custom)
                .append("discountTypeCombination", discountTypeCombination)
                .append("lock", lock)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .append("purchaseOrderNumber", purchaseOrderNumber)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .build();
    }

    @Override
    public Cart copyDeep() {
        return Cart.deepCopy(this);
    }
}
