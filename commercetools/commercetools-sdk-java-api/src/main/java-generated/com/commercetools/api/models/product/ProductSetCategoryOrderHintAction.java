
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetCategoryOrderHintActionImpl.class)
public interface ProductSetCategoryOrderHintAction extends ProductUpdateAction {

    String SET_CATEGORY_ORDER_HINT = "setCategoryOrderHint";

    @NotNull
    @JsonProperty("categoryId")
    public String getCategoryId();

    @JsonProperty("orderHint")
    public String getOrderHint();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setCategoryId(final String categoryId);

    public void setOrderHint(final String orderHint);

    public void setStaged(final Boolean staged);

    public static ProductSetCategoryOrderHintAction of() {
        return new ProductSetCategoryOrderHintActionImpl();
    }

    public static ProductSetCategoryOrderHintAction of(final ProductSetCategoryOrderHintAction template) {
        ProductSetCategoryOrderHintActionImpl instance = new ProductSetCategoryOrderHintActionImpl();
        instance.setCategoryId(template.getCategoryId());
        instance.setOrderHint(template.getOrderHint());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetCategoryOrderHintActionBuilder builder() {
        return ProductSetCategoryOrderHintActionBuilder.of();
    }

    public static ProductSetCategoryOrderHintActionBuilder builder(final ProductSetCategoryOrderHintAction template) {
        return ProductSetCategoryOrderHintActionBuilder.of(template);
    }

    default <T> T withProductSetCategoryOrderHintAction(Function<ProductSetCategoryOrderHintAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetCategoryOrderHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetCategoryOrderHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetCategoryOrderHintAction>";
            }
        };
    }
}
