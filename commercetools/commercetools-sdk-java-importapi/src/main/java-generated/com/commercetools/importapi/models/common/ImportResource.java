
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A representation of the resource to import. Import resources are similar to draft types, but they only support key references. In general, import resources are more granular then regular resources. They are optimized for incremental updates and therefore have a slightly different structure.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportResource importResource = ImportResource.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportResourceImpl.class)
public interface ImportResource {

    /**
     *  <p>User-defined unique identifier.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ImportResource
     */
    public static ImportResource of() {
        return new ImportResourceImpl();
    }

    /**
     * factory method to create a shallow copy ImportResource
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportResource of(final ImportResource template) {
        ImportResourceImpl instance = new ImportResourceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportResource
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportResource deepCopy(@Nullable final ImportResource template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.importapi.models.categories.CategoryImport) {
            return com.commercetools.importapi.models.categories.CategoryImport
                    .deepCopy((com.commercetools.importapi.models.categories.CategoryImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.customers.CustomerImport) {
            return com.commercetools.importapi.models.customers.CustomerImport
                    .deepCopy((com.commercetools.importapi.models.customers.CustomerImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.discount_codes.DiscountCodeImport) {
            return com.commercetools.importapi.models.discount_codes.DiscountCodeImport
                    .deepCopy((com.commercetools.importapi.models.discount_codes.DiscountCodeImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.inventories.InventoryImport) {
            return com.commercetools.importapi.models.inventories.InventoryImport
                    .deepCopy((com.commercetools.importapi.models.inventories.InventoryImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.prices.PriceImport) {
            return com.commercetools.importapi.models.prices.PriceImport
                    .deepCopy((com.commercetools.importapi.models.prices.PriceImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.productdrafts.ProductDraftImport) {
            return com.commercetools.importapi.models.productdrafts.ProductDraftImport
                    .deepCopy((com.commercetools.importapi.models.productdrafts.ProductDraftImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.products.ProductImport) {
            return com.commercetools.importapi.models.products.ProductImport
                    .deepCopy((com.commercetools.importapi.models.products.ProductImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.producttypes.ProductTypeImport) {
            return com.commercetools.importapi.models.producttypes.ProductTypeImport
                    .deepCopy((com.commercetools.importapi.models.producttypes.ProductTypeImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.ProductVariantImport) {
            return com.commercetools.importapi.models.productvariants.ProductVariantImport
                    .deepCopy((com.commercetools.importapi.models.productvariants.ProductVariantImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.standalone_prices.StandalonePriceImport) {
            return com.commercetools.importapi.models.standalone_prices.StandalonePriceImport
                    .deepCopy((com.commercetools.importapi.models.standalone_prices.StandalonePriceImport) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.TypeImport) {
            return com.commercetools.importapi.models.types.TypeImport
                    .deepCopy((com.commercetools.importapi.models.types.TypeImport) template);
        }
        ImportResourceImpl instance = new ImportResourceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ImportResource
     * @return builder
     */
    public static ImportResourceBuilder builder() {
        return ImportResourceBuilder.of();
    }

    /**
     * create builder for ImportResource instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportResourceBuilder builder(final ImportResource template) {
        return ImportResourceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportResource(Function<ImportResource, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportResource> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportResource>() {
            @Override
            public String toString() {
                return "TypeReference<ImportResource>";
            }
        };
    }
}
