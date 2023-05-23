
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateMissingPermissionErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateMissingPermissionError associateMissingPermissionError = AssociateMissingPermissionError.builder()
 *             .message("{message}")
 *             .associate(associateBuilder -> associateBuilder)
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateMissingPermissionErrorBuilder implements Builder<AssociateMissingPermissionError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.customer.CustomerResourceIdentifier associate;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     *  <ul>
     *   <li>When an action is performed by an Associate: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When an action is performed for another Associate, like viewing their Cart: <code>"Associate '$idOfAssociate' has no rights to $action for customer '$idOfCustomer' in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When viewing an entity: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredViewMyPermission' or '$requiredViewOthersPermission'."</code></li>
     *  </ul>
     * @param message value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder associate(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @param builder function to build the associate value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder withAssociate(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @param associate value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder associate(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier associate) {
        this.associate = associate;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param builder function to build the associateOnBehalf value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder associateOnBehalf(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.associateOnBehalf = builder
                .apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param builder function to build the associateOnBehalf value
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder withAssociateOnBehalf(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.associateOnBehalf = builder
                .apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param associateOnBehalf value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder associateOnBehalf(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf) {
        this.associateOnBehalf = associateOnBehalf;
        return this;
    }

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder permissions(
            final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder permissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public AssociateMissingPermissionErrorBuilder plusPermissions(
            final com.commercetools.api.models.associate_role.Permission... permissions) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.addAll(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <ul>
     *   <li>When an action is performed by an Associate: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When an action is performed for another Associate, like viewing their Cart: <code>"Associate '$idOfAssociate' has no rights to $action for customer '$idOfCustomer' in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When viewing an entity: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredViewMyPermission' or '$requiredViewOthersPermission'."</code></li>
     *  </ul>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @return associate
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociate() {
        return this.associate;
    }

    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @return associateOnBehalf
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociateOnBehalf() {
        return this.associateOnBehalf;
    }

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @return permissions
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    /**
     * builds AssociateMissingPermissionError with checking for non-null required values
     * @return AssociateMissingPermissionError
     */
    public AssociateMissingPermissionError build() {
        Objects.requireNonNull(message, AssociateMissingPermissionError.class + ": message is missing");
        Objects.requireNonNull(associate, AssociateMissingPermissionError.class + ": associate is missing");
        Objects.requireNonNull(businessUnit, AssociateMissingPermissionError.class + ": businessUnit is missing");
        Objects.requireNonNull(permissions, AssociateMissingPermissionError.class + ": permissions is missing");
        return new AssociateMissingPermissionErrorImpl(message, values, associate, businessUnit, associateOnBehalf,
            permissions);
    }

    /**
     * builds AssociateMissingPermissionError without checking for non-null required values
     * @return AssociateMissingPermissionError
     */
    public AssociateMissingPermissionError buildUnchecked() {
        return new AssociateMissingPermissionErrorImpl(message, values, associate, businessUnit, associateOnBehalf,
            permissions);
    }

    /**
     * factory method for an instance of AssociateMissingPermissionErrorBuilder
     * @return builder
     */
    public static AssociateMissingPermissionErrorBuilder of() {
        return new AssociateMissingPermissionErrorBuilder();
    }

    /**
     * create builder for AssociateMissingPermissionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateMissingPermissionErrorBuilder of(final AssociateMissingPermissionError template) {
        AssociateMissingPermissionErrorBuilder builder = new AssociateMissingPermissionErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.associate = template.getAssociate();
        builder.businessUnit = template.getBusinessUnit();
        builder.associateOnBehalf = template.getAssociateOnBehalf();
        builder.permissions = template.getPermissions();
        return builder;
    }

}
