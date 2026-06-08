
package com.commercetools.importapi.models.types;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import a Type. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeImport typeImport = TypeImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .plusResourceTypeIds(resourceTypeIdsBuilder -> resourceTypeIdsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeImportImpl.class)
public interface TypeImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier for the Type. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @return resourceTypeIds
     */
    @NotNull
    @JsonProperty("resourceTypeIds")
    public List<ResourceTypeId> getResourceTypeIds();

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @return fieldDefinitions
     */
    @Valid
    @JsonProperty("fieldDefinitions")
    public List<FieldDefinition> getFieldDefinitions();

    /**
     *  <p>User-defined unique identifier for the Type. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>Type.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Maps to <code>Type.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @param resourceTypeIds values to be set
     */

    @JsonIgnore
    public void setResourceTypeIds(final ResourceTypeId... resourceTypeIds);

    /**
     *  <p>Maps to <code>Type.resourceTypeIds</code>. This value cannot be changed after the Type is imported.</p>
     * @param resourceTypeIds values to be set
     */

    public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param fieldDefinitions values to be set
     */

    @JsonIgnore
    public void setFieldDefinitions(final FieldDefinition... fieldDefinitions);

    /**
     *  <p>Maps to <code>Type.fieldDefinitions</code>.</p>
     * @param fieldDefinitions values to be set
     */

    public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);

    /**
     * factory method
     * @return instance of TypeImport
     */
    public static TypeImport of() {
        return new TypeImportImpl();
    }

    /**
     * factory method to create a shallow copy TypeImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeImport of(final TypeImport template) {
        TypeImportImpl instance = new TypeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setResourceTypeIds(template.getResourceTypeIds());
        instance.setFieldDefinitions(template.getFieldDefinitions());
        return instance;
    }

    public TypeImport copyDeep();

    /**
     * factory method to create a deep copy of TypeImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeImport deepCopy(@Nullable final TypeImport template) {
        if (template == null) {
            return null;
        }
        TypeImportImpl instance = new TypeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setResourceTypeIds(
            Optional.ofNullable(template.getResourceTypeIds()).map(ArrayList::new).orElse(null));
        instance.setFieldDefinitions(Optional.ofNullable(template.getFieldDefinitions())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.types.FieldDefinition::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for TypeImport
     * @return builder
     */
    public static TypeImportBuilder builder() {
        return TypeImportBuilder.of();
    }

    /**
     * create builder for TypeImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeImportBuilder builder(final TypeImport template) {
        return TypeImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeImport(Function<TypeImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeImport>() {
            @Override
            public String toString() {
                return "TypeReference<TypeImport>";
            }
        };
    }
}
