
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a> with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomTypeRemovedMessagePayload orderCustomTypeRemovedMessagePayload = OrderCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomTypeRemovedMessagePayloadImpl.class)
public interface OrderCustomTypeRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomTypeRemovedMessagePayload
     */
    String ORDER_CUSTOM_TYPE_REMOVED = "OrderCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of OrderCustomTypeRemovedMessagePayload
     */
    public static OrderCustomTypeRemovedMessagePayload of() {
        return new OrderCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomTypeRemovedMessagePayload of(final OrderCustomTypeRemovedMessagePayload template) {
        OrderCustomTypeRemovedMessagePayloadImpl instance = new OrderCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public OrderCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final OrderCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomTypeRemovedMessagePayloadImpl instance = new OrderCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for OrderCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static OrderCustomTypeRemovedMessagePayloadBuilder builder() {
        return OrderCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomTypeRemovedMessagePayloadBuilder builder(
            final OrderCustomTypeRemovedMessagePayload template) {
        return OrderCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomTypeRemovedMessagePayload(Function<OrderCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
