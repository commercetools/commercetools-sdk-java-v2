package com.commercetools.api.models.error;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLAssociateMissingPermissionErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Returned when an Associate is missing a Permission on a B2B resource.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
    public void setPermissions(final Permission ...permissions);
    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions values to be set
     */
    
    public void setPermissions(final List<Permission> permissions);

    /**
     * factory method
     * @return instance of GraphQLAssociateMissingPermissionError
     */
    public static GraphQLAssociateMissingPermissionError of(){
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

    /**
     * factory method to create a deep copy of GraphQLAssociateMissingPermissionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAssociateMissingPermissionError deepCopy(@Nullable final GraphQLAssociateMissingPermissionError template) {
        if (template == null) {
            return null;
        }
        GraphQLAssociateMissingPermissionErrorImpl instance = new GraphQLAssociateMissingPermissionErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAssociate(com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getAssociate()));
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier.deepCopy(template.getBusinessUnit()));
        instance.setAssociateOnBehalf(com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getAssociateOnBehalf()));
        instance.setPermissions(Optional.ofNullable(template.getPermissions())
                .map(ArrayList::new)
                .orElse(null));
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
    public static GraphQLAssociateMissingPermissionErrorBuilder builder(final GraphQLAssociateMissingPermissionError template) {
        return GraphQLAssociateMissingPermissionErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAssociateMissingPermissionError(Function<GraphQLAssociateMissingPermissionError, T> helper) {
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
