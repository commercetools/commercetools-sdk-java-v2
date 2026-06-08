
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderKeySetMessagePayload recurringOrderKeySetMessagePayload = RecurringOrderKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderKeySetMessagePayloadImpl.class)
public interface RecurringOrderKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for RecurringOrderKeySetMessagePayload
     */
    String RECURRING_ORDER_KEY_SET = "RecurringOrderKeySet";

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of RecurringOrderKeySetMessagePayload
     */
    public static RecurringOrderKeySetMessagePayload of() {
        return new RecurringOrderKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderKeySetMessagePayload of(final RecurringOrderKeySetMessagePayload template) {
        RecurringOrderKeySetMessagePayloadImpl instance = new RecurringOrderKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public RecurringOrderKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderKeySetMessagePayload deepCopy(
            @Nullable final RecurringOrderKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        RecurringOrderKeySetMessagePayloadImpl instance = new RecurringOrderKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderKeySetMessagePayload
     * @return builder
     */
    public static RecurringOrderKeySetMessagePayloadBuilder builder() {
        return RecurringOrderKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for RecurringOrderKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderKeySetMessagePayloadBuilder builder(final RecurringOrderKeySetMessagePayload template) {
        return RecurringOrderKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderKeySetMessagePayload(Function<RecurringOrderKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderKeySetMessagePayload>";
            }
        };
    }
}
