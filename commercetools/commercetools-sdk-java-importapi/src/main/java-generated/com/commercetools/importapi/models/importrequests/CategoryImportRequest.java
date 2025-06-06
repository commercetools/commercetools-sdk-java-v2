
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.categories.CategoryImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import Categories. Contains data for Categories to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryImportRequest categoryImportRequest = CategoryImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("category")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryImportRequestImpl.class)
public interface CategoryImportRequest extends ImportRequest {

    /**
     * discriminator value for CategoryImportRequest
     */
    String CATEGORY = "category";

    /**
     *  <p>The category import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<CategoryImport> getResources();

    /**
     *  <p>The category import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final CategoryImport... resources);

    /**
     *  <p>The category import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<CategoryImport> resources);

    /**
     * factory method
     * @return instance of CategoryImportRequest
     */
    public static CategoryImportRequest of() {
        return new CategoryImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy CategoryImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryImportRequest of(final CategoryImportRequest template) {
        CategoryImportRequestImpl instance = new CategoryImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public CategoryImportRequest copyDeep();

    /**
     * factory method to create a deep copy of CategoryImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryImportRequest deepCopy(@Nullable final CategoryImportRequest template) {
        if (template == null) {
            return null;
        }
        CategoryImportRequestImpl instance = new CategoryImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.categories.CategoryImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategoryImportRequest
     * @return builder
     */
    public static CategoryImportRequestBuilder builder() {
        return CategoryImportRequestBuilder.of();
    }

    /**
     * create builder for CategoryImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryImportRequestBuilder builder(final CategoryImportRequest template) {
        return CategoryImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryImportRequest(Function<CategoryImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryImportRequest>";
            }
        };
    }
}
