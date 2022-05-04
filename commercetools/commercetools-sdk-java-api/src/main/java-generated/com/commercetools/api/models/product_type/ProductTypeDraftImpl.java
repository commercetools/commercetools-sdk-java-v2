
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeDraftImpl implements ProductTypeDraft, ModelBase {

    private String key;

    private String name;

    private String description;

    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes;

    @JsonCreator
    ProductTypeDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.attributes = attributes;
    }

    public ProductTypeDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier for the ProductType.</p>
    */
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(name).append(description).append(attributes).toHashCode();
    }

}
