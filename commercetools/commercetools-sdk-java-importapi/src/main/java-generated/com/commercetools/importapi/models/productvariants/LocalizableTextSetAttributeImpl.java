
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
*  <p>This type represents an attribute whose value is a localized text.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocalizableTextSetAttributeImpl implements LocalizableTextSetAttribute {

    private String name;

    private String type;

    private java.util.List<com.commercetools.importapi.models.common.LocalizedString> value;

    @JsonCreator
    LocalizableTextSetAttributeImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.name = name;
        this.value = value;
        this.type = LTEXT_SET;
    }

    public LocalizableTextSetAttributeImpl() {
        this.type = LTEXT_SET;
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

    public java.util.List<com.commercetools.importapi.models.common.LocalizedString> getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final com.commercetools.importapi.models.common.LocalizedString... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<com.commercetools.importapi.models.common.LocalizedString> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LocalizableTextSetAttributeImpl that = (LocalizableTextSetAttributeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(type).append(value).toHashCode();
    }

}
