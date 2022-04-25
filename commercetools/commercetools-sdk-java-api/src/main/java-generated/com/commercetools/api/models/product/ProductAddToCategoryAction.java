
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
@JsonDeserialize(as = ProductAddToCategoryActionImpl.class)
public interface ProductAddToCategoryAction extends ProductUpdateAction {

    String ADD_TO_CATEGORY = "addToCategory";

    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryResourceIdentifier getCategory();

    @JsonProperty("orderHint")
    public String getOrderHint();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategory(final CategoryResourceIdentifier category);

    public void setOrderHint(final String orderHint);

    public void setStaged(final Boolean staged);

    public static ProductAddToCategoryAction of() {
        return new ProductAddToCategoryActionImpl();
    }

    public static ProductAddToCategoryAction of(final ProductAddToCategoryAction template) {
        ProductAddToCategoryActionImpl instance = new ProductAddToCategoryActionImpl();
        instance.setCategory(template.getCategory());
        instance.setOrderHint(template.getOrderHint());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddToCategoryActionBuilder builder() {
        return ProductAddToCategoryActionBuilder.of();
    }

    public static ProductAddToCategoryActionBuilder builder(final ProductAddToCategoryAction template) {
        return ProductAddToCategoryActionBuilder.of(template);
    }

    default <T> T withProductAddToCategoryAction(Function<ProductAddToCategoryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddToCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddToCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddToCategoryAction>";
            }
        };
    }
}
