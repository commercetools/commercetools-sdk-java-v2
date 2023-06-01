package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.types.TypeImport;
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
 *  <p>The request body to import Types. Contains data for Types to be created or updated in a Project.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeImportRequestImpl implements TypeImportRequest, ModelBase {

    
    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    
    private java.util.List<com.commercetools.importapi.models.types.TypeImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypeImportRequestImpl(@JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.types.TypeImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("type");
    }
    /**
     * create empty instance
     */
    public TypeImportRequestImpl() {
        this.type = ImportResourceType.findEnum("type");
    }

    /**
     *  <p>The resource types that can be imported.</p>
     */
    
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
     *  <p>The type import resources of this request.</p>
     */
    
    public java.util.List<com.commercetools.importapi.models.types.TypeImport> getResources(){
        return this.resources;
    }

    
    public void setResources(final com.commercetools.importapi.models.types.TypeImport ...resources){
       this.resources = new ArrayList<>(Arrays.asList(resources));
    }
    
    
    public void setResources(final java.util.List<com.commercetools.importapi.models.types.TypeImport> resources){
       this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TypeImportRequestImpl that = (TypeImportRequestImpl) o;
    
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
