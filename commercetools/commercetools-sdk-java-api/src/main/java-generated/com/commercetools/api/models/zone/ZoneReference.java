
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a Zone.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneReference zoneReference = ZoneReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("zone")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneReferenceImpl.class)
public interface ZoneReference extends Reference, com.commercetools.api.models.Identifiable<Zone>,
        com.commercetools.api.models.IdentifiableObjHolder<Zone> {

    /**
     * discriminator value for ZoneReference
     */
    String ZONE = "zone";

    /**
     *  <p>Contains the representation of the expanded Zone. Only present in responses to requests with Reference Expansion for Zones.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Zone getObj();

    /**
     *  <p>Unique identifier of the referenced Zone.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Zone. Only present in responses to requests with Reference Expansion for Zones.</p>
     * @param obj value to be set
     */

    public void setObj(final Zone obj);

    /**
     *  <p>Unique identifier of the referenced Zone.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ZoneReference
     */
    public static ZoneReference of() {
        return new ZoneReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ZoneReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneReference of(final ZoneReference template) {
        ZoneReferenceImpl instance = new ZoneReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public ZoneReference copyDeep();

    /**
     * factory method to create a deep copy of ZoneReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneReference deepCopy(@Nullable final ZoneReference template) {
        if (template == null) {
            return null;
        }
        ZoneReferenceImpl instance = new ZoneReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.zone.Zone.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ZoneReference
     * @return builder
     */
    public static ZoneReferenceBuilder builder() {
        return ZoneReferenceBuilder.of();
    }

    /**
     * create builder for ZoneReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneReferenceBuilder builder(final ZoneReference template) {
        return ZoneReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneReference(Function<ZoneReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneReference>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneReference>";
            }
        };
    }
}
