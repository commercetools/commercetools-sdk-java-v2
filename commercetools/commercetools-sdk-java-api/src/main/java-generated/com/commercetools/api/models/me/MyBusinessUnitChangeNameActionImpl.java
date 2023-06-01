package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
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
 *  <p>Updating the name on a Business Unit generates a BusinessUnitNameChanged Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitChangeNameActionImpl implements MyBusinessUnitChangeNameAction, ModelBase {

    
    private String action;
    
    
    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitChangeNameActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action =  CHANGE_NAME;
    }
    /**
     * create empty instance
     */
    public MyBusinessUnitChangeNameActionImpl() {
        this.action =  CHANGE_NAME;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New name to set.</p>
     */
    
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
    
        MyBusinessUnitChangeNameActionImpl that = (MyBusinessUnitChangeNameActionImpl) o;
    
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
