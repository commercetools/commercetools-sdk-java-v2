
package com.commercetools.api.models.type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   TypeResourceIdentifier typeResourceIdentifier = TypeResourceIdentifier.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeResourceIdentifierBuilder implements Builder<TypeResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Platform-generated unique identifier of the referenced Type. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public TypeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Type. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public TypeResourceIdentifierBuilder key(@Nullable final String key) {
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

    public TypeResourceIdentifier build() {
        return new TypeResourceIdentifierImpl(id, key);
    }

    /**
     * builds TypeResourceIdentifier without checking for non null required values
     */
    public TypeResourceIdentifier buildUnchecked() {
        return new TypeResourceIdentifierImpl(id, key);
    }

    public static TypeResourceIdentifierBuilder of() {
        return new TypeResourceIdentifierBuilder();
    }

    public static TypeResourceIdentifierBuilder of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierBuilder builder = new TypeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
