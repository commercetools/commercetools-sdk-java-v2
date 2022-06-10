
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetKeyAction categorySetKeyAction = CategorySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetKeyActionImpl.class)
public interface CategorySetKeyAction extends CategoryUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CategorySetKeyAction of() {
        return new CategorySetKeyActionImpl();
    }

    public static CategorySetKeyAction of(final CategorySetKeyAction template) {
        CategorySetKeyActionImpl instance = new CategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CategorySetKeyActionBuilder builder() {
        return CategorySetKeyActionBuilder.of();
    }

    public static CategorySetKeyActionBuilder builder(final CategorySetKeyAction template) {
        return CategorySetKeyActionBuilder.of(template);
    }

    default <T> T withCategorySetKeyAction(Function<CategorySetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetKeyAction>";
            }
        };
    }
}
