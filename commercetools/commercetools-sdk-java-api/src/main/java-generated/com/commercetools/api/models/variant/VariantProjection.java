
package com.commercetools.api.models.variant;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.CategoryOrderHints;
import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>A lightweight, read-only projection of a single Variant with embedded Product data. Variant Projections are automatically created and updated when Variants or their parent Products change.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantProjection variantProjection = VariantProjection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .staged(true)
 *             .variantId(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .plusCategories(categoriesBuilder -> categoriesBuilder)
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .plusAssets(assetsBuilder -> assetsBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .default(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantProjectionImpl.class)
public interface VariantProjection {

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Variant Projection.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Variant Projection was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p><code>true</code> for the staged (draft) projection, <code>false</code> for the current (published) projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return categories
     */
    @NotNull
    @Valid
    @JsonProperty("categories")
    public List<CategoryReference> getCategories();

    /**
     *  <p>Order of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     * @return categoryOrderHints
     */
    @Valid
    @JsonProperty("categoryOrderHints")
    public CategoryOrderHints getCategoryOrderHints();

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return images
     */
    @NotNull
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return assets
     */
    @NotNull
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     * @return price
     */
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p><code>true</code> if this Variant is the default Variant of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> (see <span>Product.defaultVariant</span>). <code>false</code> otherwise.</p>
     * @return default
     */
    @NotNull
    @JsonProperty("default")
    public Boolean getDefault();

    /**
     *  <p>Unique identifier of the Variant within its parent Product.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Variant Projection.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Variant Projection was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p><code>true</code> for the staged (draft) projection, <code>false</code> for the current (published) projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Name of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Slug of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Description of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param categories values to be set
     */

    @JsonIgnore
    public void setCategories(final CategoryReference... categories);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> assigned to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param categories values to be set
     */

    public void setCategories(final List<CategoryReference> categories);

    /**
     *  <p>Order of the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a>.</p>
     * @param categoryOrderHints value to be set
     */

    public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Assets of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>, including product-level Attributes merged at projection time.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>The selected price based on the <span>price selection</span> query parameters. Only present when price selection parameters are provided.</p>
     * @param price value to be set
     */

    public void setPrice(final Price price);

    /**
     *  <p><code>true</code> if this Variant is the default Variant of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> (see <span>Product.defaultVariant</span>). <code>false</code> otherwise.</p>
     * @param _default value to be set
     */

    public void setDefault(final Boolean _default);

    /**
     * factory method
     * @return instance of VariantProjection
     */
    public static VariantProjection of() {
        return new VariantProjectionImpl();
    }

    /**
     * factory method to create a shallow copy VariantProjection
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantProjection of(final VariantProjection template) {
        VariantProjectionImpl instance = new VariantProjectionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setStaged(template.getStaged());
        instance.setVariantId(template.getVariantId());
        instance.setProduct(template.getProduct());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
        instance.setCategoryOrderHints(template.getCategoryOrderHints());
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setAttributes(template.getAttributes());
        instance.setPrice(template.getPrice());
        instance.setDefault(template.getDefault());
        return instance;
    }

    public VariantProjection copyDeep();

    /**
     * factory method to create a deep copy of VariantProjection
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantProjection deepCopy(@Nullable final VariantProjection template) {
        if (template == null) {
            return null;
        }
        VariantProjectionImpl instance = new VariantProjectionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setStaged(template.getStaged());
        instance.setVariantId(template.getVariantId());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCategories(Optional.ofNullable(template.getCategories())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.category.CategoryReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCategoryOrderHints(
            com.commercetools.api.models.product.CategoryOrderHints.deepCopy(template.getCategoryOrderHints()));
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPrice(com.commercetools.api.models.common.Price.deepCopy(template.getPrice()));
        instance.setDefault(template.getDefault());
        return instance;
    }

    /**
     * builder factory method for VariantProjection
     * @return builder
     */
    public static VariantProjectionBuilder builder() {
        return VariantProjectionBuilder.of();
    }

    /**
     * create builder for VariantProjection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantProjectionBuilder builder(final VariantProjection template) {
        return VariantProjectionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantProjection(Function<VariantProjection, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantProjection> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantProjection>() {
            @Override
            public String toString() {
                return "TypeReference<VariantProjection>";
            }
        };
    }
}
