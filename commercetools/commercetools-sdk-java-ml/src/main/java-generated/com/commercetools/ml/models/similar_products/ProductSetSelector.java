
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
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetSelectorImpl.class)
public interface ProductSetSelector {

    /**
    *  <p>The project containing the project set.</p>
    */
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    /**
    *  <p>An array of Product IDs to compare. If unspecified, no Product ID filter is applied.</p>
    */

    @JsonProperty("productIds")
    public List<String> getProductIds();

    /**
    *  <p>An array of product type IDs. Only products with product types in this array are compared. If unspecified, no product type filter is applied.</p>
    */

    @JsonProperty("productTypeIds")
    public List<String> getProductTypeIds();

    /**
    *  <p>Specifies use of staged or current product data.</p>
    */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
    *  <p>Specifies use of product variants. If set to <code>true</code>, all product variants are compared, not just the master variant.</p>
    */

    @JsonProperty("includeVariants")
    public Boolean getIncludeVariants();

    /**
    *  <p>Maximum number of products to check (if unspecified, all products are considered). Note that the maximum number of product comparisons between two productSets is 20,000,000. This limit cannot be exceeded. If you need a higher limit, contact https://support.commercetools.com</p>
    */

    @JsonProperty("productSetLimit")
    public Long getProductSetLimit();

    public void setProjectKey(final String projectKey);

    @JsonIgnore
    public void setProductIds(final String... productIds);

    public void setProductIds(final List<String> productIds);

    @JsonIgnore
    public void setProductTypeIds(final String... productTypeIds);

    public void setProductTypeIds(final List<String> productTypeIds);

    public void setStaged(final Boolean staged);

    public void setIncludeVariants(final Boolean includeVariants);

    public void setProductSetLimit(final Long productSetLimit);

    public static ProductSetSelector of() {
        return new ProductSetSelectorImpl();
    }

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

    public static ProductSetSelectorBuilder builder() {
        return ProductSetSelectorBuilder.of();
    }

    public static ProductSetSelectorBuilder builder(final ProductSetSelector template) {
        return ProductSetSelectorBuilder.of(template);
    }

    default <T> T withProductSetSelector(Function<ProductSetSelector, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetSelector> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetSelector>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetSelector>";
            }
        };
    }
}
