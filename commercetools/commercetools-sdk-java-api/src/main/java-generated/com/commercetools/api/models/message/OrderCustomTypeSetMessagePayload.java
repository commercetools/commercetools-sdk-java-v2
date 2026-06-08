
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomTypeSetMessagePayload orderCustomTypeSetMessagePayload = OrderCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomTypeSetMessagePayloadImpl.class)
public interface OrderCustomTypeSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomTypeSetMessagePayload
     */
    String ORDER_CUSTOM_TYPE_SET = "OrderCustomTypeSet";

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of OrderCustomTypeSetMessagePayload
     */
    public static OrderCustomTypeSetMessagePayload of() {
        return new OrderCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomTypeSetMessagePayload of(final OrderCustomTypeSetMessagePayload template) {
        OrderCustomTypeSetMessagePayloadImpl instance = new OrderCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public OrderCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomTypeSetMessagePayload deepCopy(@Nullable final OrderCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomTypeSetMessagePayloadImpl instance = new OrderCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for OrderCustomTypeSetMessagePayload
     * @return builder
     */
    public static OrderCustomTypeSetMessagePayloadBuilder builder() {
        return OrderCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomTypeSetMessagePayloadBuilder builder(final OrderCustomTypeSetMessagePayload template) {
        return OrderCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomTypeSetMessagePayload(Function<OrderCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomTypeSetMessagePayload>";
            }
        };
    }
}
