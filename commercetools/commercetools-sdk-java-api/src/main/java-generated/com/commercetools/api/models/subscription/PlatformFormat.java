
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The PlatformFormat uses constructs that are similar to the ones used in the REST API, for example, on the <span>Messages Query HTTP API</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PlatformFormat platformFormat = PlatformFormat.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Platform")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PlatformFormatImpl.class)
public interface PlatformFormat extends DeliveryFormat {

    /**
     * discriminator value for PlatformFormat
     */
    String PLATFORM = "Platform";

    /**
     * factory method
     * @return instance of PlatformFormat
     */
    public static PlatformFormat of() {
        return new PlatformFormatImpl();
    }

    /**
     * factory method to create a shallow copy PlatformFormat
     * @param template instance to be copied
     * @return copy instance
     */
    public static PlatformFormat of(final PlatformFormat template) {
        PlatformFormatImpl instance = new PlatformFormatImpl();
        return instance;
    }

    public PlatformFormat copyDeep();

    /**
     * factory method to create a deep copy of PlatformFormat
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PlatformFormat deepCopy(@Nullable final PlatformFormat template) {
        if (template == null) {
            return null;
        }
        PlatformFormatImpl instance = new PlatformFormatImpl();
        return instance;
    }

    /**
     * builder factory method for PlatformFormat
     * @return builder
     */
    public static PlatformFormatBuilder builder() {
        return PlatformFormatBuilder.of();
    }

    /**
     * create builder for PlatformFormat instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PlatformFormatBuilder builder(final PlatformFormat template) {
        return PlatformFormatBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPlatformFormat(Function<PlatformFormat, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PlatformFormat> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PlatformFormat>() {
            @Override
            public String toString() {
                return "TypeReference<PlatformFormat>";
            }
        };
    }
}
