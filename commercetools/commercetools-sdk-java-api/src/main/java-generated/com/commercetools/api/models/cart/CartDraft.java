
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDraftImpl.class)
public interface CartDraft extends com.commercetools.api.models.CustomizableDraft<CartDraft> {

    /**
    *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
    *  <p>User-specific unique identifier of the cart.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Id of an existing Customer.</p>
    */

    @JsonProperty("customerId")
    public String getCustomerId();

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
    *  <p>Will be set automatically when the <code>customerId</code> is set and the customer is a member of a customer group.
    *  Can be set explicitly when no <code>customerId</code> is present.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
    *  <p>Assigns the new cart to an anonymous session (the customer has not signed up/in yet).</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
    *  <p>Assigns the new cart to the store.
    *  The store assignment can not be modified.</p>
    */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Default inventory mode is <code>None</code>.</p>
    */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
    *  <p>The default tax mode is <code>Platform</code>.</p>
    */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
    *  <p>The default tax rounding mode is <code>HalfEven</code>.</p>
    */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
    *  <p>The default tax calculation mode is <code>LineItemLevel</code>.</p>
    */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    @Valid
    @JsonProperty("lineItems")
    public List<LineItemDraft> getLineItems();

    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemDraft> getCustomLineItems();

    /**
    *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
    */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    @Valid
    @JsonProperty("billingAddress")
    public BaseAddress getBillingAddress();

    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
    *  <p>An external tax rate can be set for the <code>shippingMethod</code> if the cart has the <code>External</code> TaxMode.</p>
    */
    @Valid
    @JsonProperty("externalTaxRateForShippingMethod")
    public ExternalTaxRateDraft getExternalTaxRateForShippingMethod();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>Must be one of the languages supported for this project</p>
    */

    @JsonProperty("locale")
    public String getLocale();

    /**
    *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.
    *  If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
    */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
    *  <p>The default origin is <code>Customer</code>.</p>
    */

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
    *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.
    *  Based on the definition of ShippingRateInputType.
    *  If CartClassification is defined, it must be ClassificationShippingRateInput.
    *  If CartScore is defined, it must be ScoreShippingRateInput.
    *  Otherwise it can not bet set.</p>
    */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
    *  <p>Contains addresses for carts with multiple shipping addresses.
    *  Each address must contain a key which is unique in this cart.
    *  Line items will use these keys to reference the addresses under their <code>shippingDetails</code>.
    *  The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate.
    *  Only the cart's <code>shippingAddress</code> is used for this.</p>
    */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    /**
    *  <p>The code of existing DiscountCodes.</p>
    */

    @JsonProperty("discountCodes")
    public List<String> getDiscountCodes();

    public void setCurrency(final String currency);

    public void setKey(final String key);

    public void setCustomerId(final String customerId);

    public void setCustomerEmail(final String customerEmail);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setAnonymousId(final String anonymousId);

    public void setStore(final StoreResourceIdentifier store);

    public void setCountry(final String country);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setTaxMode(final TaxMode taxMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    @JsonIgnore
    public void setLineItems(final LineItemDraft... lineItems);

    public void setLineItems(final List<LineItemDraft> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemDraft... customLineItems);

    public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setBillingAddress(final BaseAddress billingAddress);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setExternalTaxRateForShippingMethod(final ExternalTaxRateDraft externalTaxRateForShippingMethod);

    public void setCustom(final CustomFieldsDraft custom);

    public void setLocale(final String locale);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setOrigin(final CartOrigin origin);

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    @JsonIgnore
    public void setDiscountCodes(final String... discountCodes);

    public void setDiscountCodes(final List<String> discountCodes);

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
        instance.setStore(template.getStore());
        instance.setCountry(template.getCountry());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setExternalTaxRateForShippingMethod(template.getExternalTaxRateForShippingMethod());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setOrigin(template.getOrigin());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDiscountCodes(template.getDiscountCodes());
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
