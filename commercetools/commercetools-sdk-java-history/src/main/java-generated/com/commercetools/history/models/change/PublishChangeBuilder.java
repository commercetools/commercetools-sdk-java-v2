
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   PublishChange publishChange = PublishChange.builder()
           .change("{change}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PublishChangeBuilder implements Builder<PublishChange> {

    private String change;

    public PublishChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public PublishChange build() {
        Objects.requireNonNull(change, PublishChange.class + ": change is missing");
        return new PublishChangeImpl(change);
    }

    /**
     * builds PublishChange without checking for non null required values
     */
    public PublishChange buildUnchecked() {
        return new PublishChangeImpl(change);
    }

    public static PublishChangeBuilder of() {
        return new PublishChangeBuilder();
    }

    public static PublishChangeBuilder of(final PublishChange template) {
        PublishChangeBuilder builder = new PublishChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
