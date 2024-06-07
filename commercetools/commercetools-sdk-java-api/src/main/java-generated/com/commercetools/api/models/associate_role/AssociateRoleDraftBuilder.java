
package com.commercetools.api.models.associate_role;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleDraft associateRoleDraft = AssociateRoleDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleDraftBuilder implements Builder<AssociateRoleDraft> {

    private String key;

    @Nullable
    private String name;

    @Nullable
    private Boolean buyerAssignable;

    @Nullable
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined unique and immutable identifier for the AssociateRole.</p>
     * @param key value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the AssociateRole.</p>
     * @param name value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer.</p>
     * @param buyerAssignable value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder buyerAssignable(@Nullable final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
        return this;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder permissions(
            @Nullable final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder permissions(
            @Nullable final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder plusPermissions(
            @Nullable final com.commercetools.api.models.associate_role.Permission... permissions) {
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

    public AssociateRoleDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AssociateRoleDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param custom value to be set
     * @return Builder
     */

    public AssociateRoleDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique and immutable identifier for the AssociateRole.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
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
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer.</p>
     * @return buyerAssignable
     */

    @Nullable
    public Boolean getBuyerAssignable() {
        return this.buyerAssignable;
    }

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @return permissions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds AssociateRoleDraft with checking for non-null required values
     * @return AssociateRoleDraft
     */
    public AssociateRoleDraft build() {
        Objects.requireNonNull(key, AssociateRoleDraft.class + ": key is missing");
        return new AssociateRoleDraftImpl(key, name, buyerAssignable, permissions, custom);
    }

    /**
     * builds AssociateRoleDraft without checking for non-null required values
     * @return AssociateRoleDraft
     */
    public AssociateRoleDraft buildUnchecked() {
        return new AssociateRoleDraftImpl(key, name, buyerAssignable, permissions, custom);
    }

    /**
     * factory method for an instance of AssociateRoleDraftBuilder
     * @return builder
     */
    public static AssociateRoleDraftBuilder of() {
        return new AssociateRoleDraftBuilder();
    }

    /**
     * create builder for AssociateRoleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleDraftBuilder of(final AssociateRoleDraft template) {
        AssociateRoleDraftBuilder builder = new AssociateRoleDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.buyerAssignable = template.getBuyerAssignable();
        builder.permissions = template.getPermissions();
        builder.custom = template.getCustom();
        return builder;
    }

}
