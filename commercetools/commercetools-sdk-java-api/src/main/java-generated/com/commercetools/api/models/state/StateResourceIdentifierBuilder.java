
package com.commercetools.api.models.state;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StateResourceIdentifier stateResourceIdentifier = StateResourceIdentifier.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateResourceIdentifierBuilder implements Builder<StateResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Platform-generated unique identifier of the referenced State. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public StateResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced State. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public StateResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public StateResourceIdentifier build() {
        return new StateResourceIdentifierImpl(id, key);
    }

    /**
     * builds StateResourceIdentifier without checking for non null required values
     */
    public StateResourceIdentifier buildUnchecked() {
        return new StateResourceIdentifierImpl(id, key);
    }

    public static StateResourceIdentifierBuilder of() {
        return new StateResourceIdentifierBuilder();
    }

    public static StateResourceIdentifierBuilder of(final StateResourceIdentifier template) {
        StateResourceIdentifierBuilder builder = new StateResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
