
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the ParcelItemsUpdated Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelItemsAction stagedOrderSetParcelItemsAction = StagedOrderSetParcelItemsAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelItemsActionImpl.class)
public interface StagedOrderSetParcelItemsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetParcelItemsAction
     */
    String SET_PARCEL_ITEMS = "setParcelItems";

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of StagedOrderSetParcelItemsAction
     */
    public static StagedOrderSetParcelItemsAction of() {
        return new StagedOrderSetParcelItemsActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetParcelItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetParcelItemsAction of(final StagedOrderSetParcelItemsAction template) {
        StagedOrderSetParcelItemsActionImpl instance = new StagedOrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetParcelItemsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetParcelItemsAction deepCopy(@Nullable final StagedOrderSetParcelItemsAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetParcelItemsActionImpl instance = new StagedOrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetParcelItemsAction
     * @return builder
     */
    public static StagedOrderSetParcelItemsActionBuilder builder() {
        return StagedOrderSetParcelItemsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetParcelItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelItemsActionBuilder builder(final StagedOrderSetParcelItemsAction template) {
        return StagedOrderSetParcelItemsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetParcelItemsAction(Function<StagedOrderSetParcelItemsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelItemsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelItemsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelItemsAction>";
            }
        };
    }
}
