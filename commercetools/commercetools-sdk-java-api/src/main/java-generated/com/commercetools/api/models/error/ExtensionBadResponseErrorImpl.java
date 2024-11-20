
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when the response from the API Extension could not be parsed successfully (such as a <code>500</code> HTTP status code, or an invalid JSON response).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionBadResponseErrorImpl implements ExtensionBadResponseError, ModelBase {

    private String code;

    private String message;

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
    ExtensionBadResponseErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("localizedMessage") final com.commercetools.api.models.common.LocalizedString localizedMessage,
            @JsonProperty("extensionExtraInfo") final java.lang.Object extensionExtraInfo,
            @JsonProperty("extensionErrors") final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors,
            @JsonProperty("extensionBody") final String extensionBody,
            @JsonProperty("extensionStatusCode") final Integer extensionStatusCode,
            @JsonProperty("extensionId") final String extensionId,
            @JsonProperty("extensionKey") final String extensionKey) {
        this.message = message;
        this.values = values;
        this.localizedMessage = localizedMessage;
        this.extensionExtraInfo = extensionExtraInfo;
        this.extensionErrors = extensionErrors;
        this.extensionBody = extensionBody;
        this.extensionStatusCode = extensionStatusCode;
        this.extensionId = extensionId;
        this.extensionKey = extensionKey;
        this.code = EXTENSION_BAD_RESPONSE;
    }

    /**
     * create empty instance
     */
    public ExtensionBadResponseErrorImpl() {
        this.code = EXTENSION_BAD_RESPONSE;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Description of the invalid Extension response. For example, <code>"The extension did not return the expected JSON."</code>.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage() {
        return this.localizedMessage;
    }

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     */

    public java.lang.Object getExtensionExtraInfo() {
        return this.extensionExtraInfo;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ExtensionError> getExtensionErrors() {
        return this.extensionErrors;
    }

    /**
     *  <p>The response body returned by the Extension.</p>
     */

    public String getExtensionBody() {
        return this.extensionBody;
    }

    /**
     *  <p>Http status code returned by the Extension.</p>
     */

    public Integer getExtensionStatusCode() {
        return this.extensionStatusCode;
    }

    /**
     *  <p>Unique identifier of the Extension.</p>
     */

    public String getExtensionId() {
        return this.extensionId;
    }

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     */

    public String getExtensionKey() {
        return this.extensionKey;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setLocalizedMessage(final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public void setExtensionExtraInfo(final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
    }

    public void setExtensionErrors(final com.commercetools.api.models.error.ExtensionError... extensionErrors) {
        this.extensionErrors = new ArrayList<>(Arrays.asList(extensionErrors));
    }

    public void setExtensionErrors(
            final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.extensionErrors = extensionErrors;
    }

    public void setExtensionBody(final String extensionBody) {
        this.extensionBody = extensionBody;
    }

    public void setExtensionStatusCode(final Integer extensionStatusCode) {
        this.extensionStatusCode = extensionStatusCode;
    }

    public void setExtensionId(final String extensionId) {
        this.extensionId = extensionId;
    }

    public void setExtensionKey(final String extensionKey) {
        this.extensionKey = extensionKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionBadResponseErrorImpl that = (ExtensionBadResponseErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(localizedMessage, that.localizedMessage)
                .append(extensionExtraInfo, that.extensionExtraInfo)
                .append(extensionErrors, that.extensionErrors)
                .append(extensionBody, that.extensionBody)
                .append(extensionStatusCode, that.extensionStatusCode)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
                .append(code, that.code)
                .append(message, that.message)
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
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("localizedMessage", localizedMessage)
                .append("extensionExtraInfo", extensionExtraInfo)
                .append("extensionErrors", extensionErrors)
                .append("extensionBody", extensionBody)
                .append("extensionStatusCode", extensionStatusCode)
                .append("extensionId", extensionId)
                .append("extensionKey", extensionKey)
                .build();
    }

}
