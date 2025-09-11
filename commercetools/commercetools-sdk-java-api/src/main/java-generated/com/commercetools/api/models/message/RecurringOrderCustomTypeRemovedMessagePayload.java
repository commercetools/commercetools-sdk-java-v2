
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomTypeAction" rel="nofollow">Set Custom Type</a> with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomTypeRemovedMessagePayload recurringOrderCustomTypeRemovedMessagePayload = RecurringOrderCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderCustomTypeRemovedMessagePayloadImpl.class)
public interface RecurringOrderCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderCustomTypeRemovedMessagePayload
     */
    String RECURRING_ORDER_CUSTOM_TYPE_REMOVED = "RecurringOrderCustomTypeRemoved";

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
     * @return instance of RecurringOrderCustomTypeRemovedMessagePayload
     */
    public static RecurringOrderCustomTypeRemovedMessagePayload of() {
        return new RecurringOrderCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderCustomTypeRemovedMessagePayload of(
            final RecurringOrderCustomTypeRemovedMessagePayload template) {
        RecurringOrderCustomTypeRemovedMessagePayloadImpl instance = new RecurringOrderCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    public RecurringOrderCustomTypeRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final RecurringOrderCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderCustomTypeRemovedMessagePayloadImpl instance = new RecurringOrderCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static RecurringOrderCustomTypeRemovedMessagePayloadBuilder builder() {
        return RecurringOrderCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomTypeRemovedMessagePayloadBuilder builder(
            final RecurringOrderCustomTypeRemovedMessagePayload template) {
        return RecurringOrderCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderCustomTypeRemovedMessagePayload(
            Function<RecurringOrderCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
