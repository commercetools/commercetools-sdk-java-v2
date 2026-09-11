
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Publish</span> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPublishedMessagePayload variantPublishedMessagePayload = VariantPublishedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantPublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantPublishedMessagePayloadImpl.class)
public interface VariantPublishedMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantPublishedMessagePayload
     */
    String VARIANT_PUBLISHED = "VariantPublished";

    /**
     * factory method
     * @return instance of VariantPublishedMessagePayload
     */
    public static VariantPublishedMessagePayload of() {
        return new VariantPublishedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantPublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantPublishedMessagePayload of(final VariantPublishedMessagePayload template) {
        VariantPublishedMessagePayloadImpl instance = new VariantPublishedMessagePayloadImpl();
        return instance;
    }

    public VariantPublishedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantPublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantPublishedMessagePayload deepCopy(@Nullable final VariantPublishedMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantPublishedMessagePayloadImpl instance = new VariantPublishedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for VariantPublishedMessagePayload
     * @return builder
     */
    public static VariantPublishedMessagePayloadBuilder builder() {
        return VariantPublishedMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantPublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPublishedMessagePayloadBuilder builder(final VariantPublishedMessagePayload template) {
        return VariantPublishedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantPublishedMessagePayload(Function<VariantPublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantPublishedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantPublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantPublishedMessagePayload>";
            }
        };
    }
}
