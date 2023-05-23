
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the <code>buyerAssignable</code> value of an AssociateRole generates an AssociateRoleBuyerAssignableChanged Message.</p>
 *
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
@JsonDeserialize(as = AssociateRoleChangeBuyerAssignableActionImpl.class)
public interface AssociateRoleChangeBuyerAssignableAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleChangeBuyerAssignableAction
     */
    String CHANGE_BUYER_ASSIGNABLE = "changeBuyerAssignable";

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @return buyerAssignable
     */
    @NotNull
    @JsonProperty("buyerAssignable")
    public Boolean getBuyerAssignable();

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @param buyerAssignable value to be set
     */

    public void setBuyerAssignable(final Boolean buyerAssignable);

    /**
     * factory method
     * @return instance of AssociateRoleChangeBuyerAssignableAction
     */
    public static AssociateRoleChangeBuyerAssignableAction of() {
        return new AssociateRoleChangeBuyerAssignableActionImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleChangeBuyerAssignableAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleChangeBuyerAssignableAction of(final AssociateRoleChangeBuyerAssignableAction template) {
        AssociateRoleChangeBuyerAssignableActionImpl instance = new AssociateRoleChangeBuyerAssignableActionImpl();
        instance.setBuyerAssignable(template.getBuyerAssignable());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleChangeBuyerAssignableAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleChangeBuyerAssignableAction deepCopy(
            @Nullable final AssociateRoleChangeBuyerAssignableAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleChangeBuyerAssignableActionImpl instance = new AssociateRoleChangeBuyerAssignableActionImpl();
        instance.setBuyerAssignable(template.getBuyerAssignable());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleChangeBuyerAssignableAction
     * @return builder
     */
    public static AssociateRoleChangeBuyerAssignableActionBuilder builder() {
        return AssociateRoleChangeBuyerAssignableActionBuilder.of();
    }

    /**
     * create builder for AssociateRoleChangeBuyerAssignableAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleChangeBuyerAssignableActionBuilder builder(
            final AssociateRoleChangeBuyerAssignableAction template) {
        return AssociateRoleChangeBuyerAssignableActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleChangeBuyerAssignableAction(
            Function<AssociateRoleChangeBuyerAssignableAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleChangeBuyerAssignableAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleChangeBuyerAssignableAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleChangeBuyerAssignableAction>";
            }
        };
    }
}
