
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
 *  <p>Contains a reference to a resource which does not exist. For example, if a Category is imported with a parent Category that does not exist, the reference to the parent Category is an unresolved reference.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnresolvedReferencesImpl implements UnresolvedReferences, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    UnresolvedReferencesImpl(@JsonProperty("key") final String key,
            @JsonProperty("typeId") final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.key = key;
        this.typeId = typeId;
    }

    /**
     * create empty instance
     */
    public UnresolvedReferencesImpl() {
    }

    /**
     *  <p><code>key</code> of the unresolved resource.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Type of the unresolved resource.</p>
     */

    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
        return this.typeId;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setTypeId(final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        UnresolvedReferencesImpl that = (UnresolvedReferencesImpl) o;

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
    public UnresolvedReferences copyDeep() {
        return UnresolvedReferences.deepCopy(this);
    }
}
