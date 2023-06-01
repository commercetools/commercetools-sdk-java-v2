package com.commercetools.importapi.models.importcontainers;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importcontainers.ImportContainerUpdateDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportContainerUpdateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportContainerUpdateDraft importContainerUpdateDraft = ImportContainerUpdateDraft.builder()
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImportContainerUpdateDraftBuilder implements Builder<ImportContainerUpdateDraft> {

    
    
    private Long version;
    
    
    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    
    /**
     *  <p>Current version of the ImportContainer.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public ImportContainerUpdateDraftBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     * @return Builder
     */
    
    public ImportContainerUpdateDraftBuilder resourceType(@Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    
    

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @return resourceType
     */
    
    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType(){
        return this.resourceType;
    }

    /**
     * builds ImportContainerUpdateDraft with checking for non-null required values
     * @return ImportContainerUpdateDraft
     */
    public ImportContainerUpdateDraft build() {
        Objects.requireNonNull(version, ImportContainerUpdateDraft.class + ": version is missing");
        return new ImportContainerUpdateDraftImpl(version, resourceType);
    }
    
    /**
     * builds ImportContainerUpdateDraft without checking for non-null required values
     * @return ImportContainerUpdateDraft
     */
    public ImportContainerUpdateDraft buildUnchecked() {
        return new ImportContainerUpdateDraftImpl(version, resourceType);
    }

    /**
     * factory method for an instance of ImportContainerUpdateDraftBuilder
     * @return builder 
     */
    public static ImportContainerUpdateDraftBuilder of() {
        return new ImportContainerUpdateDraftBuilder();
    }

    /**
     * create builder for ImportContainerUpdateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerUpdateDraftBuilder of(final ImportContainerUpdateDraft template) {
        ImportContainerUpdateDraftBuilder builder = new ImportContainerUpdateDraftBuilder();
        builder.version = template.getVersion();
        builder.resourceType = template.getResourceType();
        return builder;
    }

}
