
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A set of ProductData for comparison. If no optional attributes are specified, all <code>current</code> ProductData are selected for comparison.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSelector productSetSelector = ProductSetSelector.builder()
 *             .projectKey("{projectKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetSelectorImpl.class)
public interface ProductSetSelector {

    /**
     *  <p>The project containing the project set.</p>
     * @return projectKey
     */
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @return productIds
     */

    @JsonProperty("productIds")
    public List<String> getProductIds();

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @return productTypeIds
     */

    @JsonProperty("productTypeIds")
    public List<String> getProductTypeIds();

    /**
     *  <p>Specifies use of staged or current product data.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Specifies use of product variants. If set to <code>true</code>, all product variants are compared, not just the master variant.</p>
     * @return includeVariants
     */

    @JsonProperty("includeVariants")
    public Boolean getIncludeVariants();

    /**
     *  <p>Maximum number of products to check (if unspecified, all products are considered). Note that the maximum number of product comparisons between two productSets is 20,000,000. This limit cannot be exceeded. If you need a higher limit, contact https://support.commercetools.com</p>
     * @return productSetLimit
     */

    @JsonProperty("productSetLimit")
    public Long getProductSetLimit();

    /**
     *  <p>The project containing the project set.</p>
     * @param projectKey value to be set
     */

    public void setProjectKey(final String projectKey);

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @param productIds values to be set
     */

    @JsonIgnore
    public void setProductIds(final String... productIds);

    /**
     *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
     * @param productIds values to be set
     */

    public void setProductIds(final List<String> productIds);

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @param productTypeIds values to be set
     */

    @JsonIgnore
    public void setProductTypeIds(final String... productTypeIds);

    /**
     *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
     * @param productTypeIds values to be set
     */

    public void setProductTypeIds(final List<String> productTypeIds);

    /**
     *  <p>Specifies use of staged or current product data.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Specifies use of product variants. If set to <code>true</code>, all product variants are compared, not just the master variant.</p>
     * @param includeVariants value to be set
     */

    public void setIncludeVariants(final Boolean includeVariants);

    /**
     *  <p>Maximum number of products to check (if unspecified, all products are considered). Note that the maximum number of product comparisons between two productSets is 20,000,000. This limit cannot be exceeded. If you need a higher limit, contact https://support.commercetools.com</p>
     * @param productSetLimit value to be set
     */

    public void setProductSetLimit(final Long productSetLimit);

    /**
     * factory method
     * @return instance of ProductSetSelector
     */
    public static ProductSetSelector of() {
        return new ProductSetSelectorImpl();
    }

    /**
     * factory method to copy an instance of ProductSetSelector
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetSelector of(final ProductSetSelector template) {
        ProductSetSelectorImpl instance = new ProductSetSelectorImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setProductIds(template.getProductIds());
        instance.setProductTypeIds(template.getProductTypeIds());
        instance.setStaged(template.getStaged());
        instance.setIncludeVariants(template.getIncludeVariants());
        instance.setProductSetLimit(template.getProductSetLimit());
        return instance;
    }

    /**
     * builder factory method for ProductSetSelector
     * @return builder
     */
    public static ProductSetSelectorBuilder builder() {
        return ProductSetSelectorBuilder.of();
    }

    /**
     * create builder for ProductSetSelector instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetSelectorBuilder builder(final ProductSetSelector template) {
        return ProductSetSelectorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetSelector(Function<ProductSetSelector, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetSelector> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetSelector>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetSelector>";
            }
        };
    }
}
