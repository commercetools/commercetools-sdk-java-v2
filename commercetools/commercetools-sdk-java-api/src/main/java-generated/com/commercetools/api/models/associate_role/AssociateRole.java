
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRole
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRole associateRole = AssociateRole.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .buyerAssignable(true)
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleImpl.class)
public interface AssociateRole extends BaseResource {

    /**
     *  <p>Unique identifier of the AssociateRole.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the AssociateRole.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the AssociateRole was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the AssociateRole was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the AssociateRole.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer. If false, the AssociateRole can only be assigned using the general endpoint.</p>
     * @return buyerAssignable
     */
    @NotNull
    @JsonProperty("buyerAssignable")
    public Boolean getBuyerAssignable();

    /**
     *  <p>Name of the AssociateRole.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @return permissions
     */
    @NotNull
    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the AssociateRole.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the AssociateRole.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the AssociateRole was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the AssociateRole was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the AssociateRole.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer. If false, the AssociateRole can only be assigned using the general endpoint.</p>
     * @param buyerAssignable value to be set
     */

    public void setBuyerAssignable(final Boolean buyerAssignable);

    /**
     *  <p>Name of the AssociateRole.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of AssociateRole
     */
    public static AssociateRole of() {
        return new AssociateRoleImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRole
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRole of(final AssociateRole template) {
        AssociateRoleImpl instance = new AssociateRoleImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setBuyerAssignable(template.getBuyerAssignable());
        instance.setName(template.getName());
        instance.setPermissions(template.getPermissions());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRole
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRole deepCopy(@Nullable final AssociateRole template) {
        if (template == null) {
            return null;
        }
        AssociateRoleImpl instance = new AssociateRoleImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setBuyerAssignable(template.getBuyerAssignable());
        instance.setName(template.getName());
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for AssociateRole
     * @return builder
     */
    public static AssociateRoleBuilder builder() {
        return AssociateRoleBuilder.of();
    }

    /**
     * create builder for AssociateRole instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleBuilder builder(final AssociateRole template) {
        return AssociateRoleBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRole(Function<AssociateRole, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRole> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRole>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRole>";
            }
        };
    }
}
