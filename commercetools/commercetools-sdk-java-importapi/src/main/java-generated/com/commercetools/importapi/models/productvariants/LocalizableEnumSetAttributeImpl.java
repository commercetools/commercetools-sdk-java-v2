
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a localized enum. The attribute value refers to the key of the enum value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LocalizableEnumSetAttributeImpl implements LocalizableEnumSetAttribute, ModelBase {

    private String name;

    private String type;

    private java.util.List<String> value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LocalizableEnumSetAttributeImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.util.List<String> value) {
        this.name = name;
        this.value = value;
        this.type = LENUM_SET;
    }

    /**
     * create empty instance
     */
    public LocalizableEnumSetAttributeImpl() {
        this.type = LENUM_SET;
    }

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Must match <code>type</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type. The type is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>A set of localized enum values, each represented by its key. Each key must match the key of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumValue" rel="nofollow">AttributeLocalizedEnumValue</a> in the Product Type.</p>
     */

    public java.util.List<String> getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final String... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<String> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LocalizableEnumSetAttributeImpl that = (LocalizableEnumSetAttributeImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(type).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("type", type)
                .append("value", value)
                .build();
    }

    @Override
    public LocalizableEnumSetAttribute copyDeep() {
        return LocalizableEnumSetAttribute.deepCopy(this);
    }
}
