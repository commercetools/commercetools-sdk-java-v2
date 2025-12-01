
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
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateReference stateReference = StateReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("state")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateReferenceImpl.class)
public interface StateReference extends Reference {

    /**
     * discriminator value for StateReference
     */
    String STATE = "state";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of StateReference
     */
    public static StateReference of() {
        return new StateReferenceImpl();
    }

    /**
     * factory method to create a shallow copy StateReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateReference of(final StateReference template) {
        StateReferenceImpl instance = new StateReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public StateReference copyDeep();

    /**
     * factory method to create a deep copy of StateReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateReference deepCopy(@Nullable final StateReference template) {
        if (template == null) {
            return null;
        }
        StateReferenceImpl instance = new StateReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for StateReference
     * @return builder
     */
    public static StateReferenceBuilder builder() {
        return StateReferenceBuilder.of();
    }

    /**
     * create builder for StateReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateReferenceBuilder builder(final StateReference template) {
        return StateReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateReference(Function<StateReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateReference>() {
            @Override
            public String toString() {
                return "TypeReference<StateReference>";
            }
        };
    }
}
