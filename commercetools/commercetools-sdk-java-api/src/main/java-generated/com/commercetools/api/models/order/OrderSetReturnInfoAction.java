
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnInfoAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnInfoAction orderSetReturnInfoAction = OrderSetReturnInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnInfoActionImpl.class)
public interface OrderSetReturnInfoAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetReturnInfoAction
     */
    String SET_RETURN_INFO = "setReturnInfo";

    /**
     *
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<ReturnInfoDraft> getItems();

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnInfoDraft... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<ReturnInfoDraft> items);

    /**
     * factory method
     * @return instance of OrderSetReturnInfoAction
     */
    public static OrderSetReturnInfoAction of() {
        return new OrderSetReturnInfoActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnInfoAction of(final OrderSetReturnInfoAction template) {
        OrderSetReturnInfoActionImpl instance = new OrderSetReturnInfoActionImpl();
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetReturnInfoAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetReturnInfoAction deepCopy(@Nullable final OrderSetReturnInfoAction template) {
        if (template == null) {
            return null;
        }
        OrderSetReturnInfoActionImpl instance = new OrderSetReturnInfoActionImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnInfoDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSetReturnInfoAction
     * @return builder
     */
    public static OrderSetReturnInfoActionBuilder builder() {
        return OrderSetReturnInfoActionBuilder.of();
    }

    /**
     * create builder for OrderSetReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnInfoActionBuilder builder(final OrderSetReturnInfoAction template) {
        return OrderSetReturnInfoActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetReturnInfoAction(Function<OrderSetReturnInfoAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnInfoAction>";
            }
        };
    }
}
