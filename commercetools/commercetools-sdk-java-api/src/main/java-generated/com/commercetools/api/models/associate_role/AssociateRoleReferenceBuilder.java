
package com.commercetools.api.models.associate_role;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleReference associateRoleReference = AssociateRoleReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleReferenceBuilder implements Builder<AssociateRoleReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.associate_role.AssociateRole obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public AssociateRoleReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded AssociateRole. Only present in responses to requests with <span>Reference Expansion</span> for AssociateRole.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public AssociateRoleReferenceBuilder obj(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded AssociateRole. Only present in responses to requests with <span>Reference Expansion</span> for AssociateRole.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public AssociateRoleReferenceBuilder withObj(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        this.obj = builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded AssociateRole. Only present in responses to requests with <span>Reference Expansion</span> for AssociateRole.</p>
     * @param obj value to be set
     * @return Builder
     */

    public AssociateRoleReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.associate_role.AssociateRole obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded AssociateRole. Only present in responses to requests with <span>Reference Expansion</span> for AssociateRole.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.associate_role.AssociateRole getObj() {
        return this.obj;
    }

    /**
     * builds AssociateRoleReference with checking for non-null required values
     * @return AssociateRoleReference
     */
    public AssociateRoleReference build() {
        Objects.requireNonNull(id, AssociateRoleReference.class + ": id is missing");
        return new AssociateRoleReferenceImpl(id, obj);
    }

    /**
     * builds AssociateRoleReference without checking for non-null required values
     * @return AssociateRoleReference
     */
    public AssociateRoleReference buildUnchecked() {
        return new AssociateRoleReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of AssociateRoleReferenceBuilder
     * @return builder
     */
    public static AssociateRoleReferenceBuilder of() {
        return new AssociateRoleReferenceBuilder();
    }

    /**
     * create builder for AssociateRoleReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleReferenceBuilder of(final AssociateRoleReference template) {
        AssociateRoleReferenceBuilder builder = new AssociateRoleReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
