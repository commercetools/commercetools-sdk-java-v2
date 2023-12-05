
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DirectDiscount;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.DiscountOnTotalPrice;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.Shipping;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingMode;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.quote.QuoteReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Order
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Order order = Order.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .orderState(OrderState.OPEN)
 *             .plusSyncInfo(syncInfoBuilder -> syncInfoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImpl.class)
public interface Order extends BaseResource, OrderMixin, com.commercetools.api.models.DomainResource<Order>,
        com.commercetools.api.models.Referencable<Order>, com.commercetools.api.models.ResourceIdentifiable<Order>,
        com.commercetools.api.models.Customizable<Order>, com.commercetools.api.models.order.OrderLike<Order> {

    /**
     *  <p>Unique identifier of the Order.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Order.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined identifier of the Order that is unique across a Project.</p>
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>User-defined identifier of a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p><code>id</code> of the Customer that the Order belongs to.</p>
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for LineItem Price selection.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Anonymous session associated with the Order.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Reference to a Business Unit the Order belongs to.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @return customLineItems
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     * @return taxedShippingPrice
     */
    @Valid
    @JsonProperty("taxedShippingPrice")
    public TaxedPrice getTaxedShippingPrice();

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     * @return discountOnTotalPrice
     */
    @Valid
    @JsonProperty("discountOnTotalPrice")
    public DiscountOnTotalPrice getDiscountOnTotalPrice();

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @return taxMode
     */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Order.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Billing address associated with the Order.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
     *  <p>Indicates whether there can be one or multiple Shipping Methods.</p>
     * @return shippingMode
     */
    @NotNull
    @JsonProperty("shippingMode")
    public ShippingMode getShippingMode();

    /**
     *  <p><code>key</code> of the ShippingMethod for <code>Single</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     * @return shippingCustomFields
     */
    @Valid
    @JsonProperty("shippingCustomFields")
    public CustomFields getShippingCustomFields();

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @return shipping
     */
    @NotNull
    @Valid
    @JsonProperty("shipping")
    public List<Shipping> getShipping();

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @return discountCodes
     */
    @Valid
    @JsonProperty("discountCodes")
    public List<DiscountCodeInfo> getDiscountCodes();

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @return directDiscounts
     */
    @Valid
    @JsonProperty("directDiscounts")
    public List<DirectDiscount> getDirectDiscounts();

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @return refusedGifts
     */
    @NotNull
    @Valid
    @JsonProperty("refusedGifts")
    public List<CartDiscountReference> getRefusedGifts();

    /**
     *  <p>Payment information related to the Order.</p>
     * @return paymentInfo
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *  <p>Used for LineItem Price selection.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Languages of the Order. Can only contain languages supported by the Project.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Indicates the origin of the Cart from which the Order was created.</p>
     * @return origin
     */
    @NotNull
    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     * @return quote
     */
    @Valid
    @JsonProperty("quote")
    public QuoteReference getQuote();

    /**
     *  <p>Current status of the Order.</p>
     * @return orderState
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>Shipment status of the Order.</p>
     * @return shipmentState
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>Payment status of the Order.</p>
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @return syncInfo
     */
    @NotNull
    @Valid
    @JsonProperty("syncInfo")
    public List<SyncInfo> getSyncInfo();

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @return returnInfo
     */
    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    /**
     *  <p>Internal-only field.</p>
     * @return lastMessageSequenceNumber
     */
    @Deprecated
    @JsonProperty("lastMessageSequenceNumber")
    public Long getLastMessageSequenceNumber();

    /**
     *  <p>Custom Fields of the Order.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>User-defined date and time (UTC) of the Order. Present only on an Order created using Order Import.</p>
     * @return completedAt
     */

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
     *  <p>Date and time (UTC) the Order was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Order was last updated.</p>
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
     *  <p>Unique identifier of the Order.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Order.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined identifier of the Order that is unique across a Project.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     *  <p>User-defined identifier of a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p><code>id</code> of the Customer that the Order belongs to.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for LineItem Price selection.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Anonymous session associated with the Order.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Reference to a Business Unit the Order belongs to.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItem> lineItems);

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param customLineItems values to be set
     */

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final TypedMoney totalPrice);

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     * @param taxedShippingPrice value to be set
     */

    public void setTaxedShippingPrice(final TaxedPrice taxedShippingPrice);

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     * @param discountOnTotalPrice value to be set
     */

    public void setDiscountOnTotalPrice(final DiscountOnTotalPrice discountOnTotalPrice);

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     */

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Order.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final Address billingAddress);

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final Address shippingAddress);

    /**
     *  <p>Indicates whether there can be one or multiple Shipping Methods.</p>
     * @param shippingMode value to be set
     */

    public void setShippingMode(final ShippingMode shippingMode);

    /**
     *  <p><code>key</code> of the ShippingMethod for <code>Single</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfo shippingInfo);

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     * @param shippingCustomFields value to be set
     */

    public void setShippingCustomFields(final CustomFields shippingCustomFields);

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param shipping values to be set
     */

    @JsonIgnore
    public void setShipping(final Shipping... shipping);

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param shipping values to be set
     */

    public void setShipping(final List<Shipping> shipping);

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes values to be set
     */

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes values to be set
     */

    public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts values to be set
     */

    @JsonIgnore
    public void setDirectDiscounts(final DirectDiscount... directDiscounts);

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts values to be set
     */

    public void setDirectDiscounts(final List<DirectDiscount> directDiscounts);

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param refusedGifts values to be set
     */

    @JsonIgnore
    public void setRefusedGifts(final CartDiscountReference... refusedGifts);

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param refusedGifts values to be set
     */

    public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);

    /**
     *  <p>Payment information related to the Order.</p>
     * @param paymentInfo value to be set
     */

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    /**
     *  <p>Used for LineItem Price selection.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Languages of the Order. Can only contain languages supported by the Project.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Indicates the origin of the Cart from which the Order was created.</p>
     * @param origin value to be set
     */

    public void setOrigin(final CartOrigin origin);

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     * @param cart value to be set
     */

    public void setCart(final CartReference cart);

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     * @param quote value to be set
     */

    public void setQuote(final QuoteReference quote);

    /**
     *  <p>Current status of the Order.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>Shipment status of the Order.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     *  <p>Payment status of the Order.</p>
     * @param paymentState value to be set
     */

    public void setPaymentState(final PaymentState paymentState);

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param syncInfo values to be set
     */

    @JsonIgnore
    public void setSyncInfo(final SyncInfo... syncInfo);

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param syncInfo values to be set
     */

    public void setSyncInfo(final List<SyncInfo> syncInfo);

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param returnInfo values to be set
     */

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param returnInfo values to be set
     */

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    /**
     *  <p>Internal-only field.</p>
     * @param lastMessageSequenceNumber value to be set
     */
    @Deprecated
    public void setLastMessageSequenceNumber(final Long lastMessageSequenceNumber);

    /**
     *  <p>Custom Fields of the Order.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>User-defined date and time (UTC) of the Order. Present only on an Order created using Order Import.</p>
     * @param completedAt value to be set
     */

    public void setCompletedAt(final ZonedDateTime completedAt);

    /**
     *  <p>Date and time (UTC) the Order was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Order was last updated.</p>
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
     * factory method
     * @return instance of Order
     */
    public static Order of() {
        return new OrderImpl();
    }

    /**
     * factory method to create a shallow copy Order
     * @param template instance to be copied
     * @return copy instance
     */
    public static Order of(final Order template) {
        OrderImpl instance = new OrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedShippingPrice(template.getTaxedShippingPrice());
        instance.setDiscountOnTotalPrice(template.getDiscountOnTotalPrice());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
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
        instance.setCart(template.getCart());
        instance.setQuote(template.getQuote());
        instance.setOrderState(template.getOrderState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setState(template.getState());
        instance.setSyncInfo(template.getSyncInfo());
        instance.setReturnInfo(template.getReturnInfo());
        instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
        instance.setCustom(template.getCustom());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    /**
     * factory method to create a deep copy of Order
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Order deepCopy(@Nullable final Order template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.order_edit.StagedOrder) {
            return com.commercetools.api.models.order_edit.StagedOrder
                    .deepCopy((com.commercetools.api.models.order_edit.StagedOrder) template);
        }
        OrderImpl instance = new OrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
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
        instance.setTotalPrice(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setTaxedShippingPrice(
            com.commercetools.api.models.cart.TaxedPrice.deepCopy(template.getTaxedShippingPrice()));
        instance.setDiscountOnTotalPrice(
            com.commercetools.api.models.cart.DiscountOnTotalPrice.deepCopy(template.getDiscountOnTotalPrice()));
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
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
        instance.setCart(com.commercetools.api.models.cart.CartReference.deepCopy(template.getCart()));
        instance.setQuote(com.commercetools.api.models.quote.QuoteReference.deepCopy(template.getQuote()));
        instance.setOrderState(template.getOrderState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setSyncInfo(Optional.ofNullable(template.getSyncInfo())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.SyncInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setReturnInfo(Optional.ofNullable(template.getReturnInfo())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setCompletedAt(template.getCompletedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for Order
     * @return builder
     */
    public static OrderBuilder builder() {
        return OrderBuilder.of();
    }

    /**
     * create builder for Order instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBuilder builder(final Order template) {
        return OrderBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrder(Function<Order, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.ORDER;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Order> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Order>() {
            @Override
            public String toString() {
                return "TypeReference<Order>";
            }
        };
    }
}
