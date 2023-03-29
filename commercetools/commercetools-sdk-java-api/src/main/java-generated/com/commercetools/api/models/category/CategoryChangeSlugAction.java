
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the slug produces the CategorySlugChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeSlugAction categoryChangeSlugAction = CategoryChangeSlugAction.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeSlugActionImpl.class)
public interface CategoryChangeSlugAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryChangeSlugAction
     */
    String CHANGE_SLUG = "changeSlug";

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     * factory method
     * @return instance of CategoryChangeSlugAction
     */
    public static CategoryChangeSlugAction of() {
        return new CategoryChangeSlugActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryChangeSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryChangeSlugAction of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionImpl instance = new CategoryChangeSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryChangeSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryChangeSlugAction deepCopy(@Nullable final CategoryChangeSlugAction template) {
        if (template == null) {
            return null;
        }
        CategoryChangeSlugActionImpl instance = new CategoryChangeSlugActionImpl();
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        return instance;
    }

    /**
     * builder factory method for CategoryChangeSlugAction
     * @return builder
     */
    public static CategoryChangeSlugActionBuilder builder() {
        return CategoryChangeSlugActionBuilder.of();
    }

    /**
     * create builder for CategoryChangeSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeSlugActionBuilder builder(final CategoryChangeSlugAction template) {
        return CategoryChangeSlugActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryChangeSlugAction(Function<CategoryChangeSlugAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeSlugAction>";
            }
        };
    }
}
