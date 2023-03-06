
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The <code>customerId</code> is determined by a password flow token and automatically set on the resulting Cart. The <code>anonymousId</code> is determined by a token for an anonymous session and automatically set on the resulting Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartDraft myCartDraft = MyCartDraft.builder()
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartDraftImpl.class)
public interface MyCartDraft extends com.commercetools.api.models.CustomizableDraft<MyCartDraft>,
        io.vrap.rmf.base.client.Draft<MyCartDraft> {

    /**
     *  <p>Currency the Cart uses.</p>
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Email address of the Customer the Cart belongs to.</p>
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

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
    public List<MyLineItemDraft> getLineItems();

    /**
     *  <p>Determines how Tax Rates are set. The <code>Disabled</code> TaxMode <strong>cannot</strong> be set.</p>
     */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

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
     *  <p>Shipping Method for the Cart. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     */
    @Valid
    @JsonProperty("shippingMethod")
    public ShippingMethodResourceIdentifier getShippingMethod();

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
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
     *  <p>Number of days after which a Cart with <code>Active</code> CartState is deleted since its last modification. If not provided, the default value for this field configured in Project settings is assigned.</p>
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

    public void setCustomerEmail(final String customerEmail);

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    public void setStore(final StoreResourceIdentifier store);

    @JsonIgnore
    public void setLineItems(final MyLineItemDraft... lineItems);

    public void setLineItems(final List<MyLineItemDraft> lineItems);

    public void setTaxMode(final TaxMode taxMode);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setBillingAddress(final BaseAddress billingAddress);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    @JsonIgnore
    public void setDiscountCodes(final String... discountCodes);

    public void setDiscountCodes(final List<String> discountCodes);

    public void setCountry(final String country);

    public void setLocale(final String locale);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public void setCustom(final CustomFieldsDraft custom);

    public static MyCartDraft of() {
        return new MyCartDraftImpl();
    }

    public static MyCartDraft of(final MyCartDraft template) {
        MyCartDraftImpl instance = new MyCartDraftImpl();
        instance.setCurrency(template.getCurrency());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setTaxMode(template.getTaxMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setCountry(template.getCountry());
        instance.setLocale(template.getLocale());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static MyCartDraftBuilder builder() {
        return MyCartDraftBuilder.of();
    }

    public static MyCartDraftBuilder builder(final MyCartDraft template) {
        return MyCartDraftBuilder.of(template);
    }

    default <T> T withMyCartDraft(Function<MyCartDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartDraft>";
            }
        };
    }
}
