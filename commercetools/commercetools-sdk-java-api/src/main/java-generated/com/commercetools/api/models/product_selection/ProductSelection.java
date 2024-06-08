
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSelection
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelection productSelection = ProductSelection.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .productCount(0.3)
 *             .mode(ProductSelectionMode.INDIVIDUAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionImpl.class)
public interface ProductSelection
        extends BaseResource, ProductSelectionMixin, com.commercetools.api.models.DomainResource<ProductSelection>,
        com.commercetools.api.models.Referencable<ProductSelection>,
        com.commercetools.api.models.ResourceIdentifiable<ProductSelection>,
        com.commercetools.api.models.Customizable<ProductSelection>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the ProductSelection.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the ProductSelection.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the ProductSelection was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the ProductSelection was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the ProductSelection.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the ProductSelection.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Number of Products that are currently assigned to this ProductSelection.</p>
     * @return productCount
     */
    @NotNull
    @JsonProperty("productCount")
    public Integer getProductCount();

    /**
     *  <p>Specifies in which way the Products are assigned to the ProductSelection. Currently, the only way of doing this is to specify each Product individually, either by including or excluding them explicitly.</p>
     * @return mode
     */
    @NotNull
    @JsonProperty("mode")
    public ProductSelectionMode getMode();

    /**
     *  <p>Custom Fields of the ProductSelection.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the ProductSelection.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the ProductSelection.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the ProductSelection was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the ProductSelection was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the ProductSelection.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the ProductSelection.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Number of Products that are currently assigned to this ProductSelection.</p>
     * @param productCount value to be set
     */

    public void setProductCount(final Integer productCount);

    /**
     *  <p>Specifies in which way the Products are assigned to the ProductSelection. Currently, the only way of doing this is to specify each Product individually, either by including or excluding them explicitly.</p>
     * @param mode value to be set
     */

    public void setMode(final ProductSelectionMode mode);

    /**
     *  <p>Custom Fields of the ProductSelection.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of ProductSelection
     */
    public static ProductSelection of() {
        return new ProductSelectionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelection
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelection of(final ProductSelection template) {
        ProductSelectionImpl instance = new ProductSelectionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductCount(template.getProductCount());
        instance.setMode(template.getMode());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelection
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelection deepCopy(@Nullable final ProductSelection template) {
        if (template == null) {
            return null;
        }
        ProductSelectionImpl instance = new ProductSelectionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setProductCount(template.getProductCount());
        instance.setMode(template.getMode());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for ProductSelection
     * @return builder
     */
    public static ProductSelectionBuilder builder() {
        return ProductSelectionBuilder.of();
    }

    /**
     * create builder for ProductSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionBuilder builder(final ProductSelection template) {
        return ProductSelectionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelection(Function<ProductSelection, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.PRODUCT_SELECTION;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelection>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelection>";
            }
        };
    }
}
