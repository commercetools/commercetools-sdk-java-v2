
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>An import request batches multiple import resources of the same import resource type for processing by an import container.</p>
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.CategoryImportRequestImpl.class, name = CategoryImportRequest.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.CustomerImportRequestImpl.class, name = CustomerImportRequest.CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.DiscountCodeImportRequestImpl.class, name = DiscountCodeImportRequest.DISCOUNT_CODE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.InventoryImportRequestImpl.class, name = InventoryImportRequest.INVENTORY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.OrderImportRequestImpl.class, name = OrderImportRequest.ORDER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.OrderPatchImportRequestImpl.class, name = OrderPatchImportRequest.ORDER_PATCH),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.PriceImportRequestImpl.class, name = PriceImportRequest.PRICE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductDraftImportRequestImpl.class, name = ProductDraftImportRequest.PRODUCT_DRAFT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductImportRequestImpl.class, name = ProductImportRequest.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductTypeImportRequestImpl.class, name = ProductTypeImportRequest.PRODUCT_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductVariantImportRequestImpl.class, name = ProductVariantImportRequest.PRODUCT_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestImpl.class, name = ProductVariantPatchRequest.PRODUCT_VARIANT_PATCH),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.StandalonePriceImportRequestImpl.class, name = StandalonePriceImportRequest.STANDALONE_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.TypeImportRequestImpl.class, name = TypeImportRequest.TYPE) })
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
        if (template instanceof com.commercetools.importapi.models.importrequests.CategoryImportRequest) {
            return com.commercetools.importapi.models.importrequests.CategoryImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.CategoryImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.CustomerImportRequest) {
            return com.commercetools.importapi.models.importrequests.CustomerImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.CustomerImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.DiscountCodeImportRequest) {
            return com.commercetools.importapi.models.importrequests.DiscountCodeImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.DiscountCodeImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.InventoryImportRequest) {
            return com.commercetools.importapi.models.importrequests.InventoryImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.InventoryImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.OrderImportRequest) {
            return com.commercetools.importapi.models.importrequests.OrderImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.OrderImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.OrderPatchImportRequest) {
            return com.commercetools.importapi.models.importrequests.OrderPatchImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.OrderPatchImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.PriceImportRequest) {
            return com.commercetools.importapi.models.importrequests.PriceImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.PriceImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.ProductDraftImportRequest) {
            return com.commercetools.importapi.models.importrequests.ProductDraftImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.ProductDraftImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.ProductImportRequest) {
            return com.commercetools.importapi.models.importrequests.ProductImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.ProductImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.ProductTypeImportRequest) {
            return com.commercetools.importapi.models.importrequests.ProductTypeImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.ProductTypeImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.ProductVariantImportRequest) {
            return com.commercetools.importapi.models.importrequests.ProductVariantImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.ProductVariantImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest) {
            return com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.StandalonePriceImportRequest) {
            return com.commercetools.importapi.models.importrequests.StandalonePriceImportRequest.deepCopy(
                (com.commercetools.importapi.models.importrequests.StandalonePriceImportRequest) template);
        }
        if (template instanceof com.commercetools.importapi.models.importrequests.TypeImportRequest) {
            return com.commercetools.importapi.models.importrequests.TypeImportRequest
                    .deepCopy((com.commercetools.importapi.models.importrequests.TypeImportRequest) template);
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
