
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnInfoAddedMessage" rel="nofollow">Return Info Added</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddReturnInfoAction orderAddReturnInfoAction = OrderAddReturnInfoAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addReturnInfo")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderAddReturnInfoActionImpl.class)
public interface OrderAddReturnInfoAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderAddReturnInfoAction
     */
    String ADD_RETURN_INFO = "addReturnInfo";

    /**
     *  <p>Value to set.</p>
     * @return returnTrackingId
     */

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();

    /**
     *  <p>Value to set. If not set, it defaults to the current date and time.</p>
     * @return returnDate
     */

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    /**
     *  <p>Value to set.</p>
     * @param returnTrackingId value to be set
     */

    public void setReturnTrackingId(final String returnTrackingId);

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnItemDraft... items);

    /**
     *  <p>Items to be returned. Must not be empty.</p>
     * @param items values to be set
     */

    public void setItems(final List<ReturnItemDraft> items);

    /**
     *  <p>Value to set. If not set, it defaults to the current date and time.</p>
     * @param returnDate value to be set
     */

    public void setReturnDate(final ZonedDateTime returnDate);

    /**
     * factory method
     * @return instance of OrderAddReturnInfoAction
     */
    public static OrderAddReturnInfoAction of() {
        return new OrderAddReturnInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderAddReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderAddReturnInfoAction of(final OrderAddReturnInfoAction template) {
        OrderAddReturnInfoActionImpl instance = new OrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(template.getItems());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    public OrderAddReturnInfoAction copyDeep();

    /**
     * factory method to create a deep copy of OrderAddReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderAddReturnInfoAction deepCopy(@Nullable final OrderAddReturnInfoAction template) {
        if (template == null) {
            return null;
        }
        OrderAddReturnInfoActionImpl instance = new OrderAddReturnInfoActionImpl();
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    /**
     * builder factory method for OrderAddReturnInfoAction
     * @return builder
     */
    public static OrderAddReturnInfoActionBuilder builder() {
        return OrderAddReturnInfoActionBuilder.of();
    }

    /**
     * create builder for OrderAddReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddReturnInfoActionBuilder builder(final OrderAddReturnInfoAction template) {
        return OrderAddReturnInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderAddReturnInfoAction(Function<OrderAddReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddReturnInfoAction>";
            }
        };
    }
}
