package com.commercetools.api.models.message;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessage;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitParentUnitChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitParentUnitChangedMessage businessUnitParentUnitChangedMessage = BusinessUnitParentUnitChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitParentUnitChangedMessageBuilder implements Builder<BusinessUnitParentUnitChangedMessage> {

    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    
    private Long sequenceNumber;
    
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    
    private Long resourceVersion;
    
    
    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;
    
    
    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit;

    
    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    
    
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder resource(Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder resourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder withResourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }
                    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    
    
    
    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder oldParentUnit(Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldParentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder withOldParentUnit(Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.oldParentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @param oldParentUnit value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder oldParentUnit(@Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
        return this;
    }
    
    
    
    
    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @param builder function to build the newParentUnit value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder newParentUnit(Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.newParentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @param builder function to build the newParentUnit value
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder withNewParentUnit(Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.newParentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @param newParentUnit value to be set
     * @return Builder
     */
    
    public BusinessUnitParentUnitChangedMessageBuilder newParentUnit(@Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit) {
        this.newParentUnit = newParentUnit;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
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
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */
    
    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @return oldParentUnit
     */
    
    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit(){
        return this.oldParentUnit;
    }
    
    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @return newParentUnit
     */
    
    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getNewParentUnit(){
        return this.newParentUnit;
    }

    /**
     * builds BusinessUnitParentUnitChangedMessage with checking for non-null required values
     * @return BusinessUnitParentUnitChangedMessage
     */
    public BusinessUnitParentUnitChangedMessage build() {
        Objects.requireNonNull(id, BusinessUnitParentUnitChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, BusinessUnitParentUnitChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, BusinessUnitParentUnitChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, BusinessUnitParentUnitChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, BusinessUnitParentUnitChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, BusinessUnitParentUnitChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, BusinessUnitParentUnitChangedMessage.class + ": resourceVersion is missing");
        return new BusinessUnitParentUnitChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, oldParentUnit, newParentUnit);
    }
    
    /**
     * builds BusinessUnitParentUnitChangedMessage without checking for non-null required values
     * @return BusinessUnitParentUnitChangedMessage
     */
    public BusinessUnitParentUnitChangedMessage buildUnchecked() {
        return new BusinessUnitParentUnitChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, oldParentUnit, newParentUnit);
    }

    /**
     * factory method for an instance of BusinessUnitParentUnitChangedMessageBuilder
     * @return builder 
     */
    public static BusinessUnitParentUnitChangedMessageBuilder of() {
        return new BusinessUnitParentUnitChangedMessageBuilder();
    }

    /**
     * create builder for BusinessUnitParentUnitChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessageBuilder of(final BusinessUnitParentUnitChangedMessage template) {
        BusinessUnitParentUnitChangedMessageBuilder builder = new BusinessUnitParentUnitChangedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.oldParentUnit = template.getOldParentUnit();
        builder.newParentUnit = template.getNewParentUnit();
        return builder;
    }

}
