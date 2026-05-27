
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to an <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionReference extensionReference = ExtensionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("extension")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionReferenceImpl.class)
public interface ExtensionReference extends Reference {

    /**
     * discriminator value for ExtensionReference
     */
    String EXTENSION = "extension";

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Extension. Only present in responses to requests with <span>Reference Expansion</span> for Extensions.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Extension getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Contains the representation of the expanded Extension. Only present in responses to requests with <span>Reference Expansion</span> for Extensions.</p>
     * @param obj value to be set
     */

    public void setObj(final Extension obj);

    /**
     * factory method
     * @return instance of ExtensionReference
     */
    public static ExtensionReference of() {
        return new ExtensionReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionReference of(final ExtensionReference template) {
        ExtensionReferenceImpl instance = new ExtensionReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public ExtensionReference copyDeep();

    /**
     * factory method to create a deep copy of ExtensionReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionReference deepCopy(@Nullable final ExtensionReference template) {
        if (template == null) {
            return null;
        }
        ExtensionReferenceImpl instance = new ExtensionReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.extension.Extension.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ExtensionReference
     * @return builder
     */
    public static ExtensionReferenceBuilder builder() {
        return ExtensionReferenceBuilder.of();
    }

    /**
     * create builder for ExtensionReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionReferenceBuilder builder(final ExtensionReference template) {
        return ExtensionReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionReference(Function<ExtensionReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionReference>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionReference>";
            }
        };
    }
}
