package com.commercetools.api.models.me;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
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
 *  <p>Changing the parent of a Business Unit generates a BusinessUnitParentUnitChanged Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitChangeParentUnitActionImpl implements MyBusinessUnitChangeParentUnitAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitChangeParentUnitActionImpl(@JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        this.action =  CHANGE_PARENT_UNIT;
    }
    /**
     * create empty instance
     */
    public MyBusinessUnitChangeParentUnitActionImpl() {
        this.action =  CHANGE_PARENT_UNIT;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New parent unit of the Business Unit.</p>
     */
    
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit(){
        return this.parentUnit;
    }

    
    public void setParentUnit(final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit){
        this.parentUnit = parentUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyBusinessUnitChangeParentUnitActionImpl that = (MyBusinessUnitChangeParentUnitActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(parentUnit, that.parentUnit)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(parentUnit)
            .toHashCode();
    }

}
