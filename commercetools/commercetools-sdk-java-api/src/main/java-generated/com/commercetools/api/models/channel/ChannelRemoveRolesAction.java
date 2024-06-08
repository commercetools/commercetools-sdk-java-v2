
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
 * ChannelRemoveRolesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelRemoveRolesAction channelRemoveRolesAction = ChannelRemoveRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelRemoveRolesActionImpl.class)
public interface ChannelRemoveRolesAction extends ChannelUpdateAction {

    /**
     * discriminator value for ChannelRemoveRolesAction
     */
    String REMOVE_ROLES = "removeRoles";

    /**
     *  <p>Value to remove from the array.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    /**
     *  <p>Value to remove from the array.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    /**
     *  <p>Value to remove from the array.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<ChannelRoleEnum> roles);

    /**
     * factory method
     * @return instance of ChannelRemoveRolesAction
     */
    public static ChannelRemoveRolesAction of() {
        return new ChannelRemoveRolesActionImpl();
    }

    /**
     * factory method to create a shallow copy ChannelRemoveRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelRemoveRolesAction of(final ChannelRemoveRolesAction template) {
        ChannelRemoveRolesActionImpl instance = new ChannelRemoveRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChannelRemoveRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelRemoveRolesAction deepCopy(@Nullable final ChannelRemoveRolesAction template) {
        if (template == null) {
            return null;
        }
        ChannelRemoveRolesActionImpl instance = new ChannelRemoveRolesActionImpl();
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChannelRemoveRolesAction
     * @return builder
     */
    public static ChannelRemoveRolesActionBuilder builder() {
        return ChannelRemoveRolesActionBuilder.of();
    }

    /**
     * create builder for ChannelRemoveRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelRemoveRolesActionBuilder builder(final ChannelRemoveRolesAction template) {
        return ChannelRemoveRolesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelRemoveRolesAction(Function<ChannelRemoveRolesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelRemoveRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelRemoveRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelRemoveRolesAction>";
            }
        };
    }
}
