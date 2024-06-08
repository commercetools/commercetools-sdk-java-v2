
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * CategorySetMetaTitleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaTitleAction categorySetMetaTitleAction = CategorySetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaTitleActionImpl.class)
public interface CategorySetMetaTitleAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetMetaTitleAction
     */
    String SET_META_TITLE = "setMetaTitle";

    /**
     *  <p>Value to set.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Value to set.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     * factory method
     * @return instance of CategorySetMetaTitleAction
     */
    public static CategorySetMetaTitleAction of() {
        return new CategorySetMetaTitleActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetMetaTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetMetaTitleAction of(final CategorySetMetaTitleAction template) {
        CategorySetMetaTitleActionImpl instance = new CategorySetMetaTitleActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetMetaTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetMetaTitleAction deepCopy(@Nullable final CategorySetMetaTitleAction template) {
        if (template == null) {
            return null;
        }
        CategorySetMetaTitleActionImpl instance = new CategorySetMetaTitleActionImpl();
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        return instance;
    }

    /**
     * builder factory method for CategorySetMetaTitleAction
     * @return builder
     */
    public static CategorySetMetaTitleActionBuilder builder() {
        return CategorySetMetaTitleActionBuilder.of();
    }

    /**
     * create builder for CategorySetMetaTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetMetaTitleActionBuilder builder(final CategorySetMetaTitleAction template) {
        return CategorySetMetaTitleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetMetaTitleAction(Function<CategorySetMetaTitleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetMetaTitleAction>";
            }
        };
    }
}
