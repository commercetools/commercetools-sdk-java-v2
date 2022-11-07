
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The PlatformFormat uses constructs that are similar to the ones used in the REST API, for example, on the Messages Query HTTP API.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PlatformFormatImpl.class)
public interface PlatformFormat extends DeliveryFormat {

    String PLATFORM = "Platform";

    public static PlatformFormat of() {
        return new PlatformFormatImpl();
    }

    public static PlatformFormat of(final PlatformFormat template) {
        PlatformFormatImpl instance = new PlatformFormatImpl();
        return instance;
    }

    public static PlatformFormatBuilder builder() {
        return PlatformFormatBuilder.of();
    }

    public static PlatformFormatBuilder builder(final PlatformFormat template) {
        return PlatformFormatBuilder.of(template);
    }

    default <T> T withPlatformFormat(Function<PlatformFormat, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PlatformFormat> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PlatformFormat>() {
            @Override
            public String toString() {
                return "TypeReference<PlatformFormat>";
            }
        };
    }
}
