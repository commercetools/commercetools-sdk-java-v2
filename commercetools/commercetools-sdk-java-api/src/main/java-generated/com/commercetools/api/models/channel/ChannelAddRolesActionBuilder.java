package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelAddRolesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelAddRolesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelAddRolesAction channelAddRolesAction = ChannelAddRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChannelAddRolesActionBuilder implements Builder<ChannelAddRolesAction> {

    
    
    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    /**
     *  <p>Value to append to the array.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public ChannelAddRolesActionBuilder roles( final com.commercetools.api.models.channel.ChannelRoleEnum ...roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public ChannelAddRolesActionBuilder roles( final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public ChannelAddRolesActionBuilder plusRoles( final com.commercetools.api.models.channel.ChannelRoleEnum ...roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }
    
    
    

    /**
     *  <p>Value to append to the array.</p>
     * @return roles
     */
    
    
    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles(){
        return this.roles;
    }

    /**
     * builds ChannelAddRolesAction with checking for non-null required values
     * @return ChannelAddRolesAction
     */
    public ChannelAddRolesAction build() {
        Objects.requireNonNull(roles, ChannelAddRolesAction.class + ": roles is missing");
        return new ChannelAddRolesActionImpl(roles);
    }
    
    /**
     * builds ChannelAddRolesAction without checking for non-null required values
     * @return ChannelAddRolesAction
     */
    public ChannelAddRolesAction buildUnchecked() {
        return new ChannelAddRolesActionImpl(roles);
    }

    /**
     * factory method for an instance of ChannelAddRolesActionBuilder
     * @return builder 
     */
    public static ChannelAddRolesActionBuilder of() {
        return new ChannelAddRolesActionBuilder();
    }

    /**
     * create builder for ChannelAddRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelAddRolesActionBuilder of(final ChannelAddRolesAction template) {
        ChannelAddRolesActionBuilder builder = new ChannelAddRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
