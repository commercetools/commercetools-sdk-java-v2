
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Cart
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Cart cart = Cart.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .inventoryMode(InventoryMode.NONE)
 *             .cartState(CartState.ACTIVE)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .plusItemShippingAddresses(itemShippingAddressesBuilder -> itemShippingAddressesBuilder)
 *             .plusDiscountCodes(discountCodesBuilder -> discountCodesBuilder)
 *             .plusDirectDiscounts(directDiscountsBuilder -> directDiscountsBuilder)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartImpl.class)
public interface Cart extends BaseResource, CartMixin, com.commercetools.api.models.DomainResource<Cart>,
        com.commercetools.api.models.Referencable<Cart>, com.commercetools.api.models.ResourceIdentifiable<Cart>,
        com.commercetools.api.models.Customizable<Cart>, com.commercetools.api.models.order.OrderLike<Cart>,
        com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Cart.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Cart.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Cart.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the Cart belongs to.</p>
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Cart.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @return customLineItems
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
     *  <p>Sum of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> quantities, excluding <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>. Only present when the Cart has at least one LineItem.</p>
     * @return totalLineItemQuantity
     */

    @JsonProperty("totalLineItemQuantity")
    public Long getTotalLineItemQuantity();

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public CentPrecisionMoney getTotalPrice();

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @return taxedShippingPrice
     */
    @Valid
    @JsonProperty("taxedShippingPrice")
    public TaxedPrice getTaxedShippingPrice();

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
     * @return discountOnTotalPrice
     */
    @Valid
    @JsonProperty("discountOnTotalPrice")
    public DiscountOnTotalPrice getDiscountOnTotalPrice();

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @return priceRoundingMode
     */
    @NotNull
    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @return taxRoundingMode
     */
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */
    @NotNull
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Cart.</p>
     * @return inventoryMode
     */
    @NotNull
    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Current status of the Cart.</p>
     * @return cartState
     */
    @NotNull
    @JsonProperty("cartState")
    public CartState getCartState();

    /**
     *  <p>Determines freezing behavior when <code>cartState</code> is <code>Frozen</code>.</p>
     * @return freezeStrategy
     */

    @JsonProperty("freezeStrategy")
    public FreezeStrategy getFreezeStrategy();

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
     *  <p>Indicates whether the Cart has one or multiple Shipping Methods.</p>
     * @return shippingMode
     */
    @NotNull
    @JsonProperty("shippingMode")
    public ShippingMode getShippingMode();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingCustomFields
     */
    @Valid
    @JsonProperty("shippingCustomFields")
    public CustomFields getShippingCustomFields();

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @return shipping
     */
    @NotNull
    @Valid
    @JsonProperty("shipping")
    public List<Shipping> getShipping();

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */
    @NotNull
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @return discountCodes
     */
    @NotNull
    @Valid
    @JsonProperty("discountCodes")
    public List<DiscountCodeInfo> getDiscountCodes();

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @return directDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("directDiscounts")
    public List<DirectDiscount> getDirectDiscounts();

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @return refusedGifts
     */
    @NotNull
    @Valid
    @JsonProperty("refusedGifts")
    public List<CartDiscountReference> getRefusedGifts();

    /**
     *  <p>Payment information related to the Cart.</p>
     * @return paymentInfo
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Indicates how the Cart was created.</p>
     * @return origin
     */
    @NotNull
    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>Custom Fields of the Cart.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Indicates if a combination of discount types can apply on a Cart.</p>
     * @return discountTypeCombination
     */
    @Valid
    @JsonProperty("discountTypeCombination")
    public DiscountTypeCombination getDiscountTypeCombination();

    /**
     *  <p>Indicates whether the Cart has been <span>locked</span>, preventing edits.</p>
     * @return lock
     */
    @Valid
    @JsonProperty("lock")
    public CartLock getLock();

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    /**
     *  <p>User-defined identifier of a purchase order.</p>
     *  <p>It is typically set by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Buyer" rel="nofollow">Buyer</a> or Merchant to track the purchase order during the <span>quote and order flow</span>.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>Date and time (UTC) the Cart was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Cart was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Cart.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Unique identifier of the Cart.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Cart.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the Cart.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the Cart belongs to.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Cart.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItem> lineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param customLineItems values to be set
     */

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    /**
     *  <p>Sum of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> quantities, excluding <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>. Only present when the Cart has at least one LineItem.</p>
     * @param totalLineItemQuantity value to be set
     */

    public void setTotalLineItemQuantity(final Long totalLineItemQuantity);

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param taxedShippingPrice value to be set
     */

    public void setTaxedShippingPrice(final TaxedPrice taxedShippingPrice);

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
     * @param discountOnTotalPrice value to be set
     */

    public void setDiscountOnTotalPrice(final DiscountOnTotalPrice discountOnTotalPrice);

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     */

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Current status of the Cart.</p>
     * @param cartState value to be set
     */

    public void setCartState(final CartState cartState);

    /**
     *  <p>Determines freezing behavior when <code>cartState</code> is <code>Frozen</code>.</p>
     * @param freezeStrategy value to be set
     */

    public void setFreezeStrategy(final FreezeStrategy freezeStrategy);

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final Address billingAddress);

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final Address shippingAddress);

    /**
     *  <p>Indicates whether the Cart has one or multiple Shipping Methods.</p>
     * @param shippingMode value to be set
     */

    public void setShippingMode(final ShippingMode shippingMode);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfo shippingInfo);

    /**
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingCustomFields value to be set
     */

    public void setShippingCustomFields(final CustomFields shippingCustomFields);

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param shipping values to be set
     */

    @JsonIgnore
    public void setShipping(final Shipping... shipping);

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param shipping values to be set
     */

    public void setShipping(final List<Shipping> shipping);

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes values to be set
     */

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes values to be set
     */

    public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts values to be set
     */

    @JsonIgnore
    public void setDirectDiscounts(final DirectDiscount... directDiscounts);

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts values to be set
     */

    public void setDirectDiscounts(final List<DirectDiscount> directDiscounts);

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param refusedGifts values to be set
     */

    @JsonIgnore
    public void setRefusedGifts(final CartDiscountReference... refusedGifts);

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param refusedGifts values to be set
     */

    public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);

    /**
     *  <p>Payment information related to the Cart.</p>
     * @param paymentInfo value to be set
     */

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    /**
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Indicates how the Cart was created.</p>
     * @param origin value to be set
     */

    public void setOrigin(final CartOrigin origin);

    /**
     *  <p>Custom Fields of the Cart.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Indicates if a combination of discount types can apply on a Cart.</p>
     * @param discountTypeCombination value to be set
     */

    public void setDiscountTypeCombination(final DiscountTypeCombination discountTypeCombination);

    /**
     *  <p>Indicates whether the Cart has been <span>locked</span>, preventing edits.</p>
     * @param lock value to be set
     */

    public void setLock(final CartLock lock);

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    /**
     *  <p>User-defined identifier of a purchase order.</p>
     *  <p>It is typically set by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Buyer" rel="nofollow">Buyer</a> or Merchant to track the purchase order during the <span>quote and order flow</span>.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>Date and time (UTC) the Cart was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Cart was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Cart.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     * factory method
     * @return instance of Cart
     */
    public static Cart of() {
        return new CartImpl();
    }

    /**
     * factory method to create a shallow copy Cart
     * @param template instance to be copied
     * @return copy instance
     */
    public static Cart of(final Cart template) {
        CartImpl instance = new CartImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalLineItemQuantity(template.getTotalLineItemQuantity());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedShippingPrice(template.getTaxedShippingPrice());
        instance.setDiscountOnTotalPrice(template.getDiscountOnTotalPrice());
        instance.setTaxMode(template.getTaxMode());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setCartState(template.getCartState());
        instance.setFreezeStrategy(template.getFreezeStrategy());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingMode(template.getShippingMode());
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setShippingCustomFields(template.getShippingCustomFields());
        instance.setShipping(template.getShipping());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setDirectDiscounts(template.getDirectDiscounts());
        instance.setRefusedGifts(template.getRefusedGifts());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setOrigin(template.getOrigin());
        instance.setCustom(template.getCustom());
        instance.setDiscountTypeCombination(template.getDiscountTypeCombination());
        instance.setLock(template.getLock());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    public Cart copyDeep();

    /**
     * factory method to create a deep copy of Cart
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Cart deepCopy(@Nullable final Cart template) {
        if (template == null) {
            return null;
        }
        CartImpl instance = new CartImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getBusinessUnit()));
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
        instance.setTotalLineItemQuantity(template.getTotalLineItemQuantity());
        instance.setTotalPrice(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setTaxedShippingPrice(
            com.commercetools.api.models.cart.TaxedPrice.deepCopy(template.getTaxedShippingPrice()));
        instance.setDiscountOnTotalPrice(
            com.commercetools.api.models.cart.DiscountOnTotalPrice.deepCopy(template.getDiscountOnTotalPrice()));
        instance.setTaxMode(template.getTaxMode());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setCartState(template.getCartState());
        instance.setFreezeStrategy(template.getFreezeStrategy());
        instance.setBillingAddress(com.commercetools.api.models.common.Address.deepCopy(template.getBillingAddress()));
        instance.setShippingAddress(
            com.commercetools.api.models.common.Address.deepCopy(template.getShippingAddress()));
        instance.setShippingMode(template.getShippingMode());
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingInfo(com.commercetools.api.models.cart.ShippingInfo.deepCopy(template.getShippingInfo()));
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInput.deepCopy(template.getShippingRateInput()));
        instance.setShippingCustomFields(
            com.commercetools.api.models.type.CustomFields.deepCopy(template.getShippingCustomFields()));
        instance.setShipping(Optional.ofNullable(template.getShipping())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.Shipping::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Address::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountCodes(Optional.ofNullable(template.getDiscountCodes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountCodeInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDirectDiscounts(Optional.ofNullable(template.getDirectDiscounts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DirectDiscount::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRefusedGifts(Optional.ofNullable(template.getRefusedGifts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.CartDiscountReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPaymentInfo(com.commercetools.api.models.order.PaymentInfo.deepCopy(template.getPaymentInfo()));
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setOrigin(template.getOrigin());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setDiscountTypeCombination(
            com.commercetools.api.models.cart.DiscountTypeCombination.deepCopy(template.getDiscountTypeCombination()));
        instance.setLock(com.commercetools.api.models.cart.CartLock.deepCopy(template.getLock()));
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for Cart
     * @return builder
     */
    public static CartBuilder builder() {
        return CartBuilder.of();
    }

    /**
     * create builder for Cart instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartBuilder builder(final Cart template) {
        return CartBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCart(Function<Cart, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Cart> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Cart>() {
            @Override
            public String toString() {
                return "TypeReference<Cart>";
            }
        };
    }
}
