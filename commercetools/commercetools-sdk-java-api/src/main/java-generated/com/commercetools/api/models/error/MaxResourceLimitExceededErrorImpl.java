package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
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
 *  <p>Returned when a resource type cannot be created as it has reached its limits.</p>
 *  <p>The limits must be adjusted for this resource before sending the request again.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MaxResourceLimitExceededErrorImpl implements MaxResourceLimitExceededError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MaxResourceLimitExceededErrorImpl(@JsonProperty("message") final String message, @JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("exceededResource") final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.message = message;
        this.values = values;
        this.exceededResource = exceededResource;
        this.code =  MAX_RESOURCE_LIMIT_EXCEEDED;
    }
    /**
     * create empty instance
     */
    public MaxResourceLimitExceededErrorImpl() {
        this.code =  MAX_RESOURCE_LIMIT_EXCEEDED;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p><code>"You have exceeded the limit of $limit resources of type $resourceTypeId."</code></p>
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     */
    
    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource(){
        return this.exceededResource;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setExceededResource(final com.commercetools.api.models.common.ReferenceTypeId exceededResource){
        this.exceededResource = exceededResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MaxResourceLimitExceededErrorImpl that = (MaxResourceLimitExceededErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(exceededResource, that.exceededResource)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(values)
            .append(exceededResource)
            .toHashCode();
    }

}
