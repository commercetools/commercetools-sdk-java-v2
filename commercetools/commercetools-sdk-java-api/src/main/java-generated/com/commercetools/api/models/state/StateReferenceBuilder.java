
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
     <*  <p>Platform-generated unique identifier of the referenced State.</p>>
     */

    public StateReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded State. Only present in responses to requests with Reference Expansion for States.</p>>
     */

    public StateReferenceBuilder obj(
            Function<com.commercetools.api.models.state.StateBuilder, com.commercetools.api.models.state.StateBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.state.StateBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded State. Only present in responses to requests with Reference Expansion for States.</p>>
     */

    public StateReferenceBuilder obj(@Nullable final com.commercetools.api.models.state.State obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.state.State getObj() {
        return this.obj;
    }

    public StateReference build() {
        Objects.requireNonNull(id, StateReference.class + ": id is missing");
        return new StateReferenceImpl(id, obj);
    }

    /**
     * builds StateReference without checking for non null required values
     */
    public StateReference buildUnchecked() {
        return new StateReferenceImpl(id, obj);
    }

    public static StateReferenceBuilder of() {
        return new StateReferenceBuilder();
    }

    public static StateReferenceBuilder of(final StateReference template) {
        StateReferenceBuilder builder = new StateReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
