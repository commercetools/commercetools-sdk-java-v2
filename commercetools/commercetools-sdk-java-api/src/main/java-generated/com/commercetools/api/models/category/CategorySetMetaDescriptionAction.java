
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
 * CategorySetMetaDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaDescriptionAction categorySetMetaDescriptionAction = CategorySetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMetaDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaDescriptionActionImpl.class)
public interface CategorySetMetaDescriptionAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetMetaDescriptionAction
     */
    String SET_META_DESCRIPTION = "setMetaDescription";

    /**
     *  <p>Value to set.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Value to set.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     * factory method
     * @return instance of CategorySetMetaDescriptionAction
     */
    public static CategorySetMetaDescriptionAction of() {
        return new CategorySetMetaDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetMetaDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetMetaDescriptionAction of(final CategorySetMetaDescriptionAction template) {
        CategorySetMetaDescriptionActionImpl instance = new CategorySetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        return instance;
    }

    public CategorySetMetaDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of CategorySetMetaDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetMetaDescriptionAction deepCopy(@Nullable final CategorySetMetaDescriptionAction template) {
        if (template == null) {
            return null;
        }
        CategorySetMetaDescriptionActionImpl instance = new CategorySetMetaDescriptionActionImpl();
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        return instance;
    }

    /**
     * builder factory method for CategorySetMetaDescriptionAction
     * @return builder
     */
    public static CategorySetMetaDescriptionActionBuilder builder() {
        return CategorySetMetaDescriptionActionBuilder.of();
    }

    /**
     * create builder for CategorySetMetaDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetMetaDescriptionActionBuilder builder(final CategorySetMetaDescriptionAction template) {
        return CategorySetMetaDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetMetaDescriptionAction(Function<CategorySetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetMetaDescriptionAction>";
            }
        };
    }
}
