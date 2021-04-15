
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
@JsonDeserialize(as = ProductAddedToCategoryMessagePayloadImpl.class)
public interface ProductAddedToCategoryMessagePayload extends MessagePayload {

    String PRODUCT_ADDED_TO_CATEGORY = "ProductAddedToCategory";

    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryReference category);

    public void setStaged(final Boolean staged);

    public static ProductAddedToCategoryMessagePayload of() {
        return new ProductAddedToCategoryMessagePayloadImpl();
    }

    public static ProductAddedToCategoryMessagePayload of(final ProductAddedToCategoryMessagePayload template) {
        ProductAddedToCategoryMessagePayloadImpl instance = new ProductAddedToCategoryMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddedToCategoryMessagePayloadBuilder builder() {
        return ProductAddedToCategoryMessagePayloadBuilder.of();
    }

    public static ProductAddedToCategoryMessagePayloadBuilder builder(
            final ProductAddedToCategoryMessagePayload template) {
        return ProductAddedToCategoryMessagePayloadBuilder.of(template);
    }

    default <T> T withProductAddedToCategoryMessagePayload(Function<ProductAddedToCategoryMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
