
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a StandalonePrice.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceResourceIdentifier standalonePriceResourceIdentifier = StandalonePriceResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceResourceIdentifierImpl.class)
public interface StandalonePriceResourceIdentifier extends ResourceIdentifier {

    /**
     * discriminator value for StandalonePriceResourceIdentifier
     */
    String STANDALONE_PRICE = "standalone-price";

    /**
     * factory method
     * @return instance of StandalonePriceResourceIdentifier
     */
    public static StandalonePriceResourceIdentifier of() {
        return new StandalonePriceResourceIdentifierImpl();
    }

    /**
     * factory method to copy an instance of StandalonePriceResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceResourceIdentifier of(final StandalonePriceResourceIdentifier template) {
        StandalonePriceResourceIdentifierImpl instance = new StandalonePriceResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceResourceIdentifier
     * @return builder
     */
    public static StandalonePriceResourceIdentifierBuilder builder() {
        return StandalonePriceResourceIdentifierBuilder.of();
    }

    /**
     * create builder for StandalonePriceResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceResourceIdentifierBuilder builder(final StandalonePriceResourceIdentifier template) {
        return StandalonePriceResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceResourceIdentifier(Function<StandalonePriceResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceResourceIdentifier>";
            }
        };
    }
}
