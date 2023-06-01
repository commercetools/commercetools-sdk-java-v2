package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValue;
import com.commercetools.history.models.change_value.ChangeValueExternalChangeValue;
import com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValue;
import com.commercetools.history.models.change_value.ChangeValueRelativeChangeValue;
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
 * ChangeValueChangeValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeValueChangeValueImpl implements ChangeValueChangeValue, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeValueChangeValueImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ChangeValueChangeValueImpl() {
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
    
        ChangeValueChangeValueImpl that = (ChangeValueChangeValueImpl) o;
    
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
