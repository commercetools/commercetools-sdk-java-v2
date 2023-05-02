
package com.commercetools.api.models.associate_role;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleChangeBuyerAssignableActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleChangeBuyerAssignableAction associateRoleChangeBuyerAssignableAction = AssociateRoleChangeBuyerAssignableAction.builder()
 *             .buyerAssignable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleChangeBuyerAssignableActionBuilder
        implements Builder<AssociateRoleChangeBuyerAssignableAction> {

    private Boolean buyerAssignable;

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @param buyerAssignable value to be set
     * @return Builder
     */

    public AssociateRoleChangeBuyerAssignableActionBuilder buyerAssignable(final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
        return this;
    }

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @return buyerAssignable
     */

    public Boolean getBuyerAssignable() {
        return this.buyerAssignable;
    }

    /**
     * builds AssociateRoleChangeBuyerAssignableAction with checking for non-null required values
     * @return AssociateRoleChangeBuyerAssignableAction
     */
    public AssociateRoleChangeBuyerAssignableAction build() {
        Objects.requireNonNull(buyerAssignable,
            AssociateRoleChangeBuyerAssignableAction.class + ": buyerAssignable is missing");
        return new AssociateRoleChangeBuyerAssignableActionImpl(buyerAssignable);
    }

    /**
     * builds AssociateRoleChangeBuyerAssignableAction without checking for non-null required values
     * @return AssociateRoleChangeBuyerAssignableAction
     */
    public AssociateRoleChangeBuyerAssignableAction buildUnchecked() {
        return new AssociateRoleChangeBuyerAssignableActionImpl(buyerAssignable);
    }

    /**
     * factory method for an instance of AssociateRoleChangeBuyerAssignableActionBuilder
     * @return builder
     */
    public static AssociateRoleChangeBuyerAssignableActionBuilder of() {
        return new AssociateRoleChangeBuyerAssignableActionBuilder();
    }

    /**
     * create builder for AssociateRoleChangeBuyerAssignableAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleChangeBuyerAssignableActionBuilder of(
            final AssociateRoleChangeBuyerAssignableAction template) {
        AssociateRoleChangeBuyerAssignableActionBuilder builder = new AssociateRoleChangeBuyerAssignableActionBuilder();
        builder.buyerAssignable = template.getBuyerAssignable();
        return builder;
    }

}
