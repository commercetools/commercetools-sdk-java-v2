
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionNoResponseErrorImpl implements ExtensionNoResponseError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String extensionId;

    private String extensionKey;

    @JsonCreator
    ExtensionNoResponseErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("extensionId") final String extensionId,
            @JsonProperty("extensionKey") final String extensionKey) {
        this.message = message;
        this.values = values;
        this.extensionId = extensionId;
        this.extensionKey = extensionKey;
        this.code = EXTENSION_NO_RESPONSE;
    }

    public ExtensionNoResponseErrorImpl() {
        this.code = EXTENSION_NO_RESPONSE;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public String getExtensionId() {
        return this.extensionId;
    }

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

}
