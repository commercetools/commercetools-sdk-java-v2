
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
 *     DiscountCodeKeySetMessagePayload discountCodeKeySetMessagePayload = DiscountCodeKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DiscountCodeKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeKeySetMessagePayloadImpl.class)
public interface DiscountCodeKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for DiscountCodeKeySetMessagePayload
     */
    String DISCOUNT_CODE_KEY_SET = "DiscountCodeKeySet";

    /**
     *  <p><code>key</code> value of the Discount Code after the Set Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the Discount Code before the Set Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the Discount Code after the Set Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the Discount Code before the Set Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of DiscountCodeKeySetMessagePayload
     */
    public static DiscountCodeKeySetMessagePayload of() {
        return new DiscountCodeKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeKeySetMessagePayload of(final DiscountCodeKeySetMessagePayload template) {
        DiscountCodeKeySetMessagePayloadImpl instance = new DiscountCodeKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public DiscountCodeKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeKeySetMessagePayload deepCopy(@Nullable final DiscountCodeKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        DiscountCodeKeySetMessagePayloadImpl instance = new DiscountCodeKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeKeySetMessagePayload
     * @return builder
     */
    public static DiscountCodeKeySetMessagePayloadBuilder builder() {
        return DiscountCodeKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for DiscountCodeKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeKeySetMessagePayloadBuilder builder(final DiscountCodeKeySetMessagePayload template) {
        return DiscountCodeKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeKeySetMessagePayload(Function<DiscountCodeKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeKeySetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeKeySetMessagePayload>";
            }
        };
    }
}
