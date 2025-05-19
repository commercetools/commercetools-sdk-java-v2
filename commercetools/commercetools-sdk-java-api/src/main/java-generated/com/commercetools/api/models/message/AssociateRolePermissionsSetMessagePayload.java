
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.Permission;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Permissions update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRolePermissionsSetMessagePayload associateRolePermissionsSetMessagePayload = AssociateRolePermissionsSetMessagePayload.builder()
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateRolePermissionsSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRolePermissionsSetMessagePayloadImpl.class)
public interface AssociateRolePermissionsSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRolePermissionsSetMessagePayload
     */
    String ASSOCIATE_ROLE_PERMISSIONS_SET = "AssociateRolePermissionsSet";

    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @return permissions
     */
    @NotNull
    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>Permission assigned to the AssociateRole.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     * factory method
     * @return instance of AssociateRolePermissionsSetMessagePayload
     */
    public static AssociateRolePermissionsSetMessagePayload of() {
        return new AssociateRolePermissionsSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRolePermissionsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRolePermissionsSetMessagePayload of(
            final AssociateRolePermissionsSetMessagePayload template) {
        AssociateRolePermissionsSetMessagePayloadImpl instance = new AssociateRolePermissionsSetMessagePayloadImpl();
        instance.setPermissions(template.getPermissions());
        return instance;
    }

    public AssociateRolePermissionsSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of AssociateRolePermissionsSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRolePermissionsSetMessagePayload deepCopy(
            @Nullable final AssociateRolePermissionsSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRolePermissionsSetMessagePayloadImpl instance = new AssociateRolePermissionsSetMessagePayloadImpl();
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssociateRolePermissionsSetMessagePayload
     * @return builder
     */
    public static AssociateRolePermissionsSetMessagePayloadBuilder builder() {
        return AssociateRolePermissionsSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRolePermissionsSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionsSetMessagePayloadBuilder builder(
            final AssociateRolePermissionsSetMessagePayload template) {
        return AssociateRolePermissionsSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRolePermissionsSetMessagePayload(
            Function<AssociateRolePermissionsSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionsSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionsSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRolePermissionsSetMessagePayload>";
            }
        };
    }
}
