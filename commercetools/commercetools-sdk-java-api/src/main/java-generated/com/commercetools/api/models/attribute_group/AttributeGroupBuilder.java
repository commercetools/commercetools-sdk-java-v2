package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import java.time.ZonedDateTime;
import com.commercetools.api.models.attribute_group.AttributeGroup;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroup attributeGroup = AttributeGroup.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
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
public class AttributeGroupBuilder implements Builder<AttributeGroup> {

    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    
    private java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Platform-generated unique identifier of the AttributeGroup.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Current version of the AttributeGroup.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the AttributeGroup was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the AttributeGroup was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public AttributeGroupBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public AttributeGroupBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public AttributeGroupBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public AttributeGroupBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public AttributeGroupBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public AttributeGroupBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Name of the AttributeGroup.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public AttributeGroupBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public AttributeGroupBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Description of the AttributeGroup.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder attributes( final com.commercetools.api.models.attribute_group.AttributeReference ...attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder attributes( final java.util.List<com.commercetools.api.models.attribute_group.AttributeReference> attributes) {
        this.attributes = attributes;
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param attributes value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder plusAttributes( final com.commercetools.api.models.attribute_group.AttributeReference ...attributes) {
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
    
    public AttributeGroupBuilder plusAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
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
    
    public AttributeGroupBuilder withAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReferenceBuilder> builder) {
        this.attributes = new ArrayList<>();
        this.attributes.add(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public AttributeGroupBuilder addAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReference> builder) {
        return plusAttributes(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()));
    }
    
    /**
     *  <p>Attributes with unique values.</p>
     * @param builder function to build the attributes value
     * @return Builder
     */
    
    public AttributeGroupBuilder setAttributes(Function<com.commercetools.api.models.attribute_group.AttributeReferenceBuilder, com.commercetools.api.models.attribute_group.AttributeReference> builder) {
        return attributes(builder.apply(com.commercetools.api.models.attribute_group.AttributeReferenceBuilder.of()));
    }
                    
    
    
    /**
     *  <p>User-defined unique identifier of the AttributeGroup.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public AttributeGroupBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Platform-generated unique identifier of the AttributeGroup.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the AttributeGroup.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the AttributeGroup was initially created.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the AttributeGroup was last updated.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
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
     *  <p>User-defined unique identifier of the AttributeGroup.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds AttributeGroup with checking for non-null required values
     * @return AttributeGroup
     */
    public AttributeGroup build() {
        Objects.requireNonNull(id, AttributeGroup.class + ": id is missing");
        Objects.requireNonNull(version, AttributeGroup.class + ": version is missing");
        Objects.requireNonNull(createdAt, AttributeGroup.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, AttributeGroup.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, AttributeGroup.class + ": name is missing");
        Objects.requireNonNull(attributes, AttributeGroup.class + ": attributes is missing");
        return new AttributeGroupImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, description, attributes, key);
    }
    
    /**
     * builds AttributeGroup without checking for non-null required values
     * @return AttributeGroup
     */
    public AttributeGroup buildUnchecked() {
        return new AttributeGroupImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, description, attributes, key);
    }

    /**
     * factory method for an instance of AttributeGroupBuilder
     * @return builder 
     */
    public static AttributeGroupBuilder of() {
        return new AttributeGroupBuilder();
    }

    /**
     * create builder for AttributeGroup instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupBuilder of(final AttributeGroup template) {
        AttributeGroupBuilder builder = new AttributeGroupBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.attributes = template.getAttributes();
        builder.key = template.getKey();
        return builder;
    }

}
