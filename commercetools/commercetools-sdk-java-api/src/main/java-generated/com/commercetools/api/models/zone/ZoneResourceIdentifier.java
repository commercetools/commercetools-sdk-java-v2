
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Zone. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneResourceIdentifier zoneResourceIdentifier = ZoneResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneResourceIdentifierImpl.class)
public interface ZoneResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Zone> {

    /**
     * discriminator value for ZoneResourceIdentifier
     */
    String ZONE = "zone";

    /**
     *  <p>Unique identifier of the referenced Zone. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Zone. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Zone. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Zone. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ZoneResourceIdentifier
     */
    public static ZoneResourceIdentifier of() {
        return new ZoneResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy ZoneResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneResourceIdentifier of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierImpl instance = new ZoneResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ZoneResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneResourceIdentifier deepCopy(@Nullable final ZoneResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        ZoneResourceIdentifierImpl instance = new ZoneResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ZoneResourceIdentifier
     * @return builder
     */
    public static ZoneResourceIdentifierBuilder builder() {
        return ZoneResourceIdentifierBuilder.of();
    }

    /**
     * create builder for ZoneResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneResourceIdentifierBuilder builder(final ZoneResourceIdentifier template) {
        return ZoneResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneResourceIdentifier(Function<ZoneResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneResourceIdentifier>";
            }
        };
    }
}
