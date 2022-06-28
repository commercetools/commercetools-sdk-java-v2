
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeDraft productTypeDraft = ProductTypeDraft.builder()
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeDraftImpl.class)
public interface ProductTypeDraft {

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ProductType.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Description of the ProductType.</p>
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their ProductVariants.</p>
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeDraft>";
            }
        };
    }
}
