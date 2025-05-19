
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
 *  <p>The <code>data</code> of the Import Operation Rejected Event.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperationRejectedEventData importOperationRejectedEventData = ImportOperationRejectedEventData.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportOperationRejectedEventDataImpl.class)
public interface ImportOperationRejectedEventData {

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>rejected</code> state.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The <code>id</code> of the Import Operation with the <code>rejected</code> state.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ImportOperationRejectedEventData
     */
    public static ImportOperationRejectedEventData of() {
        return new ImportOperationRejectedEventDataImpl();
    }

    /**
     * factory method to create a shallow copy ImportOperationRejectedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImportOperationRejectedEventData of(final ImportOperationRejectedEventData template) {
        ImportOperationRejectedEventDataImpl instance = new ImportOperationRejectedEventDataImpl();
        instance.setId(template.getId());
        return instance;
    }

    public ImportOperationRejectedEventData copyDeep();

    /**
     * factory method to create a deep copy of ImportOperationRejectedEventData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImportOperationRejectedEventData deepCopy(@Nullable final ImportOperationRejectedEventData template) {
        if (template == null) {
            return null;
        }
        ImportOperationRejectedEventDataImpl instance = new ImportOperationRejectedEventDataImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for ImportOperationRejectedEventData
     * @return builder
     */
    public static ImportOperationRejectedEventDataBuilder builder() {
        return ImportOperationRejectedEventDataBuilder.of();
    }

    /**
     * create builder for ImportOperationRejectedEventData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationRejectedEventDataBuilder builder(final ImportOperationRejectedEventData template) {
        return ImportOperationRejectedEventDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImportOperationRejectedEventData(Function<ImportOperationRejectedEventData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImportOperationRejectedEventData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportOperationRejectedEventData>() {
            @Override
            public String toString() {
                return "TypeReference<ImportOperationRejectedEventData>";
            }
        };
    }
}
