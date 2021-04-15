package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ReviewRatingSetMessage;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewRatingSetMessageBuilder {

    
    
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
    private Double oldRating;
    
    
    @Nullable
    private Double newRating;
    
    
    
    private Boolean includedInStatistics;
    
    
    @Nullable
    private com.commercetools.api.models.common.Reference target;

    
    public ReviewRatingSetMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder oldRating(@Nullable final Double oldRating) {
        this.oldRating = oldRating;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder newRating(@Nullable final Double newRating) {
        this.newRating = newRating;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder includedInStatistics( final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
        return this;
    }
    
    
    public ReviewRatingSetMessageBuilder target(@Nullable final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    
    
    public String getId(){
        return this.id;
    }
    
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    
    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    
    @Nullable
    public Double getOldRating(){
        return this.oldRating;
    }
    
    
    @Nullable
    public Double getNewRating(){
        return this.newRating;
    }
    
    
    
    public Boolean getIncludedInStatistics(){
        return this.includedInStatistics;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.Reference getTarget(){
        return this.target;
    }

    public ReviewRatingSetMessage build() {
        return new ReviewRatingSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, oldRating, newRating, includedInStatistics, target);
    }

    public static ReviewRatingSetMessageBuilder of() {
        return new ReviewRatingSetMessageBuilder();
    }

    public static ReviewRatingSetMessageBuilder of(final ReviewRatingSetMessage template) {
        ReviewRatingSetMessageBuilder builder = new ReviewRatingSetMessageBuilder();
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
        builder.oldRating = template.getOldRating();
        builder.newRating = template.getNewRating();
        builder.includedInStatistics = template.getIncludedInStatistics();
        builder.target = template.getTarget();
        return builder;
    }

}
