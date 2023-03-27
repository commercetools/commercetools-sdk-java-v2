
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.category.Category;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Category request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryCreatedMessagePayload categoryCreatedMessagePayload = CategoryCreatedMessagePayload.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryCreatedMessagePayloadImpl.class)
public interface CategoryCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CategoryCreatedMessagePayload
     */
    String CATEGORY_CREATED = "CategoryCreated";

    /**
     *  <p>Category that was created.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public Category getCategory();

    /**
     *  <p>Category that was created.</p>
     * @param category value to be set
     */

    public void setCategory(final Category category);

    /**
     * factory method
     * @return instance of CategoryCreatedMessagePayload
     */
    public static CategoryCreatedMessagePayload of() {
        return new CategoryCreatedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of CategoryCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryCreatedMessagePayload of(final CategoryCreatedMessagePayload template) {
        CategoryCreatedMessagePayloadImpl instance = new CategoryCreatedMessagePayloadImpl();
        instance.setCategory(template.getCategory());
        return instance;
    }

    /**
     * builder factory method for CategoryCreatedMessagePayload
     * @return builder
     */
    public static CategoryCreatedMessagePayloadBuilder builder() {
        return CategoryCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CategoryCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryCreatedMessagePayloadBuilder builder(final CategoryCreatedMessagePayload template) {
        return CategoryCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryCreatedMessagePayload(Function<CategoryCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryCreatedMessagePayload>";
            }
        };
    }
}
