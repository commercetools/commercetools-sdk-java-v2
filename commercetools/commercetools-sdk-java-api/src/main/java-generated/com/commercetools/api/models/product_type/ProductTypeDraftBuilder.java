
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeDraftBuilder {

    @Nullable
    private String key;

    private String name;

    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes;

    public ProductTypeDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ProductTypeDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProductTypeDraftBuilder description(final String description) {
        this.description = description;
        return this;
    }

    public ProductTypeDraftBuilder attributes(
            @Nullable final com.commercetools.api.models.product_type.AttributeDefinitionDraft... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }

    public ProductTypeDraftBuilder attributes(
            @Nullable final java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.product_type.AttributeDefinitionDraft> getAttributes() {
        return this.attributes;
    }

    public ProductTypeDraft build() {
        return new ProductTypeDraftImpl(key, name, description, attributes);
    }

    public static ProductTypeDraftBuilder of() {
        return new ProductTypeDraftBuilder();
    }

    public static ProductTypeDraftBuilder of(final ProductTypeDraft template) {
        ProductTypeDraftBuilder builder = new ProductTypeDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        return builder;
    }

}
