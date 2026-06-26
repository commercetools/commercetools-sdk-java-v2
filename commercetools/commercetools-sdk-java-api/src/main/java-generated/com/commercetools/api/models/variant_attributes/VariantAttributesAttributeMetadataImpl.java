
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Metadata about a requested <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">Attribute</a>, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesAttributeMetadataImpl implements VariantAttributesAttributeMetadata, ModelBase {

    private String name;

    private com.commercetools.api.models.common.LocalizedString label;

    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAttributesAttributeMetadataImpl(@JsonProperty("name") final String name,
            @JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label,
            @JsonProperty("type") final String type) {
        this.name = name;
        this.label = label;
        this.type = type;
    }

    /**
     * create empty instance
     */
    public VariantAttributesAttributeMetadataImpl() {
    }

    /**
     *  <p>Name of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getLabel() {
        return this.label;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>, for example <code>boolean</code>, <code>text</code>, <code>ltext</code>, <code>enum</code>, <code>lenum</code>, <code>number</code>, <code>money</code>, <code>date</code>, <code>time</code>, <code>datetime</code>, <code>reference</code>, <code>set</code>, or <code>nested</code>.</p>
     */

    public String getType() {
        return this.type;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setLabel(final com.commercetools.api.models.common.LocalizedString label) {
        this.label = label;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantAttributesAttributeMetadataImpl that = (VariantAttributesAttributeMetadataImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(label, that.label)
                .append(type, that.type)
                .append(name, that.name)
                .append(label, that.label)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(label).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("label", label)
                .append("type", type)
                .build();
    }

    @Override
    public VariantAttributesAttributeMetadata copyDeep() {
        return VariantAttributesAttributeMetadata.deepCopy(this);
    }
}
