package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.common.LocalizedString;
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
 *  <p>Defines an allowed value of a CustomFieldLocalizedEnumType field.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldLocalizedEnumValueImpl implements CustomFieldLocalizedEnumValue, ModelBase {

    
    private String key;
    
    
    private com.commercetools.importapi.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldLocalizedEnumValueImpl(@JsonProperty("key") final String key, @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
    }
    /**
     * create empty instance
     */
    public CustomFieldLocalizedEnumValueImpl() {
    }

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Descriptive localized label of the value.</p>
     */
    
    public com.commercetools.importapi.models.common.LocalizedString getLabel(){
        return this.label;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setLabel(final com.commercetools.importapi.models.common.LocalizedString label){
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomFieldLocalizedEnumValueImpl that = (CustomFieldLocalizedEnumValueImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
                .append(label, that.label)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
            .append(label)
            .toHashCode();
    }

}
