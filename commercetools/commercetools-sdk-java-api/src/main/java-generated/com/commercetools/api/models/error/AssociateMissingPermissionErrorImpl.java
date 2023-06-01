package com.commercetools.api.models.error;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.error.ErrorObject;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Returned when an Associate is missing a Permission on a B2B resource.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateMissingPermissionErrorImpl implements AssociateMissingPermissionError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier associate;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf;
    
    
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateMissingPermissionErrorImpl(@JsonProperty("message") final String message, @JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("associate") final com.commercetools.api.models.customer.CustomerResourceIdentifier associate, @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit, @JsonProperty("associateOnBehalf") final com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf, @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.message = message;
        this.values = values;
        this.associate = associate;
        this.businessUnit = businessUnit;
        this.associateOnBehalf = associateOnBehalf;
        this.permissions = permissions;
        this.code =  ASSOCIATE_MISSING_PERMISSION;
    }
    /**
     * create empty instance
     */
    public AssociateMissingPermissionErrorImpl() {
        this.code =  ASSOCIATE_MISSING_PERMISSION;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <ul>
     *   <li>When an action is performed by an Associate: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When an action is performed for another Associate, like viewing their Cart: <code>"Associate '$idOfAssociate' has no rights to $action for customer '$idOfCustomer' in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredPermission'."</code></li>
     *   <li>When viewing an entity: <code>"Associate '$idOfAssociate' has no rights to $action in business-unit '$idOrKeyOfBusinessUnit'. Needs '$requiredViewMyPermission' or '$requiredViewOthersPermission'."</code></li>
     *  </ul>
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>ResourceIdentifier to the Associate that tried to perform the action.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociate(){
        return this.associate;
    }
    
    /**
     *  <p>ResourceIdentifier to the BusinessUnit.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit(){
        return this.businessUnit;
    }
    
    /**
     *  <p>ResourceIdentifier of the Associate on whose behalf the action is performed.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociateOnBehalf(){
        return this.associateOnBehalf;
    }
    
    /**
     *  <p>The Permissions that the Associate performing the action lacks. At least one of these Permissions is needed.</p>
     */
    
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions(){
        return this.permissions;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setAssociate(final com.commercetools.api.models.customer.CustomerResourceIdentifier associate){
        this.associate = associate;
    }
    
    
    public void setBusinessUnit(final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit){
        this.businessUnit = businessUnit;
    }
    
    
    public void setAssociateOnBehalf(final com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf){
        this.associateOnBehalf = associateOnBehalf;
    }
    
    
    public void setPermissions(final com.commercetools.api.models.associate_role.Permission ...permissions){
       this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }
    
    
    public void setPermissions(final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions){
       this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AssociateMissingPermissionErrorImpl that = (AssociateMissingPermissionErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(associate, that.associate)
                .append(businessUnit, that.businessUnit)
                .append(associateOnBehalf, that.associateOnBehalf)
                .append(permissions, that.permissions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(values)
            .append(associate)
            .append(businessUnit)
            .append(associateOnBehalf)
            .append(permissions)
            .toHashCode();
    }

}
