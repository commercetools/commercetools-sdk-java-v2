
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
 *  <p>References a resource by key.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class KeyReferenceImpl implements KeyReference, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    KeyReferenceImpl(@JsonProperty("key") final String key,
            @JsonProperty("typeId") final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.key = key;
        this.typeId = typeId;
    }

    /**
     * create empty instance
     */
    public KeyReferenceImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. If the referenced resource does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced resource is created.</p>
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

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        KeyReferenceImpl that = (KeyReferenceImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(typeId, that.typeId)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(typeId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("typeId", typeId)
                .build();
    }

    @Override
    public KeyReference copyDeep() {
        return KeyReference.deepCopy(this);
    }
}
