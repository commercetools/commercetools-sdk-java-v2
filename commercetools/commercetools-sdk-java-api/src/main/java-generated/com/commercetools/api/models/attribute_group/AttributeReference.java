
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeReference attributeReference = AttributeReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeReferenceImpl.class)
public interface AttributeReference {

    /**
     *  <p>Key of the attribute.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static AttributeReference of() {
        return new AttributeReferenceImpl();
    }

    public static AttributeReference of(final AttributeReference template) {
        AttributeReferenceImpl instance = new AttributeReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static AttributeReferenceBuilder builder() {
        return AttributeReferenceBuilder.of();
    }

    public static AttributeReferenceBuilder builder(final AttributeReference template) {
        return AttributeReferenceBuilder.of(template);
    }

    default <T> T withAttributeReference(Function<AttributeReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeReference>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeReference>";
            }
        };
    }
}
