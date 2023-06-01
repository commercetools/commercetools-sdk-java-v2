package com.commercetools.importapi.models.common;

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
 * LocalizedEnumValue
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class LocalizedEnumValueImpl implements LocalizedEnumValue, ModelBase {

    
    private String key;
    
    
    private com.commercetools.importapi.models.common.LocalizedString label;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LocalizedEnumValueImpl(@JsonProperty("key") final String key, @JsonProperty("label") final com.commercetools.importapi.models.common.LocalizedString label) {
        this.key = key;
        this.label = label;
    }
    /**
     * create empty instance
     */
    public LocalizedEnumValueImpl() {
    }

    /**
     *
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
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
    
        LocalizedEnumValueImpl that = (LocalizedEnumValueImpl) o;
    
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
