
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRemovedFromCategoryMessagePayloadImpl.class)
public interface ProductRemovedFromCategoryMessagePayload extends MessagePayload {

    String PRODUCT_REMOVED_FROM_CATEGORY = "ProductRemovedFromCategory";

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Category">Category</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryReference category);

    public void setStaged(final Boolean staged);

    public static ProductRemovedFromCategoryMessagePayload of() {
        return new ProductRemovedFromCategoryMessagePayloadImpl();
    }

    public static ProductRemovedFromCategoryMessagePayload of(final ProductRemovedFromCategoryMessagePayload template) {
        ProductRemovedFromCategoryMessagePayloadImpl instance = new ProductRemovedFromCategoryMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder builder() {
        return ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }

    public static ProductRemovedFromCategoryMessagePayloadBuilder builder(
            final ProductRemovedFromCategoryMessagePayload template) {
        return ProductRemovedFromCategoryMessagePayloadBuilder.of(template);
    }

    default <T> T withProductRemovedFromCategoryMessagePayload(
            Function<ProductRemovedFromCategoryMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemovedFromCategoryMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemovedFromCategoryMessagePayload>";
            }
        };
    }
}
