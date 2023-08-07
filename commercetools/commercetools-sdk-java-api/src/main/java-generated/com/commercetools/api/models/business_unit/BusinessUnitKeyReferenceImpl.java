
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Reference to a BusinessUnit by its key.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitKeyReferenceImpl implements BusinessUnitKeyReference, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitKeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("business-unit");
    }

    /**
     * create empty instance
     */
    public BusinessUnitKeyReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("business-unit");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique and immutable key of the referenced BusinessUnit.</p>
     */

    public String getKey() {
        return this.key;
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

        BusinessUnitKeyReferenceImpl that = (BusinessUnitKeyReferenceImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(key).toHashCode();
    }

}
