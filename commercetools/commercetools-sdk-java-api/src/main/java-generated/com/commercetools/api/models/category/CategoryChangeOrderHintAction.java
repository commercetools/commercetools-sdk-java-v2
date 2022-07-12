
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeOrderHintAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeOrderHintAction categoryChangeOrderHintAction = CategoryChangeOrderHintAction.builder()
 *             .orderHint("{orderHint}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeOrderHintActionImpl.class)
public interface CategoryChangeOrderHintAction extends CategoryUpdateAction {

    String CHANGE_ORDER_HINT = "changeOrderHint";

    /**
     *  <p>New value to set. Must be a decimal value between 0 and 1.</p>
     */
    @NotNull
    @JsonProperty("orderHint")
    public String getOrderHint();

    public void setOrderHint(final String orderHint);

    public static CategoryChangeOrderHintAction of() {
        return new CategoryChangeOrderHintActionImpl();
    }

    public static CategoryChangeOrderHintAction of(final CategoryChangeOrderHintAction template) {
        CategoryChangeOrderHintActionImpl instance = new CategoryChangeOrderHintActionImpl();
        instance.setOrderHint(template.getOrderHint());
        return instance;
    }

    public static CategoryChangeOrderHintActionBuilder builder() {
        return CategoryChangeOrderHintActionBuilder.of();
    }

    public static CategoryChangeOrderHintActionBuilder builder(final CategoryChangeOrderHintAction template) {
        return CategoryChangeOrderHintActionBuilder.of(template);
    }

    default <T> T withCategoryChangeOrderHintAction(Function<CategoryChangeOrderHintAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeOrderHintAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeOrderHintAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeOrderHintAction>";
            }
        };
    }
}
