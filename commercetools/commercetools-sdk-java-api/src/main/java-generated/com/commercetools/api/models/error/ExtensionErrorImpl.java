
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
 * ExtensionError
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionErrorImpl implements ExtensionError, ModelBase {

    private String code;

    private String message;

    private String extensionId;

    private String extensionKey;

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExtensionErrorImpl(@JsonProperty("code") final String code, @JsonProperty("message") final String message,
            @JsonProperty("extensionId") final String extensionId,
            @JsonProperty("extensionKey") final String extensionKey,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.code = code;
        this.message = message;
        this.extensionId = extensionId;
        this.extensionKey = extensionKey;
        this.values = values;
    }

    /**
     * create empty instance
     */
    public ExtensionErrorImpl() {
    }

    /**
     *  <p>Error code caused by the Extension. For example, <code>InvalidField</code>.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the error.</p>
     */

    public String getMessage() {
        return this.message;
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

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setExtensionId(final String extensionId) {
        this.extensionId = extensionId;
    }

    public void setExtensionKey(final String extensionKey) {
        this.extensionKey = extensionKey;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExtensionErrorImpl that = (ExtensionErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
                .append(values, that.values)
                .append(code, that.code)
                .append(message, that.message)
                .append(extensionId, that.extensionId)
                .append(extensionKey, that.extensionKey)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(extensionId)
                .append(extensionKey)
                .append(values)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("extensionId", extensionId)
                .append("extensionKey", extensionKey)
                .append("values", values)
                .build();
    }

}
