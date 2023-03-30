
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Contains the <code>current</code> and <code>staged</code> ProductData.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCatalogData productCatalogData = ProductCatalogData.builder()
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .staged(stagedBuilder -> stagedBuilder)
 *             .hasStagedChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductCatalogDataImpl.class)
public interface ProductCatalogData extends ProductCatalogDataMixin {

    /**
     *  <p><code>true</code> if the Product is published.</p>
     * @return published
     */
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>Current (published) data of the Product.</p>
     * @return current
     */
    @NotNull
    @Valid
    @JsonProperty("current")
    public ProductData getCurrent();

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @return staged
     */
    @NotNull
    @Valid
    @JsonProperty("staged")
    public ProductData getStaged();

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @return hasStagedChanges
     */
    @NotNull
    @JsonProperty("hasStagedChanges")
    public Boolean getHasStagedChanges();

    /**
     *  <p><code>true</code> if the Product is published.</p>
     * @param published value to be set
     */

    public void setPublished(final Boolean published);

    /**
     *  <p>Current (published) data of the Product.</p>
     * @param current value to be set
     */

    public void setCurrent(final ProductData current);

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @param staged value to be set
     */

    public void setStaged(final ProductData staged);

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @param hasStagedChanges value to be set
     */

    public void setHasStagedChanges(final Boolean hasStagedChanges);

    /**
     * factory method
     * @return instance of ProductCatalogData
     */
    public static ProductCatalogData of() {
        return new ProductCatalogDataImpl();
    }

    /**
     * factory method to create a shallow copy ProductCatalogData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductCatalogData of(final ProductCatalogData template) {
        ProductCatalogDataImpl instance = new ProductCatalogDataImpl();
        instance.setPublished(template.getPublished());
        instance.setCurrent(template.getCurrent());
        instance.setStaged(template.getStaged());
        instance.setHasStagedChanges(template.getHasStagedChanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductCatalogData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductCatalogData deepCopy(@Nullable final ProductCatalogData template) {
        if (template == null) {
            return null;
        }
        ProductCatalogDataImpl instance = new ProductCatalogDataImpl();
        instance.setPublished(template.getPublished());
        instance.setCurrent(com.commercetools.api.models.product.ProductData.deepCopy(template.getCurrent()));
        instance.setStaged(com.commercetools.api.models.product.ProductData.deepCopy(template.getStaged()));
        instance.setHasStagedChanges(template.getHasStagedChanges());
        return instance;
    }

    /**
     * builder factory method for ProductCatalogData
     * @return builder
     */
    public static ProductCatalogDataBuilder builder() {
        return ProductCatalogDataBuilder.of();
    }

    /**
     * create builder for ProductCatalogData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductCatalogDataBuilder builder(final ProductCatalogData template) {
        return ProductCatalogDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductCatalogData(Function<ProductCatalogData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductCatalogData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductCatalogData>() {
            @Override
            public String toString() {
                return "TypeReference<ProductCatalogData>";
            }
        };
    }
}
