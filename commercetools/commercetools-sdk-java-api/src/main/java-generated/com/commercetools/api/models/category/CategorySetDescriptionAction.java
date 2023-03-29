
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetDescriptionAction categorySetDescriptionAction = CategorySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetDescriptionActionImpl.class)
public interface CategorySetDescriptionAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of CategorySetDescriptionAction
     */
    public static CategorySetDescriptionAction of() {
        return new CategorySetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetDescriptionAction of(final CategorySetDescriptionAction template) {
        CategorySetDescriptionActionImpl instance = new CategorySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetDescriptionAction deepCopy(@Nullable final CategorySetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        CategorySetDescriptionActionImpl instance = new CategorySetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for CategorySetDescriptionAction
     * @return builder
     */
    public static CategorySetDescriptionActionBuilder builder() {
        return CategorySetDescriptionActionBuilder.of();
    }

    /**
     * create builder for CategorySetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetDescriptionActionBuilder builder(final CategorySetDescriptionAction template) {
        return CategorySetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetDescriptionAction(Function<CategorySetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetDescriptionAction>";
            }
        };
    }
}
