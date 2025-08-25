
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceReference standalonePriceReference = StandalonePriceReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("standalone-price")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceReferenceImpl.class)
public interface StandalonePriceReference extends Reference {

    /**
     * discriminator value for StandalonePriceReference
     */
    String STANDALONE_PRICE = "standalone-price";

    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with <span>Reference Expansion</span> for StandalonePrice.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public StandalonePrice getObj();

    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with <span>Reference Expansion</span> for StandalonePrice.</p>
     * @param obj value to be set
     */

    public void setObj(final StandalonePrice obj);

    /**
     * factory method
     * @return instance of StandalonePriceReference
     */
    public static StandalonePriceReference of() {
        return new StandalonePriceReferenceImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceReference of(final StandalonePriceReference template) {
        StandalonePriceReferenceImpl instance = new StandalonePriceReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public StandalonePriceReference copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceReference deepCopy(@Nullable final StandalonePriceReference template) {
        if (template == null) {
            return null;
        }
        StandalonePriceReferenceImpl instance = new StandalonePriceReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.standalone_price.StandalonePrice.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceReference
     * @return builder
     */
    public static StandalonePriceReferenceBuilder builder() {
        return StandalonePriceReferenceBuilder.of();
    }

    /**
     * create builder for StandalonePriceReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceReferenceBuilder builder(final StandalonePriceReference template) {
        return StandalonePriceReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceReference(Function<StandalonePriceReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceReference>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceReference>";
            }
        };
    }
}
