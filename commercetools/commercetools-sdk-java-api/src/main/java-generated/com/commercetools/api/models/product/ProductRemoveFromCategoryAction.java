
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
 *  <p>Produces the ProductRemovedFromCategory Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveFromCategoryAction productRemoveFromCategoryAction = ProductRemoveFromCategoryAction.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemoveFromCategoryActionImpl.class)
public interface ProductRemoveFromCategoryAction extends ProductUpdateAction {

    String REMOVE_FROM_CATEGORY = "removeFromCategory";

    /**
     *  <p>The Category to remove.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryResourceIdentifier getCategory();

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are removed. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are removed.</p>
     */

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
