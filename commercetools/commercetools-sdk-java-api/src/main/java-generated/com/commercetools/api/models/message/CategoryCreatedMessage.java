
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.Category;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create Category request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryCreatedMessage categoryCreatedMessage = CategoryCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CategoryCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryCreatedMessageImpl.class)
public interface CategoryCreatedMessage extends Message {

    /**
     * discriminator value for CategoryCreatedMessage
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
     * @return instance of CategoryCreatedMessage
     */
    public static CategoryCreatedMessage of() {
        return new CategoryCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CategoryCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryCreatedMessage of(final CategoryCreatedMessage template) {
        CategoryCreatedMessageImpl instance = new CategoryCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCategory(template.getCategory());
        return instance;
    }

    public CategoryCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of CategoryCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryCreatedMessage deepCopy(@Nullable final CategoryCreatedMessage template) {
        if (template == null) {
            return null;
        }
        CategoryCreatedMessageImpl instance = new CategoryCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCategory(com.commercetools.api.models.category.Category.deepCopy(template.getCategory()));
        return instance;
    }

    /**
     * builder factory method for CategoryCreatedMessage
     * @return builder
     */
    public static CategoryCreatedMessageBuilder builder() {
        return CategoryCreatedMessageBuilder.of();
    }

    /**
     * create builder for CategoryCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryCreatedMessageBuilder builder(final CategoryCreatedMessage template) {
        return CategoryCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryCreatedMessage(Function<CategoryCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryCreatedMessage>";
            }
        };
    }
}
