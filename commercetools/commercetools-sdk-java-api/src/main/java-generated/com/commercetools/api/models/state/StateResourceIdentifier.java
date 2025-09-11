
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateResourceIdentifier stateResourceIdentifier = StateResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("state")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StateResourceIdentifierImpl.class)
public interface StateResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<State> {

    /**
     * discriminator value for StateResourceIdentifier
     */
    String STATE = "state";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of StateResourceIdentifier
     */
    public static StateResourceIdentifier of() {
        return new StateResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy StateResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateResourceIdentifier of(final StateResourceIdentifier template) {
        StateResourceIdentifierImpl instance = new StateResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public StateResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of StateResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateResourceIdentifier deepCopy(@Nullable final StateResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        StateResourceIdentifierImpl instance = new StateResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StateResourceIdentifier
     * @return builder
     */
    public static StateResourceIdentifierBuilder builder() {
        return StateResourceIdentifierBuilder.of();
    }

    /**
     * create builder for StateResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateResourceIdentifierBuilder builder(final StateResourceIdentifier template) {
        return StateResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateResourceIdentifier(Function<StateResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StateResourceIdentifier>";
            }
        };
    }
}
