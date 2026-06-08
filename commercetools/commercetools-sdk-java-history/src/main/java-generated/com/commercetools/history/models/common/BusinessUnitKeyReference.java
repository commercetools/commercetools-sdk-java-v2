
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitKeyReference businessUnitKeyReference = BusinessUnitKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("business-unit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitKeyReferenceImpl.class)
public interface BusinessUnitKeyReference extends KeyReference {

    /**
     * discriminator value for BusinessUnitKeyReference
     */
    String BUSINESS_UNIT = "business-unit";

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique and immutable key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of BusinessUnitKeyReference
     */
    public static BusinessUnitKeyReference of() {
        return new BusinessUnitKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitKeyReference of(final BusinessUnitKeyReference template) {
        BusinessUnitKeyReferenceImpl instance = new BusinessUnitKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public BusinessUnitKeyReference copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitKeyReference deepCopy(@Nullable final BusinessUnitKeyReference template) {
        if (template == null) {
            return null;
        }
        BusinessUnitKeyReferenceImpl instance = new BusinessUnitKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitKeyReference
     * @return builder
     */
    public static BusinessUnitKeyReferenceBuilder builder() {
        return BusinessUnitKeyReferenceBuilder.of();
    }

    /**
     * create builder for BusinessUnitKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitKeyReferenceBuilder builder(final BusinessUnitKeyReference template) {
        return BusinessUnitKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitKeyReference(Function<BusinessUnitKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitKeyReference>";
            }
        };
    }
}
