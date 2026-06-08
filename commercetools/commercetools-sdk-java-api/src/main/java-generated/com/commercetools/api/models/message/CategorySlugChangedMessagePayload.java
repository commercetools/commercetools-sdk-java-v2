
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySlugChangedMessagePayload categorySlugChangedMessagePayload = CategorySlugChangedMessagePayload.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CategorySlugChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySlugChangedMessagePayloadImpl.class)
public interface CategorySlugChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CategorySlugChangedMessagePayload
     */
    String CATEGORY_SLUG_CHANGED = "CategorySlugChanged";

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @return oldSlug
     */
    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     * @param oldSlug value to be set
     */

    public void setOldSlug(final LocalizedString oldSlug);

    /**
     * factory method
     * @return instance of CategorySlugChangedMessagePayload
     */
    public static CategorySlugChangedMessagePayload of() {
        return new CategorySlugChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CategorySlugChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySlugChangedMessagePayload of(final CategorySlugChangedMessagePayload template) {
        CategorySlugChangedMessagePayloadImpl instance = new CategorySlugChangedMessagePayloadImpl();
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    public CategorySlugChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CategorySlugChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySlugChangedMessagePayload deepCopy(
            @Nullable final CategorySlugChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CategorySlugChangedMessagePayloadImpl instance = new CategorySlugChangedMessagePayloadImpl();
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setOldSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldSlug()));
        return instance;
    }

    /**
     * builder factory method for CategorySlugChangedMessagePayload
     * @return builder
     */
    public static CategorySlugChangedMessagePayloadBuilder builder() {
        return CategorySlugChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CategorySlugChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySlugChangedMessagePayloadBuilder builder(final CategorySlugChangedMessagePayload template) {
        return CategorySlugChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySlugChangedMessagePayload(Function<CategorySlugChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySlugChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySlugChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySlugChangedMessagePayload>";
            }
        };
    }
}
