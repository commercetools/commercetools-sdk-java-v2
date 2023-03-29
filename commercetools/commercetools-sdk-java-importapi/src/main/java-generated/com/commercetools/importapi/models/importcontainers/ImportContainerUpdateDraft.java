
package com.commercetools.importapi.models.importcontainers;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The representation sent to the server when updating an import container.</p>
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportContainerUpdateDraftImpl.class)
public interface ImportContainerUpdateDraft extends io.vrap.rmf.base.client.Draft<ImportContainerUpdateDraft> {

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @return resourceType
     */

    @JsonProperty("resourceType")
    public ImportResourceType getResourceType();

    /**
     *  <p>Current version of the ImportContainer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>The resource type to be imported. If not given, the ImportContainer is able to import all of the supported ImportResourceTypes.</p>
     * @param resourceType value to be set
     */

    public void setResourceType(final ImportResourceType resourceType);

    /**
     * factory method
     * @return instance of ImportContainerUpdateDraft
     */
    public static ImportContainerUpdateDraft of() {
        return new ImportContainerUpdateDraftImpl();
    }

    /**
     * factory method to create a shallow copy ImportContainerUpdateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportContainerUpdateDraft of(final ImportContainerUpdateDraft template) {
        ImportContainerUpdateDraftImpl instance = new ImportContainerUpdateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImportContainerUpdateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportContainerUpdateDraft deepCopy(@Nullable final ImportContainerUpdateDraft template) {
        if (template == null) {
            return null;
        }
        ImportContainerUpdateDraftImpl instance = new ImportContainerUpdateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setResourceType(template.getResourceType());
        return instance;
    }

    /**
     * builder factory method for ImportContainerUpdateDraft
     * @return builder
     */
    public static ImportContainerUpdateDraftBuilder builder() {
        return ImportContainerUpdateDraftBuilder.of();
    }

    /**
     * create builder for ImportContainerUpdateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportContainerUpdateDraftBuilder builder(final ImportContainerUpdateDraft template) {
        return ImportContainerUpdateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportContainerUpdateDraft(Function<ImportContainerUpdateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportContainerUpdateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportContainerUpdateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ImportContainerUpdateDraft>";
            }
        };
    }
}
