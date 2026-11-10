
package com.commercetools.history.models.common;

import java.util.*;

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

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public StateReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds StateReference with checking for non-null required values
     * @return StateReference
     */
    public StateReference build() {
        Objects.requireNonNull(id, StateReference.class + ": id is missing");
        return new StateReferenceImpl(id);
    }

    /**
     * builds StateReference without checking for non-null required values
     * @return StateReference
     */
    public StateReference buildUnchecked() {
        return new StateReferenceImpl(id);
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
        return builder;
    }

}
