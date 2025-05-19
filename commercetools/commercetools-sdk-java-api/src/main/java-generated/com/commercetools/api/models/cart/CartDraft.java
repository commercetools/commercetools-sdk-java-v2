
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CartDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDraft cartDraft = CartDraft.builder()
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDraftImpl.class)
public interface CartDraft extends com.commercetools.api.models.CustomizableDraft<CartDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<CartDraft> {

    /**
     *  <p>Currency the Cart uses.</p>
     * @return currency
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
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
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for Line Item price selection.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemDraft> getLineItems();

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @return customLineItems
     */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemDraft> getCustomLineItems();

    /**
     *  <p>Determines how Tax Rates are set.</p>
     * @return taxMode
     */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     * @return externalTaxRateForShippingMethod
     */
    @Valid
    @JsonProperty("externalTaxRateForShippingMethod")
    public ExternalTaxRateDraft getExternalTaxRateForShippingMethod();

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public BaseAddress getBillingAddress();

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> ShippingMode. Determines eligible ShippingMethod rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @return shippingMethod
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @return shippingMode
     */

    @JsonProperty("shippingMode")
    public ShippingMode getShippingMode();

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return customShipping
     */
    @Valid
    @JsonProperty("customShipping")
    public List<CustomShippingDraft> getCustomShipping();

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shipping
     */
    @Valid
    @JsonProperty("shipping")
    public List<ShippingDraft> getShipping();

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @return discountCodes
     */

    @JsonProperty("discountCodes")
    public List<String> getDiscountCodes();

    /**
     *  <p>Used for Line Item price selection. If used for Create Cart in Store, the provided country must be one of the Store's <code>countries</code>.</p>
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

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
     * @return deleteDaysAfterLastModification
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Currency the Cart uses.</p>
     * @param currency value to be set
     */

    public void setCurrency(final String currency);

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>id</code> of the Customer that the Cart belongs to.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for Line Item price selection.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItemDraft... lineItems);

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItemDraft> lineItems);

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemDraft... customLineItems);

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param customLineItems values to be set
     */

    public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);

    /**
     *  <p>Determines how Tax Rates are set.</p>
     * @param taxMode value to be set
     */

    public void setTaxMode(final TaxMode taxMode);

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     * @param externalTaxRateForShippingMethod value to be set
     */

    public void setExternalTaxRateForShippingMethod(final ExternalTaxRateDraft externalTaxRateForShippingMethod);

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     */

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final BaseAddress billingAddress);

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> ShippingMode. Determines eligible ShippingMethod rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final BaseAddress shippingAddress);

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param shippingMethod value to be set
     */

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @param shippingMode value to be set
     */

    public void setShippingMode(final ShippingMode shippingMode);

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param customShipping values to be set
     */

    @JsonIgnore
    public void setCustomShipping(final CustomShippingDraft... customShipping);

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param customShipping values to be set
     */

    public void setCustomShipping(final List<CustomShippingDraft> customShipping);

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shipping values to be set
     */

    @JsonIgnore
    public void setShipping(final ShippingDraft... shipping);

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shipping values to be set
     */

    public void setShipping(final List<ShippingDraft> shipping);

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes values to be set
     */

    @JsonIgnore
    public void setDiscountCodes(final String... discountCodes);

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes values to be set
     */

    public void setDiscountCodes(final List<String> discountCodes);

    /**
     *  <p>Used for Line Item price selection. If used for Create Cart in Store, the provided country must be one of the Store's <code>countries</code>.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Indicates how the Cart was created.</p>
     * @param origin value to be set
     */

    public void setOrigin(final CartOrigin origin);

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
     * @param deleteDaysAfterLastModification value to be set
     */

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of CartDraft
     */
    public static CartDraft of() {
        return new CartDraftImpl();
    }

    /**
     * factory method to create a shallow copy CartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDraft of(final CartDraft template) {
        CartDraftImpl instance = new CartDraftImpl();
        instance.setCurrency(template.getCurrency());
        instance.setKey(template.getKey());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTaxMode(template.getTaxMode());
        instance.setExternalTaxRateForShippingMethod(template.getExternalTaxRateForShippingMethod());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setShippingMode(template.getShippingMode());
        instance.setCustomShipping(template.getCustomShipping());
        instance.setShipping(template.getShipping());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setOrigin(template.getOrigin());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public CartDraft copyDeep();

    /**
     * factory method to create a deep copy of CartDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDraft deepCopy(@Nullable final CartDraft template) {
        if (template == null) {
            return null;
        }
        CartDraftImpl instance = new CartDraftImpl();
        instance.setCurrency(template.getCurrency());
        instance.setKey(template.getKey());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.LineItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomLineItems(Optional.ofNullable(template.getCustomLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.CustomLineItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxMode(template.getTaxMode());
        instance.setExternalTaxRateForShippingMethod(com.commercetools.api.models.cart.ExternalTaxRateDraft
                .deepCopy(template.getExternalTaxRateForShippingMethod()));
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getBillingAddress()));
        instance.setShippingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getShippingAddress()));
        instance.setShippingMethod(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier
                .deepCopy(template.getShippingMethod()));
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInputDraft.deepCopy(template.getShippingRateInput()));
        instance.setShippingMode(template.getShippingMode());
        instance.setCustomShipping(Optional.ofNullable(template.getCustomShipping())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.CustomShippingDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShipping(Optional.ofNullable(template.getShipping())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.ShippingDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDiscountCodes(Optional.ofNullable(template.getDiscountCodes()).map(ArrayList::new).orElse(null));
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setOrigin(template.getOrigin());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for CartDraft
     * @return builder
     */
    public static CartDraftBuilder builder() {
        return CartDraftBuilder.of();
    }

    /**
     * create builder for CartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDraftBuilder builder(final CartDraft template) {
        return CartDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDraft(Function<CartDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDraft>";
            }
        };
    }
}
