
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a Category.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryReference categoryReference = CategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference, com.commercetools.api.models.Identifiable<Category> {

    String CATEGORY = "category";

    /**
     <*  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>>
     */
    @Valid
    @JsonProperty("obj")
    public Category getObj();

    /**
     <*  <p>Unique identifier of the referenced Category.</p>>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Category obj);

    public void setId(final String id);

    public static CategoryReference of() {
        return new CategoryReferenceImpl();
    }

    public static CategoryReference of(final CategoryReference template) {
        CategoryReferenceImpl instance = new CategoryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CategoryReferenceBuilder builder() {
        return CategoryReferenceBuilder.of();
    }

    public static CategoryReferenceBuilder builder(final CategoryReference template) {
        return CategoryReferenceBuilder.of(template);
    }

    default <T> T withCategoryReference(Function<CategoryReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryReference>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryReference>";
            }
        };
    }
}
