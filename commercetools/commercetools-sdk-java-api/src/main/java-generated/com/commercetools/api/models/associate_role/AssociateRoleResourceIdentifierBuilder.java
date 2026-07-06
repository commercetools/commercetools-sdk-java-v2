
package com.commercetools.api.models.associate_role;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleResourceIdentifier associateRoleResourceIdentifier = AssociateRoleResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleResourceIdentifierBuilder implements Builder<AssociateRoleResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public AssociateRoleResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public AssociateRoleResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds AssociateRoleResourceIdentifier with checking for non-null required values
     * @return AssociateRoleResourceIdentifier
     */
    public AssociateRoleResourceIdentifier build() {
        return new AssociateRoleResourceIdentifierImpl(id, key);
    }

    /**
     * builds AssociateRoleResourceIdentifier without checking for non-null required values
     * @return AssociateRoleResourceIdentifier
     */
    public AssociateRoleResourceIdentifier buildUnchecked() {
        return new AssociateRoleResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of AssociateRoleResourceIdentifierBuilder
     * @return builder
     */
    public static AssociateRoleResourceIdentifierBuilder of() {
        return new AssociateRoleResourceIdentifierBuilder();
    }

    /**
     * create builder for AssociateRoleResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleResourceIdentifierBuilder of(final AssociateRoleResourceIdentifier template) {
        AssociateRoleResourceIdentifierBuilder builder = new AssociateRoleResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
