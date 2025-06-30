
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupKeySetMessagePayload discountGroupKeySetMessagePayload = DiscountGroupKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountGroupKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupKeySetMessagePayloadImpl.class)
public interface DiscountGroupKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountGroupKeySetMessagePayload
     */
    String DISCOUNT_GROUP_KEY_SET = "DiscountGroupKeySet";

    /**
     *  <p><code>key</code> value of the DiscountGroup after the Set Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the DiscountGroup before the Set Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the DiscountGroup after the Set Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the DiscountGroup before the Set Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of DiscountGroupKeySetMessagePayload
     */
    public static DiscountGroupKeySetMessagePayload of() {
        return new DiscountGroupKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupKeySetMessagePayload of(final DiscountGroupKeySetMessagePayload template) {
        DiscountGroupKeySetMessagePayloadImpl instance = new DiscountGroupKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public DiscountGroupKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupKeySetMessagePayload deepCopy(
            @Nullable final DiscountGroupKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountGroupKeySetMessagePayloadImpl instance = new DiscountGroupKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupKeySetMessagePayload
     * @return builder
     */
    public static DiscountGroupKeySetMessagePayloadBuilder builder() {
        return DiscountGroupKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountGroupKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupKeySetMessagePayloadBuilder builder(final DiscountGroupKeySetMessagePayload template) {
        return DiscountGroupKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupKeySetMessagePayload(Function<DiscountGroupKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupKeySetMessagePayload>";
            }
        };
    }
}
