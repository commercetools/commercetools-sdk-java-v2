
package com.commercetools.history.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneResourceIdentifier zoneResourceIdentifier = ZoneResourceIdentifier.builder()
 *             .typeId(ReferenceTypeId.APPROVAL_FLOW)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneResourceIdentifierBuilder implements Builder<ZoneResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public ZoneResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public ZoneResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     * @param typeId value to be set
     * @return Builder
     */

    public ZoneResourceIdentifierBuilder typeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     * @return typeId
     */

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     * builds ZoneResourceIdentifier with checking for non-null required values
     * @return ZoneResourceIdentifier
     */
    public ZoneResourceIdentifier build() {
        Objects.requireNonNull(typeId, ZoneResourceIdentifier.class + ": typeId is missing");
        return new ZoneResourceIdentifierImpl(id, key, typeId);
    }

    /**
     * builds ZoneResourceIdentifier without checking for non-null required values
     * @return ZoneResourceIdentifier
     */
    public ZoneResourceIdentifier buildUnchecked() {
        return new ZoneResourceIdentifierImpl(id, key, typeId);
    }

    /**
     * factory method for an instance of ZoneResourceIdentifierBuilder
     * @return builder
     */
    public static ZoneResourceIdentifierBuilder of() {
        return new ZoneResourceIdentifierBuilder();
    }

    /**
     * create builder for ZoneResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneResourceIdentifierBuilder of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierBuilder builder = new ZoneResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
