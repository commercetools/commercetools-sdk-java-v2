
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantReference variantReference = VariantReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("variant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantReferenceImpl.class)
public interface VariantReference extends Reference {

    /**
     * discriminator value for VariantReference
     */
    String VARIANT = "variant";

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Contains the representation of the expanded Variant. Only present in responses to requests with <span>Reference Expansion</span> for Variants.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Variant getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Variant. Only present in responses to requests with <span>Reference Expansion</span> for Variants.</p>
     * @param obj value to be set
     */

    public void setObj(final Variant obj);

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of VariantReference
     */
    public static VariantReference of() {
        return new VariantReferenceImpl();
    }

    /**
     * factory method to create a shallow copy VariantReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantReference of(final VariantReference template) {
        VariantReferenceImpl instance = new VariantReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public VariantReference copyDeep();

    /**
     * factory method to create a deep copy of VariantReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantReference deepCopy(@Nullable final VariantReference template) {
        if (template == null) {
            return null;
        }
        VariantReferenceImpl instance = new VariantReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.variant.Variant.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for VariantReference
     * @return builder
     */
    public static VariantReferenceBuilder builder() {
        return VariantReferenceBuilder.of();
    }

    /**
     * create builder for VariantReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantReferenceBuilder builder(final VariantReference template) {
        return VariantReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantReference(Function<VariantReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantReference> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantReference>() {
            @Override
            public String toString() {
                return "TypeReference<VariantReference>";
            }
        };
    }
}
