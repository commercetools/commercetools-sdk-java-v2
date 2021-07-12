
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>This type represents an attribute whose value is a set of references.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceSetAttributeImpl implements ReferenceSetAttribute {

    private String name;

    private String type;

    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    @JsonCreator
    ReferenceSetAttributeImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.name = name;
        this.value = value;
        this.type = REFERENCE_SET;
    }

    public ReferenceSetAttributeImpl() {
        this.type = REFERENCE_SET;
    }

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions.
    *  The name is required if this type is used in a product variant and must not be set when
    *  used in a product variant patch.</p>
    */
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final com.commercetools.importapi.models.common.KeyReference... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferenceSetAttributeImpl that = (ReferenceSetAttributeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(type).append(value).toHashCode();
    }

}
