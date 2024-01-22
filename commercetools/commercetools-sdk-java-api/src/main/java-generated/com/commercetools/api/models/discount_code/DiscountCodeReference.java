
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a DiscountCode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeReference discountCodeReference = DiscountCodeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeReferenceImpl.class)
public interface DiscountCodeReference extends Reference, com.commercetools.api.models.Identifiable<DiscountCode>,
        com.commercetools.api.models.IdentifiableObjHolder<DiscountCode> {

    /**
     * discriminator value for DiscountCodeReference
     */
    String DISCOUNT_CODE = "discount-code";

    /**
     *  <p>Contains the representation of the expanded DiscountCode. Only present in responses to requests with Reference Expansion for DiscountCodes.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public DiscountCode getObj();

    /**
     *  <p>Unique identifier of the referenced DiscountCode.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded DiscountCode. Only present in responses to requests with Reference Expansion for DiscountCodes.</p>
     * @param obj value to be set
     */

    public void setObj(final DiscountCode obj);

    /**
     *  <p>Unique identifier of the referenced DiscountCode.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of DiscountCodeReference
     */
    public static DiscountCodeReference of() {
        return new DiscountCodeReferenceImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeReference of(final DiscountCodeReference template) {
        DiscountCodeReferenceImpl instance = new DiscountCodeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeReference deepCopy(@Nullable final DiscountCodeReference template) {
        if (template == null) {
            return null;
        }
        DiscountCodeReferenceImpl instance = new DiscountCodeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.discount_code.DiscountCode.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeReference
     * @return builder
     */
    public static DiscountCodeReferenceBuilder builder() {
        return DiscountCodeReferenceBuilder.of();
    }

    /**
     * create builder for DiscountCodeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeReferenceBuilder builder(final DiscountCodeReference template) {
        return DiscountCodeReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeReference(Function<DiscountCodeReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeReference>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeReference>";
            }
        };
    }
}
