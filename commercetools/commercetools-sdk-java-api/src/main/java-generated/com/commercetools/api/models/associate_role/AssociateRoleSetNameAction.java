
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the name of an AssociateRole generates an AssociateRoleNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetNameAction associateRoleSetNameAction = AssociateRoleSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleSetNameActionImpl.class)
public interface AssociateRoleSetNameAction extends AssociateRoleUpdateAction {

    /**
     * discriminator value for AssociateRoleSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>New name to set. If <code>name</code> is absent or <code>null</code>, the existing name, if any, will be removed.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name to set. If <code>name</code> is absent or <code>null</code>, the existing name, if any, will be removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of AssociateRoleSetNameAction
     */
    public static AssociateRoleSetNameAction of() {
        return new AssociateRoleSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleSetNameAction of(final AssociateRoleSetNameAction template) {
        AssociateRoleSetNameActionImpl instance = new AssociateRoleSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public AssociateRoleSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleSetNameAction deepCopy(@Nullable final AssociateRoleSetNameAction template) {
        if (template == null) {
            return null;
        }
        AssociateRoleSetNameActionImpl instance = new AssociateRoleSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleSetNameAction
     * @return builder
     */
    public static AssociateRoleSetNameActionBuilder builder() {
        return AssociateRoleSetNameActionBuilder.of();
    }

    /**
     * create builder for AssociateRoleSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetNameActionBuilder builder(final AssociateRoleSetNameAction template) {
        return AssociateRoleSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleSetNameAction(Function<AssociateRoleSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleSetNameAction>";
            }
        };
    }
}
