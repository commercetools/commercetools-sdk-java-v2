
package com.commercetools.api.models.attribute_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupResourceIdentifier attributeGroupResourceIdentifier = AttributeGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupResourceIdentifierBuilder implements Builder<AttributeGroupResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Platform-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public AttributeGroupResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-generated unique identifier of the referenced AttributeGroup. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public AttributeGroupResourceIdentifierBuilder key(@Nullable final String key) {
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

    public AttributeGroupResourceIdentifier build() {
        return new AttributeGroupResourceIdentifierImpl(id, key);
    }

    /**
     * builds AttributeGroupResourceIdentifier without checking for non null required values
     */
    public AttributeGroupResourceIdentifier buildUnchecked() {
        return new AttributeGroupResourceIdentifierImpl(id, key);
    }

    public static AttributeGroupResourceIdentifierBuilder of() {
        return new AttributeGroupResourceIdentifierBuilder();
    }

    public static AttributeGroupResourceIdentifierBuilder of(final AttributeGroupResourceIdentifier template) {
        AttributeGroupResourceIdentifierBuilder builder = new AttributeGroupResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
