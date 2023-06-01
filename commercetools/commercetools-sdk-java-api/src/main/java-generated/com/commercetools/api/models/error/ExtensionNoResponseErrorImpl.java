package com.commercetools.api.models.error;

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
 *  <p>Returned when the API Extension does not respond within the time limit, or could not be reached.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExtensionNoResponseErrorImpl implements ExtensionNoResponseError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private String extensionId;
    
    
    private String extensionKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionNoResponseErrorImpl(@JsonProperty("message") final String message, @JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("extensionId") final String extensionId, @JsonProperty("extensionKey") final String extensionKey) {
        this.message = message;
        this.values = values;
        this.extensionId = extensionId;
        this.extensionKey = extensionKey;
        this.code =  EXTENSION_NO_RESPONSE;
    }
    /**
     * create empty instance
     */
    public ExtensionNoResponseErrorImpl() {
        this.code =  EXTENSION_NO_RESPONSE;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p><code>"Extension did not respond in time."</code></p>
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
     *  <p>Unique identifier of the API Extension.</p>
     */
    
    public String getExtensionId(){
        return this.extensionId;
    }
    
    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     */
    
    public String getExtensionKey(){
        return this.extensionKey;
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
    
    
    public void setExtensionId(final String extensionId){
        this.extensionId = extensionId;
    }
    
    
    public void setExtensionKey(final String extensionKey){
        this.extensionKey = extensionKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ExtensionNoResponseErrorImpl that = (ExtensionNoResponseErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(values)
            .append(extensionId)
            .append(extensionKey)
            .toHashCode();
    }

}
