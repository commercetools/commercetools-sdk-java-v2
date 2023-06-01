package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.cart.DirectDiscountReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Reference to a DirectDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DirectDiscountReference directDiscountReference = DirectDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DirectDiscountReferenceImpl.class)
public interface DirectDiscountReference extends Reference {

    /**
     * discriminator value for DirectDiscountReference
     */
    String DIRECT_DISCOUNT = "direct-discount";

    /**
     *  <p>Unique identifier of the referenced DirectDiscount.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced DirectDiscount.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    

    /**
     * factory method
     * @return instance of DirectDiscountReference
     */
    public static DirectDiscountReference of(){
        return new DirectDiscountReferenceImpl();
    }
    

    /**
     * factory method to create a shallow copy DirectDiscountReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static DirectDiscountReference of(final DirectDiscountReference template) {
        DirectDiscountReferenceImpl instance = new DirectDiscountReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * factory method to create a deep copy of DirectDiscountReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DirectDiscountReference deepCopy(@Nullable final DirectDiscountReference template) {
        if (template == null) {
            return null;
        }
        DirectDiscountReferenceImpl instance = new DirectDiscountReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for DirectDiscountReference
     * @return builder
     */
    public static DirectDiscountReferenceBuilder builder() {
        return DirectDiscountReferenceBuilder.of();
    }
    
    /**
     * create builder for DirectDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DirectDiscountReferenceBuilder builder(final DirectDiscountReference template) {
        return DirectDiscountReferenceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDirectDiscountReference(Function<DirectDiscountReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DirectDiscountReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DirectDiscountReference>() {
            @Override
            public String toString() {
                return "TypeReference<DirectDiscountReference>";
            }
        };
    }
}
