
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
 *  <p>Returned when the API Extension does not respond within the time limit, or could not be reached.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
    ExtensionNoResponseErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("extensionId") final String extensionId,
            @JsonProperty("extensionKey") final String extensionKey) {
        this.message = message;
        this.values = values;
        this.extensionId = extensionId;
        this.extensionKey = extensionKey;
        this.code = EXTENSION_NO_RESPONSE;
    }

    /**
     * create empty instance
     */
    public ExtensionNoResponseErrorImpl() {
        this.code = EXTENSION_NO_RESPONSE;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Extension did not respond in time."</code></p>
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
     *  <p>Unique identifier of the API Extension.</p>
     */

    public String getExtensionId() {
        return this.extensionId;
    }

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
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

        ExtensionNoResponseErrorImpl that = (ExtensionNoResponseErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(extensionId)
                .append(extensionKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("extensionId", extensionId)
                .append("extensionKey", extensionKey)
                .build();
    }

    @Override
    public ExtensionNoResponseError copyDeep() {
        return ExtensionNoResponseError.deepCopy(this);
    }
}
