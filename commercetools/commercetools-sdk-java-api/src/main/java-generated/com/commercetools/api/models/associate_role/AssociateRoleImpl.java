package com.commercetools.api.models.associate_role;

import com.commercetools.api.models.associate_role.Permission;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
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
 * AssociateRole
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateRoleImpl implements AssociateRole, ModelBase {

    
    private String id;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    private String key;
    
    
    private Boolean buyerAssignable;
    
    
    private String name;
    
    
    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;
    
    
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("buyerAssignable") final Boolean buyerAssignable, @JsonProperty("name") final String name, @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.buyerAssignable = buyerAssignable;
        this.name = name;
        this.permissions = permissions;
        this.custom = custom;
    }
    /**
     * create empty instance
     */
    public AssociateRoleImpl() {
    }

    /**
     *  <p>Unique identifier of the AssociateRole.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the AssociateRole.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the AssociateRole was initially created.</p>
     */
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the AssociateRole was last updated.</p>
     */
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>User-defined unique identifier of the AssociateRole.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer. If false, the AssociateRole can only be assigned using the general endpoint.</p>
     */
    
    public Boolean getBuyerAssignable(){
        return this.buyerAssignable;
    }
    
    /**
     *  <p>Name of the AssociateRole.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     */
    
    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions(){
        return this.permissions;
    }
    
    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     */
    
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setBuyerAssignable(final Boolean buyerAssignable){
        this.buyerAssignable = buyerAssignable;
    }
    
    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setPermissions(final com.commercetools.api.models.associate_role.Permission ...permissions){
       this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }
    
    
    public void setPermissions(final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions){
       this.permissions = permissions;
    }
    
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AssociateRoleImpl that = (AssociateRoleImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(buyerAssignable, that.buyerAssignable)
                .append(name, that.name)
                .append(permissions, that.permissions)
                .append(custom, that.custom)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(version)
            .append(createdAt)
            .append(lastModifiedAt)
            .append(lastModifiedBy)
            .append(createdBy)
            .append(key)
            .append(buyerAssignable)
            .append(name)
            .append(permissions)
            .append(custom)
            .toHashCode();
    }

}
