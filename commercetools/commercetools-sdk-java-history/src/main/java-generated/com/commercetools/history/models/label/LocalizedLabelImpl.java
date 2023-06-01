package com.commercetools.history.models.label;

import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.label.Label;
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
 * LocalizedLabel
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocalizedLabelImpl implements LocalizedLabel, ModelBase {

    
    private String type;
    
    
    private com.commercetools.history.models.common.LocalizedString value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LocalizedLabelImpl(@JsonProperty("value") final com.commercetools.history.models.common.LocalizedString value) {
        this.value = value;
        this.type =  LOCALIZED_LABEL;
    }
    /**
     * create empty instance
     */
    public LocalizedLabelImpl() {
        this.type =  LOCALIZED_LABEL;
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
    
    public com.commercetools.history.models.common.LocalizedString getValue(){
        return this.value;
    }

    
    public void setValue(final com.commercetools.history.models.common.LocalizedString value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        LocalizedLabelImpl that = (LocalizedLabelImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(value)
            .toHashCode();
    }

}
