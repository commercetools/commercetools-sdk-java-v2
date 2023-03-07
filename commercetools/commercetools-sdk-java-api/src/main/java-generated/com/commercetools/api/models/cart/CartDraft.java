
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>id</code> of the Customer that the Cart belongs to.</p>
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for LineItem Price selection.</p>
     *  <p>It is automatically set if the Customer referenced in <code>customerId</code> belongs to a Customer Group. It can also be set explicitly when no <code>customerId</code> is present.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to.</p>
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Line Items to add to the Cart.</p>
     */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemDraft> getLineItems();

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemDraft> getCustomLineItems();

    /**
     *  <p>Determines how Tax Rates are set.</p>
     */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     */
    @Valid
    @JsonProperty("externalTaxRateForShippingMethod")
    public ExternalTaxRateDraft getExternalTaxRateForShippingMethod();

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Determines how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Billing address associated with the Cart.</p>
     */
    @Valid
    @JsonProperty("billingAddress")
    public BaseAddress getBillingAddress();

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
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
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     */

    @JsonProperty("shippingMode")
    public ShippingMode getShippingMode();

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */
    @Valid
    @JsonProperty("customShipping")
    public List<CustomShippingDraft> getCustomShipping();

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */
    @Valid
    @JsonProperty("shipping")
    public List<ShippingDraft> getShipping();

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     */

    @JsonProperty("discountCodes")
    public List<String> getDiscountCodes();

    /**
     *  <p>Used for LineItem Price selection. If used for Create Cart in Store, the provided country must be one of the Store's <code>countries</code>.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Indicates how the Cart was created.</p>
     */

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>Number of days after which an active Cart is deleted since its last modification. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
     */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
     *  <p>Custom Fields for the Cart.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setCurrency(final String currency);

    public void setKey(final String key);

    public void setCustomerId(final String customerId);

    public void setCustomerEmail(final String customerEmail);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setAnonymousId(final String anonymousId);

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    public void setStore(final StoreResourceIdentifier store);

    @JsonIgnore
    public void setLineItems(final LineItemDraft... lineItems);

    public void setLineItems(final List<LineItemDraft> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemDraft... customLineItems);

    public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);

    public void setTaxMode(final TaxMode taxMode);

    public void setExternalTaxRateForShippingMethod(final ExternalTaxRateDraft externalTaxRateForShippingMethod);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setBillingAddress(final BaseAddress billingAddress);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    public void setShippingMode(final ShippingMode shippingMode);

    @JsonIgnore
    public void setCustomShipping(final CustomShippingDraft... customShipping);

    public void setCustomShipping(final List<CustomShippingDraft> customShipping);

    @JsonIgnore
    public void setShipping(final ShippingDraft... shipping);

    public void setShipping(final List<ShippingDraft> shipping);

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    @JsonIgnore
    public void setDiscountCodes(final String... discountCodes);

    public void setDiscountCodes(final List<String> discountCodes);

    public void setCountry(final String country);

    public void setLocale(final String locale);

    public void setOrigin(final CartOrigin origin);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setCustom(final CustomFieldsDraft custom);

    public static CartDraft of() {
        return new CartDraftImpl();
    }

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

    public static CartDraftBuilder builder() {
        return CartDraftBuilder.of();
    }

    public static CartDraftBuilder builder(final CartDraft template) {
        return CartDraftBuilder.of(template);
    }

    default <T> T withCartDraft(Function<CartDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDraft>";
            }
        };
    }
}
