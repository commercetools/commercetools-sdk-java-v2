
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftImpl.class, name = ProductDiscountValueAbsoluteDraft.ABSOLUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftImpl.class, name = ProductDiscountValueExternalDraft.EXTERNAL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftImpl.class, name = ProductDiscountValueRelativeDraft.RELATIVE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductDiscountValueDraftImpl.class, visible = true)
@JsonDeserialize(as = ProductDiscountValueDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductDiscountValueDraft {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftBuilder absoluteBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteDraftBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftBuilder externalBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftBuilder.of();
    }

    public static com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftBuilder relativeBuilder() {
        return com.commercetools.api.models.product_discount.ProductDiscountValueRelativeDraftBuilder.of();
    }

    default <T> T withProductDiscountValueDraft(Function<ProductDiscountValueDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueDraft>";
            }
        };
    }
}
