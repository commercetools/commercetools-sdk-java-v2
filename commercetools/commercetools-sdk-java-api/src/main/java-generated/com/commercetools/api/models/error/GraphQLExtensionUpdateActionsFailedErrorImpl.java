package com.commercetools.api.models.error;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.error.ExtensionError;
import com.commercetools.api.models.error.GraphQLErrorObject;
import java.lang.Object;
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
 *  <p>Returned when update actions could not be applied to the resource (for example, because a referenced resource does not exist). This would result in a 400 Bad Request response if the same update action was sent from a regular client.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLExtensionUpdateActionsFailedErrorImpl implements GraphQLExtensionUpdateActionsFailedError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.common.LocalizedString localizedMessage;
    
    
    private java.lang.Object extensionExtraInfo;
    
    
    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLExtensionUpdateActionsFailedErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("localizedMessage") final com.commercetools.api.models.common.LocalizedString localizedMessage, @JsonProperty("extensionExtraInfo") final java.lang.Object extensionExtraInfo, @JsonProperty("extensionErrors") final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.values = values;
        this.localizedMessage = localizedMessage;
        this.extensionExtraInfo = extensionExtraInfo;
        this.extensionErrors = extensionErrors;
        this.code =  EXTENSION_UPDATE_ACTIONS_FAILED;
    }
    /**
     * create empty instance
     */
    public GraphQLExtensionUpdateActionsFailedErrorImpl() {
        this.code =  EXTENSION_UPDATE_ACTIONS_FAILED;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>User-defined localized description of the error.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage(){
        return this.localizedMessage;
    }
    
    /**
     *  <p>Any information that should be returned to the API caller.</p>
     */
    
    public java.lang.Object getExtensionExtraInfo(){
        return this.extensionExtraInfo;
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     */
    
    public java.util.List<com.commercetools.api.models.error.ExtensionError> getExtensionErrors(){
        return this.extensionErrors;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setLocalizedMessage(final com.commercetools.api.models.common.LocalizedString localizedMessage){
        this.localizedMessage = localizedMessage;
    }
    
    
    public void setExtensionExtraInfo(final java.lang.Object extensionExtraInfo){
        this.extensionExtraInfo = extensionExtraInfo;
    }
    
    
    public void setExtensionErrors(final com.commercetools.api.models.error.ExtensionError ...extensionErrors){
       this.extensionErrors = new ArrayList<>(Arrays.asList(extensionErrors));
    }
    
    
    public void setExtensionErrors(final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors){
       this.extensionErrors = extensionErrors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLExtensionUpdateActionsFailedErrorImpl that = (GraphQLExtensionUpdateActionsFailedErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(localizedMessage, that.localizedMessage)
                .append(extensionExtraInfo, that.extensionExtraInfo)
                .append(extensionErrors, that.extensionErrors)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(localizedMessage)
            .append(extensionExtraInfo)
            .append(extensionErrors)
            .toHashCode();
    }

}
