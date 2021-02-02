
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeDraftImpl.class)
public interface ProductTypeDraft {

    /**
    *  <p>User-specific unique identifier for the product type (min.
    *  2 and max.
    *  256 characters).</p>
    */

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("description")
    public String getDescription();

    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinitionDraft> getAttributes();

    public void setKey(final String key);

    public void setName(final String name);

    public void setDescription(final String description);

    @JsonIgnore
    public void setAttributes(final AttributeDefinitionDraft... attributes);

    public void setAttributes(final List<AttributeDefinitionDraft> attributes);

    public static ProductTypeDraft of() {
        return new ProductTypeDraftImpl();
    }

    public static ProductTypeDraft of(final ProductTypeDraft template) {
        ProductTypeDraftImpl instance = new ProductTypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public static ProductTypeDraftBuilder builder() {
        return ProductTypeDraftBuilder.of();
    }

    public static ProductTypeDraftBuilder builder(final ProductTypeDraft template) {
        return ProductTypeDraftBuilder.of(template);
    }

    default <T> T withProductTypeDraft(Function<ProductTypeDraft, T> helper) {
        return helper.apply(this);
    }
}
