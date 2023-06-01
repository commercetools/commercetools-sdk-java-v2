package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.CategorySlugChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Change Slug update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySlugChangedMessage categorySlugChangedMessage = CategorySlugChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategorySlugChangedMessageImpl.class)
public interface CategorySlugChangedMessage extends Message {

    /**
     * discriminator value for CategorySlugChangedMessage
     */
    String CATEGORY_SLUG_CHANGED = "CategorySlugChanged";

    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     * @return oldSlug
     */
    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     * @param slug value to be set
     */
    
    public void setSlug(final LocalizedString slug);
    
    
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     * @param oldSlug value to be set
     */
    
    public void setOldSlug(final LocalizedString oldSlug);
    

    /**
     * factory method
     * @return instance of CategorySlugChangedMessage
     */
    public static CategorySlugChangedMessage of(){
        return new CategorySlugChangedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy CategorySlugChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySlugChangedMessage of(final CategorySlugChangedMessage template) {
        CategorySlugChangedMessageImpl instance = new CategorySlugChangedMessageImpl();
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
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySlugChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySlugChangedMessage deepCopy(@Nullable final CategorySlugChangedMessage template) {
        if (template == null) {
            return null;
        }
        CategorySlugChangedMessageImpl instance = new CategorySlugChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setOldSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldSlug()));
        return instance;
    }

    /**
     * builder factory method for CategorySlugChangedMessage
     * @return builder
     */
    public static CategorySlugChangedMessageBuilder builder() {
        return CategorySlugChangedMessageBuilder.of();
    }
    
    /**
     * create builder for CategorySlugChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySlugChangedMessageBuilder builder(final CategorySlugChangedMessage template) {
        return CategorySlugChangedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySlugChangedMessage(Function<CategorySlugChangedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySlugChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySlugChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySlugChangedMessage>";
            }
        };
    }
}
