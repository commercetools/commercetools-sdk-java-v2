
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ChannelAddRolesAction
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelAddRolesActionImpl.class)
public interface ChannelAddRolesAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelAddRolesAction
     */
    String ADD_ROLES = "addRoles";

    /**
     *  <p>Value to append to the array.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    /**
     *  <p>Value to append to the array.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    /**
     *  <p>Value to append to the array.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<ChannelRoleEnum> roles);

    /**
     * factory method
     * @return instance of ChannelAddRolesAction
     */
    public static ChannelAddRolesAction of() {
        return new ChannelAddRolesActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelAddRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelAddRolesAction of(final ChannelAddRolesAction template) {
        ChannelAddRolesActionImpl instance = new ChannelAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelAddRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelAddRolesAction deepCopy(@Nullable final ChannelAddRolesAction template) {
        if (template == null) {
            return null;
        }
        ChannelAddRolesActionImpl instance = new ChannelAddRolesActionImpl();
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChannelAddRolesAction
     * @return builder
     */
    public static ChannelAddRolesActionBuilder builder() {
        return ChannelAddRolesActionBuilder.of();
    }

    /**
     * create builder for ChannelAddRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelAddRolesActionBuilder builder(final ChannelAddRolesAction template) {
        return ChannelAddRolesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelAddRolesAction(Function<ChannelAddRolesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelAddRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelAddRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelAddRolesAction>";
            }
        };
    }
}
