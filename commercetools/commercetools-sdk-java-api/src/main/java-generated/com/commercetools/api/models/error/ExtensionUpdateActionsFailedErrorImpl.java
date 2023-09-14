
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Returned when update actions could not be applied to the resource (for example, because a referenced resource does not exist). This would result in a 400 Bad Request response if the same update action was sent from a regular client.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionUpdateActionsFailedErrorImpl implements ExtensionUpdateActionsFailedError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.common.LocalizedString localizedMessage;

    private java.lang.Object extensionExtraInfo;

    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionUpdateActionsFailedErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("localizedMessage") final com.commercetools.api.models.common.LocalizedString localizedMessage,
            @JsonProperty("extensionExtraInfo") final java.lang.Object extensionExtraInfo,
            @JsonProperty("extensionErrors") final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.message = message;
        this.values = values;
        this.localizedMessage = localizedMessage;
        this.extensionExtraInfo = extensionExtraInfo;
        this.extensionErrors = extensionErrors;
        this.code = EXTENSION_UPDATE_ACTIONS_FAILED;
    }

    /**
     * create empty instance
     */
    public ExtensionUpdateActionsFailedErrorImpl() {
        this.code = EXTENSION_UPDATE_ACTIONS_FAILED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionUpdateActionsFailedErrorImpl that = (ExtensionUpdateActionsFailedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(localizedMessage, that.localizedMessage)
                .append(extensionExtraInfo, that.extensionExtraInfo)
                .append(extensionErrors, that.extensionErrors)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(localizedMessage, that.localizedMessage)
                .append(extensionExtraInfo, that.extensionExtraInfo)
                .append(extensionErrors, that.extensionErrors)
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
                .toHashCode();
    }

}
