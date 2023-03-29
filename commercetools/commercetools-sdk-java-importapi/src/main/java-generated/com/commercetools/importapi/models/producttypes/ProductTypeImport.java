
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ImportResource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a ProductType to be imported that is persisted as a ProductType in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeImport productTypeImport = ProductTypeImport.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .description("{description}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeImportImpl.class)
public interface ProductTypeImport extends ImportResource {

    /**
     *  <p>Maps to <code>ProductType.name</code>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Maps to <code>ProductType.description</code>.</p>
     * @return description
     */
    @NotNull
    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    /**
     *  <p>Maps to <code>ProductType.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Maps to <code>ProductType.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final AttributeDefinition... attributes);

    /**
     *  <p>The <code>attributes</code> of ProductType.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<AttributeDefinition> attributes);

    /**
     * factory method
     * @return instance of ProductTypeImport
     */
    public static ProductTypeImport of() {
        return new ProductTypeImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeImport of(final ProductTypeImport template) {
        ProductTypeImportImpl instance = new ProductTypeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTypeImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeImport deepCopy(@Nullable final ProductTypeImport template) {
        if (template == null) {
            return null;
        }
        ProductTypeImportImpl instance = new ProductTypeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.producttypes.AttributeDefinition::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTypeImport
     * @return builder
     */
    public static ProductTypeImportBuilder builder() {
        return ProductTypeImportBuilder.of();
    }

    /**
     * create builder for ProductTypeImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeImportBuilder builder(final ProductTypeImport template) {
        return ProductTypeImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeImport(Function<ProductTypeImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeImport>";
            }
        };
    }
}
