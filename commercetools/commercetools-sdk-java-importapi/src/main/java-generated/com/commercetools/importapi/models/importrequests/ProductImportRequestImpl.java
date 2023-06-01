package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.products.ProductImport;
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
 *  <p>The request body to import Products. Contains data for Products to be created or updated in a Project.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductImportRequestImpl implements ProductImportRequest, ModelBase {

    
    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    
    private java.util.List<com.commercetools.importapi.models.products.ProductImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductImportRequestImpl(@JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.products.ProductImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("product");
    }
    /**
     * create empty instance
     */
    public ProductImportRequestImpl() {
        this.type = ImportResourceType.findEnum("product");
    }

    /**
     *  <p>The resource types that can be imported.</p>
     */
    
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
     *  <p>The product import resources of this request.</p>
     */
    
    public java.util.List<com.commercetools.importapi.models.products.ProductImport> getResources(){
        return this.resources;
    }

    
    public void setResources(final com.commercetools.importapi.models.products.ProductImport ...resources){
       this.resources = new ArrayList<>(Arrays.asList(resources));
    }
    
    
    public void setResources(final java.util.List<com.commercetools.importapi.models.products.ProductImport> resources){
       this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductImportRequestImpl that = (ProductImportRequestImpl) o;
    
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
