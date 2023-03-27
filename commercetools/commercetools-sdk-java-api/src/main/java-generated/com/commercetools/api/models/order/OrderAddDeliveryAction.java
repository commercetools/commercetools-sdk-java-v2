
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddDeliveryAction orderAddDeliveryAction = OrderAddDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderAddDeliveryActionImpl.class)
public interface OrderAddDeliveryAction
        extends OrderUpdateAction, com.commercetools.api.models.CustomizableDraft<OrderAddDeliveryAction> {

    /**
     * discriminator value for OrderAddDeliveryAction
     */
    String ADD_DELIVERY = "addDelivery";

    /**
     *
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *
     * @return parcels
     */
    @Valid
    @JsonProperty("parcels")
    public List<ParcelDraft> getParcels();

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * set parcels
     * @param parcels values to be set
     */

    @JsonIgnore
    public void setParcels(final ParcelDraft... parcels);

    /**
     * set parcels
     * @param parcels values to be set
     */

    public void setParcels(final List<ParcelDraft> parcels);

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of OrderAddDeliveryAction
     */
    public static OrderAddDeliveryAction of() {
        return new OrderAddDeliveryActionImpl();
    }

    /**
     * factory method to copy an instance of OrderAddDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderAddDeliveryAction of(final OrderAddDeliveryAction template) {
        OrderAddDeliveryActionImpl instance = new OrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setShippingKey(template.getShippingKey());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * builder factory method for OrderAddDeliveryAction
     * @return builder
     */
    public static OrderAddDeliveryActionBuilder builder() {
        return OrderAddDeliveryActionBuilder.of();
    }

    /**
     * create builder for OrderAddDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddDeliveryActionBuilder builder(final OrderAddDeliveryAction template) {
        return OrderAddDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderAddDeliveryAction(Function<OrderAddDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddDeliveryAction>";
            }
        };
    }
}
