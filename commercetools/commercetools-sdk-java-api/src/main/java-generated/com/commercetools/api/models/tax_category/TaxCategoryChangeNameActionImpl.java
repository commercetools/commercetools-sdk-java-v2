package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
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
public final class TaxCategoryChangeNameActionImpl implements TaxCategoryChangeNameAction {

    private String action;
    
    private String name;

    @JsonCreator
    TaxCategoryChangeNameActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action = "changeName";
    }
    public TaxCategoryChangeNameActionImpl() {
        this.action = "changeName";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getName(){
        return this.name;
    }

    public void setName(final String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TaxCategoryChangeNameActionImpl that = (TaxCategoryChangeNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(name, that.name)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(name)
            .toHashCode();
    }

}
