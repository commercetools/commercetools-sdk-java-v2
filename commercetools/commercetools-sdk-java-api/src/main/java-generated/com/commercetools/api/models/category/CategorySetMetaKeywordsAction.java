
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetMetaKeywordsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetMetaKeywordsAction categorySetMetaKeywordsAction = CategorySetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetMetaKeywordsActionImpl.class)
public interface CategorySetMetaKeywordsAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetMetaKeywordsAction
     */
    String SET_META_KEYWORDS = "setMetaKeywords";

    /**
     *  <p>Value to set.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>Value to set.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     * factory method
     * @return instance of CategorySetMetaKeywordsAction
     */
    public static CategorySetMetaKeywordsAction of() {
        return new CategorySetMetaKeywordsActionImpl();
    }

    /**
     * factory method to copy an instance of CategorySetMetaKeywordsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetMetaKeywordsAction of(final CategorySetMetaKeywordsAction template) {
        CategorySetMetaKeywordsActionImpl instance = new CategorySetMetaKeywordsActionImpl();
        instance.setMetaKeywords(template.getMetaKeywords());
        return instance;
    }

    /**
     * builder factory method for CategorySetMetaKeywordsAction
     * @return builder
     */
    public static CategorySetMetaKeywordsActionBuilder builder() {
        return CategorySetMetaKeywordsActionBuilder.of();
    }

    /**
     * create builder for CategorySetMetaKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetMetaKeywordsActionBuilder builder(final CategorySetMetaKeywordsAction template) {
        return CategorySetMetaKeywordsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetMetaKeywordsAction(Function<CategorySetMetaKeywordsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaKeywordsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetMetaKeywordsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetMetaKeywordsAction>";
            }
        };
    }
}
