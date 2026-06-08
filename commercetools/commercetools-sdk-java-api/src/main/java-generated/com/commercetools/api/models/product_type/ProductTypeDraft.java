
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
public interface ProductTypeDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ProductTypeDraft> {

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ProductType.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Description of the ProductType.</p>
     * @return description
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinitionDraft> getAttributes();

    /**
     *  <p>User-defined unique identifier for the ProductType.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the ProductType.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Description of the ProductType.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final AttributeDefinitionDraft... attributes);

    /**
     *  <p>Attributes to specify for the ProductType. Products of this ProductType have these Attributes available on their <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariants</a>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<AttributeDefinitionDraft> attributes);

    /**
     * factory method
     * @return instance of ProductTypeDraft
     */
    public static ProductTypeDraft of() {
        return new ProductTypeDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeDraft of(final ProductTypeDraft template) {
        ProductTypeDraftImpl instance = new ProductTypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public ProductTypeDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeDraft deepCopy(@Nullable final ProductTypeDraft template) {
        if (template == null) {
            return null;
        }
        ProductTypeDraftImpl instance = new ProductTypeDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_type.AttributeDefinitionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeDraft
     * @return builder
     */
    public static ProductTypeDraftBuilder builder() {
        return ProductTypeDraftBuilder.of();
    }

    /**
     * create builder for ProductTypeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeDraftBuilder builder(final ProductTypeDraft template) {
        return ProductTypeDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeDraft(Function<ProductTypeDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeDraft>";
            }
        };
    }
}
