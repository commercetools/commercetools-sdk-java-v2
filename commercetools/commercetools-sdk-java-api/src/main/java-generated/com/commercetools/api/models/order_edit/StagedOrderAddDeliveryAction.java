
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddDeliveryAction stagedOrderAddDeliveryAction = StagedOrderAddDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddDeliveryActionImpl.class)
public interface StagedOrderAddDeliveryAction
        extends StagedOrderUpdateAction, com.commercetools.api.models.CustomizableDraft<StagedOrderAddDeliveryAction> {

    /**
     * discriminator value for StagedOrderAddDeliveryAction
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
     * @return instance of StagedOrderAddDeliveryAction
     */
    public static StagedOrderAddDeliveryAction of() {
        return new StagedOrderAddDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddDeliveryAction of(final StagedOrderAddDeliveryAction template) {
        StagedOrderAddDeliveryActionImpl instance = new StagedOrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderAddDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddDeliveryAction deepCopy(@Nullable final StagedOrderAddDeliveryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddDeliveryActionImpl instance = new StagedOrderAddDeliveryActionImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        instance.setParcels(Optional.ofNullable(template.getParcels())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ParcelDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddDeliveryAction
     * @return builder
     */
    public static StagedOrderAddDeliveryActionBuilder builder() {
        return StagedOrderAddDeliveryActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddDeliveryActionBuilder builder(final StagedOrderAddDeliveryAction template) {
        return StagedOrderAddDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddDeliveryAction(Function<StagedOrderAddDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddDeliveryAction>";
            }
        };
    }
}
