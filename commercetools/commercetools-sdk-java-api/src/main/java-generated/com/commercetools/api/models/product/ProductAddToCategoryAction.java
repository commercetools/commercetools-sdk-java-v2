
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

/**
 *  <p>Produces the ProductAddedToCategory Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddToCategoryAction productAddToCategoryAction = ProductAddToCategoryAction.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddToCategoryActionImpl.class)
public interface ProductAddToCategoryAction extends ProductUpdateAction {

    String ADD_TO_CATEGORY = "addToCategory";

    /**
     *  <p>The Category to add.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryResourceIdentifier getCategory();

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are updated. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are updated.</p>
     */

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
