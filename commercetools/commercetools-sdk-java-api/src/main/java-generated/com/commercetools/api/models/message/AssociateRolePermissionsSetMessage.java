
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
 *     AssociateRolePermissionsSetMessage associateRolePermissionsSetMessage = AssociateRolePermissionsSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRolePermissionsSetMessageImpl.class)
public interface AssociateRolePermissionsSetMessage extends Message {

    /**
     * discriminator value for AssociateRolePermissionsSetMessage
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
     * @return instance of AssociateRolePermissionsSetMessage
     */
    public static AssociateRolePermissionsSetMessage of() {
        return new AssociateRolePermissionsSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRolePermissionsSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRolePermissionsSetMessage of(final AssociateRolePermissionsSetMessage template) {
        AssociateRolePermissionsSetMessageImpl instance = new AssociateRolePermissionsSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setPermissions(template.getPermissions());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRolePermissionsSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRolePermissionsSetMessage deepCopy(
            @Nullable final AssociateRolePermissionsSetMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRolePermissionsSetMessageImpl instance = new AssociateRolePermissionsSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssociateRolePermissionsSetMessage
     * @return builder
     */
    public static AssociateRolePermissionsSetMessageBuilder builder() {
        return AssociateRolePermissionsSetMessageBuilder.of();
    }

    /**
     * create builder for AssociateRolePermissionsSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRolePermissionsSetMessageBuilder builder(final AssociateRolePermissionsSetMessage template) {
        return AssociateRolePermissionsSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRolePermissionsSetMessage(Function<AssociateRolePermissionsSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionsSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRolePermissionsSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRolePermissionsSetMessage>";
            }
        };
    }
}
