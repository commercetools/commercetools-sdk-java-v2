
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleBuyerAssignableChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleBuyerAssignableChangedMessagePayload associateRoleBuyerAssignableChangedMessagePayload = AssociateRoleBuyerAssignableChangedMessagePayload.builder()
 *             .buyerAssignable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleBuyerAssignableChangedMessagePayloadBuilder
        implements Builder<AssociateRoleBuyerAssignableChangedMessagePayload> {

    private Boolean buyerAssignable;

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @param buyerAssignable value to be set
     * @return Builder
     */

    public AssociateRoleBuyerAssignableChangedMessagePayloadBuilder buyerAssignable(final Boolean buyerAssignable) {
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
     * builds AssociateRoleBuyerAssignableChangedMessagePayload with checking for non-null required values
     * @return AssociateRoleBuyerAssignableChangedMessagePayload
     */
    public AssociateRoleBuyerAssignableChangedMessagePayload build() {
        Objects.requireNonNull(buyerAssignable,
            AssociateRoleBuyerAssignableChangedMessagePayload.class + ": buyerAssignable is missing");
        return new AssociateRoleBuyerAssignableChangedMessagePayloadImpl(buyerAssignable);
    }

    /**
     * builds AssociateRoleBuyerAssignableChangedMessagePayload without checking for non-null required values
     * @return AssociateRoleBuyerAssignableChangedMessagePayload
     */
    public AssociateRoleBuyerAssignableChangedMessagePayload buildUnchecked() {
        return new AssociateRoleBuyerAssignableChangedMessagePayloadImpl(buyerAssignable);
    }

    /**
     * factory method for an instance of AssociateRoleBuyerAssignableChangedMessagePayloadBuilder
     * @return builder
     */
    public static AssociateRoleBuyerAssignableChangedMessagePayloadBuilder of() {
        return new AssociateRoleBuyerAssignableChangedMessagePayloadBuilder();
    }

    /**
     * create builder for AssociateRoleBuyerAssignableChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleBuyerAssignableChangedMessagePayloadBuilder of(
            final AssociateRoleBuyerAssignableChangedMessagePayload template) {
        AssociateRoleBuyerAssignableChangedMessagePayloadBuilder builder = new AssociateRoleBuyerAssignableChangedMessagePayloadBuilder();
        builder.buyerAssignable = template.getBuyerAssignable();
        return builder;
    }

}
