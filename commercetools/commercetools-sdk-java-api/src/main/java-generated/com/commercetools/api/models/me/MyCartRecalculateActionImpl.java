package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRecalculateActionImpl implements MyCartRecalculateAction {

    private String action;
    
    private Boolean updateProductData;

    @JsonCreator
    MyCartRecalculateActionImpl(@JsonProperty("updateProductData") final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        this.action = "recalculate";
    }
    public MyCartRecalculateActionImpl() {
        this.action = "recalculate";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Boolean getUpdateProductData(){
        return this.updateProductData;
    }

    public void setUpdateProductData(final Boolean updateProductData){
        this.updateProductData = updateProductData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartRecalculateActionImpl that = (MyCartRecalculateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(updateProductData, that.updateProductData)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(updateProductData)
            .toHashCode();
    }

}
