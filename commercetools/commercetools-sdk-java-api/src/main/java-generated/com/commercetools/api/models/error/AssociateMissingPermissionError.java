
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when an Associate is missing a Permission on a B2B resource.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("AssociateMissingPermission")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateMissingPermissionErrorImpl.class)
public interface AssociateMissingPermissionError extends ErrorObject {

    /**
     * discriminator value for AssociateMissingPermissionError
     */
    String ASSOCIATE_MISSING_PERMISSION = "AssociateMissingPermission";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <ul>
     *   <li>When an action is performed by an Associate: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When an action is performed for another Associate, like viewing their Cart: <code>"Associate '$idOfAssociate' has no rights to $action for customer '$idOfCustomer' in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When viewing an entity: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredViewMyPermission' or '$requiredViewOthersPermission'."</code></li>
     *  </ul>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public CustomerResourceIdentifier getAssociate();

    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @return associateOnBehalf
     */
    @Valid
    @JsonProperty("associateOnBehalf")
    public CustomerResourceIdentifier getAssociateOnBehalf();

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @return permissions
     */
    @NotNull
    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <ul>
     *   <li>When an action is performed by an Associate: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When an action is performed for another Associate, like viewing their Cart: <code>"Associate '$idOfAssociate' has no rights to $action for customer '$idOfCustomer' in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When viewing an entity: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredViewMyPermission' or '$requiredViewOthersPermission'."</code></li>
     *  </ul>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerResourceIdentifier associate);

    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param associateOnBehalf value to be set
     */

    public void setAssociateOnBehalf(final CustomerResourceIdentifier associateOnBehalf);

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     * factory method
     * @return instance of AssociateMissingPermissionError
     */
    public static AssociateMissingPermissionError of() {
        return new AssociateMissingPermissionErrorImpl();
    }

    /**
     * factory method to create a shallow copy AssociateMissingPermissionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateMissingPermissionError of(final AssociateMissingPermissionError template) {
        AssociateMissingPermissionErrorImpl instance = new AssociateMissingPermissionErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAssociate(template.getAssociate());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setAssociateOnBehalf(template.getAssociateOnBehalf());
        instance.setPermissions(template.getPermissions());
        return instance;
    }

    public AssociateMissingPermissionError copyDeep();

    /**
     * factory method to create a deep copy of AssociateMissingPermissionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateMissingPermissionError deepCopy(@Nullable final AssociateMissingPermissionError template) {
        if (template == null) {
            return null;
        }
        AssociateMissingPermissionErrorImpl instance = new AssociateMissingPermissionErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAssociate(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getAssociate()));
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setAssociateOnBehalf(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getAssociateOnBehalf()));
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AssociateMissingPermissionError
     * @return builder
     */
    public static AssociateMissingPermissionErrorBuilder builder() {
        return AssociateMissingPermissionErrorBuilder.of();
    }

    /**
     * create builder for AssociateMissingPermissionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateMissingPermissionErrorBuilder builder(final AssociateMissingPermissionError template) {
        return AssociateMissingPermissionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateMissingPermissionError(Function<AssociateMissingPermissionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateMissingPermissionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateMissingPermissionError>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateMissingPermissionError>";
            }
        };
    }
}
