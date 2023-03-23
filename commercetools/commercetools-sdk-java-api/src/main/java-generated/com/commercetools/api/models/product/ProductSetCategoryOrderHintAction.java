
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetCategoryOrderHintAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetCategoryOrderHintAction productSetCategoryOrderHintAction = ProductSetCategoryOrderHintAction.builder()
 *             .categoryId("{categoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetCategoryOrderHintActionImpl.class)
public interface ProductSetCategoryOrderHintAction extends ProductUpdateAction {

    String SET_CATEGORY_ORDER_HINT = "setCategoryOrderHint";

    /**
     *  <p>The <code>id</code> of the Category to add the <code>orderHint</code>.</p>
     * @return categoryId
     */
    @NotNull
    @JsonProperty("categoryId")
    public String getCategoryId();

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     * @return orderHint
     */

    @JsonProperty("orderHint")
    public String getOrderHint();

    /**
     *  <p>If <code>true</code>, only the staged <code>categoryOrderHints</code> is updated. If <code>false</code>, both the current and staged <code>categoryOrderHints</code> are updated.</p>
     * @return staged
     */

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
