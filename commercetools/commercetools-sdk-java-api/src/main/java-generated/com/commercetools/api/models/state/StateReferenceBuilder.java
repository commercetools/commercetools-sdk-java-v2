
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateReferenceBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateReferenceBuilder implements Builder<StateReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.state.State obj;

    /**
     *  <p>Unique identifier of the referenced State.</p>
     * @param id value to be set
     * @return Builder
     */

    public StateReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded State. Only present in responses to requests with Reference Expansion for States.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public StateReferenceBuilder obj(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.StateBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.state.StateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded State. Only present in responses to requests with Reference Expansion for States.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public StateReferenceBuilder withObj(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.State> builder) {
        this.obj = builder.apply(com.commercetools.api.models.state.StateBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded State. Only present in responses to requests with Reference Expansion for States.</p>
     * @param obj value to be set
     * @return Builder
     */

    public StateReferenceBuilder obj(@Nullable final com.commercetools.api.models.state.State obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced State.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded State. Only present in responses to requests with Reference Expansion for States.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.state.State getObj() {
        return this.obj;
    }

    /**
     * builds StateReference with checking for non-null required values
     * @return StateReference
     */
    public StateReference build() {
        Objects.requireNonNull(id, StateReference.class + ": id is missing");
        return new StateReferenceImpl(id, obj);
    }

    /**
     * builds StateReference without checking for non-null required values
     * @return StateReference
     */
    public StateReference buildUnchecked() {
        return new StateReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of StateReferenceBuilder
     * @return builder
     */
    public static StateReferenceBuilder of() {
        return new StateReferenceBuilder();
    }

    /**
     * create builder for StateReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateReferenceBuilder of(final StateReference template) {
        StateReferenceBuilder builder = new StateReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
