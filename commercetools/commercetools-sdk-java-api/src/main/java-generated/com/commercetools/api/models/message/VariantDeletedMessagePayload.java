
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Delete Variant</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantDeletedMessagePayload variantDeletedMessagePayload = VariantDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantDeletedMessagePayloadImpl.class)
public interface VariantDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantDeletedMessagePayload
     */
    String VARIANT_DELETED = "VariantDeleted";

    /**
     * factory method
     * @return instance of VariantDeletedMessagePayload
     */
    public static VariantDeletedMessagePayload of() {
        return new VariantDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantDeletedMessagePayload of(final VariantDeletedMessagePayload template) {
        VariantDeletedMessagePayloadImpl instance = new VariantDeletedMessagePayloadImpl();
        return instance;
    }

    public VariantDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantDeletedMessagePayload deepCopy(@Nullable final VariantDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantDeletedMessagePayloadImpl instance = new VariantDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for VariantDeletedMessagePayload
     * @return builder
     */
    public static VariantDeletedMessagePayloadBuilder builder() {
        return VariantDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDeletedMessagePayloadBuilder builder(final VariantDeletedMessagePayload template) {
        return VariantDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantDeletedMessagePayload(Function<VariantDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantDeletedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantDeletedMessagePayload>";
            }
        };
    }
}
