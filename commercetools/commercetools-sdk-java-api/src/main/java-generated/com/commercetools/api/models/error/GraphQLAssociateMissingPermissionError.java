
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
 *  <p>Returned when an <span>Associate</span> is missing a <span>Permission</span> on a <span>B2B resource</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAssociateMissingPermissionError graphQLAssociateMissingPermissionError = GraphQLAssociateMissingPermissionError.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateMissingPermission")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAssociateMissingPermissionErrorImpl.class)
public interface GraphQLAssociateMissingPermissionError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAssociateMissingPermissionError
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that tried to perform the action.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public CustomerResourceIdentifier getAssociate();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @return businessUnit
     */
    @NotNull
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> on whose behalf the action is performed.</p>
     * @return associateOnBehalf
     */
    @Valid
    @JsonProperty("associateOnBehalf")
    public CustomerResourceIdentifier getAssociateOnBehalf();

    /**
     *  <p>The Permissions that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> performing the action lacks. At least one of these Permissions is needed.</p>
     * @return permissions
     */
    @NotNull
    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that tried to perform the action.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerResourceIdentifier associate);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> on whose behalf the action is performed.</p>
     * @param associateOnBehalf value to be set
     */

    public void setAssociateOnBehalf(final CustomerResourceIdentifier associateOnBehalf);

    /**
     *  <p>The Permissions that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>The Permissions that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     * factory method
     * @return instance of GraphQLAssociateMissingPermissionError
     */
    public static GraphQLAssociateMissingPermissionError of() {
        return new GraphQLAssociateMissingPermissionErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAssociateMissingPermissionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAssociateMissingPermissionError of(final GraphQLAssociateMissingPermissionError template) {
        GraphQLAssociateMissingPermissionErrorImpl instance = new GraphQLAssociateMissingPermissionErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAssociate(template.getAssociate());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setAssociateOnBehalf(template.getAssociateOnBehalf());
        instance.setPermissions(template.getPermissions());
        return instance;
    }

    public GraphQLAssociateMissingPermissionError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAssociateMissingPermissionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAssociateMissingPermissionError deepCopy(
            @Nullable final GraphQLAssociateMissingPermissionError template) {
        if (template == null) {
            return null;
        }
        GraphQLAssociateMissingPermissionErrorImpl instance = new GraphQLAssociateMissingPermissionErrorImpl();
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
     * builder factory method for GraphQLAssociateMissingPermissionError
     * @return builder
     */
    public static GraphQLAssociateMissingPermissionErrorBuilder builder() {
        return GraphQLAssociateMissingPermissionErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAssociateMissingPermissionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAssociateMissingPermissionErrorBuilder builder(
            final GraphQLAssociateMissingPermissionError template) {
        return GraphQLAssociateMissingPermissionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAssociateMissingPermissionError(
            Function<GraphQLAssociateMissingPermissionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLAssociateMissingPermissionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLAssociateMissingPermissionError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAssociateMissingPermissionError>";
            }
        };
    }
}
