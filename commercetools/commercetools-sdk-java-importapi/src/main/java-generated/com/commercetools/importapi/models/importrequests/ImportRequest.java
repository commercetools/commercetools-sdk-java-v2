
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>An import request batches multiple import resources of the same import resource type for processing by an import container.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.CategoryImportRequestImpl.class, name = CategoryImportRequest.CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.CustomerImportRequestImpl.class, name = CustomerImportRequest.CUSTOMER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.OrderImportRequestImpl.class, name = OrderImportRequest.ORDER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.OrderPatchImportRequestImpl.class, name = OrderPatchImportRequest.ORDER_PATCH),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.PriceImportRequestImpl.class, name = PriceImportRequest.PRICE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductDraftImportRequestImpl.class, name = ProductDraftImportRequest.PRODUCT_DRAFT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductImportRequestImpl.class, name = ProductImportRequest.PRODUCT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductTypeImportRequestImpl.class, name = ProductTypeImportRequest.PRODUCT_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductVariantImportRequestImpl.class, name = ProductVariantImportRequest.PRODUCT_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestImpl.class, name = ProductVariantPatchRequest.PRODUCT_VARIANT_PATCH) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ImportRequestImpl.class, visible = true)
@JsonDeserialize(as = ImportRequestImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ImportRequest {

    /**
    *  <p>The type of the import resource.</p>
    */
    @NotNull
    @JsonProperty("type")
    public ImportResourceType getType();

    public static com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder categoryBuilder() {
        return com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder customerBuilder() {
        return com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder orderBuilder() {
        return com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder orderPatchBuilder() {
        return com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder priceBuilder() {
        return com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder productDraftBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder productBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder productTypeBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder productVariantBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder.of();
    }

    public static com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder productVariantPatchBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder.of();
    }

    default <T> T withImportRequest(Function<ImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ImportRequest>";
            }
        };
    }
}
