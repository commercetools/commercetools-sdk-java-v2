
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Zone.</p>
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

    String ZONE = "zone";

    /**
     *  <p>Unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Zone. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static ZoneResourceIdentifier of() {
        return new ZoneResourceIdentifierImpl();
    }

    public static ZoneResourceIdentifier of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierImpl instance = new ZoneResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ZoneResourceIdentifierBuilder builder() {
        return ZoneResourceIdentifierBuilder.of();
    }

    public static ZoneResourceIdentifierBuilder builder(final ZoneResourceIdentifier template) {
        return ZoneResourceIdentifierBuilder.of(template);
    }

    default <T> T withZoneResourceIdentifier(Function<ZoneResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneResourceIdentifier>";
            }
        };
    }
}
