
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Zone">Zone</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneResourceIdentifierImpl.class)
public interface ZoneResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Zone> {

    String ZONE = "zone";

    /**
    *  <p>Unique ID of the referenced <a href="ctp:api:type:Zone">Zone</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Unique key of the referenced <a href="ctp:api:type:Zone">Zone</a>. Either <code>id</code> or <code>key</code> is required.</p>
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
