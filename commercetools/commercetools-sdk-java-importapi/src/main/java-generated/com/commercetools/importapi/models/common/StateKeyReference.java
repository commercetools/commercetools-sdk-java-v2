
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a state by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateKeyReference stateKeyReference = StateKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateKeyReferenceImpl.class)
public interface StateKeyReference extends KeyReference {

    /**
     * discriminator value for StateKeyReference
     */
    String STATE = "state";

    /**
     * factory method
     * @return instance of StateKeyReference
     */
    public static StateKeyReference of() {
        return new StateKeyReferenceImpl();
    }

    /**
     * factory method to copy an instance of StateKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateKeyReference of(final StateKeyReference template) {
        StateKeyReferenceImpl instance = new StateKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StateKeyReference
     * @return builder
     */
    public static StateKeyReferenceBuilder builder() {
        return StateKeyReferenceBuilder.of();
    }

    /**
     * create builder for StateKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateKeyReferenceBuilder builder(final StateKeyReference template) {
        return StateKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateKeyReference(Function<StateKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<StateKeyReference>";
            }
        };
    }
}
