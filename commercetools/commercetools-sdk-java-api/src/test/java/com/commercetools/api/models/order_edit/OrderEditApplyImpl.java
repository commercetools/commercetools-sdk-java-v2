package com.commercetools.api.models.order_edit;


import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditApplyImpl implements OrderEditApply {

    
    private Integer editVersion;
    
    
    private Integer resourceVersion;

    @JsonCreator
    OrderEditApplyImpl(@JsonProperty("editVersion") final Integer editVersion, @JsonProperty("resourceVersion") final Integer resourceVersion) {
        this.editVersion = editVersion;
        this.resourceVersion = resourceVersion;
    }
    public OrderEditApplyImpl() {
    }

    
    public Integer getEditVersion(){
        return this.editVersion;
    }
    
    
    public Integer getResourceVersion(){
        return this.resourceVersion;
    }

    
    public void setEditVersion(final Integer editVersion){
        this.editVersion = editVersion;
    }
    
    
    public void setResourceVersion(final Integer resourceVersion){
        this.resourceVersion = resourceVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditApplyImpl that = (OrderEditApplyImpl) o;
    
        return new EqualsBuilder()
                .append(editVersion, that.editVersion)
                .append(resourceVersion, that.resourceVersion)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(editVersion)
            .append(resourceVersion)
            .toHashCode();
    }

}
