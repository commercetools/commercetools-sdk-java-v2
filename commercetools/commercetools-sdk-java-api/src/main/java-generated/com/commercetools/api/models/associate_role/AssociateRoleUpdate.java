
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleUpdate
 *
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
@JsonDeserialize(as = AssociateRoleUpdateImpl.class)
public interface AssociateRoleUpdate {

    /**
     *  <p>Expected version of the AssociateRole on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<AssociateRoleUpdateAction> getActions();

    /**
     *  <p>Expected version of the AssociateRole on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final AssociateRoleUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     * @param actions values to be set
     */

    public void setActions(final List<AssociateRoleUpdateAction> actions);

    /**
     * factory method
     * @return instance of AssociateRoleUpdate
     */
    public static AssociateRoleUpdate of() {
        return new AssociateRoleUpdateImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleUpdate of(final AssociateRoleUpdate template) {
        AssociateRoleUpdateImpl instance = new AssociateRoleUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleUpdate deepCopy(@Nullable final AssociateRoleUpdate template) {
        if (template == null) {
            return null;
        }
        AssociateRoleUpdateImpl instance = new AssociateRoleUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.associate_role.AssociateRoleUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleUpdate
     * @return builder
     */
    public static AssociateRoleUpdateBuilder builder() {
        return AssociateRoleUpdateBuilder.of();
    }

    /**
     * create builder for AssociateRoleUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleUpdateBuilder builder(final AssociateRoleUpdate template) {
        return AssociateRoleUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleUpdate(Function<AssociateRoleUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleUpdate>";
            }
        };
    }
}
