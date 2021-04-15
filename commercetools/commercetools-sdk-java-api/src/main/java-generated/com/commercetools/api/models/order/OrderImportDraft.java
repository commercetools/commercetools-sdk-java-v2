
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CustomLineItemDraft;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.TaxedPriceDraft;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderImportDraftImpl.class)
public interface OrderImportDraft {

    /**
    *  <p>String that unique identifies an order.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
    *  It should be unique within a project.</p>
    */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
    *  <p>If given the customer with that ID must exist in the project.</p>
    */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
    *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
    */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
    *  <p>If not given <code>customLineItems</code> must not be empty.</p>
    */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemImportDraft> getLineItems();

    /**
    *  <p>If not given <code>lineItems</code> must not be empty.</p>
    */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemDraft> getCustomLineItems();

    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
    *  <p>Order Import does not support calculation of taxes.
    *  When setting the draft the taxedPrice is to be provided.</p>
    */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPriceDraft getTaxedPrice();

    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
    *  <p>Set when the customer is set and the customer is a member of a customer group.
    *  Used for product variant price selection.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
    *  Used for product variant price selection.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
    */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
    *  <p>Set if the ShippingMethod is set.</p>
    */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfoImportDraft getShippingInfo();

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
    */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
    *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
    */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
    *  <p>Contains addresses for orders with multiple shipping addresses.</p>
    */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
    *  <p>The default origin is <code>Customer</code>.</p>
    */

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    public void setOrderNumber(final String orderNumber);

    public void setCustomerId(final String customerId);

    public void setCustomerEmail(final String customerEmail);

    @JsonIgnore
    public void setLineItems(final LineItemImportDraft... lineItems);

    public void setLineItems(final List<LineItemImportDraft> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemDraft... customLineItems);

    public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);

    public void setTotalPrice(final Money totalPrice);

    public void setTaxedPrice(final TaxedPriceDraft taxedPrice);

    public void setShippingAddress(final Address shippingAddress);

    public void setBillingAddress(final Address billingAddress);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setCountry(final String country);

    public void setOrderState(final OrderState orderState);

    public void setShipmentState(final ShipmentState shipmentState);

    public void setPaymentState(final PaymentState paymentState);

    public void setShippingInfo(final ShippingInfoImportDraft shippingInfo);

    public void setCompletedAt(final ZonedDateTime completedAt);

    public void setCustom(final CustomFieldsDraft custom);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    public void setStore(final StoreResourceIdentifier store);

    public void setOrigin(final CartOrigin origin);

    public static OrderImportDraft of() {
        return new OrderImportDraftImpl();
    }

    public static OrderImportDraft of(final OrderImportDraft template) {
        OrderImportDraftImpl instance = new OrderImportDraftImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(template.getCustom());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setStore(template.getStore());
        instance.setOrigin(template.getOrigin());
        return instance;
    }

    public static OrderImportDraftBuilder builder() {
        return OrderImportDraftBuilder.of();
    }

    public static OrderImportDraftBuilder builder(final OrderImportDraft template) {
        return OrderImportDraftBuilder.of(template);
    }

    default <T> T withOrderImportDraft(Function<OrderImportDraft, T> helper) {
        return helper.apply(this);
    }
}
