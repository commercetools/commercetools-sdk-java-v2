
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnresolvedReferencesBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnresolvedReferences unresolvedReferences = UnresolvedReferences.builder()
 *             .key("{key}")
 *             .typeId(ReferenceType.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnresolvedReferencesBuilder implements Builder<UnresolvedReferences> {

    private String key;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    /**
     *
     * @param key
     * @return Builder
     */

    public UnresolvedReferencesBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The type of the referenced resource.</p>
     * @param typeId
     * @return Builder
     */

    public UnresolvedReferencesBuilder typeId(final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.typeId = typeId;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
        return this.typeId;
    }

    public UnresolvedReferences build() {
        Objects.requireNonNull(key, UnresolvedReferences.class + ": key is missing");
        Objects.requireNonNull(typeId, UnresolvedReferences.class + ": typeId is missing");
        return new UnresolvedReferencesImpl(key, typeId);
    }

    /**
     * builds UnresolvedReferences without checking for non null required values
     */
    public UnresolvedReferences buildUnchecked() {
        return new UnresolvedReferencesImpl(key, typeId);
    }

    public static UnresolvedReferencesBuilder of() {
        return new UnresolvedReferencesBuilder();
    }

    public static UnresolvedReferencesBuilder of(final UnresolvedReferences template) {
        UnresolvedReferencesBuilder builder = new UnresolvedReferencesBuilder();
        builder.key = template.getKey();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
