
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResourceIdentifier resourceIdentifier = ResourceIdentifier.builder()
 *             .id("{id}")
 *             .key("{key}")
 *             .typeId(ReferenceTypeId.APPROVAL_FLOW)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ResourceIdentifierBuilder implements Builder<ResourceIdentifier> {

    private String id;

    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */

    public ResourceIdentifierBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public ResourceIdentifierBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     * @param typeId value to be set
     * @return Builder
     */

    public ResourceIdentifierBuilder typeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * value of id}
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * value of key}
     * @return key
     */

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
     * builds ResourceIdentifier with checking for non-null required values
     * @return ResourceIdentifier
     */
    public ResourceIdentifier build() {
        Objects.requireNonNull(id, ResourceIdentifier.class + ": id is missing");
        Objects.requireNonNull(key, ResourceIdentifier.class + ": key is missing");
        Objects.requireNonNull(typeId, ResourceIdentifier.class + ": typeId is missing");
        return new ResourceIdentifierImpl(id, key, typeId);
    }

    /**
     * builds ResourceIdentifier without checking for non-null required values
     * @return ResourceIdentifier
     */
    public ResourceIdentifier buildUnchecked() {
        return new ResourceIdentifierImpl(id, key, typeId);
    }

    /**
     * factory method for an instance of ResourceIdentifierBuilder
     * @return builder
     */
    public static ResourceIdentifierBuilder of() {
        return new ResourceIdentifierBuilder();
    }

    /**
     * create builder for ResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResourceIdentifierBuilder of(final ResourceIdentifier template) {
        ResourceIdentifierBuilder builder = new ResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
