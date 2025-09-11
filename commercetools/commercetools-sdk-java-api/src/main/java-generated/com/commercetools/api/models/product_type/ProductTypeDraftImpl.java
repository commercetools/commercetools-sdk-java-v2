
package com.commercetools.api.models.product_type;

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
 * ProductTypeDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeDraftImpl implements ProductTypeDraft, ModelBase {

    private String key;

    private String name;

    private String description;

    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public ProductTypeDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the ProductType.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Description of the ProductType.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> getAttributes() {
        return this.attributes;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAttributes(final com.commercetools.api.models.product_type.AttributeDefinitionDraft... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeDraftImpl that = (ProductTypeDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(attributes, that.attributes)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(name).append(description).append(attributes).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("description", description)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public ProductTypeDraft copyDeep() {
        return ProductTypeDraft.deepCopy(this);
    }
}
