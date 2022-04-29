
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartDraftImpl.class)
public interface MyCartDraft extends com.commercetools.api.models.CustomizableDraft<MyCartDraft> {

    /**
    *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

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

    @Valid
    @JsonProperty("lineItems")
    public List<MyLineItemDraft> getLineItems();

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
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @JsonProperty("locale")
    public String getLocale();

    /**
    *  <p>The <code>TaxMode</code> <code>Disabled</code> can not be set on the My Carts endpoint.</p>
    */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
    *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.
    *  If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
    */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    /**
    *  <p>Contains addresses for orders with multiple shipping addresses.
    *  Each address must contain a key which is unique in this cart.</p>
    */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    @Valid
    @JsonProperty("discountCodes")
    public List<DiscountCodeInfo> getDiscountCodes();

    public void setCurrency(final String currency);

    public void setCustomerEmail(final String customerEmail);

    public void setCountry(final String country);

    public void setInventoryMode(final InventoryMode inventoryMode);

    @JsonIgnore
    public void setLineItems(final MyLineItemDraft... lineItems);

    public void setLineItems(final List<MyLineItemDraft> lineItems);

    public void setShippingAddress(final BaseAddress shippingAddress);

    public void setBillingAddress(final BaseAddress billingAddress);

    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);

    public void setCustom(final CustomFieldsDraft custom);

    public void setLocale(final String locale);

    public void setTaxMode(final TaxMode taxMode);

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    public void setStore(final StoreKeyReference store);

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

    public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);

    public static MyCartDraft of() {
        return new MyCartDraftImpl();
    }

    public static MyCartDraft of(final MyCartDraft template) {
        MyCartDraftImpl instance = new MyCartDraftImpl();
        instance.setCurrency(template.getCurrency());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCountry(template.getCountry());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setLineItems(template.getLineItems());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingMethod(template.getShippingMethod());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setTaxMode(template.getTaxMode());
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setStore(template.getStore());
        instance.setDiscountCodes(template.getDiscountCodes());
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
