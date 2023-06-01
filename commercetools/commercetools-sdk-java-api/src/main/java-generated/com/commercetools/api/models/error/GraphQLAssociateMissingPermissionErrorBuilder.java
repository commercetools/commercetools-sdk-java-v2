package com.commercetools.api.models.error;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLAssociateMissingPermissionError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAssociateMissingPermissionErrorBuilder
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
public class GraphQLAssociateMissingPermissionErrorBuilder implements Builder<GraphQLAssociateMissingPermissionError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier associate;
    
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;
    
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf;
    
    
    
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder addValue(final String key, final java.lang.Object value) {
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
    
    public GraphQLAssociateMissingPermissionErrorBuilder associate(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @param builder function to build the associate value
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder withAssociate(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.associate = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @param associate value to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder associate( final com.commercetools.api.models.customer.CustomerResourceIdentifier associate) {
        this.associate = associate;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder businessUnit(Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder withBusinessUnit(Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @param businessUnit value to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder businessUnit( final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param builder function to build the associateOnBehalf value
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder associateOnBehalf(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.associateOnBehalf = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param builder function to build the associateOnBehalf value
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder withAssociateOnBehalf(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.associateOnBehalf = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @param associateOnBehalf value to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder associateOnBehalf(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf) {
        this.associateOnBehalf = associateOnBehalf;
        return this;
    }
    
    
    
    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions value to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder permissions( final com.commercetools.api.models.associate_role.Permission ...permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }
    
    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions value to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder permissions( final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }
    
    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @param permissions value to be set
     * @return Builder
     */
    
    public GraphQLAssociateMissingPermissionErrorBuilder plusPermissions( final com.commercetools.api.models.associate_role.Permission ...permissions) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.addAll(Arrays.asList(permissions));
        return this;
    }
    
    
    

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     * @return associate
     */
    
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociate(){
        return this.associate;
    }
    
    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     * @return businessUnit
     */
    
    
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit(){
        return this.businessUnit;
    }
    
    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     * @return associateOnBehalf
     */
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociateOnBehalf(){
        return this.associateOnBehalf;
    }
    
    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     * @return permissions
     */
    
    
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions(){
        return this.permissions;
    }

    /**
     * builds GraphQLAssociateMissingPermissionError with checking for non-null required values
     * @return GraphQLAssociateMissingPermissionError
     */
    public GraphQLAssociateMissingPermissionError build() {
        Objects.requireNonNull(associate, GraphQLAssociateMissingPermissionError.class + ": associate is missing");
        Objects.requireNonNull(businessUnit, GraphQLAssociateMissingPermissionError.class + ": businessUnit is missing");
        Objects.requireNonNull(permissions, GraphQLAssociateMissingPermissionError.class + ": permissions is missing");
        return new GraphQLAssociateMissingPermissionErrorImpl(values, associate, businessUnit, associateOnBehalf, permissions);
    }
    
    /**
     * builds GraphQLAssociateMissingPermissionError without checking for non-null required values
     * @return GraphQLAssociateMissingPermissionError
     */
    public GraphQLAssociateMissingPermissionError buildUnchecked() {
        return new GraphQLAssociateMissingPermissionErrorImpl(values, associate, businessUnit, associateOnBehalf, permissions);
    }

    /**
     * factory method for an instance of GraphQLAssociateMissingPermissionErrorBuilder
     * @return builder 
     */
    public static GraphQLAssociateMissingPermissionErrorBuilder of() {
        return new GraphQLAssociateMissingPermissionErrorBuilder();
    }

    /**
     * create builder for GraphQLAssociateMissingPermissionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAssociateMissingPermissionErrorBuilder of(final GraphQLAssociateMissingPermissionError template) {
        GraphQLAssociateMissingPermissionErrorBuilder builder = new GraphQLAssociateMissingPermissionErrorBuilder();
        builder.values = template.values();
        builder.associate = template.getAssociate();
        builder.businessUnit = template.getBusinessUnit();
        builder.associateOnBehalf = template.getAssociateOnBehalf();
        builder.permissions = template.getPermissions();
        return builder;
    }

}
