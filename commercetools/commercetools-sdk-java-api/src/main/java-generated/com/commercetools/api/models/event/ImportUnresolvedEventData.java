
package com.commercetools.api.models.event;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>data</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ImportUnresolvedEvent" rel="nofollow">Import Unresolved Event</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportUnresolvedEventData importUnresolvedEventData = ImportUnresolvedEventData.builder()
 *             .id("{id}")
 *             .version(1)
 *             .importContainerKey("{importContainerKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportUnresolvedEventDataImpl.class)
public interface ImportUnresolvedEventData {

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @return importContainerKey
     */
    @NotNull
    @JsonProperty("importContainerKey")
    public String getImportContainerKey();

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>The <code>version</code> of the Import Operation with the <code>unresolved</code> state.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>The <code>key</code> of the Import Container.</p>
     * @param importContainerKey value to be set
     */

    public void setImportContainerKey(final String importContainerKey);

    /**
     * factory method
     * @return instance of ImportUnresolvedEventData
     */
    public static ImportUnresolvedEventData of() {
        return new ImportUnresolvedEventDataImpl();
    }

    /**
     * factory method to create a shallow copy ImportUnresolvedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportUnresolvedEventData of(final ImportUnresolvedEventData template) {
        ImportUnresolvedEventDataImpl instance = new ImportUnresolvedEventDataImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        return instance;
    }

    public ImportUnresolvedEventData copyDeep();

    /**
     * factory method to create a deep copy of ImportUnresolvedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportUnresolvedEventData deepCopy(@Nullable final ImportUnresolvedEventData template) {
        if (template == null) {
            return null;
        }
        ImportUnresolvedEventDataImpl instance = new ImportUnresolvedEventDataImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setImportContainerKey(template.getImportContainerKey());
        return instance;
    }

    /**
     * builder factory method for ImportUnresolvedEventData
     * @return builder
     */
    public static ImportUnresolvedEventDataBuilder builder() {
        return ImportUnresolvedEventDataBuilder.of();
    }

    /**
     * create builder for ImportUnresolvedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportUnresolvedEventDataBuilder builder(final ImportUnresolvedEventData template) {
        return ImportUnresolvedEventDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportUnresolvedEventData(Function<ImportUnresolvedEventData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportUnresolvedEventData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportUnresolvedEventData>() {
            @Override
            public String toString() {
                return "TypeReference<ImportUnresolvedEventData>";
            }
        };
    }
}
