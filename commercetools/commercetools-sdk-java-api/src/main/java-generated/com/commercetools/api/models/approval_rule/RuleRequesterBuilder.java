
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RuleRequesterBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RuleRequester ruleRequester = RuleRequester.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleRequesterBuilder implements Builder<RuleRequester> {

    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleRequesterBuilder associateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param builder function to build the associateRole value
     * @return Builder
     */

    public RuleRequesterBuilder withAssociateRole(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReference> builder) {
        this.associateRole = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @param associateRole value to be set
     * @return Builder
     */

    public RuleRequesterBuilder associateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
     * @return associateRole
     */

    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     * builds RuleRequester with checking for non-null required values
     * @return RuleRequester
     */
    public RuleRequester build() {
        Objects.requireNonNull(associateRole, RuleRequester.class + ": associateRole is missing");
        return new RuleRequesterImpl(associateRole);
    }

    /**
     * builds RuleRequester without checking for non-null required values
     * @return RuleRequester
     */
    public RuleRequester buildUnchecked() {
        return new RuleRequesterImpl(associateRole);
    }

    /**
     * factory method for an instance of RuleRequesterBuilder
     * @return builder
     */
    public static RuleRequesterBuilder of() {
        return new RuleRequesterBuilder();
    }

    /**
     * create builder for RuleRequester instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RuleRequesterBuilder of(final RuleRequester template) {
        RuleRequesterBuilder builder = new RuleRequesterBuilder();
        builder.associateRole = template.getAssociateRole();
        return builder;
    }

}
