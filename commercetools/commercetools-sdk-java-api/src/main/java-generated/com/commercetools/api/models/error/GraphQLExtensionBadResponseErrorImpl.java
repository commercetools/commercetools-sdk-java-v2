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
 *  <p>Returned when the response from the API Extension could not be parsed successfully (such as a <code>500</code> HTTP status code, or an invalid JSON response).</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLExtensionBadResponseErrorImpl implements GraphQLExtensionBadResponseError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.common.LocalizedString localizedMessage;
    
    
    private java.lang.Object extensionExtraInfo;
    
    
    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;
    
    
    private String extensionBody;
    
    
    private Integer extensionStatusCode;
    
    
    private String extensionId;
    
    
    private String extensionKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLExtensionBadResponseErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("localizedMessage") final com.commercetools.api.models.common.LocalizedString localizedMessage, @JsonProperty("extensionExtraInfo") final java.lang.Object extensionExtraInfo, @JsonProperty("extensionErrors") final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors, @JsonProperty("extensionBody") final String extensionBody, @JsonProperty("extensionStatusCode") final Integer extensionStatusCode, @JsonProperty("extensionId") final String extensionId, @JsonProperty("extensionKey") final String extensionKey) {
        this.values = values;
        this.localizedMessage = localizedMessage;
        this.extensionExtraInfo = extensionExtraInfo;
        this.extensionErrors = extensionErrors;
        this.extensionBody = extensionBody;
        this.extensionStatusCode = extensionStatusCode;
        this.extensionId = extensionId;
        this.extensionKey = extensionKey;
        this.code =  EXTENSION_BAD_RESPONSE;
    }
    /**
     * create empty instance
     */
    public GraphQLExtensionBadResponseErrorImpl() {
        this.code =  EXTENSION_BAD_RESPONSE;
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
    
    /**
     *  <p>The response body returned by the Extension.</p>
     */
    
    public String getExtensionBody(){
        return this.extensionBody;
    }
    
    /**
     *  <p>Http status code returned by the Extension.</p>
     */
    
    public Integer getExtensionStatusCode(){
        return this.extensionStatusCode;
    }
    
    /**
     *  <p>Unique identifier of the Extension.</p>
     */
    
    public String getExtensionId(){
        return this.extensionId;
    }
    
    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     */
    
    public String getExtensionKey(){
        return this.extensionKey;
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
    
    
    public void setExtensionBody(final String extensionBody){
        this.extensionBody = extensionBody;
    }
    
    
    public void setExtensionStatusCode(final Integer extensionStatusCode){
        this.extensionStatusCode = extensionStatusCode;
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
    
        GraphQLExtensionBadResponseErrorImpl that = (GraphQLExtensionBadResponseErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(localizedMessage, that.localizedMessage)
                .append(extensionExtraInfo, that.extensionExtraInfo)
                .append(extensionErrors, that.extensionErrors)
                .append(extensionBody, that.extensionBody)
                .append(extensionStatusCode, that.extensionStatusCode)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
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
            .append(extensionBody)
            .append(extensionStatusCode)
            .append(extensionId)
            .append(extensionKey)
            .toHashCode();
    }

}
