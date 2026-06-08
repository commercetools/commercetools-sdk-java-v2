
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.AssociateRole;
import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Information about all roles and permissions of an Associate in a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateResponse businessUnitAssociateResponse = BusinessUnitAssociateResponse.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusAssociateRoles(associateRolesBuilder -> associateRolesBuilder)
 *             .plusInheritedAssociateRoles(inheritedAssociateRolesBuilder -> inheritedAssociateRolesBuilder)
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateResponseImpl.class)
public interface BusinessUnitAssociateResponse {

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @return associateRoles
     */
    @NotNull
    @Valid
    @JsonProperty("associateRoles")
    public List<AssociateRole> getAssociateRoles();

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @return inheritedAssociateRoles
     */
    @NotNull
    @Valid
    @JsonProperty("inheritedAssociateRoles")
    public List<AssociateRole> getInheritedAssociateRoles();

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @return permissions
     */
    @NotNull
    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param associateRoles values to be set
     */

    @JsonIgnore
    public void setAssociateRoles(final AssociateRole... associateRoles);

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param associateRoles values to be set
     */

    public void setAssociateRoles(final List<AssociateRole> associateRoles);

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param inheritedAssociateRoles values to be set
     */

    @JsonIgnore
    public void setInheritedAssociateRoles(final AssociateRole... inheritedAssociateRoles);

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param inheritedAssociateRoles values to be set
     */

    public void setInheritedAssociateRoles(final List<AssociateRole> inheritedAssociateRoles);

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     * factory method
     * @return instance of BusinessUnitAssociateResponse
     */
    public static BusinessUnitAssociateResponse of() {
        return new BusinessUnitAssociateResponseImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociateResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateResponse of(final BusinessUnitAssociateResponse template) {
        BusinessUnitAssociateResponseImpl instance = new BusinessUnitAssociateResponseImpl();
        instance.setCustomer(template.getCustomer());
        instance.setAssociateRoles(template.getAssociateRoles());
        instance.setInheritedAssociateRoles(template.getInheritedAssociateRoles());
        instance.setPermissions(template.getPermissions());
        return instance;
    }

    public BusinessUnitAssociateResponse copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAssociateResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateResponse deepCopy(@Nullable final BusinessUnitAssociateResponse template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateResponseImpl instance = new BusinessUnitAssociateResponseImpl();
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setAssociateRoles(Optional.ofNullable(template.getAssociateRoles())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.associate_role.AssociateRole::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setInheritedAssociateRoles(Optional.ofNullable(template.getInheritedAssociateRoles())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.associate_role.AssociateRole::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateResponse
     * @return builder
     */
    public static BusinessUnitAssociateResponseBuilder builder() {
        return BusinessUnitAssociateResponseBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociateResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateResponseBuilder builder(final BusinessUnitAssociateResponse template) {
        return BusinessUnitAssociateResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateResponse(Function<BusinessUnitAssociateResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateResponse>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateResponse>";
            }
        };
    }
}
