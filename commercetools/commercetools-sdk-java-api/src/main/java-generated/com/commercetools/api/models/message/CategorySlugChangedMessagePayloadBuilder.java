package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CategorySlugChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySlugChangedMessagePayloadBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategorySlugChangedMessagePayloadBuilder implements Builder<CategorySlugChangedMessagePayload> {

    
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldSlug;

    
    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     * @param builder function to build the slug value
     * @return Builder
     */
    
    public CategorySlugChangedMessagePayloadBuilder slug(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     * @param builder function to build the slug value
     * @return Builder
     */
    
    public CategorySlugChangedMessagePayloadBuilder withSlug(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     * @param slug value to be set
     * @return Builder
     */
    
    public CategorySlugChangedMessagePayloadBuilder slug( final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }
    
    
    
    
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     * @param builder function to build the oldSlug value
     * @return Builder
     */
    
    public CategorySlugChangedMessagePayloadBuilder oldSlug(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     * @param builder function to build the oldSlug value
     * @return Builder
     */
    
    public CategorySlugChangedMessagePayloadBuilder withOldSlug(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.oldSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     * @param oldSlug value to be set
     * @return Builder
     */
    
    public CategorySlugChangedMessagePayloadBuilder oldSlug(@Nullable final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.oldSlug = oldSlug;
        return this;
    }
    
    

    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     * @return slug
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     * @return oldSlug
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldSlug(){
        return this.oldSlug;
    }

    /**
     * builds CategorySlugChangedMessagePayload with checking for non-null required values
     * @return CategorySlugChangedMessagePayload
     */
    public CategorySlugChangedMessagePayload build() {
        Objects.requireNonNull(slug, CategorySlugChangedMessagePayload.class + ": slug is missing");
        return new CategorySlugChangedMessagePayloadImpl(slug, oldSlug);
    }
    
    /**
     * builds CategorySlugChangedMessagePayload without checking for non-null required values
     * @return CategorySlugChangedMessagePayload
     */
    public CategorySlugChangedMessagePayload buildUnchecked() {
        return new CategorySlugChangedMessagePayloadImpl(slug, oldSlug);
    }

    /**
     * factory method for an instance of CategorySlugChangedMessagePayloadBuilder
     * @return builder 
     */
    public static CategorySlugChangedMessagePayloadBuilder of() {
        return new CategorySlugChangedMessagePayloadBuilder();
    }

    /**
     * create builder for CategorySlugChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySlugChangedMessagePayloadBuilder of(final CategorySlugChangedMessagePayload template) {
        CategorySlugChangedMessagePayloadBuilder builder = new CategorySlugChangedMessagePayloadBuilder();
        builder.slug = template.getSlug();
        builder.oldSlug = template.getOldSlug();
        return builder;
    }

}
