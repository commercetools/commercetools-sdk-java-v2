
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductLabel productLabel = ProductLabel.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductLabelImpl.class)
public interface ProductLabel extends Label {

    /**
     * discriminator value for ProductLabel
     */
    String PRODUCT_LABEL = "ProductLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the Product.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ProductLabel
     */
    public static ProductLabel of() {
        return new ProductLabelImpl();
    }

    /**
     * factory method to create a shallow copy ProductLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductLabel of(final ProductLabel template) {
        ProductLabelImpl instance = new ProductLabelImpl();
        instance.setSlug(template.getSlug());
        instance.setName(template.getName());
        return instance;
    }

    public ProductLabel copyDeep();

    /**
     * factory method to create a deep copy of ProductLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductLabel deepCopy(@Nullable final ProductLabel template) {
        if (template == null) {
            return null;
        }
        ProductLabelImpl instance = new ProductLabelImpl();
        instance.setSlug(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for ProductLabel
     * @return builder
     */
    public static ProductLabelBuilder builder() {
        return ProductLabelBuilder.of();
    }

    /**
     * create builder for ProductLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductLabelBuilder builder(final ProductLabel template) {
        return ProductLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductLabel(Function<ProductLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductLabel>() {
            @Override
            public String toString() {
                return "TypeReference<ProductLabel>";
            }
        };
    }
}
