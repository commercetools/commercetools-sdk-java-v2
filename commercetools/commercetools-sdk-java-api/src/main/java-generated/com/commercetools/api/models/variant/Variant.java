
package com.commercetools.api.models.variant;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>A Variant represents a single Variant with both current (published) and staged (draft) data. Variants are writable resources that support create, update, and delete operations.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Variant variant = Variant.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .variantId(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImpl.class)
public interface Variant extends BaseResource {

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Variant.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Variant was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Variant was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Variant.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Variant. This is different from <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>key</code>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>A unique, sequential identifier of the Variant within the parent Product.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p><code>true</code> if the Variant is published, <code>false</code> if it is unpublished.</p>
     * @return published
     */
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>The current data of the Variant.</p>
     * @return current
     */
    @NotNull
    @Valid
    @JsonProperty("current")
    public VariantData getCurrent();

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     * @return staged
     */
    @Valid
    @JsonProperty("staged")
    public VariantData getStaged();

    /**
     *  <p>Unique identifier of the Variant.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Variant.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Variant was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Variant was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Variant.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Variant.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the Variant. This is different from <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>key</code>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>A unique, sequential identifier of the Variant within the parent Product.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>Reference to the parent <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>true</code> if the Variant is published, <code>false</code> if it is unpublished.</p>
     * @param published value to be set
     */

    public void setPublished(final Boolean published);

    /**
     *  <p>The current data of the Variant.</p>
     * @param current value to be set
     */

    public void setCurrent(final VariantData current);

    /**
     *  <p>The staged data of the Variant. Only present if there are staged changes that differ from the current data.</p>
     * @param staged value to be set
     */

    public void setStaged(final VariantData staged);

    /**
     * factory method
     * @return instance of Variant
     */
    public static Variant of() {
        return new VariantImpl();
    }

    /**
     * factory method to create a shallow copy Variant
     * @param template instance to be copied
     * @return copy instance
     */
    public static Variant of(final Variant template) {
        VariantImpl instance = new VariantImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setVariantId(template.getVariantId());
        instance.setProduct(template.getProduct());
        instance.setPublished(template.getPublished());
        instance.setCurrent(template.getCurrent());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public Variant copyDeep();

    /**
     * factory method to create a deep copy of Variant
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Variant deepCopy(@Nullable final Variant template) {
        if (template == null) {
            return null;
        }
        VariantImpl instance = new VariantImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setVariantId(template.getVariantId());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setPublished(template.getPublished());
        instance.setCurrent(com.commercetools.api.models.variant.VariantData.deepCopy(template.getCurrent()));
        instance.setStaged(com.commercetools.api.models.variant.VariantData.deepCopy(template.getStaged()));
        return instance;
    }

    /**
     * builder factory method for Variant
     * @return builder
     */
    public static VariantBuilder builder() {
        return VariantBuilder.of();
    }

    /**
     * create builder for Variant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBuilder builder(final Variant template) {
        return VariantBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariant(Function<Variant, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<Variant> typeReference() {
        return new tools.jackson.core.type.TypeReference<Variant>() {
            @Override
            public String toString() {
                return "TypeReference<Variant>";
            }
        };
    }
}
