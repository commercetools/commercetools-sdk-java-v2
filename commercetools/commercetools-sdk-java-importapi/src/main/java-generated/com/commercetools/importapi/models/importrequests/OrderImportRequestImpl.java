package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.orders.OrderImport;
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
 *  <p>The request body to import Orders. Contains data for Orders to be created in a Project.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderImportRequestImpl implements OrderImportRequest, ModelBase {

    
    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    
    private java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderImportRequestImpl(@JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("order");
    }
    /**
     * create empty instance
     */
    public OrderImportRequestImpl() {
        this.type = ImportResourceType.findEnum("order");
    }

    /**
     *  <p>The resource types that can be imported.</p>
     */
    
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
     *  <p>The order import resources of this request.</p>
     */
    
    public java.util.List<com.commercetools.importapi.models.orders.OrderImport> getResources(){
        return this.resources;
    }

    
    public void setResources(final com.commercetools.importapi.models.orders.OrderImport ...resources){
       this.resources = new ArrayList<>(Arrays.asList(resources));
    }
    
    
    public void setResources(final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources){
       this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderImportRequestImpl that = (OrderImportRequestImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(resources, that.resources)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(resources)
            .toHashCode();
    }

}
