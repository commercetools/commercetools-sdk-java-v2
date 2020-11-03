package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyLineItemDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.me.MyCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCartDraftImpl.class)
public interface MyCartDraft  {

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
    public Address getShippingAddress();
    
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();
    
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
    public List<Address> getItemShippingAddresses();

    public void setCurrency(final String currency);
    
    public void setCustomerEmail(final String customerEmail);
    
    public void setCountry(final String country);
    
    public void setInventoryMode(final InventoryMode inventoryMode);
    
    @JsonIgnore
    public void setLineItems(final MyLineItemDraft ...lineItems);
    public void setLineItems(final List<MyLineItemDraft> lineItems);
    
    public void setShippingAddress(final Address shippingAddress);
    
    public void setBillingAddress(final Address billingAddress);
    
    public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
    
    public void setCustom(final CustomFieldsDraft custom);
    
    public void setLocale(final String locale);
    
    public void setTaxMode(final TaxMode taxMode);
    
    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
    
    @JsonIgnore
    public void setItemShippingAddresses(final Address ...itemShippingAddresses);
    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    public static MyCartDraftImpl of(){
        return new MyCartDraftImpl();
    }
    

    public static MyCartDraftImpl of(final MyCartDraft template) {
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
        return instance;
    }

    default <T> T withMyCartDraft(Function<MyCartDraft, T> helper) {
        return helper.apply(this);
    }
}
