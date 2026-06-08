
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductPriceModeEnum;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import a Product. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> in the Project.</p>
 *  <p>This is the minimal representation required for creating a Product in Composable Commerce.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImport productImport = ProductImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImportImpl.class)
public interface ProductImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeKeyReference getProductType();

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> do not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @return categories
     */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

    /**
     *
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     * @return searchKeywords
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see <span>Managing the published state of Products</span>.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Maps to <code>Product.priceMode</code>.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>ProductData.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>Product.productType</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced ProductType is created.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeKeyReference productType);

    /**
     *  <p>Maps to <code>ProductData.slug</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Maps to <code>ProductData.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> do not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param categories values to be set
     */

    @JsonIgnore
    public void setCategories(final CategoryKeyReference... categories);

    /**
     *  <p>Maps to <code>ProductData.categories</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Categories</a> do not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Categories are created.</p>
     * @param categories values to be set
     */

    public void setCategories(final List<CategoryKeyReference> categories);

    /**
     * set attributes
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     * set attributes
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Maps to <code>ProductData.metaTitle</code>.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>Maps to <code>ProductData.metaDescription</code>.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>Maps to <code>ProductData.metaKeywords</code>.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>Maps to <code>Product.taxCategory</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced TaxCategory is created.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    /**
     *  <p>Maps to <code>ProductData.searchKeywords</code>.</p>
     * @param searchKeywords value to be set
     */

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    /**
     *  <p>Maps to <code>Product.state</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced State is created.</p>
     * @param state value to be set
     */

    public void setState(final StateKeyReference state);

    /**
     *  <p>Determines the published status and current/staged projection of the Product. For more information, see <span>Managing the published state of Products</span>.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Maps to <code>Product.priceMode</code>.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    /**
     * factory method
     * @return instance of ProductImport
     */
    public static ProductImport of() {
        return new ProductImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductImport of(final ProductImport template) {
        ProductImportImpl instance = new ProductImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductType(template.getProductType());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
        instance.setAttributes(template.getAttributes());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setState(template.getState());
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    public ProductImport copyDeep();

    /**
     * factory method to create a deep copy of ProductImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductImport deepCopy(@Nullable final ProductImport template) {
        if (template == null) {
            return null;
        }
        ProductImportImpl instance = new ProductImportImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setProductType(
            com.commercetools.importapi.models.common.ProductTypeKeyReference.deepCopy(template.getProductType()));
        instance.setSlug(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCategories(Optional.ofNullable(template.getCategories())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.CategoryKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productvariants.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMetaTitle(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setTaxCategory(
            com.commercetools.importapi.models.common.TaxCategoryKeyReference.deepCopy(template.getTaxCategory()));
        instance.setSearchKeywords(
            com.commercetools.importapi.models.products.SearchKeywords.deepCopy(template.getSearchKeywords()));
        instance.setState(com.commercetools.importapi.models.common.StateKeyReference.deepCopy(template.getState()));
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for ProductImport
     * @return builder
     */
    public static ProductImportBuilder builder() {
        return ProductImportBuilder.of();
    }

    /**
     * create builder for ProductImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImportBuilder builder(final ProductImport template) {
        return ProductImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductImport(Function<ProductImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImport>";
            }
        };
    }
}
