
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the slug produces the CategorySlugChangedMessage.</p>
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

    String CHANGE_SLUG = "changeSlug";

    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    public void setSlug(final LocalizedString slug);

    public static CategoryChangeSlugAction of() {
        return new CategoryChangeSlugActionImpl();
    }

    public static CategoryChangeSlugAction of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionImpl instance = new CategoryChangeSlugActionImpl();
        instance.setSlug(template.getSlug());
        return instance;
    }

    public static CategoryChangeSlugActionBuilder builder() {
        return CategoryChangeSlugActionBuilder.of();
    }

    public static CategoryChangeSlugActionBuilder builder(final CategoryChangeSlugAction template) {
        return CategoryChangeSlugActionBuilder.of(template);
    }

    default <T> T withCategoryChangeSlugAction(Function<CategoryChangeSlugAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeSlugAction>";
            }
        };
    }
}
