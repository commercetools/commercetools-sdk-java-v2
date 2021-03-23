
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectDraftImpl implements CustomObjectDraft {

    private String container;

    private String key;

    private java.lang.Object value;

    private Long version;

    @JsonCreator
    CustomObjectDraftImpl(@JsonProperty("container") final String container, @JsonProperty("key") final String key,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("version") final Long version) {
        this.container = container;
        this.key = key;
        this.value = value;
        this.version = version;
    }

    public CustomObjectDraftImpl() {
    }

    /**
    *  <p>A namespace to group custom objects.</p>
    */
    public String getContainer() {
        return this.container;
    }

    /**
    *  <p>A user-defined key that is unique within the given container.</p>
    */
    public String getKey() {
        return this.key;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomObjectDraftImpl that = (CustomObjectDraftImpl) o;

        return new EqualsBuilder().append(container, that.container)
                .append(key, that.key)
                .append(value, that.value)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(container).append(key).append(value).append(version).toHashCode();
    }

}
