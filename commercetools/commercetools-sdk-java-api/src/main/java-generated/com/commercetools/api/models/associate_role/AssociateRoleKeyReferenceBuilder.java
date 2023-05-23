
package com.commercetools.api.models.associate_role;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleKeyReference associateRoleKeyReference = AssociateRoleKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleKeyReferenceBuilder implements Builder<AssociateRoleKeyReference> {

    private String key;

    /**
     *  <p>Unique and immutable key of the referenced AssociateRole.</p>
     * @param key value to be set
     * @return Builder
     */

    public AssociateRoleKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique and immutable key of the referenced AssociateRole.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds AssociateRoleKeyReference with checking for non-null required values
     * @return AssociateRoleKeyReference
     */
    public AssociateRoleKeyReference build() {
        Objects.requireNonNull(key, AssociateRoleKeyReference.class + ": key is missing");
        return new AssociateRoleKeyReferenceImpl(key);
    }

    /**
     * builds AssociateRoleKeyReference without checking for non-null required values
     * @return AssociateRoleKeyReference
     */
    public AssociateRoleKeyReference buildUnchecked() {
        return new AssociateRoleKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of AssociateRoleKeyReferenceBuilder
     * @return builder
     */
    public static AssociateRoleKeyReferenceBuilder of() {
        return new AssociateRoleKeyReferenceBuilder();
    }

    /**
     * create builder for AssociateRoleKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleKeyReferenceBuilder of(final AssociateRoleKeyReference template) {
        AssociateRoleKeyReferenceBuilder builder = new AssociateRoleKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
