package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeResourceIdentifierImpl;

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
 *  <p>ResourceIdentifier to a DiscountCode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeResourceIdentifier discountCodeResourceIdentifier = DiscountCodeResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeResourceIdentifierImpl.class)
public interface DiscountCodeResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<DiscountCode> {

    /**
     * discriminator value for DiscountCodeResourceIdentifier
     */
    String DISCOUNT_CODE = "discount-code";

    /**
     *  <p>Unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced DiscountCode. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of DiscountCodeResourceIdentifier
     */
    public static DiscountCodeResourceIdentifier of(){
        return new DiscountCodeResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy DiscountCodeResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeResourceIdentifier of(final DiscountCodeResourceIdentifier template) {
        DiscountCodeResourceIdentifierImpl instance = new DiscountCodeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeResourceIdentifier deepCopy(@Nullable final DiscountCodeResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        DiscountCodeResourceIdentifierImpl instance = new DiscountCodeResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeResourceIdentifier
     * @return builder
     */
    public static DiscountCodeResourceIdentifierBuilder builder() {
        return DiscountCodeResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for DiscountCodeResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeResourceIdentifierBuilder builder(final DiscountCodeResourceIdentifier template) {
        return DiscountCodeResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeResourceIdentifier(Function<DiscountCodeResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeResourceIdentifier>";
            }
        };
    }
}
