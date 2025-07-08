
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>An import request batches multiple import resources of the same import resource type for processing by an Import Container.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportRequest importRequest = ImportRequest.categoryBuilder()
 *             plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ImportRequestImpl.class, visible = true)
@JsonDeserialize(as = ImportRequestImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ImportRequest {

    /**
     *  <p>The resource types that can be imported.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public ImportResourceType getType();

    public ImportRequest copyDeep();

    /**
     * factory method to create a deep copy of ImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportRequest deepCopy(@Nullable final ImportRequest template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ImportRequestImpl)) {
            return template.copyDeep();
        }
        ImportRequestImpl instance = new ImportRequestImpl();
        return instance;
    }

    /**
     * builder for category subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder categoryBuilder() {
        return com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder.of();
    }

    /**
     * builder for customer subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder customerBuilder() {
        return com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder.of();
    }

    /**
     * builder for discountCode subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.DiscountCodeImportRequestBuilder discountCodeBuilder() {
        return com.commercetools.importapi.models.importrequests.DiscountCodeImportRequestBuilder.of();
    }

    /**
     * builder for inventory subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.InventoryImportRequestBuilder inventoryBuilder() {
        return com.commercetools.importapi.models.importrequests.InventoryImportRequestBuilder.of();
    }

    /**
     * builder for order subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder orderBuilder() {
        return com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder.of();
    }

    /**
     * builder for orderPatch subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder orderPatchBuilder() {
        return com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder.of();
    }

    /**
     * builder for price subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder priceBuilder() {
        return com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder.of();
    }

    /**
     * builder for productDraft subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder productDraftBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder.of();
    }

    /**
     * builder for product subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder productBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder.of();
    }

    /**
     * builder for productSelection subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.ProductSelectionImportRequestBuilder productSelectionBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductSelectionImportRequestBuilder.of();
    }

    /**
     * builder for productType subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder productTypeBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder.of();
    }

    /**
     * builder for productVariant subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder productVariantBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder.of();
    }

    /**
     * builder for productVariantPatch subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder productVariantPatchBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder.of();
    }

    /**
     * builder for standalonePrice subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.StandalonePriceImportRequestBuilder standalonePriceBuilder() {
        return com.commercetools.importapi.models.importrequests.StandalonePriceImportRequestBuilder.of();
    }

    /**
     * builder for type subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.importrequests.TypeImportRequestBuilder typeBuilder() {
        return com.commercetools.importapi.models.importrequests.TypeImportRequestBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportRequest(Function<ImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ImportRequest>";
            }
        };
    }
}
