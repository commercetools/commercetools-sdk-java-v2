
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Contains all the tailored information of a Product for a specific Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringInStoreDraft productTailoringInStoreDraft = ProductTailoringInStoreDraft.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringInStoreDraftImpl.class)
public interface ProductTailoringInStoreDraft extends io.vrap.rmf.base.client.Draft<ProductTailoringInStoreDraft> {

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Tailored name of the Product.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Tailored description of the Product.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Tailored description of the Product that is used in search engine.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>If <code>true</code>, the ProductTailoring is published immediately.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @return variants
     */
    @Valid
    @JsonProperty("variants")
    public List<ProductVariantTailoringDraft> getVariants();

    /**
     *  <p>Attributes of the tailored Product. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<ProductTailoringAttribute> getAttributes();

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductResourceIdentifier product);

    /**
     *  <p>Tailored name of the Product.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Tailored description of the Product.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>Tailored description of the Product that is used in search engine.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>If <code>true</code>, the ProductTailoring is published immediately.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants values to be set
     */

    @JsonIgnore
    public void setVariants(final ProductVariantTailoringDraft... variants);

    /**
     *  <p>Tailored Variants of the Product.</p>
     * @param variants values to be set
     */

    public void setVariants(final List<ProductVariantTailoringDraft> variants);

    /**
     *  <p>Attributes of the tailored Product. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final ProductTailoringAttribute... attributes);

    /**
     *  <p>Attributes of the tailored Product. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<ProductTailoringAttribute> attributes);

    /**
     * factory method
     * @return instance of ProductTailoringInStoreDraft
     */
    public static ProductTailoringInStoreDraft of() {
        return new ProductTailoringInStoreDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringInStoreDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringInStoreDraft of(final ProductTailoringInStoreDraft template) {
        ProductTailoringInStoreDraftImpl instance = new ProductTailoringInStoreDraftImpl();
        instance.setKey(template.getKey());
        instance.setProduct(template.getProduct());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setSlug(template.getSlug());
        instance.setPublish(template.getPublish());
        instance.setVariants(template.getVariants());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public ProductTailoringInStoreDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringInStoreDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringInStoreDraft deepCopy(@Nullable final ProductTailoringInStoreDraft template) {
        if (template == null) {
            return null;
        }
        ProductTailoringInStoreDraftImpl instance = new ProductTailoringInStoreDraftImpl();
        instance.setKey(template.getKey());
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setPublish(template.getPublish());
        instance.setVariants(Optional.ofNullable(template.getVariants())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductTailoringAttribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringInStoreDraft
     * @return builder
     */
    public static ProductTailoringInStoreDraftBuilder builder() {
        return ProductTailoringInStoreDraftBuilder.of();
    }

    /**
     * create builder for ProductTailoringInStoreDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringInStoreDraftBuilder builder(final ProductTailoringInStoreDraft template) {
        return ProductTailoringInStoreDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringInStoreDraft(Function<ProductTailoringInStoreDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringInStoreDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringInStoreDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringInStoreDraft>";
            }
        };
    }
}
