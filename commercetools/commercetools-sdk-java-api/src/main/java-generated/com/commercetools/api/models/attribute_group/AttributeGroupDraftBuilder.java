package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeReference;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.attribute_group.AttributeGroupDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupDraft attributeGroupDraft = AttributeGroupDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeGroupDraftBuilder implements Builder<AttributeGroupDraft> {

    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    
    private java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder attributes( final com.commercetools.api.models.attribute_group.AttributeReference ...attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder attributes( final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder plusAttributes( final com.commercetools.api.models.attribute_group.AttributeReference ...attributes) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.addAll(Arrays.asList(attributes));
        return this;
    }
    
    
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder plusAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder withAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder addAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReference> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()));
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder setAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReference> builder) {
        return attributes(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()));
    }
                    
    
    
    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public AttributeGroupDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Name of the AttributeGroup.</p>
     * @return name
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @return attributes
     */
    
    
    public java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> getAttributes(){
        return this.attributes;
    }
    
    /**
     *  <p>User-defined unique identifier for the AttributeGroup.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds AttributeGroupDraft with checking for non-null required values
     * @return AttributeGroupDraft
     */
    public AttributeGroupDraft build() {
        Objects.requireNonNull(name, AttributeGroupDraft.class + ": name is missing");
        Objects.requireNonNull(attributes, AttributeGroupDraft.class + ": attributes is missing");
        return new AttributeGroupDraftImpl(name, description, attributes, key);
    }
    
    /**
     * builds AttributeGroupDraft without checking for non-null required values
     * @return AttributeGroupDraft
     */
    public AttributeGroupDraft buildUnchecked() {
        return new AttributeGroupDraftImpl(name, description, attributes, key);
    }

    /**
     * factory method for an instance of AttributeGroupDraftBuilder
     * @return builder 
     */
    public static AttributeGroupDraftBuilder of() {
        return new AttributeGroupDraftBuilder();
    }

    /**
     * create builder for AttributeGroupDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupDraftBuilder of(final AttributeGroupDraft template) {
        AttributeGroupDraftBuilder builder = new AttributeGroupDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        builder.key = template.getKey();
        return builder;
    }

}
