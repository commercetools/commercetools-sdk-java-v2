
package com.commercetools.importapi.models.common;

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
 *  <p>Used by the Import API to identify a CustomObject.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectKeyReferenceImpl implements CustomObjectKeyReference, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    private String container;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomObjectKeyReferenceImpl(@JsonProperty("key") final String key,
            @JsonProperty("container") final String container) {
        this.key = key;
        this.container = container;
        this.typeId = ReferenceType.findEnum("key-value-document");
    }

    /**
     * create empty instance
     */
    public CustomObjectKeyReferenceImpl() {
        this.typeId = ReferenceType.findEnum("key-value-document");
    }

    /**
     *  <p>User-defined unique identifier of the referenced CustomObject.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>The <code>container</code> of the referenced CustomObject.</p>
     */

    public String getContainer() {
        return this.container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomObjectKeyReferenceImpl that = (CustomObjectKeyReferenceImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(typeId, that.typeId)
                .append(container, that.container)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .append(container, that.container)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(typeId).append(container).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("typeId", typeId)
                .append("container", container)
                .build();
    }

    @Override
    public CustomObjectKeyReference copyDeep() {
        return CustomObjectKeyReference.deepCopy(this);
    }
}
