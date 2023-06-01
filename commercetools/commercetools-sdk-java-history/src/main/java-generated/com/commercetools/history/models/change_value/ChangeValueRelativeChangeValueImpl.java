package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
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
 *  <p>Shape of the value for cart discounts relative value.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeValueRelativeChangeValueImpl implements ChangeValueRelativeChangeValue, ModelBase {

    
    private String type;
    
    
    private Integer permyriad;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeValueRelativeChangeValueImpl(@JsonProperty("permyriad") final Integer permyriad) {
        this.permyriad = permyriad;
        this.type =  RELATIVE;
    }
    /**
     * create empty instance
     */
    public ChangeValueRelativeChangeValueImpl() {
        this.type =  RELATIVE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public Integer getPermyriad(){
        return this.permyriad;
    }

    
    public void setPermyriad(final Integer permyriad){
        this.permyriad = permyriad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeValueRelativeChangeValueImpl that = (ChangeValueRelativeChangeValueImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(permyriad, that.permyriad)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(permyriad)
            .toHashCode();
    }

}
