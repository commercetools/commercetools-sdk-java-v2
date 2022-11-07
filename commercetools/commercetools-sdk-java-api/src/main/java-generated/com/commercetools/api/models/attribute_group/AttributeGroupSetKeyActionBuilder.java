
package com.commercetools.api.models.attribute_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetKeyAction attributeGroupSetKeyAction = AttributeGroupSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupSetKeyActionBuilder implements Builder<AttributeGroupSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     */

    public AttributeGroupSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public AttributeGroupSetKeyAction build() {
        return new AttributeGroupSetKeyActionImpl(key);
    }

    /**
     * builds AttributeGroupSetKeyAction without checking for non null required values
     */
    public AttributeGroupSetKeyAction buildUnchecked() {
        return new AttributeGroupSetKeyActionImpl(key);
    }

    public static AttributeGroupSetKeyActionBuilder of() {
        return new AttributeGroupSetKeyActionBuilder();
    }

    public static AttributeGroupSetKeyActionBuilder of(final AttributeGroupSetKeyAction template) {
        AttributeGroupSetKeyActionBuilder builder = new AttributeGroupSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
