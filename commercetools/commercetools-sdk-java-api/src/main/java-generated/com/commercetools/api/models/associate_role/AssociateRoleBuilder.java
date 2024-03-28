
package com.commercetools.api.models.associate_role;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleBuilder
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
public class AssociateRoleBuilder implements Builder<AssociateRole> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private Boolean buyerAssignable;

    @Nullable
    private String name;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the AssociateRole.</p>
     * @param id value to be set
     * @return Builder
     */

    public AssociateRoleBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the AssociateRole.</p>
     * @param version value to be set
     * @return Builder
     */

    public AssociateRoleBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the AssociateRole was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public AssociateRoleBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the AssociateRole was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public AssociateRoleBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the AssociateRole.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public AssociateRoleBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the AssociateRole.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public AssociateRoleBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the AssociateRole.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public AssociateRoleBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the AssociateRole.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public AssociateRoleBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the AssociateRole.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public AssociateRoleBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the AssociateRole.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public AssociateRoleBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the AssociateRole.</p>
     * @param key value to be set
     * @return Builder
     */

    public AssociateRoleBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer. If false, the AssociateRole can only be assigned using the general endpoint.</p>
     * @param buyerAssignable value to be set
     * @return Builder
     */

    public AssociateRoleBuilder buyerAssignable(final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
        return this;
    }

    /**
     *  <p>Name of the AssociateRole.</p>
     * @param name value to be set
     * @return Builder
     */

    public AssociateRoleBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleBuilder permissions(
            final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleBuilder permissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleBuilder plusPermissions(
            final com.commercetools.api.models.associate_role.Permission... permissions) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.addAll(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AssociateRoleBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AssociateRoleBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param custom value to be set
     * @return Builder
     */

    public AssociateRoleBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Unique identifier of the AssociateRole.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the AssociateRole.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the AssociateRole was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the AssociateRole was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the AssociateRole.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the AssociateRole.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the AssociateRole.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer. If false, the AssociateRole can only be assigned using the general endpoint.</p>
     * @return buyerAssignable
     */

    public Boolean getBuyerAssignable() {
        return this.buyerAssignable;
    }

    /**
     *  <p>Name of the AssociateRole.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @return permissions
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds AssociateRole with checking for non-null required values
     * @return AssociateRole
     */
    public AssociateRole build() {
        Objects.requireNonNull(id, AssociateRole.class + ": id is missing");
        Objects.requireNonNull(version, AssociateRole.class + ": version is missing");
        Objects.requireNonNull(createdAt, AssociateRole.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, AssociateRole.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, AssociateRole.class + ": key is missing");
        Objects.requireNonNull(buyerAssignable, AssociateRole.class + ": buyerAssignable is missing");
        Objects.requireNonNull(permissions, AssociateRole.class + ": permissions is missing");
        return new AssociateRoleImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key,
            buyerAssignable, name, permissions, custom);
    }

    /**
     * builds AssociateRole without checking for non-null required values
     * @return AssociateRole
     */
    public AssociateRole buildUnchecked() {
        return new AssociateRoleImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key,
            buyerAssignable, name, permissions, custom);
    }

    /**
     * factory method for an instance of AssociateRoleBuilder
     * @return builder
     */
    public static AssociateRoleBuilder of() {
        return new AssociateRoleBuilder();
    }

    /**
     * create builder for AssociateRole instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleBuilder of(final AssociateRole template) {
        AssociateRoleBuilder builder = new AssociateRoleBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.buyerAssignable = template.getBuyerAssignable();
        builder.name = template.getName();
        builder.permissions = template.getPermissions();
        builder.custom = template.getCustom();
        return builder;
    }

}
