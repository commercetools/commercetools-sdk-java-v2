
package com.commercetools.api.models.attribute_group;

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
 * AttributeGroupDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupDraftImpl implements AttributeGroupDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeGroupDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes,
            @JsonProperty("key") final String key) {
        this.name = name;
        this.description = description;
        this.attributes = attributes;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public AttributeGroupDraftImpl() {
    }

    /**
     *  <p>Name of the AttributeGroup.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the AttributeGroup.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">Attributes</a> with unique values.</p>
     */

    public java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setAttributes(final com.commercetools.api.models.attribute_group.AttributeReference... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
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

        AttributeGroupDraftImpl that = (AttributeGroupDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(attributes, that.attributes)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(attributes, that.attributes)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(description).append(attributes).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("description", description)
                .append("attributes", attributes)
                .append("key", key)
                .build();
    }

    @Override
    public AttributeGroupDraft copyDeep() {
        return AttributeGroupDraft.deepCopy(this);
    }
}
