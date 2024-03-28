
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A single ProductTailoring representation contains the <em>current</em> and the <em>staged</em> representation of its product data tailored per Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoring productTailoring = ProductTailoring.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .staged(stagedBuilder -> stagedBuilder)
 *             .hasStagedChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringImpl.class)
public interface ProductTailoring extends BaseResource {

    /**
     *  <p>Unique identifier of the ProductTailoring.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the ProductTailoring.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the ProductTailoring was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ProductTailoring was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the ProductTailoring.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the ProductTailoring.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @return published
     */
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     * @return current
     */
    @NotNull
    @Valid
    @JsonProperty("current")
    public ProductTailoringData getCurrent();

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     * @return staged
     */
    @NotNull
    @Valid
    @JsonProperty("staged")
    public ProductTailoringData getStaged();

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @return hasStagedChanges
     */
    @NotNull
    @JsonProperty("hasStagedChanges")
    public Boolean getHasStagedChanges();

    /**
     *  <p>Unique identifier of the ProductTailoring.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the ProductTailoring.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the ProductTailoring was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ProductTailoring was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the ProductTailoring.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the ProductTailoring.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>Reference to the Product the ProductTailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @param published value to be set
     */

    public void setPublished(final Boolean published);

    /**
     *  <p>Current (published) data of the ProductTailoring.</p>
     * @param current value to be set
     */

    public void setCurrent(final ProductTailoringData current);

    /**
     *  <p>Staged (unpublished) data of the ProductTailoring.</p>
     * @param staged value to be set
     */

    public void setStaged(final ProductTailoringData staged);

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @param hasStagedChanges value to be set
     */

    public void setHasStagedChanges(final Boolean hasStagedChanges);

    /**
     * factory method
     * @return instance of ProductTailoring
     */
    public static ProductTailoring of() {
        return new ProductTailoringImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoring
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoring of(final ProductTailoring template) {
        ProductTailoringImpl instance = new ProductTailoringImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setStore(template.getStore());
        instance.setProduct(template.getProduct());
        instance.setPublished(template.getPublished());
        instance.setCurrent(template.getCurrent());
        instance.setStaged(template.getStaged());
        instance.setHasStagedChanges(template.getHasStagedChanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoring
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoring deepCopy(@Nullable final ProductTailoring template) {
        if (template == null) {
            return null;
        }
        ProductTailoringImpl instance = new ProductTailoringImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setPublished(template.getPublished());
        instance.setCurrent(
            com.commercetools.api.models.product_tailoring.ProductTailoringData.deepCopy(template.getCurrent()));
        instance.setStaged(
            com.commercetools.api.models.product_tailoring.ProductTailoringData.deepCopy(template.getStaged()));
        instance.setHasStagedChanges(template.getHasStagedChanges());
        return instance;
    }

    /**
     * builder factory method for ProductTailoring
     * @return builder
     */
    public static ProductTailoringBuilder builder() {
        return ProductTailoringBuilder.of();
    }

    /**
     * create builder for ProductTailoring instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringBuilder builder(final ProductTailoring template) {
        return ProductTailoringBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoring(Function<ProductTailoring, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoring> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoring>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoring>";
            }
        };
    }
}
