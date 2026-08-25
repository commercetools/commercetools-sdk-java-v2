
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantResourceIdentifier variantResourceIdentifier = VariantResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("variant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantResourceIdentifierImpl.class)
public interface VariantResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for VariantResourceIdentifier
     */
    String VARIANT = "variant";

    /**
     *
     * @return typeId
     */

    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of VariantResourceIdentifier
     */
    public static VariantResourceIdentifier of() {
        return new VariantResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy VariantResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantResourceIdentifier of(final VariantResourceIdentifier template) {
        VariantResourceIdentifierImpl instance = new VariantResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public VariantResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of VariantResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantResourceIdentifier deepCopy(@Nullable final VariantResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        VariantResourceIdentifierImpl instance = new VariantResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for VariantResourceIdentifier
     * @return builder
     */
    public static VariantResourceIdentifierBuilder builder() {
        return VariantResourceIdentifierBuilder.of();
    }

    /**
     * create builder for VariantResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantResourceIdentifierBuilder builder(final VariantResourceIdentifier template) {
        return VariantResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantResourceIdentifier(Function<VariantResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantResourceIdentifier> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<VariantResourceIdentifier>";
            }
        };
    }
}
