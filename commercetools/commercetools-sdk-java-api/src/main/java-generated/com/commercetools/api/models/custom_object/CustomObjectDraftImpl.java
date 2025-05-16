
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;

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
 * CustomObjectDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectDraftImpl implements CustomObjectDraft, ModelBase {

    private String container;

    private String key;

    private java.lang.Object value;

    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomObjectDraftImpl(@JsonProperty("container") final String container, @JsonProperty("key") final String key,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("version") final Long version) {
        this.container = container;
        this.key = key;
        this.value = value;
        this.version = version;
    }

    /**
     * create empty instance
     */
    public CustomObjectDraftImpl() {
    }

    /**
     *  <p>Namespace to group CustomObjects.</p>
     */

    public String getContainer() {
        return this.container;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Can be any JSON standard type, such as number, string, boolean, array, object, or a common API data type.</p>
     *  <ul>
     *   <li>Fields within <code>value</code> that have <code>null</code> values <strong>are not saved</strong>.</li>
     *   <li>For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</li>
     *  </ul>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>Current version of the CustomObject.</p>
     */

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
                .append(container, that.container)
                .append(key, that.key)
                .append(value, that.value)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(container).append(key).append(value).append(version).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("container", container)
                .append("key", key)
                .append("value", value)
                .append("version", version)
                .build();
    }

    @Override
    public CustomObjectDraft copyDeep() {
        return CustomObjectDraft.deepCopy(this);
    }
}
