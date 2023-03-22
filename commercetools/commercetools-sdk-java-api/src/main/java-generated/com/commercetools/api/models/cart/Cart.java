
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
     *  <p><code>id</code> of the Customer that the Cart belongs to.</p>
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
     *  <p>Reference to the Customer Group of the Customer that the Cart belongs to. Used for LineItem Price selection.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Reference to a Business Unit the Cart belongs to.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *  <p>Reference to a Store the Cart belongs to.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Line Items added to the Cart.</p>
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *  <p>Custom Line Items added to the Cart.</p>
     * @return customLineItems
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
     *  <p>Sum of all LineItem quantities, excluding CustomLineItems. Only present when the Cart has at least one LineItem.</p>
     * @return totalLineItemQuantity
     */

    @JsonProperty("totalLineItemQuantity")
    public Long getTotalLineItemQuantity();

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public CentPrecisionMoney getTotalPrice();

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, it is automatically set when the external Tax Rate for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
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
     *  <p>Indicates how Tax Rates are set.</p>
     * @return taxMode
     */
    @NotNull
    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
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
     *  <p>Billing address associated with the Cart.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
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
     *  <p>Shipping-related information of a Cart with <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @return shipping
     */
    @NotNull
    @Valid
    @JsonProperty("shipping")
    public List<Shipping> getShipping();

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
     *  <p>Additional shipping addresses of the Cart as specified by LineItems using the <code>shippingDetails</code> field.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
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
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Cart.</p>
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
     *  <p>Used for LineItem Price selection.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
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
     *  <p>Number of days after which an active Cart is deleted since its last modification. Configured in Project settings.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

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
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
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

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setCustomerId(final String customerId);

    public void setCustomerEmail(final String customerEmail);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setAnonymousId(final String anonymousId);

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    public void setStore(final StoreKeyReference store);

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    public void setLineItems(final List<LineItem> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    public void setTotalLineItemQuantity(final Long totalLineItemQuantity);

    public void setTotalPrice(final CentPrecisionMoney totalPrice);

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setTaxedShippingPrice(final TaxedPrice taxedShippingPrice);

    public void setTaxMode(final TaxMode taxMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setCartState(final CartState cartState);

    public void setBillingAddress(final Address billingAddress);

    public void setShippingAddress(final Address shippingAddress);

    public void setShippingMode(final ShippingMode shippingMode);

    public void setShippingInfo(final ShippingInfo shippingInfo);

    @JsonIgnore
    public void setShipping(final Shipping... shipping);

    public void setShipping(final List<Shipping> shipping);

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

    public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);

    @JsonIgnore
    public void setDirectDiscounts(final DirectDiscount... directDiscounts);

    public void setDirectDiscounts(final List<DirectDiscount> directDiscounts);

    @JsonIgnore
    public void setRefusedGifts(final CartDiscountReference... refusedGifts);

    public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    public void setCountry(final String country);

    public void setLocale(final String locale);

    public void setOrigin(final CartOrigin origin);

    public void setCustom(final CustomFields custom);

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

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
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setCartState(template.getCartState());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingMode(template.getShippingMode());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setShipping(template.getShipping());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setDirectDiscounts(template.getDirectDiscounts());
        instance.setRefusedGifts(template.getRefusedGifts());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setOrigin(template.getOrigin());
        instance.setCustom(template.getCustom());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
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

    public static com.fasterxml.jackson.core.type.TypeReference<Cart> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Cart>() {
            @Override
            public String toString() {
                return "TypeReference<Cart>";
            }
        };
    }
}
