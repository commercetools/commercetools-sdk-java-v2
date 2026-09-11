
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantKeySetMessagePayload variantKeySetMessagePayload = VariantKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantKeySetMessagePayloadImpl.class)
public interface VariantKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantKeySetMessagePayload
     */
    String VARIANT_KEY_SET = "VariantKeySet";

    /**
     *  <p>The key that was set on the Variant.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The previous key of the Variant.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p>The key that was set on the Variant.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The previous key of the Variant.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of VariantKeySetMessagePayload
     */
    public static VariantKeySetMessagePayload of() {
        return new VariantKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantKeySetMessagePayload of(final VariantKeySetMessagePayload template) {
        VariantKeySetMessagePayloadImpl instance = new VariantKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public VariantKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantKeySetMessagePayload deepCopy(@Nullable final VariantKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantKeySetMessagePayloadImpl instance = new VariantKeySetMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for VariantKeySetMessagePayload
     * @return builder
     */
    public static VariantKeySetMessagePayloadBuilder builder() {
        return VariantKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantKeySetMessagePayloadBuilder builder(final VariantKeySetMessagePayload template) {
        return VariantKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantKeySetMessagePayload(Function<VariantKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantKeySetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantKeySetMessagePayload>";
            }
        };
    }
}
