package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValue;
import com.commercetools.history.models.change_value.ChangeTargetShippingChangeValue;
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
 * ChangeTargetChangeValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeTargetChangeValueImpl implements ChangeTargetChangeValue, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTargetChangeValueImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ChangeTargetChangeValueImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeTargetChangeValueImpl that = (ChangeTargetChangeValueImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
