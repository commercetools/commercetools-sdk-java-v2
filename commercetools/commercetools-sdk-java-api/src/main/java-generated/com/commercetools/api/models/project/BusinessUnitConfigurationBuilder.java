
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitConfiguration businessUnitConfiguration = BusinessUnitConfiguration.builder()
 *             .myBusinessUnitStatusOnCreation(BusinessUnitConfigurationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitConfigurationBuilder implements Builder<BusinessUnitConfiguration> {

    private com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation;

    @Nullable
    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference myBusinessUnitAssociateRoleOnCreation;

    /**
     *  <p>Status of Business Units created using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param myBusinessUnitStatusOnCreation value to be set
     * @return Builder
     */

    public BusinessUnitConfigurationBuilder myBusinessUnitStatusOnCreation(
            final com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation) {
        this.myBusinessUnitStatusOnCreation = myBusinessUnitStatusOnCreation;
        return this;
    }

    /**
     *  <p>Default <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> assigned to the Associate creating a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param builder function to build the myBusinessUnitAssociateRoleOnCreation value
     * @return Builder
     */

    public BusinessUnitConfigurationBuilder myBusinessUnitAssociateRoleOnCreation(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder> builder) {
        this.myBusinessUnitAssociateRoleOnCreation = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Default <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> assigned to the Associate creating a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param builder function to build the myBusinessUnitAssociateRoleOnCreation value
     * @return Builder
     */

    public BusinessUnitConfigurationBuilder withMyBusinessUnitAssociateRoleOnCreation(
            Function<com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder, com.commercetools.api.models.associate_role.AssociateRoleKeyReference> builder) {
        this.myBusinessUnitAssociateRoleOnCreation = builder
                .apply(com.commercetools.api.models.associate_role.AssociateRoleKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Default <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> assigned to the Associate creating a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param myBusinessUnitAssociateRoleOnCreation value to be set
     * @return Builder
     */

    public BusinessUnitConfigurationBuilder myBusinessUnitAssociateRoleOnCreation(
            @Nullable final com.commercetools.api.models.associate_role.AssociateRoleKeyReference myBusinessUnitAssociateRoleOnCreation) {
        this.myBusinessUnitAssociateRoleOnCreation = myBusinessUnitAssociateRoleOnCreation;
        return this;
    }

    /**
     *  <p>Status of Business Units created using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @return myBusinessUnitStatusOnCreation
     */

    public com.commercetools.api.models.project.BusinessUnitConfigurationStatus getMyBusinessUnitStatusOnCreation() {
        return this.myBusinessUnitStatusOnCreation;
    }

    /**
     *  <p>Default <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> assigned to the Associate creating a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @return myBusinessUnitAssociateRoleOnCreation
     */

    @Nullable
    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getMyBusinessUnitAssociateRoleOnCreation() {
        return this.myBusinessUnitAssociateRoleOnCreation;
    }

    /**
     * builds BusinessUnitConfiguration with checking for non-null required values
     * @return BusinessUnitConfiguration
     */
    public BusinessUnitConfiguration build() {
        Objects.requireNonNull(myBusinessUnitStatusOnCreation,
            BusinessUnitConfiguration.class + ": myBusinessUnitStatusOnCreation is missing");
        return new BusinessUnitConfigurationImpl(myBusinessUnitStatusOnCreation, myBusinessUnitAssociateRoleOnCreation);
    }

    /**
     * builds BusinessUnitConfiguration without checking for non-null required values
     * @return BusinessUnitConfiguration
     */
    public BusinessUnitConfiguration buildUnchecked() {
        return new BusinessUnitConfigurationImpl(myBusinessUnitStatusOnCreation, myBusinessUnitAssociateRoleOnCreation);
    }

    /**
     * factory method for an instance of BusinessUnitConfigurationBuilder
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder of() {
        return new BusinessUnitConfigurationBuilder();
    }

    /**
     * create builder for BusinessUnitConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder of(final BusinessUnitConfiguration template) {
        BusinessUnitConfigurationBuilder builder = new BusinessUnitConfigurationBuilder();
        builder.myBusinessUnitStatusOnCreation = template.getMyBusinessUnitStatusOnCreation();
        builder.myBusinessUnitAssociateRoleOnCreation = template.getMyBusinessUnitAssociateRoleOnCreation();
        return builder;
    }

}
