
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupReference discountGroupReference = DiscountGroupReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("discount-group")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupReferenceImpl.class)
public interface DiscountGroupReference extends Reference {

    /**
     * discriminator value for DiscountGroupReference
     */
    String DISCOUNT_GROUP = "discount-group";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded DiscountGroup. Only present in responses to requests with <span>Reference Expansion</span> for DiscountGroups.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public DiscountGroup getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Contains the representation of the expanded DiscountGroup. Only present in responses to requests with <span>Reference Expansion</span> for DiscountGroups.</p>
     * @param obj value to be set
     */

    public void setObj(final DiscountGroup obj);

    /**
     * factory method
     * @return instance of DiscountGroupReference
     */
    public static DiscountGroupReference of() {
        return new DiscountGroupReferenceImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupReference of(final DiscountGroupReference template) {
        DiscountGroupReferenceImpl instance = new DiscountGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public DiscountGroupReference copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupReference deepCopy(@Nullable final DiscountGroupReference template) {
        if (template == null) {
            return null;
        }
        DiscountGroupReferenceImpl instance = new DiscountGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.discount_group.DiscountGroup.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupReference
     * @return builder
     */
    public static DiscountGroupReferenceBuilder builder() {
        return DiscountGroupReferenceBuilder.of();
    }

    /**
     * create builder for DiscountGroupReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupReferenceBuilder builder(final DiscountGroupReference template) {
        return DiscountGroupReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupReference(Function<DiscountGroupReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupReference>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupReference>";
            }
        };
    }
}
