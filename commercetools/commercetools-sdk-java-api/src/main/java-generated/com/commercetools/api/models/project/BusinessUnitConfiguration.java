
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitConfiguration
 *
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
@JsonDeserialize(as = BusinessUnitConfigurationImpl.class)
public interface BusinessUnitConfiguration {

    /**
     *  <p>Status of Business Units created using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @return myBusinessUnitStatusOnCreation
     */
    @NotNull
    @JsonProperty("myBusinessUnitStatusOnCreation")
    public BusinessUnitConfigurationStatus getMyBusinessUnitStatusOnCreation();

    /**
     *  <p>Default <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> assigned to the Associate creating a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @return myBusinessUnitAssociateRoleOnCreation
     */
    @Valid
    @JsonProperty("myBusinessUnitAssociateRoleOnCreation")
    public AssociateRoleKeyReference getMyBusinessUnitAssociateRoleOnCreation();

    /**
     *  <p>Status of Business Units created using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param myBusinessUnitStatusOnCreation value to be set
     */

    public void setMyBusinessUnitStatusOnCreation(final BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation);

    /**
     *  <p>Default <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> assigned to the Associate creating a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param myBusinessUnitAssociateRoleOnCreation value to be set
     */

    public void setMyBusinessUnitAssociateRoleOnCreation(
            final AssociateRoleKeyReference myBusinessUnitAssociateRoleOnCreation);

    /**
     * factory method
     * @return instance of BusinessUnitConfiguration
     */
    public static BusinessUnitConfiguration of() {
        return new BusinessUnitConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitConfiguration of(final BusinessUnitConfiguration template) {
        BusinessUnitConfigurationImpl instance = new BusinessUnitConfigurationImpl();
        instance.setMyBusinessUnitStatusOnCreation(template.getMyBusinessUnitStatusOnCreation());
        instance.setMyBusinessUnitAssociateRoleOnCreation(template.getMyBusinessUnitAssociateRoleOnCreation());
        return instance;
    }

    public BusinessUnitConfiguration copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitConfiguration deepCopy(@Nullable final BusinessUnitConfiguration template) {
        if (template == null) {
            return null;
        }
        BusinessUnitConfigurationImpl instance = new BusinessUnitConfigurationImpl();
        instance.setMyBusinessUnitStatusOnCreation(template.getMyBusinessUnitStatusOnCreation());
        instance.setMyBusinessUnitAssociateRoleOnCreation(
            com.commercetools.api.models.associate_role.AssociateRoleKeyReference
                    .deepCopy(template.getMyBusinessUnitAssociateRoleOnCreation()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitConfiguration
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder builder() {
        return BusinessUnitConfigurationBuilder.of();
    }

    /**
     * create builder for BusinessUnitConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder builder(final BusinessUnitConfiguration template) {
        return BusinessUnitConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitConfiguration(Function<BusinessUnitConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitConfiguration>";
            }
        };
    }
}
