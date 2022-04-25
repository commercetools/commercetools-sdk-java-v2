
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRemoveFromCategoryActionImpl.class)
public interface ProductRemoveFromCategoryAction extends ProductUpdateAction {

    String REMOVE_FROM_CATEGORY = "removeFromCategory";

    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryResourceIdentifier getCategory();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryResourceIdentifier category);

    public void setStaged(final Boolean staged);

    public static ProductRemoveFromCategoryAction of() {
        return new ProductRemoveFromCategoryActionImpl();
    }

    public static ProductRemoveFromCategoryAction of(final ProductRemoveFromCategoryAction template) {
        ProductRemoveFromCategoryActionImpl instance = new ProductRemoveFromCategoryActionImpl();
        instance.setCategory(template.getCategory());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemoveFromCategoryActionBuilder builder() {
        return ProductRemoveFromCategoryActionBuilder.of();
    }

    public static ProductRemoveFromCategoryActionBuilder builder(final ProductRemoveFromCategoryAction template) {
        return ProductRemoveFromCategoryActionBuilder.of(template);
    }

    default <T> T withProductRemoveFromCategoryAction(Function<ProductRemoveFromCategoryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveFromCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveFromCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveFromCategoryAction>";
            }
        };
    }
}
