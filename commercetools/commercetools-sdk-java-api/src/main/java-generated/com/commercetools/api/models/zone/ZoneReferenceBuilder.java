
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneReferenceBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneReferenceBuilder implements Builder<ZoneReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.zone.Zone obj;

    /**
     *  <p>Unique identifier of the referenced Zone.</p>
     * @param id value to be set
     * @return Builder
     */

    public ZoneReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Zone. Only present in responses to requests with Reference Expansion for Zones.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ZoneReferenceBuilder obj(
            Function<com.commercetools.api.models.zone.ZoneBuilder, com.commercetools.api.models.zone.ZoneBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.zone.ZoneBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Zone. Only present in responses to requests with Reference Expansion for Zones.</p>
     * @param obj value to be set
     * @return Builder
     */

    public ZoneReferenceBuilder obj(@Nullable final com.commercetools.api.models.zone.Zone obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Zone.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Zone. Only present in responses to requests with Reference Expansion for Zones.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.zone.Zone getObj() {
        return this.obj;
    }

    /**
     * builds ZoneReference with checking for non-null required values
     * @return ZoneReference
     */
    public ZoneReference build() {
        Objects.requireNonNull(id, ZoneReference.class + ": id is missing");
        return new ZoneReferenceImpl(id, obj);
    }

    /**
     * builds ZoneReference without checking for non-null required values
     * @return ZoneReference
     */
    public ZoneReference buildUnchecked() {
        return new ZoneReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ZoneReferenceBuilder
     * @return builder
     */
    public static ZoneReferenceBuilder of() {
        return new ZoneReferenceBuilder();
    }

    /**
     * create builder for ZoneReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneReferenceBuilder of(final ZoneReference template) {
        ZoneReferenceBuilder builder = new ZoneReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
