
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

/**
*  <p>References a key value document by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomObjectKeyReferenceImpl implements CustomObjectKeyReference, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    private String container;

    @JsonCreator
    CustomObjectKeyReferenceImpl(@JsonProperty("key") final String key,
            @JsonProperty("container") final String container) {
        this.key = key;
        this.container = container;
        this.typeId = ReferenceType.findEnum("key-value-document");
    }

    public CustomObjectKeyReferenceImpl() {
        this.typeId = ReferenceType.findEnum("key-value-document");
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The type of the referenced resource.</p>
    */
    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
        return this.typeId;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(typeId).append(container).toHashCode();
    }

}
