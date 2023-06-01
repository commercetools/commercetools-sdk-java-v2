package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AttributeGroupSetKeyActionBuilder implements Builder<AttributeGroupSetKeyAction> {

    
    @Nullable
    private String key;

    
    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public AttributeGroupSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds AttributeGroupSetKeyAction with checking for non-null required values
     * @return AttributeGroupSetKeyAction
     */
    public AttributeGroupSetKeyAction build() {
        return new AttributeGroupSetKeyActionImpl(key);
    }
    
    /**
     * builds AttributeGroupSetKeyAction without checking for non-null required values
     * @return AttributeGroupSetKeyAction
     */
    public AttributeGroupSetKeyAction buildUnchecked() {
        return new AttributeGroupSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of AttributeGroupSetKeyActionBuilder
     * @return builder 
     */
    public static AttributeGroupSetKeyActionBuilder of() {
        return new AttributeGroupSetKeyActionBuilder();
    }

    /**
     * create builder for AttributeGroupSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupSetKeyActionBuilder of(final AttributeGroupSetKeyAction template) {
        AttributeGroupSetKeyActionBuilder builder = new AttributeGroupSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
