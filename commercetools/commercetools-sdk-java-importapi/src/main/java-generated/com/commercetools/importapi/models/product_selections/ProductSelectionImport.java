
package com.commercetools.importapi.models.product_selections;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import a ProductSelection. Once imported, this data is persisted as a ProductSelection in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionImport productSelectionImport = ProductSelectionImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionImportImpl.class)
public interface ProductSelectionImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier. If an ProductSelection with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>ProductSelection.mode</code>.</p>
     * @return mode
     */

    @JsonProperty("mode")
    public ProductSelectionMode getMode();

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>List of product assignments.</p>
     * @return assignments
     */
    @Valid
    @JsonProperty("assignments")
    public List<ProductSelectionAssignment> getAssignments();

    /**
     *  <p>User-defined unique identifier. If an ProductSelection with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>ProductSelection.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>ProductSelection.mode</code>.</p>
     * @param mode value to be set
     */

    public void setMode(final ProductSelectionMode mode);

    /**
     *  <p>Maps to <code>ProductSelection.custom</code>.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     *  <p>List of product assignments.</p>
     * @param assignments values to be set
     */

    @JsonIgnore
    public void setAssignments(final ProductSelectionAssignment... assignments);

    /**
     *  <p>List of product assignments.</p>
     * @param assignments values to be set
     */

    public void setAssignments(final List<ProductSelectionAssignment> assignments);

    /**
     * factory method
     * @return instance of ProductSelectionImport
     */
    public static ProductSelectionImport of() {
        return new ProductSelectionImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionImport of(final ProductSelectionImport template) {
        ProductSelectionImportImpl instance = new ProductSelectionImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setMode(template.getMode());
        instance.setCustom(template.getCustom());
        instance.setAssignments(template.getAssignments());
        return instance;
    }

    public ProductSelectionImport copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionImport deepCopy(@Nullable final ProductSelectionImport template) {
        if (template == null) {
            return null;
        }
        ProductSelectionImportImpl instance = new ProductSelectionImportImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setMode(template.getMode());
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        instance.setAssignments(Optional.ofNullable(template.getAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.product_selections.ProductSelectionAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionImport
     * @return builder
     */
    public static ProductSelectionImportBuilder builder() {
        return ProductSelectionImportBuilder.of();
    }

    /**
     * create builder for ProductSelectionImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionImportBuilder builder(final ProductSelectionImport template) {
        return ProductSelectionImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionImport(Function<ProductSelectionImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionImport>";
            }
        };
    }
}
