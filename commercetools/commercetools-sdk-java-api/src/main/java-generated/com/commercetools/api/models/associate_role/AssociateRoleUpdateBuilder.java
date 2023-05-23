
package com.commercetools.api.models.associate_role;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleUpdate associateRoleUpdate = AssociateRoleUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleUpdateBuilder implements Builder<AssociateRoleUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> actions;

    /**
     *  <p>Expected version of the AssociateRole on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public AssociateRoleUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param actions value to be set
     * @return Builder
     */

    public AssociateRoleUpdateBuilder actions(
            final com.commercetools.api.models.associate_role.AssociateRoleUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param actions value to be set
     * @return Builder
     */

    public AssociateRoleUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param actions value to be set
     * @return Builder
     */

    public AssociateRoleUpdateBuilder plusActions(
            final com.commercetools.api.models.associate_role.AssociateRoleUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public AssociateRoleUpdateBuilder plusActions(
            Function<com.commercetools.api.models.associate_role.AssociateRoleUpdateActionBuilder, Builder<? extends com.commercetools.api.models.associate_role.AssociateRoleUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.associate_role.AssociateRoleUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public AssociateRoleUpdateBuilder withActions(
            Function<com.commercetools.api.models.associate_role.AssociateRoleUpdateActionBuilder, Builder<? extends com.commercetools.api.models.associate_role.AssociateRoleUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.associate_role.AssociateRoleUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the AssociateRole on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds AssociateRoleUpdate with checking for non-null required values
     * @return AssociateRoleUpdate
     */
    public AssociateRoleUpdate build() {
        Objects.requireNonNull(version, AssociateRoleUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, AssociateRoleUpdate.class + ": actions is missing");
        return new AssociateRoleUpdateImpl(version, actions);
    }

    /**
     * builds AssociateRoleUpdate without checking for non-null required values
     * @return AssociateRoleUpdate
     */
    public AssociateRoleUpdate buildUnchecked() {
        return new AssociateRoleUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of AssociateRoleUpdateBuilder
     * @return builder
     */
    public static AssociateRoleUpdateBuilder of() {
        return new AssociateRoleUpdateBuilder();
    }

    /**
     * create builder for AssociateRoleUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleUpdateBuilder of(final AssociateRoleUpdate template) {
        AssociateRoleUpdateBuilder builder = new AssociateRoleUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
