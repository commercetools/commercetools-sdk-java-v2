
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetRolesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetRolesAction channelSetRolesAction = ChannelSetRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetRolesActionBuilder implements Builder<ChannelSetRolesAction> {

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles value to be set
     * @return Builder
     */

    public ChannelSetRolesActionBuilder roles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles value to be set
     * @return Builder
     */

    public ChannelSetRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles value to be set
     * @return Builder
     */

    public ChannelSetRolesActionBuilder plusRoles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Value to set. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @return roles
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    /**
     * builds ChannelSetRolesAction with checking for non-null required values
     * @return ChannelSetRolesAction
     */
    public ChannelSetRolesAction build() {
        Objects.requireNonNull(roles, ChannelSetRolesAction.class + ": roles is missing");
        return new ChannelSetRolesActionImpl(roles);
    }

    /**
     * builds ChannelSetRolesAction without checking for non-null required values
     * @return ChannelSetRolesAction
     */
    public ChannelSetRolesAction buildUnchecked() {
        return new ChannelSetRolesActionImpl(roles);
    }

    /**
     * factory method for an instance of ChannelSetRolesActionBuilder
     * @return builder
     */
    public static ChannelSetRolesActionBuilder of() {
        return new ChannelSetRolesActionBuilder();
    }

    /**
     * create builder for ChannelSetRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetRolesActionBuilder of(final ChannelSetRolesAction template) {
        ChannelSetRolesActionBuilder builder = new ChannelSetRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
